// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports.inventory

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DailyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dailyServiceAsync = client.store().reports().inventory().daily()

        val dailyInventory =
            dailyServiceAsync.retrieve(
                DailyRetrieveParams.builder()
                    .reportId("reportId")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        dailyInventory.validate()
    }
}
