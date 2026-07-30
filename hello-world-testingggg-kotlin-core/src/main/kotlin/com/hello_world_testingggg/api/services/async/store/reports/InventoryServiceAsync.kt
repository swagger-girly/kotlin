// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.InventoryResponse
import com.hello_world_testingggg.api.models.StoreReportInventoryListParams
import com.hello_world_testingggg.api.services.async.store.reports.inventory.DailyServiceAsync

/** Access to Petstore orders */
interface InventoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InventoryServiceAsync

    /** Access to Petstore orders */
    fun daily(): DailyServiceAsync

    /** Returns inventory rows associated with a store report. */
    suspend fun list(
        reportId: String,
        params: StoreReportInventoryListParams = StoreReportInventoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryResponse = list(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: StoreReportInventoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryResponse

    /** @see list */
    suspend fun list(reportId: String, requestOptions: RequestOptions): InventoryResponse =
        list(reportId, StoreReportInventoryListParams.none(), requestOptions)

    /**
     * A view of [InventoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InventoryServiceAsync.WithRawResponse

        /** Access to Petstore orders */
        fun daily(): DailyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/inventory`, but is
         * otherwise the same as [InventoryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            reportId: String,
            params: StoreReportInventoryListParams = StoreReportInventoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryResponse> =
            list(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: StoreReportInventoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InventoryResponse> =
            list(reportId, StoreReportInventoryListParams.none(), requestOptions)
    }
}
