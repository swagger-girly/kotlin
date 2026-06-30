// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
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
internal class FileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val file =
            fileService.update(
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
    fun list() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val fileslist = fileService.list()

        fileslist.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        fileService.delete("path")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createArchive() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val archive =
            fileService.createArchive(
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
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = fileService.download("path")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val file =
            fileService.upload(
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
    fun uploadDirect() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val file =
            fileService.uploadDirect(
                FileUploadDirectParams.builder()
                    .path("path")
                    .xFileName("X-File-Name")
                    .body("Example data")
                    .build()
            )

        file.validate()
    }
}
