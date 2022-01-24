package com.thoughtworks.dojo.shared.domain.valueobject

import com.thoughtworks.dojo.supporting.valueobject.Address
import java.time.LocalDateTime

data class Appointment(
    val police: Police,
    val address: Address,
    val timeslot: Timeslot,
)

data class Timeslot(
    val startAt: LocalDateTime,
    val endAt: LocalDateTime,
)
