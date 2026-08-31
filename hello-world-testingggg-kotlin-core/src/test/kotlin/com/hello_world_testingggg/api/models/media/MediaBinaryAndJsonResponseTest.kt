// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBinaryAndJsonResponseTest {

    @Test
    fun create() {
        val mediaBinaryAndJsonResponse =
            MediaBinaryAndJsonResponse.builder().id("id").label("label").build()

        assertThat(mediaBinaryAndJsonResponse.id()).isEqualTo("id")
        assertThat(mediaBinaryAndJsonResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBinaryAndJsonResponse =
            MediaBinaryAndJsonResponse.builder().id("id").label("label").build()

        val roundtrippedMediaBinaryAndJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBinaryAndJsonResponse),
                jacksonTypeRef<MediaBinaryAndJsonResponse>(),
            )

        assertThat(roundtrippedMediaBinaryAndJsonResponse).isEqualTo(mediaBinaryAndJsonResponse)
    }
}
