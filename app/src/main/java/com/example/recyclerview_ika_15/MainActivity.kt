package com.example.recyclerview_ika_15

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsList = listOf<Students>(
            Students(
                R.drawable.tata,
                "Ananda Regita C",
                "Ananda Regita C, kelas XI RPL 6, absen 03"
            ),
            Students(
                R.drawable.dika,
                "Andika Neviantoro",
                "Andika Neviantoro, kelas XI RPL 6, absen 05"
            ),
            Students(
                R.drawable.ika,
                "Ika Fathisna",
                "Ika Fathisna, kelas XI RPL 6, absen 15"
            ),
            Students(
                R.drawable.srina,
                "Nisrina Amalia Iffatunisa",
                "Nisrina Amalia Iffatunisa, kelas XI RPL 6, absen 23"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_students)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = StudentsAdapter(this, studentsList){
            val intent = Intent(this, DetailStudentActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}