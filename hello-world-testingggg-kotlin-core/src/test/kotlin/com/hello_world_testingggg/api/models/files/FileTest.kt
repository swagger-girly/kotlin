// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .path("path")
                .size(0L)
                .contentType("contentType")
                .build()

        assertThat(file.lastModified()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.path()).isEqualTo("path")
        assertThat(file.size()).isEqualTo(0L)
        assertThat(file.contentType()).isEqualTo("contentType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val file =
            File.builder()
                .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .path("path")
                .size(0L)
                .contentType("contentType")
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
