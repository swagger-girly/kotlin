// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUpdateParamsTest {

    @Test
    fun create() {
        FileUpdateParams.builder()
            .path("path")
            .file("Example data".byteInputStream())
            .metadata(
                FileUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .url("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileUpdateParams.builder().path("path").build()

        assertThat(params._pathParam(0)).isEqualTo("path")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FileUpdateParams.builder()
                .path("path")
                .file("Example data".byteInputStream())
                .metadata(
                    FileUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .url("https://example.com")
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
                        "metadata" to
                            MultipartField.of(
                                FileUpdateParams.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            ),
                        "url" to MultipartField.of("https://example.com"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileUpdateParams.builder().path("path").build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
