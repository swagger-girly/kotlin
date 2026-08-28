// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaTextFirstResponseTest {

    @Test
    fun create() {
        val mediaTextFirstResponse =
            MediaTextFirstResponse.builder().id("id").label("label").build()

        assertThat(mediaTextFirstResponse.id()).isEqualTo("id")
        assertThat(mediaTextFirstResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaTextFirstResponse =
            MediaTextFirstResponse.builder().id("id").label("label").build()

        val roundtrippedMediaTextFirstResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaTextFirstResponse),
                jacksonTypeRef<MediaTextFirstResponse>(),
            )

        assertThat(roundtrippedMediaTextFirstResponse).isEqualTo(mediaTextFirstResponse)
    }
}
