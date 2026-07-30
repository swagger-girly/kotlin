// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.AiAiQueryParams
import com.hello_world_testingggg.api.models.AiAiQueryResponse

class AiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AiServiceAsync {

    private val withRawResponse: AiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiServiceAsync =
        AiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun aiQuery(
        params: AiAiQueryParams,
        requestOptions: RequestOptions,
    ): AiAiQueryResponse =
        // post /ai/query
        withRawResponse().aiQuery(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AiServiceAsync.WithRawResponse =
            AiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val aiQueryHandler: Handler<AiAiQueryResponse> =
            jsonHandler<AiAiQueryResponse>(clientOptions.jsonMapper)

        override suspend fun aiQuery(
            params: AiAiQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiAiQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { aiQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
