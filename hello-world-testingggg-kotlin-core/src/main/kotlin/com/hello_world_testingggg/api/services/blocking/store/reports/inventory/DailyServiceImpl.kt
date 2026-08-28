// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports.inventory

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
import com.hello_world_testingggg.api.models.store.reports.DailyInventory
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams

/** Access to Petstore orders */
class DailyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DailyService {

    private val withRawResponse: DailyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DailyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DailyService =
        DailyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: DailyRetrieveParams,
        requestOptions: RequestOptions,
    ): DailyInventory =
        // get /store/reports/{reportId}/inventory/daily/{date}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DailyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DailyService.WithRawResponse =
            DailyServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<DailyInventory> =
            jsonHandler<DailyInventory>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DailyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DailyInventory> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("date", params.date())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "store",
                        "reports",
                        params._pathParam(0),
                        "inventory",
                        "daily",
                        params._pathParam(1),
                    )
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
    }
}
