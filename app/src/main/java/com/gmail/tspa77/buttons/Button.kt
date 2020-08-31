package com.gmail.tspa77.buttons

import android.widget.Button
import androidx.core.content.res.ResourcesCompat.getColorStateList
import com.google.android.material.button.MaterialButton

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Primary".
 * Автоматически меняет цвета в зависимости от состояния кнопки (isEnabled = true/false) на
 * установленные в дизайн-проекте.
 */
fun Button.setStylePrimary() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.btn_primary_background, context.theme)
        iconTint = getColorStateList(resources, R.color.btn_primary_text, context.theme)
        setTextColor(getColorStateList(resources, R.color.btn_primary_text, context.theme))
    }
}

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Secondary".
 * Автоматически меняет цвета в зависимости от состояния кнопки (isEnabled = true/false) на
 * установленные в дизайн-проекте.
 */
fun Button.setStyleSecondary() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.btn_secondary_background, context.theme)
        iconTint = getColorStateList(resources, R.color.btn_secondary_text, context.theme)
        setTextColor(getColorStateList(resources, R.color.btn_secondary_text, context.theme))
    }
}

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Primary Enabled".
 * Не меняет цвета в зависимости от состояния кнопки (isEnabled = true/false)
 */
fun Button.setStylePrimaryEnabledPermanent() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.colorPrimary, context.theme)
        iconTint = getColorStateList(resources, R.color.colorWhiteText, context.theme)
        setTextColor(getColorStateList(resources, R.color.colorWhiteText, context.theme))
    }
}

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Primary Disabled".
 * Не меняет цвета в зависимости от состояния кнопки (isEnabled = true/false)
 */
fun Button.setStylePrimaryDisabledPermanent() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.colorPlaceholderText, context.theme)
        iconTint = getColorStateList(resources, R.color.colorWhiteText, context.theme)
        setTextColor(getColorStateList(resources, R.color.colorWhiteText, context.theme))
    }
}

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Secondary Enabled".
 * Не меняет цвета в зависимости от состояния кнопки (isEnabled = true/false)
 */
fun Button.setStyleSecondaryEnabledPermanent() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.colorBgSecondary, context.theme)
        iconTint = getColorStateList(resources, R.color.colorPrimary, context.theme)
        setTextColor(getColorStateList(resources, R.color.colorPrimary, context.theme))
    }
}

/**
 * Устанавливает в стилях "Material.{Primary/Secondary}Button" цвета стиля "Secondary Disabled".
 * Не меняет цвета в зависимости от состояния кнопки (isEnabled = true/false)
 */
fun Button.setStyleSecondaryDisabledPermanent() {
    (this as? MaterialButton)?.let {
        backgroundTintList =
            getColorStateList(resources, R.color.colorBgSecondary, context.theme)
        iconTint = getColorStateList(resources, R.color.colorPlaceholderText, context.theme)
        setTextColor(getColorStateList(resources, R.color.colorPlaceholderText, context.theme))
    }
}
