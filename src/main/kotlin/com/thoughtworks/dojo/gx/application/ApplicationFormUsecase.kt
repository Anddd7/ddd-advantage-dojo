package com.thoughtworks.dojo.gx.application

import com.thoughtworks.dojo.gx.domain.ApplicationForm
import com.thoughtworks.dojo.gx.domain.Education
import com.thoughtworks.dojo.shared.application.ShardApplicationFormUsecase
import com.thoughtworks.dojo.shared.application.ShardSubmitRequest
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormRepo
import com.thoughtworks.dojo.shared.domain.police.PoliceRepo
import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import com.thoughtworks.dojo.shared.domain.valueobject.Police
import jakarta.inject.Singleton

@Singleton
class ApplicationFormUsecase(
    repo: ApplicationFormRepo<ApplicationForm>,
    policeRepo: PoliceRepo,
) : ShardApplicationFormUsecase<ApplicationForm>(repo, policeRepo) {
    override fun buildApplicationForm(request: ShardSubmitRequest, appointment: Appointment) =
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
) : ShardSubmitRequest
