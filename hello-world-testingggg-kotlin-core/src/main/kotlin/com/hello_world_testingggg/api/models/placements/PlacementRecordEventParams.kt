// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import java.util.Objects

/** Appends a transfer, checkup, or disruption event to a placement's history. */
class PlacementRecordEventParams
private constructor(
    private val placementId: String?,
    private val placementEvent: PlacementEvent,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun placementId(): String? = placementId

    /**
     * A placement history entry; the shape depends on the event kind and carries no discriminator
     * mapping.
     */
    fun placementEvent(): PlacementEvent = placementEvent

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlacementRecordEventParams].
         *
         * The following fields are required:
         * ```kotlin
         * .placementEvent()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlacementRecordEventParams]. */
    class Builder internal constructor() {

        private var placementId: String? = null
        private var placementEvent: PlacementEvent? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(placementRecordEventParams: PlacementRecordEventParams) = apply {
            placementId = placementRecordEventParams.placementId
            placementEvent = placementRecordEventParams.placementEvent
            additionalHeaders = placementRecordEventParams.additionalHeaders.toBuilder()
            additionalQueryParams = placementRecordEventParams.additionalQueryParams.toBuilder()
        }

        fun placementId(placementId: String?) = apply { this.placementId = placementId }

        /**
         * A placement history entry; the shape depends on the event kind and carries no
         * discriminator mapping.
         */
        fun placementEvent(placementEvent: PlacementEvent) = apply {
            this.placementEvent = placementEvent
        }

        /** Alias for calling [placementEvent] with `PlacementEvent.ofTransfer(transfer)`. */
        fun placementEvent(transfer: PlacementEvent.PlacementTransferEvent) =
            placementEvent(PlacementEvent.ofTransfer(transfer))

        /** Alias for calling [placementEvent] with `PlacementEvent.ofCheckup(checkup)`. */
        fun placementEvent(checkup: PlacementEvent.PlacementCheckupEvent) =
            placementEvent(PlacementEvent.ofCheckup(checkup))

        /** Alias for calling [placementEvent] with `PlacementEvent.ofDisruption(disruption)`. */
        fun placementEvent(disruption: PlacementEvent.PlacementDisruptionEvent) =
            placementEvent(PlacementEvent.ofDisruption(disruption))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PlacementRecordEventParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .placementEvent()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlacementRecordEventParams =
            PlacementRecordEventParams(
                placementId,
                checkRequired("placementEvent", placementEvent),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PlacementEvent = placementEvent

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> placementId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlacementRecordEventParams &&
            placementId == other.placementId &&
            placementEvent == other.placementEvent &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(placementId, placementEvent, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlacementRecordEventParams{placementId=$placementId, placementEvent=$placementEvent, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
