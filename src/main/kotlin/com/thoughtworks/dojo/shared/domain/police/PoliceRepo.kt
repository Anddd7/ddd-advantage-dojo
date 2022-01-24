package com.thoughtworks.dojo.shared.domain.police

import com.thoughtworks.dojo.shared.domain.valueobject.Appointment
import com.thoughtworks.dojo.shared.domain.valueobject.Police
import com.thoughtworks.dojo.shared.domain.valueobject.Timeslot

interface PoliceRepo {
    fun newAppointment(police: Police): Appointment
    fun list(): List<Police>
    fun cancelAppointment(police: Police, timeslot: Timeslot)
}
