// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListTest {

    @Test
    fun create() {
        val reportList =
            ReportList.builder()
                .addData(
                    Report.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Report.Status.QUEUED)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filters(
                            Report.Filters.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .totals(
                            Report.Totals.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(reportList.data())
            .containsExactly(
                Report.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Report.Status.QUEUED)
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filters(
                        Report.Filters.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .totals(
                        Report.Totals.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(reportList.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportList =
            ReportList.builder()
                .addData(
                    Report.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Report.Status.QUEUED)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filters(
                            Report.Filters.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .totals(
                            Report.Totals.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedReportList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportList),
                jacksonTypeRef<ReportList>(),
            )

        assertThat(roundtrippedReportList).isEqualTo(reportList)
    }
}
