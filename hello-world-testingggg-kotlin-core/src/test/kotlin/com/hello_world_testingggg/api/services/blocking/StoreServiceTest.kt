// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
