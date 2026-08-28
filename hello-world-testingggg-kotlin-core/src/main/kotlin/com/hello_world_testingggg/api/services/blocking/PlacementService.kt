// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.placements.Placement
import com.hello_world_testingggg.api.models.placements.PlacementCreateParams
import com.hello_world_testingggg.api.models.placements.PlacementListPage
import com.hello_world_testingggg.api.models.placements.PlacementListParams
import com.hello_world_testingggg.api.models.placements.PlacementRecordEventParams
import com.hello_world_testingggg.api.models.placements.PlacementRetrieveParams

/** Post-adoption placement tracking */
interface PlacementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlacementService

    /** Creates a placement for an approved adoption application. */
    fun create(
        params: PlacementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /** Returns a single placement, including its adoption application and event history. */
    fun retrieve(
        placementId: String,
        params: PlacementRetrieveParams = PlacementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement = retrieve(params.toBuilder().placementId(placementId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PlacementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /** @see retrieve */
    fun retrieve(placementId: String, requestOptions: RequestOptions): Placement =
        retrieve(placementId, PlacementRetrieveParams.none(), requestOptions)

    /** Returns a cursor-paginated list of placements. */
    fun list(
        params: PlacementListParams = PlacementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlacementListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PlacementListPage =
        list(PlacementListParams.none(), requestOptions)

    /** Appends a transfer, checkup, or disruption event to a placement's history. */
    fun recordEvent(
        placementId: String,
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement = recordEvent(params.toBuilder().placementId(placementId).build(), requestOptions)

    /** @see recordEvent */
    fun recordEvent(
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /** A view of [PlacementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlacementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /placements`, but is otherwise the same as
         * [PlacementService.create].
         */
        @MustBeClosed
        fun create(
            params: PlacementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>

        /**
         * Returns a raw HTTP response for `get /placements/{placementId}`, but is otherwise the
         * same as [PlacementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            placementId: String,
            params: PlacementRetrieveParams = PlacementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement> =
            retrieve(params.toBuilder().placementId(placementId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlacementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            placementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Placement> =
            retrieve(placementId, PlacementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /placements`, but is otherwise the same as
         * [PlacementService.list].
         */
        @MustBeClosed
        fun list(
            params: PlacementListParams = PlacementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlacementListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlacementListPage> =
            list(PlacementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /placements/{placementId}/events`, but is otherwise
         * the same as [PlacementService.recordEvent].
         */
        @MustBeClosed
        fun recordEvent(
            placementId: String,
            params: PlacementRecordEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement> =
            recordEvent(params.toBuilder().placementId(placementId).build(), requestOptions)

        /** @see recordEvent */
        @MustBeClosed
        fun recordEvent(
            params: PlacementRecordEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>
    }
}
