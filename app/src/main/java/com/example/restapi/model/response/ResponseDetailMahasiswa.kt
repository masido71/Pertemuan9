package com.example.restapi.model.response


import com.example.restapi.model.request.DetailDataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDetailMahasiswa(
    @SerializedName("data")
    val data: DetailDataMahasiswa,
    @SerializedName("status")
    val status: String
)