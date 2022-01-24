package com.thoughtworks.dojo.shared.domain

import com.thoughtworks.dojo.supporting.valueobject.Address

data class Appointment(
    val police: Police,
    val address: Address,
)
