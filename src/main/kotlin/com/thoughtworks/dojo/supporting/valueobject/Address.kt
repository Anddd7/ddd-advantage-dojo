package com.thoughtworks.dojo.supporting.valueobject

data class Address(
    val postal: String,
    val province: String,
    val district: String,
    val addressLine1: String,
    val addressLine2: String? = null,
    val addressLine3: String? = null,
    val addressLine4: String? = null,
)
