// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.handlers.stringHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.Report
import com.hello_world_testingggg.api.models.ReportList
import com.hello_world_testingggg.api.models.StoreReportEmbedParams
import com.hello_world_testingggg.api.models.StoreReportListPageAsync
import com.hello_world_testingggg.api.models.StoreReportListParams
import com.hello_world_testingggg.api.models.StoreReportPauseParams
import com.hello_world_testingggg.api.models.StoreReportRetrieveParams
import com.hello_world_testingggg.api.services.async.store.reports.InventoryServiceAsync
import com.hello_world_testingggg.api.services.async.store.reports.InventoryServiceAsyncImpl

/** Access to Petstore orders */
class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val withRawResponse: ReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inventory: InventoryServiceAsync by lazy {
        InventoryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportServiceAsync =
        ReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun inventory(): InventoryServiceAsync = inventory

    override suspend fun retrieve(
        params: StoreReportRetrieveParams,
        requestOptions: RequestOptions,
    ): Report =
        // get /store/reports/{reportId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: StoreReportListParams,
        requestOptions: RequestOptions,
    ): StoreReportListPageAsync =
        // get /store/reports
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun embed(
        params: StoreReportEmbedParams,
        requestOptions: RequestOptions,
    ): String =
        // get /store/reports/{reportId}/embed
        withRawResponse().embed(params, requestOptions).parse()

    override suspend fun pause(params: StoreReportPauseParams, requestOptions: RequestOptions) {
        // post /store/reports/{reportId}/pause
        withRawResponse().pause(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val inventory: InventoryServiceAsync.WithRawResponse by lazy {
            InventoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportServiceAsync.WithRawResponse =
            ReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Access to Petstore orders */
        override fun inventory(): InventoryServiceAsync.WithRawResponse = inventory

        private val retrieveHandler: Handler<Report> = jsonHandler<Report>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: StoreReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Report> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports", params._pathParam(0))
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

        private val listHandler: Handler<ReportList> =
            jsonHandler<ReportList>(clientOptions.jsonMapper)

        override suspend fun list(
            params: StoreReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreReportListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports")
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
                        StoreReportListPageAsync.builder()
                            .service(ReportServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val embedHandler: Handler<String> = stringHandler()

        override suspend fun embed(
            params: StoreReportEmbedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports", params._pathParam(0), "embed")
                    .putHeader("Accept", "text/html")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { embedHandler.handle(it) }
            }
        }

        private val pauseHandler: Handler<Void?> = emptyHandler()

        override suspend fun pause(
            params: StoreReportPauseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports", params._pathParam(0), "pause")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { pauseHandler.handle(it) }
            }
        }
    }
}
