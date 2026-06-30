// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports.inventory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryListParamsTest {

    @Test
    fun create() {
        InventoryListParams.builder().reportId("reportId").build()
    }

    @Test
    fun pathParams() {
        val params = InventoryListParams.builder().reportId("reportId").build()

        assertThat(params._pathParam(0)).isEqualTo("reportId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
