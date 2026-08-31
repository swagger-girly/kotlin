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
import com.hello_world_testingggg.api.models.adoptions.policies.Policy
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListPage
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListPageResponse
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyRetrieveParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams

/** Adoption policies and applications */
class PolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PolicyService {

    private val withRawResponse: PolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolicyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyService =
        PolicyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: PolicyCreateParams, requestOptions: RequestOptions): Policy =
        // post /adoptions/policies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PolicyRetrieveParams, requestOptions: RequestOptions): Policy =
        // get /adoptions/policies/{policyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PolicyUpdateParams, requestOptions: RequestOptions): Policy =
        // patch /adoptions/policies/{policyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PolicyListParams, requestOptions: RequestOptions): PolicyListPage =
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

        private val listHandler: Handler<PolicyListPageResponse> =
            jsonHandler<PolicyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PolicyListPage> {
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
                        PolicyListPage.builder()
                            .service(PolicyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
