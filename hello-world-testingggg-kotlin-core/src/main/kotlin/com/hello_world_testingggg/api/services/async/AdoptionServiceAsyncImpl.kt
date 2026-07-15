// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
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
import com.hello_world_testingggg.api.models.adoptions.AdoptionCreateParams
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveDecisionParams
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveDecisionResponse
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveParams
import com.hello_world_testingggg.api.models.adoptions.Application
import com.hello_world_testingggg.api.services.async.adoptions.PolicyServiceAsync
import com.hello_world_testingggg.api.services.async.adoptions.PolicyServiceAsyncImpl

/** Adoption policies and applications */
class AdoptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdoptionServiceAsync {

    private val withRawResponse: AdoptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val policies: PolicyServiceAsync by lazy { PolicyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AdoptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdoptionServiceAsync =
        AdoptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Adoption policies and applications */
    override fun policies(): PolicyServiceAsync = policies

    override suspend fun create(
        params: AdoptionCreateParams,
        requestOptions: RequestOptions,
    ): Application =
        // post /adoptions/applications
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AdoptionRetrieveParams,
        requestOptions: RequestOptions,
    ): Application =
        // get /adoptions/applications/{applicationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun retrieveDecision(
        params: AdoptionRetrieveDecisionParams,
        requestOptions: RequestOptions,
    ): AdoptionRetrieveDecisionResponse =
        // get /adoptions/applications/{applicationId}/decision
        withRawResponse().retrieveDecision(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdoptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val policies: PolicyServiceAsync.WithRawResponse by lazy {
            PolicyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdoptionServiceAsync.WithRawResponse =
            AdoptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Adoption policies and applications */
        override fun policies(): PolicyServiceAsync.WithRawResponse = policies

        private val createHandler: Handler<Application> =
            jsonHandler<Application>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AdoptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Application> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "applications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Application> =
            jsonHandler<Application>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AdoptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Application> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("applicationId", params.applicationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "applications", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveDecisionHandler: Handler<AdoptionRetrieveDecisionResponse> =
            jsonHandler<AdoptionRetrieveDecisionResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveDecision(
            params: AdoptionRetrieveDecisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("applicationId", params.applicationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "applications", params._pathParam(0), "decision")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveDecisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
