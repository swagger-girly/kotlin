// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports

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
import com.hello_world_testingggg.api.models.InventoryResponse
import com.hello_world_testingggg.api.models.StoreReportInventoryListParams
import com.hello_world_testingggg.api.services.blocking.store.reports.inventory.DailyService
import com.hello_world_testingggg.api.services.blocking.store.reports.inventory.DailyServiceImpl

/** Access to Petstore orders */
class InventoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InventoryService {

    private val withRawResponse: InventoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val daily: DailyService by lazy { DailyServiceImpl(clientOptions) }

    override fun withRawResponse(): InventoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InventoryService =
        InventoryServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun daily(): DailyService = daily

    override fun list(
        params: StoreReportInventoryListParams,
        requestOptions: RequestOptions,
    ): InventoryResponse =
        // get /store/reports/{reportId}/inventory
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InventoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val daily: DailyService.WithRawResponse by lazy {
            DailyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InventoryService.WithRawResponse =
            InventoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Access to Petstore orders */
        override fun daily(): DailyService.WithRawResponse = daily

        private val listHandler: Handler<InventoryResponse> =
            jsonHandler<InventoryResponse>(clientOptions.jsonMapper)

        override fun list(
            params: StoreReportInventoryListParams,
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
            }
        }
    }
}
