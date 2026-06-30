// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.files.FileCreateArchiveParams
import com.hello_world_testingggg.api.models.files.FileUpdateParams
import com.hello_world_testingggg.api.models.files.FileUploadDirectParams
import com.hello_world_testingggg.api.models.files.FileUploadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class FileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.update(
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
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val fileslist = fileServiceAsync.list()

        fileslist.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        fileServiceAsync.delete("path")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createArchive() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val archive =
            fileServiceAsync.createArchive(
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
            )

        archive.validate()
    }

    @Test
    suspend fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = fileServiceAsync.download("path")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun upload() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.upload(
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
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun uploadDirect() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val file =
            fileServiceAsync.uploadDirect(
                FileUploadDirectParams.builder()
                    .path("path")
                    .xFileName("X-File-Name")
                    .body("Example data")
                    .build()
            )

        file.validate()
    }
}
