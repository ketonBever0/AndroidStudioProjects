package com.example.userapi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class UserName (
    var title:String,
    var first:String,
    var last:String
):Parcelable{}
