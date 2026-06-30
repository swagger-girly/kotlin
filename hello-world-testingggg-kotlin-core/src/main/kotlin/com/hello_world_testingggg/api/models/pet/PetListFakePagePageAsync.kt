// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import java.util.Objects

/** @see PetServiceAsync.listFakePage */
class PetListFakePagePageAsync
private constructor(
    private val service: PetServiceAsync,
    private val params: PetListFakePageParams,
    private val response: PetListFakePagePageResponse,
) : PageAsync<Pet> {

    /**
     * Delegates to [PetListFakePagePageResponse], but gracefully handles missing data.
     *
     * @see PetListFakePagePageResponse.data
     */
    fun data(): List<Pet> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PetListFakePagePageResponse], but gracefully handles missing data.
     *
     * @see PetListFakePagePageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<Pet> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): PetListFakePageParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): PetListFakePagePageAsync =
        service.listFakePage(nextPageParams())

    fun autoPager(): AutoPagerAsync<Pet> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListFakePageParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListFakePagePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PetListFakePagePageAsync].
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

    /** A builder for [PetListFakePagePageAsync]. */
    class Builder internal constructor() {

        private var service: PetServiceAsync? = null
        private var params: PetListFakePageParams? = null
        private var response: PetListFakePagePageResponse? = null

        internal fun from(petListFakePagePageAsync: PetListFakePagePageAsync) = apply {
            service = petListFakePagePageAsync.service
            params = petListFakePagePageAsync.params
            response = petListFakePagePageAsync.response
        }

        fun service(service: PetServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListFakePageParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListFakePagePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PetListFakePagePageAsync].
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
        fun build(): PetListFakePagePageAsync =
            PetListFakePagePageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListFakePagePageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PetListFakePagePageAsync{service=$service, params=$params, response=$response}"
}
