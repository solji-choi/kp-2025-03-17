package com.kp_2025_03_17.standard.util

object Ut {
    object str {
        @JvmStatic
        fun lcfirst(str: String): String {
            return str[0].lowercaseChar() + str.substring(1)
        }
    }
}