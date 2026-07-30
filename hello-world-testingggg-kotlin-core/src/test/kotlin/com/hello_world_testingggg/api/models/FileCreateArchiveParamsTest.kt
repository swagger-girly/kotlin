// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateArchiveParamsTest {

    @Test
    fun create() {
        FileCreateArchiveParams.builder()
            .addFile("Example data".byteInputStream())
            .manifest(
                FileCreateArchiveParams.Manifest.builder()
                    .name("name")
                    .addLabel("string")
                    .preservePaths(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FileCreateArchiveParams.builder()
                .addFile("Example data".byteInputStream())
                .manifest(
                    FileCreateArchiveParams.Manifest.builder()
                        .name("name")
                        .addLabel("string")
                        .preservePaths(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "files" to
                            MultipartField.builder<List<InputStream>>()
                                .value(listOf("Example data".byteInputStream()))
                                .contentType("application/octet-stream")
                                .build(),
                        "manifest" to
                            MultipartField.of(
                                FileCreateArchiveParams.Manifest.builder()
                                    .name("name")
                                    .addLabel("string")
                                    .preservePaths(true)
                                    .build()
                            ),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileCreateArchiveParams.builder().addFile("Example data".byteInputStream()).build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "files" to
                            MultipartField.builder<List<InputStream>>()
                                .value(listOf("Example data".byteInputStream()))
                                .contentType("application/octet-stream")
                                .build()
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
