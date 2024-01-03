package com.example.cardviewbooks_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cardviewbooks_recyclerview.databinding.ActivityDetailBinding
import com.example.cardviewbooks_recyclerview.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding and inflate
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID = intent.getIntExtra(BOOK_ID_XTRA, -1)
        val book = bookFromID(bookID)

        if (book != null ) {
            binding.cover.setImageResource(book.cover)
            binding.Title.text =book.title
            binding.description.text =book.description
            binding.Author.text =book.author

        }
    }
    private fun bookFromID(bookID: Int): Book? {

         for(book in bookList) {

             if (book.id == bookID)
                 return book
         }
        return null
    }
}