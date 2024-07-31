package com.arrienty.tokped.model


import com.arrienty.tokped.R

data class ListTopMenu(
    val imgTopBar: Int,
    val txtTopBar: Int,
    val descTopBar: Int
)

val dummyListMenu = listOf(
    ListTopMenu(R.drawable.gopay, R.string.txt_gopay, R.string.txt_dummy_gopay),
    ListTopMenu(R.drawable.plus, R.string.txt_dummy_discount, R.string.txt_subscription),
    ListTopMenu(R.drawable.rewards, R.string.txt_rewards, R.string.txt_dummy_rewards)
)