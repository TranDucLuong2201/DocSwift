package com.dluong.docswift.domain.model


data class FamilyAccess(
    val accessLevel: String,
    val familyId: Int,
    val id: Int,
    val patientId: Int
)