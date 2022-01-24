package com.thoughtworks.dojo.shared.domain

import java.util.UUID

data class ApplicationForm(
    val id: UUID,
    val applicant: ApplicantInfo,
    val appointment: Appointment,
)

