// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreReportGeneratedWebhookEventTest {

    @Test
    fun create() {
        val storeReportGeneratedWebhookEvent =
            StoreReportGeneratedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metrics(JsonValue.from(mapOf<String, Any>()))
                .report(
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
                .type(StoreReportGeneratedWebhookEvent.Type.STORE_REPORT_GENERATED)
                .build()

        assertThat(storeReportGeneratedWebhookEvent.id()).isEqualTo("id")
        assertThat(storeReportGeneratedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(storeReportGeneratedWebhookEvent._metrics())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(storeReportGeneratedWebhookEvent.report())
            .isEqualTo(
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
        assertThat(storeReportGeneratedWebhookEvent.type())
            .isEqualTo(StoreReportGeneratedWebhookEvent.Type.STORE_REPORT_GENERATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val storeReportGeneratedWebhookEvent =
            StoreReportGeneratedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metrics(JsonValue.from(mapOf<String, Any>()))
                .report(
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
                .type(StoreReportGeneratedWebhookEvent.Type.STORE_REPORT_GENERATED)
                .build()

        val roundtrippedStoreReportGeneratedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeReportGeneratedWebhookEvent),
                jacksonTypeRef<StoreReportGeneratedWebhookEvent>(),
            )

        assertThat(roundtrippedStoreReportGeneratedWebhookEvent)
            .isEqualTo(storeReportGeneratedWebhookEvent)
    }
}
