// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.services.blocking.notifications.WebhookService
import com.hello_world_testingggg.api.services.blocking.notifications.WebhookServiceImpl

class NotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NotificationService =
        NotificationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun webhooks(): WebhookService = webhooks

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationService.WithRawResponse {

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): NotificationService.WithRawResponse =
            NotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
