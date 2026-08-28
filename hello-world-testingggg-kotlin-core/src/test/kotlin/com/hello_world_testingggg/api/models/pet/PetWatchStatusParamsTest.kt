// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetWatchStatusParamsTest {

    @Test
    fun create() {
        PetWatchStatusParams.builder().petId(0L).lastEventId("Last-Event-ID").build()
    }

    @Test
    fun pathParams() {
        val params = PetWatchStatusParams.builder().petId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params = PetWatchStatusParams.builder().petId(0L).lastEventId("Last-Event-ID").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Last-Event-ID", "Last-Event-ID").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PetWatchStatusParams.builder().petId(0L).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
