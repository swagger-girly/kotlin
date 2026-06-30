// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.PetService
import java.util.Objects

/** @see PetService.listFakePage */
class PetListFakePagePage
private constructor(
    private val service: PetService,
    private val params: PetListFakePageParams,
    private val response: PetListFakePagePageResponse,
) : Page<Pet> {

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

    override fun nextPage(): PetListFakePagePage = service.listFakePage(nextPageParams())

    fun autoPager(): AutoPager<Pet> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PetListFakePageParams = params

    /** The response that this page was parsed from. */
    fun response(): PetListFakePagePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PetListFakePagePage].
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

    /** A builder for [PetListFakePagePage]. */
    class Builder internal constructor() {

        private var service: PetService? = null
        private var params: PetListFakePageParams? = null
        private var response: PetListFakePagePageResponse? = null

        internal fun from(petListFakePagePage: PetListFakePagePage) = apply {
            service = petListFakePagePage.service
            params = petListFakePagePage.params
            response = petListFakePagePage.response
        }

        fun service(service: PetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PetListFakePageParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PetListFakePagePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PetListFakePagePage].
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
        fun build(): PetListFakePagePage =
            PetListFakePagePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListFakePagePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PetListFakePagePage{service=$service, params=$params, response=$response}"
}
