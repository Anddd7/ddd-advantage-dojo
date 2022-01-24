package com.thoughtworks.dojo.shared.domain

import java.time.ZonedDateTime

data class ArmyRetirement(
    val retiredAt: ZonedDateTime,
    val retiredFrom: String,
)
