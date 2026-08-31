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
import com.hello_world_testingggg.api.models.adoptions.policies.Policy
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListPageAsync
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListPageResponse
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyRetrieveParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams

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
        params: PolicyCreateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // post /adoptions/policies
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): Policy =
        // get /adoptions/policies/{policyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: PolicyUpdateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // patch /adoptions/policies/{policyId}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PolicyListParams,
        requestOptions: RequestOptions,
    ): PolicyListPageAsync =
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
            params: PolicyCreateParams,
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
            params: PolicyRetrieveParams,
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
            params: PolicyUpdateParams,
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

        private val listHandler: Handler<PolicyListPageResponse> =
            jsonHandler<PolicyListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PolicyListPageAsync> {
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
                        PolicyListPageAsync.builder()
                            .service(PolicyServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
