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
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepare
import com.hello_world_testingggg.api.models.StoreListInventoryParams
import com.hello_world_testingggg.api.models.StoreListInventoryResponse
import com.hello_world_testingggg.api.models.StoreRetrieveActivityParams
import com.hello_world_testingggg.api.models.StoreRetrieveActivityResponse
import com.hello_world_testingggg.api.services.blocking.store.OrderService
import com.hello_world_testingggg.api.services.blocking.store.OrderServiceImpl
import com.hello_world_testingggg.api.services.blocking.store.ReportService
import com.hello_world_testingggg.api.services.blocking.store.ReportServiceImpl

/** Access to Petstore orders */
class StoreServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StoreService {

    private val withRawResponse: StoreService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val order: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): StoreService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreService =
        StoreServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun order(): OrderService = order

    /** Access to Petstore orders */
    override fun reports(): ReportService = reports

    override fun listInventory(
        params: StoreListInventoryParams,
        requestOptions: RequestOptions,
    ): StoreListInventoryResponse =
        // get /store/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    override fun retrieveActivity(
        params: StoreRetrieveActivityParams,
        requestOptions: RequestOptions,
    ): StoreRetrieveActivityResponse =
        // get /store/activity/{activityId}
        withRawResponse().retrieveActivity(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StoreService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val order: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StoreService.WithRawResponse =
            StoreServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /** Access to Petstore orders */
        override fun order(): OrderService.WithRawResponse = order

        /** Access to Petstore orders */
        override fun reports(): ReportService.WithRawResponse = reports

        private val listInventoryHandler: Handler<StoreListInventoryResponse> =
            jsonHandler<StoreListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: StoreListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "inventory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInventoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveActivityHandler: Handler<StoreRetrieveActivityResponse> =
            jsonHandler<StoreRetrieveActivityResponse>(clientOptions.jsonMapper)

        override fun retrieveActivity(
            params: StoreRetrieveActivityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreRetrieveActivityResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("activityId", params.activityId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "activity", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveActivityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
