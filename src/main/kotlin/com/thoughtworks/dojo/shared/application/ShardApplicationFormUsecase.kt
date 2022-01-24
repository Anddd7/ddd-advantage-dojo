package com.thoughtworks.dojo.shared.application

import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationForm
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormRepo
import com.thoughtworks.dojo.shared.domain.police.PoliceRepo
import com.thoughtworks.dojo.shared.domain.valueobject.ApplicantInfo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import com.thoughtworks.dojo.shared.domain.valueobject.Police

abstract class ShardApplicationFormUsecase<T : ApplicationForm>(
    private val repo: ApplicationFormRepo<T>,
    private val policeRepo: PoliceRepo,
) {
    fun submit(request: ShardSubmitRequest): T {
        val appointment = policeRepo.newAppointment(request.police)

        return repo.save(buildApplicationForm(request, appointment))
    }

    fun delete(id: ApplicationFormId) {
        val applicationForm = repo.get(id)
        val (police, _, timeslot) = applicationForm.appointment
        policeRepo.cancelAppointment(police, timeslot)
        repo.delete(id)
    }

    protected abstract fun buildApplicationForm(request: ShardSubmitRequest, appointment: Appointment): T
}

interface ShardSubmitRequest {
    val applicant: ApplicantInfo
    val police: Police
}
