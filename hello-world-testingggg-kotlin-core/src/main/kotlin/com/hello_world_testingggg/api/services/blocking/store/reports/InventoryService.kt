// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.store.reports.InventoryResponse
import com.hello_world_testingggg.api.models.store.reports.inventory.InventoryListParams
import com.hello_world_testingggg.api.services.blocking.store.reports.inventory.DailyService

/** Access to Petstore orders */
interface InventoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InventoryService

    /** Access to Petstore orders */
    fun daily(): DailyService

    /** Returns inventory rows associated with a store report. */
    fun list(
        reportId: String,
        params: InventoryListParams = InventoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryResponse = list(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see list */
    fun list(
        params: InventoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryResponse

    /** @see list */
    fun list(reportId: String, requestOptions: RequestOptions): InventoryResponse =
        list(reportId, InventoryListParams.none(), requestOptions)

    /** A view of [InventoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InventoryService.WithRawResponse

        /** Access to Petstore orders */
        fun daily(): DailyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/inventory`, but is
         * otherwise the same as [InventoryService.list].
         */
        @MustBeClosed
        fun list(
            reportId: String,
            params: InventoryListParams = InventoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryResponse> =
            list(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: InventoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InventoryResponse> =
            list(reportId, InventoryListParams.none(), requestOptions)
    }
}
