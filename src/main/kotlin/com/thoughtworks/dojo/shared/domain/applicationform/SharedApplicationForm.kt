package com.thoughtworks.dojo.shared.domain.applicationform

import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment

data class ApplicationFormId(val value: String)

interface SharedApplicationForm {
    val id: ApplicationFormId
    val applicant: ApplicantInfo
    val appointment: Appointment
}
