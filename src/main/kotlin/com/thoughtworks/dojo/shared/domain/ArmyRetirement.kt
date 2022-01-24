package com.thoughtworks.dojo.shared.domain

import java.time.LocalDate

data class ArmyRetirement(
    val retiredAt: LocalDate,
    val retiredFrom: String,
)
