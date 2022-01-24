package com.thoughtworks.dojo.shared.domain

import com.thoughtworks.dojo.supporting.valueobject.Address
import com.thoughtworks.dojo.supporting.valueobject.Identity

data class ApplicantInfo(
    val identity: Identity,
    val address: Address,
    val ageRange: AgeRange,
    val armyRetirement: ArmyRetirement? = null,
)
