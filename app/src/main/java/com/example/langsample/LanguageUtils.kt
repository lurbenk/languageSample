package com.example.langsample

import android.app.Activity
import android.content.res.Resources
import android.util.Log
import com.yariksoffice.lingver.Lingver
import java.util.*

object LanguageUtils {
    fun changeLanguage(activity: Activity?, resources: Resources) {
        val selectedLanguage: Locale = when (resources.configuration.locale.language) {
            "en" -> Locale("sk")
            "sk" -> Locale("en")
            else -> Locale("sk")

        }

        Lingver.getInstance().setLocale(activity!! , selectedLanguage)
        Log.d("LOCALE", "Changing language to: ${selectedLanguage.language}")
        val refresh = activity!!.intent
        activity!!.finish()
        activity!!.startActivity(refresh)
    }

    fun checkActualLanguageVersion(resources: Resources): String {
        return when (resources.configuration.locale.language) {
            "sk" -> "sk"
            "cs" -> "sk"
            else -> "en"
        }
    }
}