// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.store.order.OrderCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().order()

        val order =
            orderServiceAsync.create(
                OrderCreateParams.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(OrderCreateParams.Status.APPROVED)
                    .total(Money.builder().amount(2500L).currency("USD").build())
                    .build()
            )

        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().order()

        val order = orderServiceAsync.retrieve(0L)

        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().order()

        orderServiceAsync.delete(0L)
    }
}
