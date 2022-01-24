package com.thoughtworks.dojo.shared.infra.outbound

import com.thoughtworks.dojo.shared.domain.police.PoliceRepo
import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import com.thoughtworks.dojo.shared.domain.valueobject.Police
import com.thoughtworks.dojo.shared.domain.valueobject.Timeslot
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class MemoPoliceRepo(
    @Client("https://api.police.cdc.cn") @Inject
    private val client: HttpClient
) : PoliceRepo {

    override fun newAppointment(police: Police): Appointment {
        TODO("client.request")
    }

    override fun list(): List<Police> {
        TODO("client.request")
    }

    override fun cancelAppointment(police: Police, timeslot: Timeslot) {
        TODO("client.request")
    }
}
