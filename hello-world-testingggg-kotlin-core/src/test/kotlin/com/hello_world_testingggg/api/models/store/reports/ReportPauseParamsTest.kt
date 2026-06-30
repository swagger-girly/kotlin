// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports

import com.hello_world_testingggg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportPauseParamsTest {

    @Test
    fun create() {
        ReportPauseParams.builder().reportId("reportId").idempotencyKey("report-pause-123").build()
    }

    @Test
    fun pathParams() {
        val params = ReportPauseParams.builder().reportId("reportId").build()

        assertThat(params._pathParam(0)).isEqualTo("reportId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ReportPauseParams.builder()
                .reportId("reportId")
                .idempotencyKey("report-pause-123")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "report-pause-123").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = ReportPauseParams.builder().reportId("reportId").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
