// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports.inventory

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.store.reports.DailyInventory
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams
import java.time.LocalDate

/** Access to Petstore orders */
interface DailyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DailyServiceAsync

    /** Returns daily inventory metrics for a generated report. */
    suspend fun retrieve(
        date: LocalDate,
        params: DailyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DailyInventory = retrieve(params.toBuilder().date(date).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DailyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DailyInventory

    /** A view of [DailyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DailyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/inventory/daily/{date}`,
         * but is otherwise the same as [DailyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            date: LocalDate,
            params: DailyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DailyInventory> =
            retrieve(params.toBuilder().date(date).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DailyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DailyInventory>
    }
}
