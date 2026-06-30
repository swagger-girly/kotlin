// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports

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
import com.hello_world_testingggg.api.models.store.reports.InventoryResponse
import com.hello_world_testingggg.api.models.store.reports.inventory.InventoryListParams
import com.hello_world_testingggg.api.services.async.store.reports.inventory.DailyServiceAsync
import com.hello_world_testingggg.api.services.async.store.reports.inventory.DailyServiceAsyncImpl

/** Access to Petstore orders */
class InventoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InventoryServiceAsync {

    private val withRawResponse: InventoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val daily: DailyServiceAsync by lazy { DailyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InventoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InventoryServiceAsync =
        InventoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun daily(): DailyServiceAsync = daily

    override suspend fun list(
        params: InventoryListParams,
        requestOptions: RequestOptions,
    ): InventoryResponse =
        // get /store/reports/{reportId}/inventory
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InventoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val daily: DailyServiceAsync.WithRawResponse by lazy {
            DailyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InventoryServiceAsync.WithRawResponse =
            InventoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Access to Petstore orders */
        override fun daily(): DailyServiceAsync.WithRawResponse = daily

        private val listHandler: Handler<InventoryResponse> =
            jsonHandler<InventoryResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InventoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InventoryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports", params._pathParam(0), "inventory")
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
            }
        }
    }
}
