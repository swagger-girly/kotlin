// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.services.async.notifications.WebhookServiceAsync
import com.hello_world_testingggg.api.services.async.notifications.WebhookServiceAsyncImpl

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun webhooks(): WebhookServiceAsync = webhooks

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
