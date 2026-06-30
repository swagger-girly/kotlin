// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArchiveTest {

    @Test
    fun create() {
        val archive = Archive.builder().id("id").status(Archive.Status.QUEUED).fileCount(0).build()

        assertThat(archive.id()).isEqualTo("id")
        assertThat(archive.status()).isEqualTo(Archive.Status.QUEUED)
        assertThat(archive.fileCount()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val archive = Archive.builder().id("id").status(Archive.Status.QUEUED).fileCount(0).build()

        val roundtrippedArchive =
            jsonMapper.readValue(jsonMapper.writeValueAsString(archive), jacksonTypeRef<Archive>())

        assertThat(roundtrippedArchive).isEqualTo(archive)
    }
}
