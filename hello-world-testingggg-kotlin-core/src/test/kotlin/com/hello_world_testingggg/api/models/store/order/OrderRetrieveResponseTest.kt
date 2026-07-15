// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.order

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderRetrieveResponseTest {

    @Test
    fun create() {
        val orderRetrieveResponse =
            OrderRetrieveResponse.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(OrderRetrieveResponse.Status.APPROVED)
                .total(Money.builder().amount(2500L).currency("USD").build())
                .build()

        assertThat(orderRetrieveResponse.id()).isEqualTo(10L)
        assertThat(orderRetrieveResponse.complete()).isEqualTo(true)
        assertThat(orderRetrieveResponse.petId()).isEqualTo(198772L)
        assertThat(orderRetrieveResponse.quantity()).isEqualTo(7)
        assertThat(orderRetrieveResponse.shipDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(orderRetrieveResponse.status()).isEqualTo(OrderRetrieveResponse.Status.APPROVED)
        assertThat(orderRetrieveResponse.total())
            .isEqualTo(Money.builder().amount(2500L).currency("USD").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderRetrieveResponse =
            OrderRetrieveResponse.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(OrderRetrieveResponse.Status.APPROVED)
                .total(Money.builder().amount(2500L).currency("USD").build())
                .build()

        val roundtrippedOrderRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderRetrieveResponse),
                jacksonTypeRef<OrderRetrieveResponse>(),
            )

        assertThat(roundtrippedOrderRetrieveResponse).isEqualTo(orderRetrieveResponse)
    }
}
