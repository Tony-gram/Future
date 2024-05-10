package com.example.future.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.easyt.data.AuthViewModel
import com.example.future.models.Book
import com.example.future.navigation.LOG_URL
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage

class RViewModel(var navController: NavHostController, var context: Context) {
    var authViewModel: AuthViewModel
    var progress: ProgressDialog

    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()) {
            navController.navigate(LOG_URL)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadForm(name: String, email: String, number: String, date: String,filePath: Uri) {
        val formId = System.currentTimeMillis().toString()
        val storage_form_Ref = FirebaseStorage.getInstance().getReference()
            .child("Form/$formId")
        progress.show()
        storage_form_Ref.putFile(filePath).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                // Save data to db
                storage_form_Ref.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var form = Book(name, email, number, date,imageUrl)
                    var database_form_Ref = FirebaseDatabase.getInstance().getReference()
                        .child("Form/$formId")
                    database_form_Ref.setValue(form).addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            } else {
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

