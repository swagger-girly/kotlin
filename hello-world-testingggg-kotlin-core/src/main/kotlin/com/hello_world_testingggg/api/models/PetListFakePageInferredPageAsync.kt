// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import java.util.Objects

/** @see PetServiceAsync.listFakePageInferred */
class PetListFakePageInferredPageAsync
private constructor(
    private val service: PetServiceAsync,
    private val params: PetListFakePageInferredParams,
    private val response: PetListFakePageInferredPageResponse,
) : PageAsync<Pet> {

    /**
     * Delegates to [PetListFakePageInferredPageResponse], but gracefully handles missing data.
     *
     * @see PetListFakePageInferredPageResponse.data
     */
    fun data(): List<Pet> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PetListFakePageInferredPageResponse], but gracefully handles missing data.
     *
     * @see PetListFakePageInferredPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<Pet> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): PetListFakePageInferredParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): PetListFakePageInferredPageAsync =
        service.listFakePageInferred(nextPageParams())

    fun autoPager(): AutoPagerAsync<Pet> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListFakePageInferredParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListFakePageInferredPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PetListFakePageInferredPageAsync].
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

    /** A builder for [PetListFakePageInferredPageAsync]. */
    class Builder internal constructor() {

        private var service: PetServiceAsync? = null
        private var params: PetListFakePageInferredParams? = null
        private var response: PetListFakePageInferredPageResponse? = null

        internal fun from(petListFakePageInferredPageAsync: PetListFakePageInferredPageAsync) =
            apply {
                service = petListFakePageInferredPageAsync.service
                params = petListFakePageInferredPageAsync.params
                response = petListFakePageInferredPageAsync.response
            }

        fun service(service: PetServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListFakePageInferredParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListFakePageInferredPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PetListFakePageInferredPageAsync].
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
        fun build(): PetListFakePageInferredPageAsync =
            PetListFakePageInferredPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListFakePageInferredPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PetListFakePageInferredPageAsync{service=$service, params=$params, response=$response}"
}
