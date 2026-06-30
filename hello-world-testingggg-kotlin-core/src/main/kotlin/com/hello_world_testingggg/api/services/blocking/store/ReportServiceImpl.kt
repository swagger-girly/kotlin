// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store

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
import com.hello_world_testingggg.api.core.prepare
import com.hello_world_testingggg.api.models.store.reports.Report
import com.hello_world_testingggg.api.models.store.reports.ReportEmbedParams
import com.hello_world_testingggg.api.models.store.reports.ReportList
import com.hello_world_testingggg.api.models.store.reports.ReportListPage
import com.hello_world_testingggg.api.models.store.reports.ReportListParams
import com.hello_world_testingggg.api.models.store.reports.ReportPauseParams
import com.hello_world_testingggg.api.models.store.reports.ReportRetrieveParams
import com.hello_world_testingggg.api.services.blocking.store.reports.InventoryService
import com.hello_world_testingggg.api.services.blocking.store.reports.InventoryServiceImpl

/** Access to Petstore orders */
class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inventory: InventoryService by lazy { InventoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportService =
        ReportServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Access to Petstore orders */
    override fun inventory(): InventoryService = inventory

    override fun retrieve(params: ReportRetrieveParams, requestOptions: RequestOptions): Report =
        // get /store/reports/{reportId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ReportListParams, requestOptions: RequestOptions): ReportListPage =
        // get /store/reports
        withRawResponse().list(params, requestOptions).parse()

    override fun embed(params: ReportEmbedParams, requestOptions: RequestOptions): String =
        // get /store/reports/{reportId}/embed
        withRawResponse().embed(params, requestOptions).parse()

    override fun pause(params: ReportPauseParams, requestOptions: RequestOptions) {
        // post /store/reports/{reportId}/pause
        withRawResponse().pause(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val inventory: InventoryService.WithRawResponse by lazy {
            InventoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportService.WithRawResponse =
            ReportServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /** Access to Petstore orders */
        override fun inventory(): InventoryService.WithRawResponse = inventory

        private val retrieveHandler: Handler<Report> = jsonHandler<Report>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ReportRetrieveParams,
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

        private val listHandler: Handler<ReportList> =
            jsonHandler<ReportList>(clientOptions.jsonMapper)

        override fun list(
            params: ReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "reports")
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
                        ReportListPage.builder()
                            .service(ReportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val embedHandler: Handler<String> = stringHandler()

        override fun embed(
            params: ReportEmbedParams,
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { embedHandler.handle(it) }
            }
        }

        private val pauseHandler: Handler<Void?> = emptyHandler()

        override fun pause(
            params: ReportPauseParams,
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { pauseHandler.handle(it) }
            }
        }
    }
}
