// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.notifications

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.UnwrapWebhookParams
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggWebhookException
import com.hello_world_testingggg.api.models.ParsePetWebhookEvent

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the body could not be parsed.
     */
    fun parsePet(body: String): ParsePetWebhookEvent

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the body could not be parsed.
     * @throws HelloWorldTestinggggWebhookException if the webhook signature could not be verified
     */
    fun parsePet(unwrapParams: UnwrapWebhookParams): ParsePetWebhookEvent

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService.WithRawResponse
    }
}
