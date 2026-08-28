// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.PlacementServiceAsync
import java.util.Objects

/** @see PlacementServiceAsync.list */
class PlacementListPageAsync
private constructor(
    private val service: PlacementServiceAsync,
    private val params: PlacementListParams,
    private val response: PlacementListPageResponse,
) : PageAsync<Placement> {

    /**
     * Delegates to [PlacementListPageResponse], but gracefully handles missing data.
     *
     * @see PlacementListPageResponse.items
     */
    override fun items(): List<Placement> = response._items().getNullable("items") ?: emptyList()

    /**
     * Delegates to [PlacementListPageResponse], but gracefully handles missing data.
     *
     * @see PlacementListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PlacementListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PlacementListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Placement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlacementListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlacementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlacementListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlacementListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlacementServiceAsync? = null
        private var params: PlacementListParams? = null
        private var response: PlacementListPageResponse? = null

        internal fun from(placementListPageAsync: PlacementListPageAsync) = apply {
            service = placementListPageAsync.service
            params = placementListPageAsync.params
            response = placementListPageAsync.response
        }

        fun service(service: PlacementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlacementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlacementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlacementListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlacementListPageAsync =
            PlacementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlacementListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlacementListPageAsync{service=$service, params=$params, response=$response}"
}
