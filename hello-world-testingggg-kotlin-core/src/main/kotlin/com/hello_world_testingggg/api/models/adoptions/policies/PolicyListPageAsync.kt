// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.adoptions.PolicyServiceAsync
import java.util.Objects

/** @see PolicyServiceAsync.list */
class PolicyListPageAsync
private constructor(
    private val service: PolicyServiceAsync,
    private val params: PolicyListParams,
    private val response: PolicyListPageResponse,
) : PageAsync<Policy> {

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

    override suspend fun nextPage(): PolicyListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Policy> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): PolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolicyListPageAsync].
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

    /** A builder for [PolicyListPageAsync]. */
    class Builder internal constructor() {

        private var service: PolicyServiceAsync? = null
        private var params: PolicyListParams? = null
        private var response: PolicyListPageResponse? = null

        internal fun from(policyListPageAsync: PolicyListPageAsync) = apply {
            service = policyListPageAsync.service
            params = policyListPageAsync.params
            response = policyListPageAsync.response
        }

        fun service(service: PolicyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PolicyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PolicyListPageAsync].
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
        fun build(): PolicyListPageAsync =
            PolicyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolicyListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PolicyListPageAsync{service=$service, params=$params, response=$response}"
}
