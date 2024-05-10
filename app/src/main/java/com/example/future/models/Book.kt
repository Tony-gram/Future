package com.example.future.models

class Book {
    var name:String = ""
    var email:String = ""
    var number:String = ""
    var date:String = ""
    var imageUrl:String = ""

    constructor(name: String, email: String, number: String, date: String, imageUri: String) {
        this.name = name
        this.email = email
        this.number = number
        this.date= date
        this.imageUrl = imageUrl
    }

    constructor()
}