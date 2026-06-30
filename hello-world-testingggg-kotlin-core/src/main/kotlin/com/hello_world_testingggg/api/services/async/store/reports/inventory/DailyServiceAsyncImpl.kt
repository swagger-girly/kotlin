// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports.inventory

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
import com.hello_world_testingggg.api.models.store.reports.DailyInventory
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams

/** Access to Petstore orders */
class DailyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DailyServiceAsync {

    private val withRawResponse: DailyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DailyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DailyServiceAsync =
        DailyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: DailyRetrieveParams,
        requestOptions: RequestOptions,
    ): DailyInventory =
        // get /store/reports/{reportId}/inventory/daily/{date}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DailyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DailyServiceAsync.WithRawResponse =
            DailyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<DailyInventory> =
            jsonHandler<DailyInventory>(clientOptions.jsonMapper)

        override suspend fun retrieve(
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
    }
}
