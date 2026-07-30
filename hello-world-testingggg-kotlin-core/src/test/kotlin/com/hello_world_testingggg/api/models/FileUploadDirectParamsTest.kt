// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadDirectParamsTest {

    @Test
    fun create() {
        FileUploadDirectParams.builder()
            .path("path")
            .xFileName("X-File-Name")
            .body("Example data")
            .build()
    }

    @Test
    fun headers() {
        val params =
            FileUploadDirectParams.builder()
                .path("path")
                .xFileName("X-File-Name")
                .body("Example data")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-File-Name", "X-File-Name").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = FileUploadDirectParams.builder().body("Example data").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            FileUploadDirectParams.builder()
                .path("path")
                .xFileName("X-File-Name")
                .body("Example data")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("path", "path").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileUploadDirectParams.builder().body("Example data").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            FileUploadDirectParams.builder()
                .path("path")
                .xFileName("X-File-Name")
                .body("Example data")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("Example data")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileUploadDirectParams.builder().body("Example data").build()

        val body = params._body()

        assertThat(body).isEqualTo("Example data")
    }
}
