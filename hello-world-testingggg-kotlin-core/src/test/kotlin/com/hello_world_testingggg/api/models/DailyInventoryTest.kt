// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailyInventoryTest {

    @Test
    fun create() {
        val dailyInventory =
            DailyInventory.builder()
                .date(LocalDate.parse("2019-12-27"))
                .metrics(JsonValue.from(mapOf<String, Any>()))
                .addNote("string")
                .build()

        assertThat(dailyInventory.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(dailyInventory._metrics()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(dailyInventory.notes()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dailyInventory =
            DailyInventory.builder()
                .date(LocalDate.parse("2019-12-27"))
                .metrics(JsonValue.from(mapOf<String, Any>()))
                .addNote("string")
                .build()

        val roundtrippedDailyInventory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dailyInventory),
                jacksonTypeRef<DailyInventory>(),
            )

        assertThat(roundtrippedDailyInventory).isEqualTo(dailyInventory)
    }
}
