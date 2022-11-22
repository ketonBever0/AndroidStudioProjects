package com.example.recycleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var fName:String,
    var lName:String,
    var birthYear:Int,
    var email:String,
    var phoneNumber:String
):Parcelable{}
