package com.example.cardviewbooks_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cardviewbooks_recyclerview.databinding.ActivityDetailBinding
import com.example.cardviewbooks_recyclerview.databinding.ActivityMainBinding

//Create class for detail (when the user try to visualized more attributes for book)
//Similar that I have done in main (Detail extends the app activity)
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding and inflate
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // -1 because never gonna be a negative size list
        val bookID = intent.getIntExtra(BOOK_ID_XTRA, -1)
        val book = bookFromID(bookID)

        if (book != null ) {
            binding.cover.setImageResource(book.cover)
            binding.Title.text =book.title
            binding.description.text =book.description
            binding.Author.text =book.author

        }
    }
    //Create a function for take the id and return book
    private fun bookFromID(bookID: Int): Book? {

         for(book in bookList) {

             if (book.id == bookID)
                 return book
         }
        return null
    }
}