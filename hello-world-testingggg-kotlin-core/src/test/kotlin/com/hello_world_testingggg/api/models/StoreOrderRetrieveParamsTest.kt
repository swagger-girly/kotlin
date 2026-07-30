// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreOrderRetrieveParamsTest {

    @Test
    fun create() {
        StoreOrderRetrieveParams.builder().orderId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = StoreOrderRetrieveParams.builder().orderId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
