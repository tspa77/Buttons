package com.gmail.tspa77.buttons

import android.widget.Button
import androidx.core.content.res.ResourcesCompat.getColorStateList
import com.google.android.material.button.MaterialButton

fun Button.setStylePrimary() {
    (this as MaterialButton).let {
        isActivated = false
        backgroundTintList =
            getColorStateList(resources, R.color.btn_primary_background, context.theme)
        iconTint = getColorStateList(resources, R.color.btn_primary_text, context.theme)
        setTextColor(getColorStateList(resources, R.color.btn_primary_text, context.theme))
    }
}

fun Button.setStyleSecondary() {
    (this as MaterialButton).let {
        isActivated = false
        backgroundTintList =
            getColorStateList(resources, R.color.btn_secondary_background, context.theme)
        iconTint = getColorStateList(resources, R.color.btn_secondary_text, context.theme)
        setTextColor(getColorStateList(resources, R.color.btn_secondary_text, context.theme))
    }
}


