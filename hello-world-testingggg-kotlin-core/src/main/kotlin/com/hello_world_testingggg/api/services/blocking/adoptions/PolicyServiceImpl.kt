// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.adoptions

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
import com.hello_world_testingggg.api.core.prepare
import com.hello_world_testingggg.api.models.AdoptionPolicyCreateParams
import com.hello_world_testingggg.api.models.AdoptionPolicyListPage
import com.hello_world_testingggg.api.models.AdoptionPolicyListPageResponse
import com.hello_world_testingggg.api.models.AdoptionPolicyListParams
import com.hello_world_testingggg.api.models.AdoptionPolicyRetrieveParams
import com.hello_world_testingggg.api.models.AdoptionPolicyUpdateParams
import com.hello_world_testingggg.api.models.Policy

/** Adoption policies and applications */
class PolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PolicyService {

    private val withRawResponse: PolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolicyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyService =
        PolicyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: AdoptionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // post /adoptions/policies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AdoptionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): Policy =
        // get /adoptions/policies/{policyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): Policy =
        // patch /adoptions/policies/{policyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AdoptionPolicyListParams,
        requestOptions: RequestOptions,
    ): AdoptionPolicyListPage =
        // get /adoptions/policies
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolicyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PolicyService.WithRawResponse =
            PolicyServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<Policy> = jsonHandler<Policy>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: AdoptionPolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdoptionPolicyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("adoptions", "policies")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AdoptionPolicyListPage.builder()
                            .service(PolicyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
