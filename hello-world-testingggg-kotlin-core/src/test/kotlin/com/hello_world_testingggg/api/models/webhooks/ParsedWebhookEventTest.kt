// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.pet.Pet
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsedWebhookEventTest {

    @Test
    fun create() {
        val parsedWebhookEvent =
            ParsedWebhookEvent.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Pet.Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .type(ParsedWebhookEvent.Type.PET_CREATED)
                .build()

        assertThat(parsedWebhookEvent.pet())
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
        assertThat(parsedWebhookEvent.type()).isEqualTo(ParsedWebhookEvent.Type.PET_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Pet.Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .type(ParsedWebhookEvent.Type.PET_CREATED)
                .build()

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }
}
