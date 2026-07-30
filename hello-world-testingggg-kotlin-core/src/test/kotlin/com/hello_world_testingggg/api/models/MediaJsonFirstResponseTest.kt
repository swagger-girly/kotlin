// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaJsonFirstResponseTest {

    @Test
    fun create() {
        val mediaJsonFirstResponse =
            MediaJsonFirstResponse.builder().id("id").label("label").build()

        assertThat(mediaJsonFirstResponse.id()).isEqualTo("id")
        assertThat(mediaJsonFirstResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaJsonFirstResponse =
            MediaJsonFirstResponse.builder().id("id").label("label").build()

        val roundtrippedMediaJsonFirstResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaJsonFirstResponse),
                jacksonTypeRef<MediaJsonFirstResponse>(),
            )

        assertThat(roundtrippedMediaJsonFirstResponse).isEqualTo(mediaJsonFirstResponse)
    }
}
