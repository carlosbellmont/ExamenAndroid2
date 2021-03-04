package com.cbellmont.ejemploandroid10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StringAdapter(var stringList : List<String>) : RecyclerView.Adapter<StringAdapter.StringViewHolder>()  {

    class StringViewHolder(root: View, var textView: TextView, twTextRandom: TextView) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val twTextView = view.findViewById<TextView>(R.id.textView)
        val twTextRandom = view.findViewById<TextView>(R.id.textView2)
        return StringViewHolder(view, twTextView, twTextRandom)
    }

    override fun getItemCount(): Int {
        return stringList.size
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.textView.text = stringList[position]
        holder.textView.twTextRandom = stringList[position]
    }
}

