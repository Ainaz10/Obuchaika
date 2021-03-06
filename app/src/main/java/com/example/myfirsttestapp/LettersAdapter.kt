package com.example.myfirsttestapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LettersAdapter(private val symbolList: List<String>) : RecyclerView.Adapter<LettersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LettersViewHolder {
        val symbolListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.letters_list_item, parent, false)

        return LettersViewHolder(symbolListItemView)
    }

    override fun onBindViewHolder(holder: LettersViewHolder, position: Int) {
        val symbol = symbolList[position]
        holder.bind(symbol)
    }

    override fun getItemCount(): Int {
        return symbolList.size
    }



}