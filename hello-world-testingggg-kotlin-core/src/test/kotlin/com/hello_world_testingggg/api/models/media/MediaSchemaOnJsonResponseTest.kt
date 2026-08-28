// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaSchemaOnJsonResponseTest {

    @Test
    fun create() {
        val mediaSchemaOnJsonResponse =
            MediaSchemaOnJsonResponse.builder().id("id").label("label").build()

        assertThat(mediaSchemaOnJsonResponse.id()).isEqualTo("id")
        assertThat(mediaSchemaOnJsonResponse.label()).isEqualTo("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaSchemaOnJsonResponse =
            MediaSchemaOnJsonResponse.builder().id("id").label("label").build()

        val roundtrippedMediaSchemaOnJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaSchemaOnJsonResponse),
                jacksonTypeRef<MediaSchemaOnJsonResponse>(),
            )

        assertThat(roundtrippedMediaSchemaOnJsonResponse).isEqualTo(mediaSchemaOnJsonResponse)
    }
}
