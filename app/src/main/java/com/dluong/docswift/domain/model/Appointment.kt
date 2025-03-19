package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class Appointment(
    val appointmentId: Int,
    val dateTime: String,
    val doctorId: Int,
    val notes: String,
    val patientId: Int,
    val status: String
)