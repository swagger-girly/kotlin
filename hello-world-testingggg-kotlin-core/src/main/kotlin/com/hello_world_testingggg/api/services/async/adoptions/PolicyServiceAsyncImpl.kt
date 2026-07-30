// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.adoptions

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
import com.hello_world_testingggg.api.models.AdoptionPolicyCreateParams
import com.hello_world_testingggg.api.models.AdoptionPolicyListPageAsync
import com.hello_world_testingggg.api.models.AdoptionPolicyListPageResponse
import com.hello_world_testingggg.api.models.AdoptionPolicyListParams
import com.hello_world_testingggg.api.models.AdoptionPolicyRetrieveParams
import com.hello_world_testingggg.api.models.AdoptionPolicyUpdateParams
import com.hello_world_testingggg.api.models.Policy

/** Adoption policies and applications */
class PolicyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PolicyServiceAsync {

    private val withRawResponse: PolicyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolicyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyServiceAsync =
        PolicyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AdoptionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // post /adoptions/policies
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AdoptionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): Policy =
        // get /adoptions/policies/{policyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // patch /adoptions/policies/{policyId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AdoptionPolicyListParams,
        requestOptions: RequestOptions,
    ): AdoptionPolicyListPageAsync =
        // get /adoptions/policies
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolicyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PolicyServiceAsync.WithRawResponse =
            PolicyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Policy> = jsonHandler<Policy>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AdoptionPolicyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Policy> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "policies")
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

        private val retrieveHandler: Handler<Policy> = jsonHandler<Policy>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AdoptionPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Policy> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("policyId", params.policyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "policies", params._pathParam(0))
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

        private val updateHandler: Handler<Policy> = jsonHandler<Policy>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AdoptionPolicyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Policy> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("policyId", params.policyId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "policies", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AdoptionPolicyListPageResponse> =
            jsonHandler<AdoptionPolicyListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AdoptionPolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdoptionPolicyListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "policies")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AdoptionPolicyListPageAsync.builder()
                            .service(PolicyServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
