// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryResponseTest {

    @Test
    fun create() {
        val inventoryResponse =
            InventoryResponse.builder()
                .addData(
                    InventoryResponse.StoreReportInventoryRow.builder()
                        .quantity(0)
                        .sku("sku")
                        .attributes(
                            InventoryResponse.StoreReportInventoryRow.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .petId(0L)
                        .build()
                )
                .build()

        assertThat(inventoryResponse.data())
            .containsExactly(
                InventoryResponse.StoreReportInventoryRow.builder()
                    .quantity(0)
                    .sku("sku")
                    .attributes(
                        InventoryResponse.StoreReportInventoryRow.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .petId(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inventoryResponse =
            InventoryResponse.builder()
                .addData(
                    InventoryResponse.StoreReportInventoryRow.builder()
                        .quantity(0)
                        .sku("sku")
                        .attributes(
                            InventoryResponse.StoreReportInventoryRow.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .petId(0L)
                        .build()
                )
                .build()

        val roundtrippedInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inventoryResponse),
                jacksonTypeRef<InventoryResponse>(),
            )

        assertThat(roundtrippedInventoryResponse).isEqualTo(inventoryResponse)
    }
}
