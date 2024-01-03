package com.example.cardviewbooks_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardviewbooks_recyclerview.databinding.ActivityMainBinding

    //implement the book interface
class MainActivity : AppCompatActivity(), BookClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Create a function for populated the books
        populateBooks()

        val mainActivity = this
        binding.RecyclerView.apply{
            layoutManager = GridLayoutManager(applicationContext,3 )
            adapter = CardAdapter(bookList,mainActivity)
        }

    }

    private fun populateBooks() {
        val book1 = Book(
            R.drawable.img1,
            "Mattew Douglas",
            "Forex Trading",
            "For beginners :crash course"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.img2,
            "Richard Scarrys",
            "Best Little WORD BOOK ever!",
            "The history about the cat"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.img3,
            "Tim McNamara",
            "Rust in Action",
            "Systems programmings concepts and techniques."
        )
        bookList.add(book3)


        val book4 = Book(
            R.drawable.img4,
            "Stephan Hitchins",
            "Transforming your ideas into a Action",
            "How to thinking creatively, the design thinking process."
        )
        bookList.add(book4)


        val book5 = Book(
            R.drawable.img5,
            "Nathan Metzeler",
            "Kotlin Programming for beginners",
            "The Kotlin programming language."
        )
        bookList.add(book5)


        val book6 = Book(
            R.drawable.img6,
            "Ken Kousen",
            "Kotlin cookbook",
            "A problem focused approach."
        )
        bookList.add(book6)


        val book7 = Book(
            R.drawable.img7,
            "Richard Osman",
            "The last devil to die",
            "The new thursday murder club mystery "
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.img8,
            "Oprah Winfrey",
            "Success History",
            "Biography."
        )
        bookList.add(book8)

        val book9 = Book(
            R.drawable.img9,
            "Barak Obama",
            "A promised land",
            "Biography."
        )
        bookList.add(book9)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
    }

        override fun OnClick(book: Book) {
            val intent = Intent(applicationContext, DetailActivity::class.java)
            //pass the variable from interface
            intent.putExtra(BOOK_ID_XTRA,book.id)
            startActivity(intent)

        }
    }