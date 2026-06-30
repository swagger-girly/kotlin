// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.store.StoreListInventoryParams
import com.hello_world_testingggg.api.models.store.StoreListInventoryResponse
import com.hello_world_testingggg.api.services.blocking.store.OrderService
import com.hello_world_testingggg.api.services.blocking.store.ReportService

/** Access to Petstore orders */
interface StoreService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreService

    /** Access to Petstore orders */
    fun order(): OrderService

    /** Access to Petstore orders */
    fun reports(): ReportService

    /** Returns a map of status codes to quantities */
    fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreListInventoryResponse

    /** @see listInventory */
    fun listInventory(requestOptions: RequestOptions): StoreListInventoryResponse =
        listInventory(StoreListInventoryParams.none(), requestOptions)

    /** A view of [StoreService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreService.WithRawResponse

        /** Access to Petstore orders */
        fun order(): OrderService.WithRawResponse

        /** Access to Petstore orders */
        fun reports(): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/inventory`, but is otherwise the same as
         * [StoreService.listInventory].
         */
        @MustBeClosed
        fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(StoreListInventoryParams.none(), requestOptions)
    }
}
