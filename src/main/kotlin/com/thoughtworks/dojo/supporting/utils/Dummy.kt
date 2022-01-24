package com.thoughtworks.dojo.supporting.utils

import kotlin.random.Random

object Dummy {
    private val chars = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g')

    fun name(): String {
        val first = (0..5).joinToString("") {
            chars[Random.nextInt(0, chars.size)].toString()
        }
        val second = (0..5).joinToString("") {
            chars[Random.nextInt(0, chars.size)].toString()
        }
        return "$first $second"
    }
}
