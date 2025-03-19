package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class EmergencyRequest(
    val familyId: Any,
    val locationLat: Double,
    val locationLng: Double,
    val patientId: Int,
    val requestId: Int,
    val status: String,
    val timestamp: String
)