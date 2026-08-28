// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaJsonAndXmlResponseTest {

    @Test
    fun create() {
        val mediaJsonAndXmlResponse =
            MediaJsonAndXmlResponse.builder().id("id").label("label").build()

        assertThat(mediaJsonAndXmlResponse.id()).isEqualTo("id")
        assertThat(mediaJsonAndXmlResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaJsonAndXmlResponse =
            MediaJsonAndXmlResponse.builder().id("id").label("label").build()

        val roundtrippedMediaJsonAndXmlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaJsonAndXmlResponse),
                jacksonTypeRef<MediaJsonAndXmlResponse>(),
            )

        assertThat(roundtrippedMediaJsonAndXmlResponse).isEqualTo(mediaJsonAndXmlResponse)
    }
}
