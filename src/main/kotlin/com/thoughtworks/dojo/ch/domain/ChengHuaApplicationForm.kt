package com.thoughtworks.dojo.ch.domain

import com.thoughtworks.dojo.shared.domain.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.ApplicationForm
import com.thoughtworks.dojo.shared.domain.Appointment
import java.util.UUID

data class ChengHuaApplicationForm(
    override val id: UUID,
    override val applicant: ApplicantInfo,
    override val appointment: Appointment,
) : ApplicationForm
