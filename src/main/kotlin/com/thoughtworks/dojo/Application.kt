package com.thoughtworks.dojo

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.thoughtworks.dojo")
        .start()
}
