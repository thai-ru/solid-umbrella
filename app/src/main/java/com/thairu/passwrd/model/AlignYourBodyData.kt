package com.thairu.passwrd.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.thairu.passwrd.R

public val alignYourBodyData = listOf(
    R.drawable.foliage to R.string.ab1_nature_meditations,
    R.drawable.yoga to R.string.ab1_inversions,
    R.drawable.quick_yoga to R.string.quick_yoga,
    R.drawable.tabata to R.string.tabata,
    R.drawable.prenatal_yoga to R.string.pre_natal_yoga,
    R.drawable.stretching to R.string.stretching
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)