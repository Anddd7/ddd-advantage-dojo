package com.thoughtworks.dojo.shared.domain.applicationform

interface AbstractApplicationFormRepo<T : SharedApplicationForm> {
    fun get(id: ApplicationFormId): T
    fun list(): List<T>
    fun save(domain: T): T
    fun delete(id: ApplicationFormId): T
}
