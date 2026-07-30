// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.AiAiQueryParams
import com.hello_world_testingggg.api.models.AiAiQueryResponse

interface AiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiService

    /**
     * Casing probe replicating context.dev: glued AIAI prefix (resource ai + method ai_query) over
     * plural and non-plural synthesized element mints
     */
    fun aiQuery(
        params: AiAiQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiAiQueryResponse

    /** A view of [AiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/query`, but is otherwise the same as
         * [AiService.aiQuery].
         */
        @MustBeClosed
        fun aiQuery(
            params: AiAiQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiAiQueryResponse>
    }
}
