// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileslistTest {

    @Test
    fun create() {
        val fileslist =
            Fileslist.builder()
                .addData(
                    File.builder()
                        .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .path("path")
                        .size(0L)
                        .contentType("contentType")
                        .build()
                )
                .build()

        assertThat(fileslist.data())
            .containsExactly(
                File.builder()
                    .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .path("path")
                    .size(0L)
                    .contentType("contentType")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileslist =
            Fileslist.builder()
                .addData(
                    File.builder()
                        .lastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .path("path")
                        .size(0L)
                        .contentType("contentType")
                        .build()
                )
                .build()

        val roundtrippedFileslist =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileslist),
                jacksonTypeRef<Fileslist>(),
            )

        assertThat(roundtrippedFileslist).isEqualTo(fileslist)
    }
}
