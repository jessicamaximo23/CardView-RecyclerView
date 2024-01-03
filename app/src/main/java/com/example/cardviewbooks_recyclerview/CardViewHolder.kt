package com.example.cardviewbooks_recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewbooks_recyclerview.databinding.CardCellBinding

class CardViewHolder(
    private  val cardCellBinding: CardCellBinding,
    //crate a variable for click
    private val clickListener: BookClickListener

) : RecyclerView.ViewHolder(cardCellBinding.root) {

    //create a function
    fun bindBook(book: Book) {
    cardCellBinding.cover.setImageResource(book.cover)
    cardCellBinding.Title.text = book.title
    cardCellBinding.Author.text = book.author

    cardCellBinding.cardView.setOnClickListener{
        clickListener.OnClick(book)
    }

    }
}