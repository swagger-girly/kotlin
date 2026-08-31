// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreRetrieveActivityParamsTest {

    @Test
    fun create() {
        StoreRetrieveActivityParams.builder().activityId("activityId").build()
    }

    @Test
    fun pathParams() {
        val params = StoreRetrieveActivityParams.builder().activityId("activityId").build()

        assertThat(params._pathParam(0)).isEqualTo("activityId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
