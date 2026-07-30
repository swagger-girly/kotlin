// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.notifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.UnwrapWebhookParams
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggWebhookException
import com.hello_world_testingggg.api.models.ParsePetWebhookEvent
import com.standardwebhooks.Webhook
import com.standardwebhooks.exceptions.WebhookVerificationException

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun parsePet(body: String): ParsePetWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<ParsePetWebhookEvent>())
        } catch (e: Exception) {
            throw HelloWorldTestinggggInvalidDataException("Error parsing body", e)
        }

    override fun parsePet(unwrapParams: UnwrapWebhookParams): ParsePetWebhookEvent {
        val headers = unwrapParams.headers()
        if (headers != null) {
            try {
                val webhookSecret =
                    checkRequired(
                        "webhookSecret",
                        unwrapParams.secret() ?: clientOptions.webhookSecret,
                    )

                val headersMap =
                    headers.names().associateWith { name -> headers.values(name) }.toMap()

                val webhook = Webhook(webhookSecret)
                webhook.verify(unwrapParams.body(), headersMap)
            } catch (e: WebhookVerificationException) {
                throw HelloWorldTestinggggWebhookException(
                    "Could not verify webhook event signature",
                    e,
                )
            }
        }
        return parsePet(unwrapParams.body())
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
