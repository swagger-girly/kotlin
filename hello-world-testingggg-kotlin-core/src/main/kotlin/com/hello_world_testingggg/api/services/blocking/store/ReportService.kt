// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.Report
import com.hello_world_testingggg.api.models.StoreReportEmbedParams
import com.hello_world_testingggg.api.models.StoreReportListPage
import com.hello_world_testingggg.api.models.StoreReportListParams
import com.hello_world_testingggg.api.models.StoreReportPauseParams
import com.hello_world_testingggg.api.models.StoreReportRetrieveParams
import com.hello_world_testingggg.api.services.blocking.store.reports.InventoryService

/** Access to Petstore orders */
interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportService

    /** Access to Petstore orders */
    fun inventory(): InventoryService

    /** Returns a generated store report. */
    fun retrieve(
        reportId: String,
        params: StoreReportRetrieveParams = StoreReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report = retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: StoreReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Report

    /** @see retrieve */
    fun retrieve(reportId: String, requestOptions: RequestOptions): Report =
        retrieve(reportId, StoreReportRetrieveParams.none(), requestOptions)

    /** Returns a cursor-id paginated list of generated store reports. */
    fun list(
        params: StoreReportListParams = StoreReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreReportListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): StoreReportListPage =
        list(StoreReportListParams.none(), requestOptions)

    /** Returns an embeddable HTML representation of a store report. */
    fun embed(
        reportId: String,
        params: StoreReportEmbedParams = StoreReportEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = embed(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see embed */
    fun embed(
        params: StoreReportEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see embed */
    fun embed(reportId: String, requestOptions: RequestOptions): String =
        embed(reportId, StoreReportEmbedParams.none(), requestOptions)

    /** Pauses a report generation job and returns an empty success response. */
    fun pause(
        reportId: String,
        params: StoreReportPauseParams = StoreReportPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see pause */
    fun pause(
        params: StoreReportPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pause */
    fun pause(reportId: String, requestOptions: RequestOptions) =
        pause(reportId, StoreReportPauseParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportService.WithRawResponse

        /** Access to Petstore orders */
        fun inventory(): InventoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}`, but is otherwise the
         * same as [ReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            reportId: String,
            params: StoreReportRetrieveParams = StoreReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report> =
            retrieve(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StoreReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Report>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(reportId: String, requestOptions: RequestOptions): HttpResponseFor<Report> =
            retrieve(reportId, StoreReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports`, but is otherwise the same as
         * [ReportService.list].
         */
        @MustBeClosed
        fun list(
            params: StoreReportListParams = StoreReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreReportListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StoreReportListPage> =
            list(StoreReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/reports/{reportId}/embed`, but is otherwise
         * the same as [ReportService.embed].
         */
        @MustBeClosed
        fun embed(
            reportId: String,
            params: StoreReportEmbedParams = StoreReportEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            embed(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see embed */
        @MustBeClosed
        fun embed(
            params: StoreReportEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see embed */
        @MustBeClosed
        fun embed(reportId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            embed(reportId, StoreReportEmbedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /store/reports/{reportId}/pause`, but is otherwise
         * the same as [ReportService.pause].
         */
        @MustBeClosed
        fun pause(
            reportId: String,
            params: StoreReportPauseParams = StoreReportPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pause(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see pause */
        @MustBeClosed
        fun pause(
            params: StoreReportPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pause */
        @MustBeClosed
        fun pause(reportId: String, requestOptions: RequestOptions): HttpResponse =
            pause(reportId, StoreReportPauseParams.none(), requestOptions)
    }
}
