package com.thoughtworks.dojo.gx.domain

import com.thoughtworks.dojo.shared.domain.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.ApplicationForm
import com.thoughtworks.dojo.shared.domain.Appointment
import java.time.LocalDate
import java.util.UUID

data class GaoXinApplicationForm(
    override val id: UUID,
    override val applicant: ApplicantInfo,
    override val appointment: Appointment,
    val education: Education? = null,
) : ApplicationForm

data class Education(
    val school: String,
    val major: String,
    val enrolledAt: LocalDate,
    val graduatedAt: LocalDate,
    val certifications: List<Certification>,
)

data class Certification(
    val type: String,
    val serialNo: String,
    val issuedTime: LocalDate,
)
