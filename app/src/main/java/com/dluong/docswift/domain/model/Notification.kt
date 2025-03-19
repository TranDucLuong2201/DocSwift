package com.dluong.docswift.domain.model


import com.google.gson.annotations.SerializedName

data class Notification(
    val isRead: Boolean,
    val message: String,
    val notificationId: Int,
    val timestamp: String,
    val userId: Int
)