// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.AutoPagerAsync
import com.hello_world_testingggg.api.core.PageAsync
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.async.store.ReportServiceAsync
import java.util.Objects

/** @see ReportServiceAsync.list */
class StoreReportListPageAsync
private constructor(
    private val service: ReportServiceAsync,
    private val params: StoreReportListParams,
    private val response: ReportList,
) : PageAsync<Report> {

    /**
     * Delegates to [ReportList], but gracefully handles missing data.
     *
     * @see ReportList.data
     */
    fun data(): List<Report> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ReportList], but gracefully handles missing data.
     *
     * @see ReportList.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<Report> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): StoreReportListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._id().getNullable("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getNullable("id")).build()
        }

    override suspend fun nextPage(): StoreReportListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Report> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StoreReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StoreReportListPageAsync].
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

    /** A builder for [StoreReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReportServiceAsync? = null
        private var params: StoreReportListParams? = null
        private var response: ReportList? = null

        internal fun from(storeReportListPageAsync: StoreReportListPageAsync) = apply {
            service = storeReportListPageAsync.service
            params = storeReportListPageAsync.params
            response = storeReportListPageAsync.response
        }

        fun service(service: ReportServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StoreReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [StoreReportListPageAsync].
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
        fun build(): StoreReportListPageAsync =
            StoreReportListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StoreReportListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "StoreReportListPageAsync{service=$service, params=$params, response=$response}"
}
