// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun binaryAndJson() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.binaryAndJson()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun jsonAndXml() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.jsonAndXml()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun jsonFirst() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.jsonFirst()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schemaOnJson() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.schemaOnJson()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schemaOnText() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        mediaService.schemaOnText()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun textFirst() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.textFirst()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun textOnly() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        mediaService.textOnly()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun vendorJson() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaService = client.media()

        val response = mediaService.vendorJson()

        response.validate()
    }
}
