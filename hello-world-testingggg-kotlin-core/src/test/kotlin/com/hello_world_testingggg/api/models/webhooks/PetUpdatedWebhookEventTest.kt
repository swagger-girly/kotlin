// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.pet.Pet
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUpdatedWebhookEventTest {

    @Test
    fun create() {
        val petUpdatedWebhookEvent =
            PetUpdatedWebhookEvent.builder()
                .addChangedField(PetUpdatedWebhookEvent.ChangedField.NAME)
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
                .type(PetUpdatedWebhookEvent.Type.PET_UPDATED)
                .metadata(
                    PetUpdatedWebhookEvent.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .previousStatus(PetUpdatedWebhookEvent.PreviousStatus.AVAILABLE)
                .build()

        assertThat(petUpdatedWebhookEvent.changedFields())
            .containsExactly(PetUpdatedWebhookEvent.ChangedField.NAME)
        assertThat(petUpdatedWebhookEvent.pet())
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
        assertThat(petUpdatedWebhookEvent.type()).isEqualTo(PetUpdatedWebhookEvent.Type.PET_UPDATED)
        assertThat(petUpdatedWebhookEvent.metadata())
            .isEqualTo(
                PetUpdatedWebhookEvent.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(petUpdatedWebhookEvent.previousStatus())
            .isEqualTo(PetUpdatedWebhookEvent.PreviousStatus.AVAILABLE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petUpdatedWebhookEvent =
            PetUpdatedWebhookEvent.builder()
                .addChangedField(PetUpdatedWebhookEvent.ChangedField.NAME)
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
                .type(PetUpdatedWebhookEvent.Type.PET_UPDATED)
                .metadata(
                    PetUpdatedWebhookEvent.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .previousStatus(PetUpdatedWebhookEvent.PreviousStatus.AVAILABLE)
                .build()

        val roundtrippedPetUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petUpdatedWebhookEvent),
                jacksonTypeRef<PetUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedPetUpdatedWebhookEvent).isEqualTo(petUpdatedWebhookEvent)
    }
}
