// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.store.reports.ReportPauseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportService = client.store().reports()

        val report = reportService.retrieve("reportId")

        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportService = client.store().reports()

        val page = reportService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun embed() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportService = client.store().reports()

        reportService.embed("reportId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pause() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportService = client.store().reports()

        reportService.pause(
            ReportPauseParams.builder()
                .reportId("reportId")
                .idempotencyKey("report-pause-123")
                .build()
        )
    }
}
