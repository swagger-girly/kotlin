// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.Report
import com.hello_world_testingggg.api.models.StoreReportEmbedParams
import com.hello_world_testingggg.api.models.StoreReportListPageAsync
import com.hello_world_testingggg.api.models.StoreReportListParams
import com.hello_world_testingggg.api.models.StoreReportPauseParams
import com.hello_world_testingggg.api.models.StoreReportRetrieveParams
import com.hello_world_testingggg.api.services.async.store.reports.InventoryServiceAsync

/** Access to Petstore orders */
interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportServiceAsync

    /** Access to Petstore orders */
    fun inventory(): InventoryServiceAsync

    /** Returns a generated store report. */
    suspend fun retrieve(
        reportId: String,
        params: StoreReportRetrieveParams = StoreReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report = retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: StoreReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report

    /** @see retrieve */
    suspend fun retrieve(reportId: String, requestOptions: RequestOptions): Report =
        retrieve(reportId, StoreReportRetrieveParams.none(), requestOptions)

    /** Returns a cursor-id paginated list of generated store reports. */
    suspend fun list(
        params: StoreReportListParams = StoreReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreReportListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): StoreReportListPageAsync =
        list(StoreReportListParams.none(), requestOptions)

    /** Returns an embeddable HTML representation of a store report. */
    suspend fun embed(
        reportId: String,
        params: StoreReportEmbedParams = StoreReportEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = embed(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see embed */
    suspend fun embed(
        params: StoreReportEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see embed */
    suspend fun embed(reportId: String, requestOptions: RequestOptions): String =
        embed(reportId, StoreReportEmbedParams.none(), requestOptions)

    /** Pauses a report generation job and returns an empty success response. */
    suspend fun pause(
        reportId: String,
        params: StoreReportPauseParams = StoreReportPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see pause */
    suspend fun pause(
        params: StoreReportPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pause */
    suspend fun pause(reportId: String, requestOptions: RequestOptions) =
        pause(reportId, StoreReportPauseParams.none(), requestOptions)

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportServiceAsync.WithRawResponse

        /** Access to Petstore orders */
        fun inventory(): InventoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}`, but is otherwise the
         * same as [ReportServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            reportId: String,
            params: StoreReportRetrieveParams = StoreReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report> =
            retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: StoreReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Report> =
            retrieve(reportId, StoreReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports`, but is otherwise the same as
         * [ReportServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: StoreReportListParams = StoreReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreReportListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<StoreReportListPageAsync> =
            list(StoreReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/embed`, but is otherwise
         * the same as [ReportServiceAsync.embed].
         */
        @MustBeClosed
        suspend fun embed(
            reportId: String,
            params: StoreReportEmbedParams = StoreReportEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            embed(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see embed */
        @MustBeClosed
        suspend fun embed(
            params: StoreReportEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see embed */
        @MustBeClosed
        suspend fun embed(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> = embed(reportId, StoreReportEmbedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /store/reports/{reportId}/pause`, but is otherwise
         * the same as [ReportServiceAsync.pause].
         */
        @MustBeClosed
        suspend fun pause(
            reportId: String,
            params: StoreReportPauseParams = StoreReportPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see pause */
        @MustBeClosed
        suspend fun pause(
            params: StoreReportPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pause */
        @MustBeClosed
        suspend fun pause(reportId: String, requestOptions: RequestOptions): HttpResponse =
            pause(reportId, StoreReportPauseParams.none(), requestOptions)
    }
}
