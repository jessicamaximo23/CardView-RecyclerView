package com.example.cardviewbooks_recyclerview

    //create a a book mutable list
    var bookList = mutableListOf<Book>()

    val BOOK_ID_XTRA = "bookExtra"

//Create a class book for put all attributes as a author,title, description etc
class Book(
    //declare all variables
    var cover : Int,
    var author : String,
    var title : String,
    var description : String,

    //Increment the id
    val id:Int?= bookList.size

)