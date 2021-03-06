package com.thoughtworks.dojo.gx.infra.inbound

import com.thoughtworks.dojo.gx.application.ApplicationFormUsecase
import com.thoughtworks.dojo.gx.domain.ApplicationForm
import com.thoughtworks.dojo.gx.infra.outbound.MemoApplicationFormRepo
import com.thoughtworks.dojo.shared.application.SharedSubmitRequest
import com.thoughtworks.dojo.shared.domain.applicationform.AbstractApplicationFormRepo
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/gx/application-form")
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
