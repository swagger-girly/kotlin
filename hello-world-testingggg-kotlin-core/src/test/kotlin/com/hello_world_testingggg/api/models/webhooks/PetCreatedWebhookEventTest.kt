// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetCreatedWebhookEventTest {

    @Test
    fun create() {
        val petCreatedWebhookEvent =
            PetCreatedWebhookEvent.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                        .category(JsonValue.from(mapOf<String, Any>()))
                        .microchipId("string")
                        .relatedAddress(
                            Address.builder()
                                .city("Palo Alto")
                                .geo(
                                    Address.Geo.builder()
                                        .latitude(37.4443)
                                        .longitude(-122.1598)
                                        .build()
                                )
                                .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                .relatedMoney(
                                    Money.builder()
                                        .amount(2500L)
                                        .currency("USD")
                                        .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                        .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                .state("CA")
                                .street("437 Lytton")
                                .zip("94301")
                                .build()
                        )
                        .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                        .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                        .relatedMoney(
                            Money.builder()
                                .amount(2500L)
                                .currency("USD")
                                .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                        .status(PetStatus.AVAILABLE)
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(PetCreatedWebhookEvent.Type.PET_CREATED)
                .build()

        assertThat(petCreatedWebhookEvent.pet())
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(JsonValue.from(mapOf<String, Any>()))
                    .microchipId("string")
                    .relatedAddress(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build()
                            )
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedMoney(
                                Money.builder()
                                    .amount(2500L)
                                    .currency("USD")
                                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                    .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .state("CA")
                            .street("437 Lytton")
                            .zip("94301")
                            .build()
                    )
                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                    .relatedMoney(
                        Money.builder()
                            .amount(2500L)
                            .currency("USD")
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                    .status(PetStatus.AVAILABLE)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(petCreatedWebhookEvent.type()).isEqualTo(PetCreatedWebhookEvent.Type.PET_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petCreatedWebhookEvent =
            PetCreatedWebhookEvent.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                        .category(JsonValue.from(mapOf<String, Any>()))
                        .microchipId("string")
                        .relatedAddress(
                            Address.builder()
                                .city("Palo Alto")
                                .geo(
                                    Address.Geo.builder()
                                        .latitude(37.4443)
                                        .longitude(-122.1598)
                                        .build()
                                )
                                .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                .relatedMoney(
                                    Money.builder()
                                        .amount(2500L)
                                        .currency("USD")
                                        .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                        .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                .state("CA")
                                .street("437 Lytton")
                                .zip("94301")
                                .build()
                        )
                        .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                        .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                        .relatedMoney(
                            Money.builder()
                                .amount(2500L)
                                .currency("USD")
                                .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                        .status(PetStatus.AVAILABLE)
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .type(PetCreatedWebhookEvent.Type.PET_CREATED)
                .build()

        val roundtrippedPetCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petCreatedWebhookEvent),
                jacksonTypeRef<PetCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedPetCreatedWebhookEvent).isEqualTo(petCreatedWebhookEvent)
    }
}
