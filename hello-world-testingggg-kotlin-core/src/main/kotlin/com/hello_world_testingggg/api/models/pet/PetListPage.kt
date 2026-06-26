// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.PetService
import java.util.Objects

/** @see PetService.list */
class PetListPage
private constructor(
    private val service: PetService,
    private val params: PetListParams,
    private val response: PetListPageResponse,
) : Page<Pet> {

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

    override fun nextPage(): PetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Pet> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PetListPage].
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

    /** A builder for [PetListPage]. */
    class Builder internal constructor() {

        private var service: PetService? = null
        private var params: PetListParams? = null
        private var response: PetListPageResponse? = null

        internal fun from(petListPage: PetListPage) = apply {
            service = petListPage.service
            params = petListPage.params
            response = petListPage.response
        }

        fun service(service: PetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PetListPage].
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
        fun build(): PetListPage =
            PetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "PetListPage{service=$service, params=$params, response=$response}"
}
