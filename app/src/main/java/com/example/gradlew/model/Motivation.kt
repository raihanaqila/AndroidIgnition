package com.example.gradlew.model

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Motivation(
    @DrawableRes val imageResourceId: Int,
    @StringRes val textResourceId: Int
)