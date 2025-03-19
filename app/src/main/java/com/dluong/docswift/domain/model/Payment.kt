package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class Payment(
    val amount: Double,
    val appointmentId: Int,
    val patientId: Int,
    val paymentId: Int,
    val paymentMethod: String,
    val status: String,
    val timestamp: String
)