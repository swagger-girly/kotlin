// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.adoptions.PolicyService
import java.util.Objects

/** @see PolicyService.list */
class AdoptionPolicyListPage
private constructor(
    private val service: PolicyService,
    private val params: AdoptionPolicyListParams,
    private val response: AdoptionPolicyListPageResponse,
) : Page<Policy> {

    /**
     * Delegates to [AdoptionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see AdoptionPolicyListPageResponse.items
     */
    override fun items(): List<Policy> = response._items().getNullable("items") ?: emptyList()

    /**
     * Delegates to [AdoptionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see AdoptionPolicyListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AdoptionPolicyListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AdoptionPolicyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Policy> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AdoptionPolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): AdoptionPolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdoptionPolicyListPage].
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

    /** A builder for [AdoptionPolicyListPage]. */
    class Builder internal constructor() {

        private var service: PolicyService? = null
        private var params: AdoptionPolicyListParams? = null
        private var response: AdoptionPolicyListPageResponse? = null

        internal fun from(adoptionPolicyListPage: AdoptionPolicyListPage) = apply {
            service = adoptionPolicyListPage.service
            params = adoptionPolicyListPage.params
            response = adoptionPolicyListPage.response
        }

        fun service(service: PolicyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AdoptionPolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AdoptionPolicyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AdoptionPolicyListPage].
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
        fun build(): AdoptionPolicyListPage =
            AdoptionPolicyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdoptionPolicyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AdoptionPolicyListPage{service=$service, params=$params, response=$response}"
}
