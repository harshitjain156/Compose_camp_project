package com.example.compose_camp_project.home

import androidx.annotation.DrawableRes
import com.example.compose_camp_project.R


enum class BottomTabs(val order: Int, val tabName: String, @DrawableRes val iconRes: Int) {
    CHATS(0,"Chats", R.drawable.ic_chats),
    FRIENDS(1,"People", R.drawable.ic_people)
}