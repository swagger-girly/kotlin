// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import java.util.Objects

/** @see PetServiceAsync.list */
class PetListPageAsync
private constructor(
    private val service: PetServiceAsync,
    private val params: PetListParams,
    private val response: PetListPageResponse,
) : PageAsync<Pet> {

    /**
     * Delegates to [PetListPageResponse], but gracefully handles missing data.
     *
     * @see PetListPageResponse.items
     */
    override fun items(): List<Pet> = response._items().getNullable("items") ?: emptyList()

    /**
     * Delegates to [PetListPageResponse], but gracefully handles missing data.
     *
     * @see PetListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PetListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PetListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Pet> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PetListPageAsync].
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

    /** A builder for [PetListPageAsync]. */
    class Builder internal constructor() {

        private var service: PetServiceAsync? = null
        private var params: PetListParams? = null
        private var response: PetListPageResponse? = null

        internal fun from(petListPageAsync: PetListPageAsync) = apply {
            service = petListPageAsync.service
            params = petListPageAsync.params
            response = petListPageAsync.response
        }

        fun service(service: PetServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PetListPageAsync].
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
        fun build(): PetListPageAsync =
            PetListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PetListPageAsync{service=$service, params=$params, response=$response}"
}
