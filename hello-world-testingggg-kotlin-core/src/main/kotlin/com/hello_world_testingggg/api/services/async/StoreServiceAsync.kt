// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.StoreListInventoryParams
import com.hello_world_testingggg.api.models.StoreListInventoryResponse
import com.hello_world_testingggg.api.models.StoreRetrieveActivityParams
import com.hello_world_testingggg.api.models.StoreRetrieveActivityResponse
import com.hello_world_testingggg.api.services.async.store.OrderServiceAsync
import com.hello_world_testingggg.api.services.async.store.ReportServiceAsync

/** Access to Petstore orders */
interface StoreServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreServiceAsync

    /** Access to Petstore orders */
    fun order(): OrderServiceAsync

    /** Access to Petstore orders */
    fun reports(): ReportServiceAsync

    /** Returns a map of status codes to quantities */
    suspend fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreListInventoryResponse

    /** @see listInventory */
    suspend fun listInventory(requestOptions: RequestOptions): StoreListInventoryResponse =
        listInventory(StoreListInventoryParams.none(), requestOptions)

    /**
     * Returns a single activity feed entry. The response is a discriminated union whose arms each
     * compose the public `Pet` model, so every arm is minted under the response's namespace and
     * must inherit rather than flatten.
     */
    suspend fun retrieveActivity(
        activityId: String,
        params: StoreRetrieveActivityParams = StoreRetrieveActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreRetrieveActivityResponse =
        retrieveActivity(params.toBuilder().activityId(activityId).build(), requestOptions)

    /** @see retrieveActivity */
    suspend fun retrieveActivity(
        params: StoreRetrieveActivityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreRetrieveActivityResponse

    /** @see retrieveActivity */
    suspend fun retrieveActivity(
        activityId: String,
        requestOptions: RequestOptions,
    ): StoreRetrieveActivityResponse =
        retrieveActivity(activityId, StoreRetrieveActivityParams.none(), requestOptions)

    /** A view of [StoreServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StoreServiceAsync.WithRawResponse

        /** Access to Petstore orders */
        fun order(): OrderServiceAsync.WithRawResponse

        /** Access to Petstore orders */
        fun reports(): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/inventory`, but is otherwise the same as
         * [StoreServiceAsync.listInventory].
         */
        @MustBeClosed
        suspend fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        suspend fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(StoreListInventoryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/activity/{activityId}`, but is otherwise the
         * same as [StoreServiceAsync.retrieveActivity].
         */
        @MustBeClosed
        suspend fun retrieveActivity(
            activityId: String,
            params: StoreRetrieveActivityParams = StoreRetrieveActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreRetrieveActivityResponse> =
            retrieveActivity(params.toBuilder().activityId(activityId).build(), requestOptions)

        /** @see retrieveActivity */
        @MustBeClosed
        suspend fun retrieveActivity(
            params: StoreRetrieveActivityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreRetrieveActivityResponse>

        /** @see retrieveActivity */
        @MustBeClosed
        suspend fun retrieveActivity(
            activityId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreRetrieveActivityResponse> =
            retrieveActivity(activityId, StoreRetrieveActivityParams.none(), requestOptions)
    }
}
