package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class HealthRecord(
    val bloodPressure: String,
    val bloodSugar: Double,
    val diagnosis: String,
    val heartRate: Int,
    val height: Double,
    val lastUpdated: String,
    val patientId: Int,
    val prescribedMeds: String,
    val recordId: Int,
    val weight: Double
)