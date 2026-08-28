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
import com.hello_world_testingggg.api.models.placements.Placement
import com.hello_world_testingggg.api.models.placements.PlacementCreateParams
import com.hello_world_testingggg.api.models.placements.PlacementListPageAsync
import com.hello_world_testingggg.api.models.placements.PlacementListPageResponse
import com.hello_world_testingggg.api.models.placements.PlacementListParams
import com.hello_world_testingggg.api.models.placements.PlacementRecordEventParams
import com.hello_world_testingggg.api.models.placements.PlacementRetrieveParams

/** Post-adoption placement tracking */
class PlacementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlacementServiceAsync {

    private val withRawResponse: PlacementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlacementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlacementServiceAsync =
        PlacementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PlacementCreateParams,
        requestOptions: RequestOptions,
    ): Placement =
        // post /placements
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: PlacementRetrieveParams,
        requestOptions: RequestOptions,
    ): Placement =
        // get /placements/{placementId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: PlacementListParams,
        requestOptions: RequestOptions,
    ): PlacementListPageAsync =
        // get /placements
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun recordEvent(
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions,
    ): Placement =
        // post /placements/{placementId}/events
        withRawResponse().recordEvent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlacementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlacementServiceAsync.WithRawResponse =
            PlacementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PlacementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Placement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("placements")
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

        private val retrieveHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PlacementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Placement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("placementId", params.placementId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("placements", params._pathParam(0))
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

        private val listHandler: Handler<PlacementListPageResponse> =
            jsonHandler<PlacementListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PlacementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlacementListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("placements")
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
                        PlacementListPageAsync.builder()
                            .service(PlacementServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val recordEventHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override suspend fun recordEvent(
            params: PlacementRecordEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Placement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("placementId", params.placementId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("placements", params._pathParam(0), "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
