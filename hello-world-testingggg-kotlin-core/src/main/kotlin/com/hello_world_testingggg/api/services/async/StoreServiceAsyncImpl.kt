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
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.store.StoreListInventoryParams
import com.hello_world_testingggg.api.models.store.StoreListInventoryResponse
import com.hello_world_testingggg.api.models.store.StoreRetrieveActivityParams
import com.hello_world_testingggg.api.models.store.StoreRetrieveActivityResponse
import com.hello_world_testingggg.api.services.async.store.OrderServiceAsync
import com.hello_world_testingggg.api.services.async.store.OrderServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.store.ReportServiceAsync
import com.hello_world_testingggg.api.services.async.store.ReportServiceAsyncImpl

/** Access to Petstore orders */
class StoreServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StoreServiceAsync {

    private val withRawResponse: StoreServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val order: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): StoreServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreServiceAsync =
        StoreServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun order(): OrderServiceAsync = order

    /** Access to Petstore orders */
    override fun reports(): ReportServiceAsync = reports

    override suspend fun listInventory(
        params: StoreListInventoryParams,
        requestOptions: RequestOptions,
    ): StoreListInventoryResponse =
        // get /store/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    override suspend fun retrieveActivity(
        params: StoreRetrieveActivityParams,
        requestOptions: RequestOptions,
    ): StoreRetrieveActivityResponse =
        // get /store/activity/{activityId}
        withRawResponse().retrieveActivity(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StoreServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val order: OrderServiceAsync.WithRawResponse by lazy {
            OrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StoreServiceAsync.WithRawResponse =
            StoreServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Access to Petstore orders */
        override fun order(): OrderServiceAsync.WithRawResponse = order

        /** Access to Petstore orders */
        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        private val listInventoryHandler: Handler<StoreListInventoryResponse> =
            jsonHandler<StoreListInventoryResponse>(clientOptions.jsonMapper)

        override suspend fun listInventory(
            params: StoreListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "inventory")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieveActivity(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
