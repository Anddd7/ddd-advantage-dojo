package com.thoughtworks.dojo.ch.domain

import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.applicationform.SharedApplicationForm
import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment

data class ApplicationForm(
    override val id: ApplicationFormId,
    override val applicant: ApplicantInfo,
    override val appointment: Appointment,
) : SharedApplicationForm
