// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.adoptions.PolicyServiceAsync
import java.util.Objects

/** @see PolicyServiceAsync.list */
class AdoptionPolicyListPageAsync
private constructor(
    private val service: PolicyServiceAsync,
    private val params: AdoptionPolicyListParams,
    private val response: AdoptionPolicyListPageResponse,
) : PageAsync<Policy> {

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

    override suspend fun nextPage(): AdoptionPolicyListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Policy> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AdoptionPolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): AdoptionPolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdoptionPolicyListPageAsync].
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

    /** A builder for [AdoptionPolicyListPageAsync]. */
    class Builder internal constructor() {

        private var service: PolicyServiceAsync? = null
        private var params: AdoptionPolicyListParams? = null
        private var response: AdoptionPolicyListPageResponse? = null

        internal fun from(adoptionPolicyListPageAsync: AdoptionPolicyListPageAsync) = apply {
            service = adoptionPolicyListPageAsync.service
            params = adoptionPolicyListPageAsync.params
            response = adoptionPolicyListPageAsync.response
        }

        fun service(service: PolicyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AdoptionPolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AdoptionPolicyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AdoptionPolicyListPageAsync].
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
        fun build(): AdoptionPolicyListPageAsync =
            AdoptionPolicyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdoptionPolicyListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AdoptionPolicyListPageAsync{service=$service, params=$params, response=$response}"
}
