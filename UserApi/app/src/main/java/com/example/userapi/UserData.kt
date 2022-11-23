package com.example.userapi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class UserData (
    var gender:String,
    var name:UserName,
    var email:String,
    var phone:String,
    var cell:String,
    var picture:UserPicture

):Parcelable{}