// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun binaryAndJson() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.binaryAndJson()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun jsonAndXml() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.jsonAndXml()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun jsonFirst() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.jsonFirst()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun schemaOnJson() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.schemaOnJson()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun schemaOnText() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        mediaServiceAsync.schemaOnText()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun textFirst() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.textFirst()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun textOnly() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        mediaServiceAsync.textOnly()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun vendorJson() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val mediaServiceAsync = client.media()

        val response = mediaServiceAsync.vendorJson()

        response.validate()
    }
}
