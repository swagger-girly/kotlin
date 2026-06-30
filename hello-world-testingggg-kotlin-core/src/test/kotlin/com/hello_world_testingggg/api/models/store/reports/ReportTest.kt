// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportTest {

    @Test
    fun create() {
        val report =
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
                    Report.Totals.builder().putAdditionalProperty("foo", JsonValue.from(0)).build()
                )
                .build()

        assertThat(report.id()).isEqualTo("id")
        assertThat(report.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(report.status()).isEqualTo(Report.Status.QUEUED)
        assertThat(report.completedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(report.filters())
            .isEqualTo(
                Report.Filters.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(report.totals())
            .isEqualTo(
                Report.Totals.builder().putAdditionalProperty("foo", JsonValue.from(0)).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val report =
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
                    Report.Totals.builder().putAdditionalProperty("foo", JsonValue.from(0)).build()
                )
                .build()

        val roundtrippedReport =
            jsonMapper.readValue(jsonMapper.writeValueAsString(report), jacksonTypeRef<Report>())

        assertThat(roundtrippedReport).isEqualTo(report)
    }
}
