// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.files

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadParamsTest {

    @Test
    fun create() {
        FileUploadParams.builder()
            .file("Example data".byteInputStream())
            .expiresIn(0)
            .metadata(
                FileUploadParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .path("path")
            .public_(true)
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            FileUploadParams.builder()
                .file("Example data".byteInputStream())
                .expiresIn(0)
                .metadata(
                    FileUploadParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .path("path")
                .public_(true)
                .addTag("string")
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
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "expiresIn" to MultipartField.of(0),
                        "metadata" to
                            MultipartField.of(
                                FileUploadParams.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            ),
                        "path" to MultipartField.of("path"),
                        "public" to MultipartField.of(true),
                        "tags" to MultipartField.of(listOf("string")),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileUploadParams.builder().file("Example data".byteInputStream()).build()

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
                mapOf("file" to MultipartField.of("Example data".byteInputStream())).mapValues {
                    (_, field) ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
