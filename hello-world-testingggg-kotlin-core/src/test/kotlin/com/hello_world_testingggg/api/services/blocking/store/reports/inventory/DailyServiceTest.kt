// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports.inventory

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.store.reports.inventory.daily.DailyRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DailyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val dailyService = client.store().reports().inventory().daily()

        val dailyInventory =
            dailyService.retrieve(
                DailyRetrieveParams.builder()
                    .reportId("reportId")
                    .date(LocalDate.parse("2019-12-27"))
                    .build()
            )

        dailyInventory.validate()
    }
}
