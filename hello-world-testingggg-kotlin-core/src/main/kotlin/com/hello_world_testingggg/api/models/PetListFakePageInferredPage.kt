// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.PetService
import java.util.Objects

/** @see PetService.listFakePageInferred */
class PetListFakePageInferredPage
private constructor(
    private val service: PetService,
    private val params: PetListFakePageInferredParams,
    private val response: PetListFakePageInferredPageResponse,
) : Page<Pet> {

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

    override fun nextPage(): PetListFakePageInferredPage =
        service.listFakePageInferred(nextPageParams())

    fun autoPager(): AutoPager<Pet> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListFakePageInferredParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListFakePageInferredPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PetListFakePageInferredPage].
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

    /** A builder for [PetListFakePageInferredPage]. */
    class Builder internal constructor() {

        private var service: PetService? = null
        private var params: PetListFakePageInferredParams? = null
        private var response: PetListFakePageInferredPageResponse? = null

        internal fun from(petListFakePageInferredPage: PetListFakePageInferredPage) = apply {
            service = petListFakePageInferredPage.service
            params = petListFakePageInferredPage.params
            response = petListFakePageInferredPage.response
        }

        fun service(service: PetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListFakePageInferredParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListFakePageInferredPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PetListFakePageInferredPage].
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
        fun build(): PetListFakePageInferredPage =
            PetListFakePageInferredPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListFakePageInferredPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PetListFakePageInferredPage{service=$service, params=$params, response=$response}"
}
