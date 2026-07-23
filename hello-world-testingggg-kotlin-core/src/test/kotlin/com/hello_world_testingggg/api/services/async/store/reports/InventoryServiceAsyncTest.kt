// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store.reports

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InventoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val inventoryServiceAsync = client.store().reports().inventory()

        val inventoryResponse = inventoryServiceAsync.list("reportId")

        inventoryResponse.validate()
    }
}
