package com.thoughtworks.dojo.gx.application

import com.thoughtworks.dojo.gx.domain.ApplicationForm
import com.thoughtworks.dojo.gx.domain.Education
import com.thoughtworks.dojo.shared.application.AbstractApplicationFormUsecase
import com.thoughtworks.dojo.shared.application.SharedSubmitRequest
import com.thoughtworks.dojo.shared.domain.applicationform.AbstractApplicationFormRepo
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.police.PoliceRepo
import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import com.thoughtworks.dojo.shared.domain.valueobject.Police
import jakarta.inject.Singleton

@Singleton
class ApplicationFormUsecase(
    repo: AbstractApplicationFormRepo<ApplicationForm>,
    policeRepo: PoliceRepo,
) : AbstractApplicationFormUsecase<ApplicationForm>(repo, policeRepo) {
    override fun buildApplicationForm(request: SharedSubmitRequest, appointment: Appointment) =
        ApplicationForm(
            id = ApplicationFormId("0"),
            request.applicant,
            appointment,
            (request as SubmitRequest).education
        )
}

data class SubmitRequest(
    override val applicant: ApplicantInfo,
    override val police: Police,
    val education: Education?,
) : SharedSubmitRequest
