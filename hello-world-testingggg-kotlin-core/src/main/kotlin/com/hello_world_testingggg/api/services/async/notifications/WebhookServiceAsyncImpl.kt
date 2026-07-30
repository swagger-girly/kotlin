// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.notifications

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.UnwrapWebhookParams
import com.hello_world_testingggg.api.models.ParsePetWebhookEvent
import com.hello_world_testingggg.api.services.blocking.notifications.WebhookServiceImpl

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun parsePet(body: String): ParsePetWebhookEvent =
        WebhookServiceImpl(clientOptions).parsePet(body)

    override fun parsePet(unwrapParams: UnwrapWebhookParams): ParsePetWebhookEvent =
        WebhookServiceImpl(clientOptions).parsePet(unwrapParams)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
