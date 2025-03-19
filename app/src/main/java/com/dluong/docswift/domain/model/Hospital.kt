package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class Hospital(
    val address: String,
    val email: String,
    val hospitalId: Int,
    val name: String,
    val phoneNumber: String
)