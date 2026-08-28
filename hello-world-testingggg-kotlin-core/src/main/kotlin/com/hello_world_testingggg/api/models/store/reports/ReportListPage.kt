// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports

import com.hello_world_testingggg.api.core.AutoPager
import com.hello_world_testingggg.api.core.Page
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.services.blocking.store.ReportService
import java.util.Objects

/** @see ReportService.list */
class ReportListPage
private constructor(
    private val service: ReportService,
    private val params: ReportListParams,
    private val response: ReportList,
) : Page<Report> {

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

    fun nextPageParams(): ReportListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._id().getNullable("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getNullable("id")).build()
        }

    override fun nextPage(): ReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Report> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportList = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListPage].
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

    /** A builder for [ReportListPage]. */
    class Builder internal constructor() {

        private var service: ReportService? = null
        private var params: ReportListParams? = null
        private var response: ReportList? = null

        internal fun from(reportListPage: ReportListPage) = apply {
            service = reportListPage.service
            params = reportListPage.params
            response = reportListPage.response
        }

        fun service(service: ReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportList) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListPage].
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
        fun build(): ReportListPage =
            ReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ReportListPage{service=$service, params=$params, response=$response}"
}
