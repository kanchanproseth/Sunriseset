package com.bright.sunriseset.utillity

enum class LocalizationCode {
    EN, ZH;

    fun getLocalizeCodeString(): String {
        return when (this) {
            EN -> "en"
            ZH -> "zh"
        }
    }
}