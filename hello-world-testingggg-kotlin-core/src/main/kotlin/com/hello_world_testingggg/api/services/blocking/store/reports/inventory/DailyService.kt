// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports.inventory

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.store.reports.DailyInventory
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams
import java.time.LocalDate

/** Access to Petstore orders */
interface DailyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DailyService

    /** Returns daily inventory metrics for a generated report. */
    fun retrieve(
        date: LocalDate,
        params: DailyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DailyInventory = retrieve(params.toBuilder().date(date).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: DailyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DailyInventory

    /** A view of [DailyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DailyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/inventory/daily/{date}`,
         * but is otherwise the same as [DailyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            date: LocalDate,
            params: DailyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DailyInventory> =
            retrieve(params.toBuilder().date(date).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DailyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DailyInventory>
    }
}
