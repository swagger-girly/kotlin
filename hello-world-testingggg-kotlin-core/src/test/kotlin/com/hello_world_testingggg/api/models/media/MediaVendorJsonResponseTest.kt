// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaVendorJsonResponseTest {

    @Test
    fun create() {
        val mediaVendorJsonResponse =
            MediaVendorJsonResponse.builder().id("id").label("label").build()

        assertThat(mediaVendorJsonResponse.id()).isEqualTo("id")
        assertThat(mediaVendorJsonResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaVendorJsonResponse =
            MediaVendorJsonResponse.builder().id("id").label("label").build()

        val roundtrippedMediaVendorJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaVendorJsonResponse),
                jacksonTypeRef<MediaVendorJsonResponse>(),
            )

        assertThat(roundtrippedMediaVendorJsonResponse).isEqualTo(mediaVendorJsonResponse)
    }
}
