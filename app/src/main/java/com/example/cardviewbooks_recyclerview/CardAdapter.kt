package com.example.cardviewbooks_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewbooks_recyclerview.databinding.CardCellBinding

class CardAdapter (
    private val books: List <Book>,
    private val clickListener: BookClickListener
    )
    :RecyclerView.Adapter<CardViewHolder>()
{
    //Implement the method for create the view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from,parent,false)
        return CardViewHolder(binding, clickListener)

    }
    //Implement the method for size
    override fun getItemCount(): Int = books.size

    //Implement the method for holder the view
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        //put the function that I created earlier
        holder.bindBook(books[position])
    }

}