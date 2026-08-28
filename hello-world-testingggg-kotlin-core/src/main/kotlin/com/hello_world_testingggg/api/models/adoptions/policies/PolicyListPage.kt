// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.adoptions.PolicyService
import java.util.Objects

/** @see PolicyService.list */
class PolicyListPage
private constructor(
    private val service: PolicyService,
    private val params: PolicyListParams,
    private val response: PolicyListPageResponse,
) : Page<Policy> {

    /**
     * Delegates to [PolicyListPageResponse], but gracefully handles missing data.
     *
     * @see PolicyListPageResponse.items
     */
    override fun items(): List<Policy> = response._items().getNullable("items") ?: emptyList()

    /**
     * Delegates to [PolicyListPageResponse], but gracefully handles missing data.
     *
     * @see PolicyListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PolicyListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PolicyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Policy> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): PolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolicyListPage].
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

    /** A builder for [PolicyListPage]. */
    class Builder internal constructor() {

        private var service: PolicyService? = null
        private var params: PolicyListParams? = null
        private var response: PolicyListPageResponse? = null

        internal fun from(policyListPage: PolicyListPage) = apply {
            service = policyListPage.service
            params = policyListPage.params
            response = policyListPage.response
        }

        fun service(service: PolicyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PolicyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PolicyListPage].
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
        fun build(): PolicyListPage =
            PolicyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolicyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "PolicyListPage{service=$service, params=$params, response=$response}"
}
