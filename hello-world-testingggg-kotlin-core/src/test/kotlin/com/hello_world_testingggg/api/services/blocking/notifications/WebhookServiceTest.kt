// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.notifications

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.UnwrapWebhookParams
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggWebhookException
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class WebhookServiceTest {

    @Test
    fun parsePet() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val webhookService = client.notifications().webhooks()

        val payload =
            "{\"pet\":{\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"id\":10,\"acquisitionChannel\":\"breeder\",\"category\":{\"id\":1,\"name\":\"Dogs\",\"subcategories\":[]},\"microchipId\":\"string\",\"status\":\"available\",\"tags\":[{\"id\":0,\"name\":\"name\"}]},\"type\":\"pet.created\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        // Correct key should not throw
        webhookService.parsePet(
            UnwrapWebhookParams.builder()
                .body(payload)
                .headers(headers)
                .secret(webhookSecret)
                .build()
        )
        webhookService
            .withOptions { it.webhookSecret(webhookSecret) }
            .parsePet(UnwrapWebhookParams.builder().body(payload).headers(headers).build())

        // Secret in method takes precedence to secret on client
        val wrongKey = "whsec_aaaaaaaaaa"
        webhookService
            .withOptions { it.webhookSecret(wrongKey) }
            .parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(webhookSecret)
                    .build()
            )

        // Wrong key should throw
        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService
                .withOptions { it.webhookSecret(wrongKey) }
                .parsePet(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService
                .withOptions { it.webhookSecret(wrongKey) }
                .parsePet(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        // Bad signature should throw
        assertThrows<HelloWorldTestinggggWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService.parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<HelloWorldTestinggggWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsePet(UnwrapWebhookParams.builder().body(payload).headers(badHeaders).build())
        }

        // Old timestamp should throw
        assertThrows<HelloWorldTestinggggWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService.parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<HelloWorldTestinggggWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsePet(UnwrapWebhookParams.builder().body(payload).headers(oldHeaders).build())
        }

        // Wrong message ID should throw
        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService.parsePet(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<HelloWorldTestinggggWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService
                .withOptions { it.webhookSecret(webhookSecret) }
                .parsePet(
                    UnwrapWebhookParams.builder().body(payload).headers(wrongIdHeaders).build()
                )
        }
    }
}
