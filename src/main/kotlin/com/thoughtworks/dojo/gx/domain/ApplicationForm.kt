package com.thoughtworks.dojo.gx.domain

import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationForm
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import java.time.LocalDate

data class ApplicationForm(
    override val id: ApplicationFormId,
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
