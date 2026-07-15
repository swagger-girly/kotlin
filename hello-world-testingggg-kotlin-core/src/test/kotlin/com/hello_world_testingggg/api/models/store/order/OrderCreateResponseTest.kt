// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.order

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCreateResponseTest {

    @Test
    fun create() {
        val orderCreateResponse =
            OrderCreateResponse.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(OrderCreateResponse.Status.APPROVED)
                .total(Money.builder().amount(2500L).currency("USD").build())
                .build()

        assertThat(orderCreateResponse.id()).isEqualTo(10L)
        assertThat(orderCreateResponse.complete()).isEqualTo(true)
        assertThat(orderCreateResponse.petId()).isEqualTo(198772L)
        assertThat(orderCreateResponse.quantity()).isEqualTo(7)
        assertThat(orderCreateResponse.shipDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(orderCreateResponse.status()).isEqualTo(OrderCreateResponse.Status.APPROVED)
        assertThat(orderCreateResponse.total())
            .isEqualTo(Money.builder().amount(2500L).currency("USD").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderCreateResponse =
            OrderCreateResponse.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(OrderCreateResponse.Status.APPROVED)
                .total(Money.builder().amount(2500L).currency("USD").build())
                .build()

        val roundtrippedOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderCreateResponse),
                jacksonTypeRef<OrderCreateResponse>(),
            )

        assertThat(roundtrippedOrderCreateResponse).isEqualTo(orderCreateResponse)
    }
}
