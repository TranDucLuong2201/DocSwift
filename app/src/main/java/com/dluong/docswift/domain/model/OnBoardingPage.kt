package com.dluong.docswift.domain.model

import androidx.annotation.DrawableRes
import com.dluong.docswift.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    data object First: OnBoardingPage(
        image = R.drawable.the_lifesavers_using_computer_1,
        title = "Smart Appointment Scheduling",
        description = "Experience the power of smart scheduling."
    )
    data object Second: OnBoardingPage(
        image = R.drawable.lifesavers_caretaking_2,
        title = "Intuitive Medication Management",
        description = "Hassle-free Med Management with AI."
    )
    data object Third: OnBoardingPage(
        image = R.drawable.lifesavers_new_patient_3,
        title = "Intelligent Wellness AI Chatbot for All",
        description = "Wellness AI Chatbot at your fingertips."
    )

}