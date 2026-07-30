// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.StoreReportPauseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportServiceAsync = client.store().reports()

        val report = reportServiceAsync.retrieve("reportId")

        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportServiceAsync = client.store().reports()

        val page = reportServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun embed() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportServiceAsync = client.store().reports()

        reportServiceAsync.embed("reportId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun pause() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val reportServiceAsync = client.store().reports()

        reportServiceAsync.pause(
            StoreReportPauseParams.builder()
                .reportId("reportId")
                .idempotencyKey("report-pause-123")
                .build()
        )
    }
}
