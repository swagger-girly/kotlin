// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

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
import com.hello_world_testingggg.api.models.Placement
import com.hello_world_testingggg.api.models.PlacementCreateParams
import com.hello_world_testingggg.api.models.PlacementListPage
import com.hello_world_testingggg.api.models.PlacementListPageResponse
import com.hello_world_testingggg.api.models.PlacementListParams
import com.hello_world_testingggg.api.models.PlacementRecordEventParams
import com.hello_world_testingggg.api.models.PlacementRetrieveParams

/** Post-adoption placement tracking */
class PlacementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlacementService {

    private val withRawResponse: PlacementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlacementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlacementService =
        PlacementServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: PlacementCreateParams, requestOptions: RequestOptions): Placement =
        // post /placements
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlacementRetrieveParams,
        requestOptions: RequestOptions,
    ): Placement =
        // get /placements/{placementId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PlacementListParams,
        requestOptions: RequestOptions,
    ): PlacementListPage =
        // get /placements
        withRawResponse().list(params, requestOptions).parse()

    override fun recordEvent(
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions,
    ): Placement =
        // post /placements/{placementId}/events
        withRawResponse().recordEvent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlacementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlacementService.WithRawResponse =
            PlacementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override fun create(
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

        private val retrieveHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<PlacementListPageResponse> =
            jsonHandler<PlacementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlacementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlacementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("placements")
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
                        PlacementListPage.builder()
                            .service(PlacementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val recordEventHandler: Handler<Placement> =
            jsonHandler<Placement>(clientOptions.jsonMapper)

        override fun recordEvent(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
