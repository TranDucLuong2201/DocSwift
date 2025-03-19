package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class Doctor(
    val availability: String,
    val doctorId: Int,
    val hospitalId: Int,
    val profilePicture: String,
    val specialization: String,
    val totalPatients: Int,
    val userId: Int,
    val verifiedByHospital: Boolean
)