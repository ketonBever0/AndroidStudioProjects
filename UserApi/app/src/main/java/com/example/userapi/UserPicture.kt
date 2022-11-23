package com.example.userapi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class UserPicture (
    var large:String,
    var medium:String,
    var thumbnail:String
):Parcelable{}