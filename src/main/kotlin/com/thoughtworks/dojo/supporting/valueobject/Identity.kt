package com.thoughtworks.dojo.supporting.valueobject

import java.time.LocalDate

data class Identity(
    val value: String,
    val effectedAt: LocalDate,
    val expiredAt: LocalDate,
)
