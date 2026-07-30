// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteParamsTest {

    @Test
    fun create() {
        FileDeleteParams.builder().path("path").build()
    }

    @Test
    fun pathParams() {
        val params = FileDeleteParams.builder().path("path").build()

        assertThat(params._pathParam(0)).isEqualTo("path")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
