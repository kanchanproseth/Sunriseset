package com.bright.sunriseset.utillity

import android.content.Context
import android.content.res.Configuration
import java.util.Locale

object LocalizationManager {

    fun setLanguage(context: Context, languageCode: LocalizationCode) {
        val locale = Locale(languageCode.getLocalizeCodeString())
        Locale.setDefault(locale)

        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)

        context.resources.updateConfiguration(config, context.resources.displayMetrics)
    }
}