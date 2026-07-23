// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store.reports

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val inventoryService = client.store().reports().inventory()

        val inventoryResponse = inventoryService.list("reportId")

        inventoryResponse.validate()
    }
}
