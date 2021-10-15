package com.example.recyclerview_ika_15

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentsAdapter(private val context: Context, private val students: List<Students>, val listener: (Students) -> Unit)
    : RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>(){

    class StudentsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgStudents = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameStudents = view.findViewById<TextView>(R.id.tv_item_name)
        val descStudents = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(Students: Students, listener: (Students) -> Unit){
            imgStudents.setImageResource(Students.imgStudents)
            nameStudents.text = Students.nameStudents
            descStudents.text = Students.descStudents
            itemView.setOnClickListener {
                listener(Students)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder {
        return StudentsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_students, parent, false))
    }

    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) {
      holder.bindView(students[position], listener)
    }

    override fun getItemCount(): Int = students.size
    }

