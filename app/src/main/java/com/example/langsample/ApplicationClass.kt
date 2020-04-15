package com.example.langsample

import android.app.Application
import com.yariksoffice.lingver.Lingver

class ApplicationClass: Application()  {

     override fun onCreate() {
        super.onCreate()
         // SmartToken Language change
         if (resources.configuration.locale.language == "cs") {
             Lingver.init(this, "sk")
         } else {
             Lingver.init(this, resources.configuration.locale.language)
         }
    }
}