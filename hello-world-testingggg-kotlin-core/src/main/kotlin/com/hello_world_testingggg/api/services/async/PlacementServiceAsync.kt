// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.Placement
import com.hello_world_testingggg.api.models.PlacementCreateParams
import com.hello_world_testingggg.api.models.PlacementListPageAsync
import com.hello_world_testingggg.api.models.PlacementListParams
import com.hello_world_testingggg.api.models.PlacementRecordEventParams
import com.hello_world_testingggg.api.models.PlacementRetrieveParams

/** Post-adoption placement tracking */
interface PlacementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlacementServiceAsync

    /** Creates a placement for an approved adoption application. */
    suspend fun create(
        params: PlacementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /** Returns a single placement, including its adoption application and event history. */
    suspend fun retrieve(
        placementId: String,
        params: PlacementRetrieveParams = PlacementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement = retrieve(params.toBuilder().placementId(placementId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PlacementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /** @see retrieve */
    suspend fun retrieve(placementId: String, requestOptions: RequestOptions): Placement =
        retrieve(placementId, PlacementRetrieveParams.none(), requestOptions)

    /** Returns a cursor-paginated list of placements. */
    suspend fun list(
        params: PlacementListParams = PlacementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlacementListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PlacementListPageAsync =
        list(PlacementListParams.none(), requestOptions)

    /** Appends a transfer, checkup, or disruption event to a placement's history. */
    suspend fun recordEvent(
        placementId: String,
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement = recordEvent(params.toBuilder().placementId(placementId).build(), requestOptions)

    /** @see recordEvent */
    suspend fun recordEvent(
        params: PlacementRecordEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Placement

    /**
     * A view of [PlacementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlacementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /placements`, but is otherwise the same as
         * [PlacementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PlacementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>

        /**
         * Returns a raw HTTP response for `get /placements/{placementId}`, but is otherwise the
         * same as [PlacementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            placementId: String,
            params: PlacementRetrieveParams = PlacementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement> =
            retrieve(params.toBuilder().placementId(placementId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PlacementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            placementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Placement> =
            retrieve(placementId, PlacementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /placements`, but is otherwise the same as
         * [PlacementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PlacementListParams = PlacementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlacementListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PlacementListPageAsync> =
            list(PlacementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /placements/{placementId}/events`, but is otherwise
         * the same as [PlacementServiceAsync.recordEvent].
         */
        @MustBeClosed
        suspend fun recordEvent(
            placementId: String,
            params: PlacementRecordEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement> =
            recordEvent(params.toBuilder().placementId(placementId).build(), requestOptions)

        /** @see recordEvent */
        @MustBeClosed
        suspend fun recordEvent(
            params: PlacementRecordEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Placement>
    }
}
