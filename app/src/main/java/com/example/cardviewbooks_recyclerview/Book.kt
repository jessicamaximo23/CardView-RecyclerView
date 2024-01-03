package com.example.cardviewbooks_recyclerview


    //create a a book mutable list
    var bookList = mutableListOf<Book>()

    val BOOK_ID_XTRA = "bookExtra"
class Book(
    //declare all variables
    var cover : Int,
    var author : String,
    var title : String,
    var description : String,

    val id:Int?= bookList.size

)