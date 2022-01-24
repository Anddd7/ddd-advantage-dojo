package com.thoughtworks.dojo.ch.infra.inbound

import com.thoughtworks.dojo.ch.application.ApplicationFormUsecase
import com.thoughtworks.dojo.ch.domain.ApplicationForm
import com.thoughtworks.dojo.ch.infra.outbound.MemoApplicationFormRepo
import com.thoughtworks.dojo.shared.application.SharedSubmitRequest
import com.thoughtworks.dojo.shared.domain.applicationform.AbstractApplicationFormRepo
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/ch/application-form")
class ApplicationFormController(
    private val usecase: ApplicationFormUsecase,
    private val repo: AbstractApplicationFormRepo<ApplicationForm>,
    private val directRepo: MemoApplicationFormRepo,
) {
    @Post
    fun submit(@Body request: SharedSubmitRequest) {
        usecase.submit(request)
    }
}
