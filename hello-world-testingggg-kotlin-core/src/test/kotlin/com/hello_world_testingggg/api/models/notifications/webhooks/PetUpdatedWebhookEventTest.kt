// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.notifications.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
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
                        .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                        .category(
                            Pet.Category.builder()
                                .id(1L)
                                .name("Dogs")
                                .subcategories(listOf())
                                .build()
                        )
                        .microchipId("string")
                        .status(PetStatus.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .type(PetUpdatedWebhookEvent.Type.PET_UPDATED)
                .metadata(
                    PetUpdatedWebhookEvent.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .previousStatus(PetStatus.AVAILABLE)
                .build()

        assertThat(petUpdatedWebhookEvent.changedFields())
            .containsExactly(PetUpdatedWebhookEvent.ChangedField.NAME)
        assertThat(petUpdatedWebhookEvent.pet())
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(
                        Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                    )
                    .microchipId("string")
                    .status(PetStatus.AVAILABLE)
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
        assertThat(petUpdatedWebhookEvent.previousStatus()).isEqualTo(PetStatus.AVAILABLE)
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
                        .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                        .category(
                            Pet.Category.builder()
                                .id(1L)
                                .name("Dogs")
                                .subcategories(listOf())
                                .build()
                        )
                        .microchipId("string")
                        .status(PetStatus.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .type(PetUpdatedWebhookEvent.Type.PET_UPDATED)
                .metadata(
                    PetUpdatedWebhookEvent.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .previousStatus(PetStatus.AVAILABLE)
                .build()

        val roundtrippedPetUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petUpdatedWebhookEvent),
                jacksonTypeRef<PetUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedPetUpdatedWebhookEvent).isEqualTo(petUpdatedWebhookEvent)
    }
}
