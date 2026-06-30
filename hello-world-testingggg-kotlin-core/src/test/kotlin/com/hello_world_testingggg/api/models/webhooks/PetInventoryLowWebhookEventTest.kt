// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.pet.Pet
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetInventoryLowWebhookEventTest {

    @Test
    fun create() {
        val petInventoryLowWebhookEvent =
            PetInventoryLowWebhookEvent.builder()
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
                .quantity(0)
                .threshold(0)
                .type(PetInventoryLowWebhookEvent.Type.PET_INVENTORY_LOW)
                .lastOrder(
                    PetInventoryLowWebhookEvent.LastOrder.builder()
                        .id(10L)
                        .complete(true)
                        .petId(198772L)
                        .quantity(7)
                        .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PetInventoryLowWebhookEvent.LastOrder.Status.APPROVED)
                        .build()
                )
                .addLocation(
                    PetInventoryLowWebhookEvent.Location.builder()
                        .city("Palo Alto")
                        .state("CA")
                        .street("437 Lytton")
                        .zip("94301")
                        .build()
                )
                .build()

        assertThat(petInventoryLowWebhookEvent.pet())
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
        assertThat(petInventoryLowWebhookEvent.quantity()).isEqualTo(0)
        assertThat(petInventoryLowWebhookEvent.threshold()).isEqualTo(0)
        assertThat(petInventoryLowWebhookEvent.type())
            .isEqualTo(PetInventoryLowWebhookEvent.Type.PET_INVENTORY_LOW)
        assertThat(petInventoryLowWebhookEvent.lastOrder())
            .isEqualTo(
                PetInventoryLowWebhookEvent.LastOrder.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(PetInventoryLowWebhookEvent.LastOrder.Status.APPROVED)
                    .build()
            )
        assertThat(petInventoryLowWebhookEvent.locations())
            .containsExactly(
                PetInventoryLowWebhookEvent.Location.builder()
                    .city("Palo Alto")
                    .state("CA")
                    .street("437 Lytton")
                    .zip("94301")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petInventoryLowWebhookEvent =
            PetInventoryLowWebhookEvent.builder()
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
                .quantity(0)
                .threshold(0)
                .type(PetInventoryLowWebhookEvent.Type.PET_INVENTORY_LOW)
                .lastOrder(
                    PetInventoryLowWebhookEvent.LastOrder.builder()
                        .id(10L)
                        .complete(true)
                        .petId(198772L)
                        .quantity(7)
                        .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(PetInventoryLowWebhookEvent.LastOrder.Status.APPROVED)
                        .build()
                )
                .addLocation(
                    PetInventoryLowWebhookEvent.Location.builder()
                        .city("Palo Alto")
                        .state("CA")
                        .street("437 Lytton")
                        .zip("94301")
                        .build()
                )
                .build()

        val roundtrippedPetInventoryLowWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petInventoryLowWebhookEvent),
                jacksonTypeRef<PetInventoryLowWebhookEvent>(),
            )

        assertThat(roundtrippedPetInventoryLowWebhookEvent).isEqualTo(petInventoryLowWebhookEvent)
    }
}
