package com.example.recyclerview_ika_15

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Students(
    val imgStudents: Int,
    val nameStudents: String,
    val descStudents: String
) : Parcelable
