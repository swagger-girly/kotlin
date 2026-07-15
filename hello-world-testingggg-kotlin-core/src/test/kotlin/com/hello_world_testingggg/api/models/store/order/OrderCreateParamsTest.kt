// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.order

import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCreateParamsTest {

    @Test
    fun create() {
        OrderCreateParams.builder()
            .id(10L)
            .complete(true)
            .petId(198772L)
            .quantity(7)
            .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status(OrderCreateParams.Status.APPROVED)
            .total(Money.builder().amount(2500L).currency("USD").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            OrderCreateParams.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(OrderCreateParams.Status.APPROVED)
                .total(Money.builder().amount(2500L).currency("USD").build())
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo(10L)
        assertThat(body.complete()).isEqualTo(true)
        assertThat(body.petId()).isEqualTo(198772L)
        assertThat(body.quantity()).isEqualTo(7)
        assertThat(body.shipDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.status()).isEqualTo(OrderCreateParams.Status.APPROVED)
        assertThat(body.total()).isEqualTo(Money.builder().amount(2500L).currency("USD").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrderCreateParams.builder().build()

        val body = params._body()
    }
}
