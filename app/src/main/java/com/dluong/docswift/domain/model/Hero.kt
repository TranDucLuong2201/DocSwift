package com.dluong.docswift.domain.model


data class Hero(
    val appointments: List<Appointment>,
    val doctors: List<Doctor>,
    val emergencyRequests: List<EmergencyRequest>,
    val familyAccess: List<FamilyAccess>,
    val healthRecords: List<HealthRecord>,
    val hospitals: List<Hospital>,
    val notifications: List<Notification>,
    val payments: List<Payment>,
    val users: List<User>
)