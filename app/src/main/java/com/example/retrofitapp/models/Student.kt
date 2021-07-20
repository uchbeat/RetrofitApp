package com.example.retrofitapp.models

import com.google.gson.annotations.SerializedName

data class Student(
    var name: String,
    var seat: String,
    @SerializedName("class")
    var classNames: String
)
