package com.thoughtworks.dojo.gx.infra.inbound

import com.thoughtworks.dojo.gx.application.ApplicationFormUsecase
import com.thoughtworks.dojo.gx.domain.ApplicationForm
import com.thoughtworks.dojo.gx.infra.outbound.MemoApplicationFormRepo
import com.thoughtworks.dojo.shared.application.ShardSubmitRequest
import com.thoughtworks.dojo.shared.domain.applicationform.ApplicationFormRepo
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/gx/application-form")
class ApplicationFormController(
    private val usecase: ApplicationFormUsecase,
    private val repo: ApplicationFormRepo<ApplicationForm>,
    private val directRepo: MemoApplicationFormRepo,
) {
    @Post
    fun submit(@Body request: ShardSubmitRequest) {
        usecase.submit(request)
    }
}
