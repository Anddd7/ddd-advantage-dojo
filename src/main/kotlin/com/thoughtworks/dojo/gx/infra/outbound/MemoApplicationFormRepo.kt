package com.thoughtworks.dojo.gx.infra.outbound

import com.thoughtworks.dojo.gx.domain.ApplicationForm
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormId
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormRepo
import jakarta.inject.Singleton

@Singleton
class MemoApplicationFormRepo : ApplicationFormRepo<ApplicationForm> {
    private val storage = mutableMapOf<ApplicationFormId, ApplicationForm>()
    override fun get(id: ApplicationFormId): ApplicationForm {
        return storage.getValue(id)
    }

    override fun list(): List<ApplicationForm> {
        return storage.values.toList()
    }

    override fun save(domain: ApplicationForm): ApplicationForm {
        storage[domain.id] = domain
        return domain
    }

    override fun delete(id: ApplicationFormId): ApplicationForm {
        return storage.remove(id) ?: throw NoSuchElementException()
    }
}
