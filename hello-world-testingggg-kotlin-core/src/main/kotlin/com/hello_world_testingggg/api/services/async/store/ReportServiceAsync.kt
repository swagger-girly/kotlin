// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.store.reports.Report
import com.hello_world_testingggg.api.models.store.reports.ReportEmbedParams
import com.hello_world_testingggg.api.models.store.reports.ReportListPageAsync
import com.hello_world_testingggg.api.models.store.reports.ReportListParams
import com.hello_world_testingggg.api.models.store.reports.ReportPauseParams
import com.hello_world_testingggg.api.models.store.reports.ReportRetrieveParams
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
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report = retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report

    /** @see retrieve */
    suspend fun retrieve(reportId: String, requestOptions: RequestOptions): Report =
        retrieve(reportId, ReportRetrieveParams.none(), requestOptions)

    /** Returns a cursor-id paginated list of generated store reports. */
    suspend fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ReportListPageAsync =
        list(ReportListParams.none(), requestOptions)

    /** Returns an embeddable HTML representation of a store report. */
    suspend fun embed(
        reportId: String,
        params: ReportEmbedParams = ReportEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = embed(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see embed */
    suspend fun embed(
        params: ReportEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see embed */
    suspend fun embed(reportId: String, requestOptions: RequestOptions): String =
        embed(reportId, ReportEmbedParams.none(), requestOptions)

    /** Pauses a report generation job and returns an empty success response. */
    suspend fun pause(
        reportId: String,
        params: ReportPauseParams = ReportPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see pause */
    suspend fun pause(
        params: ReportPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pause */
    suspend fun pause(reportId: String, requestOptions: RequestOptions) =
        pause(reportId, ReportPauseParams.none(), requestOptions)

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
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report> =
            retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Report> = retrieve(reportId, ReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports`, but is otherwise the same as
         * [ReportServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ReportListPageAsync> =
            list(ReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/embed`, but is otherwise
         * the same as [ReportServiceAsync.embed].
         */
        @MustBeClosed
        suspend fun embed(
            reportId: String,
            params: ReportEmbedParams = ReportEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            embed(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see embed */
        @MustBeClosed
        suspend fun embed(
            params: ReportEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see embed */
        @MustBeClosed
        suspend fun embed(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> = embed(reportId, ReportEmbedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /store/reports/{reportId}/pause`, but is otherwise
         * the same as [ReportServiceAsync.pause].
         */
        @MustBeClosed
        suspend fun pause(
            reportId: String,
            params: ReportPauseParams = ReportPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see pause */
        @MustBeClosed
        suspend fun pause(
            params: ReportPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pause */
        @MustBeClosed
        suspend fun pause(reportId: String, requestOptions: RequestOptions): HttpResponse =
            pause(reportId, ReportPauseParams.none(), requestOptions)
    }
}
