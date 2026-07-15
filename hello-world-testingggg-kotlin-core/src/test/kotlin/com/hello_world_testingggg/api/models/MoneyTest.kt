// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoneyTest {

    @Test
    fun create() {
        val money = Money.builder().amount(2500L).currency("USD").build()

        assertThat(money.amount()).isEqualTo(2500L)
        assertThat(money.currency()).isEqualTo("USD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val money = Money.builder().amount(2500L).currency("USD").build()

        val roundtrippedMoney =
            jsonMapper.readValue(jsonMapper.writeValueAsString(money), jacksonTypeRef<Money>())

        assertThat(roundtrippedMoney).isEqualTo(money)
    }
}
