// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlacementEventRecordedWebhookEventTest {

    @Test
    fun create() {
        val placementEventRecordedWebhookEvent =
            PlacementEventRecordedWebhookEvent.builder()
                .event(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
                                    Address.builder()
                                        .city("Palo Alto")
                                        .geo(
                                            Address.GeoPoint.builder()
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
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedPet(
                                                    Pet.builder()
                                                        .name("doggie")
                                                        .addPhotoUrl("string")
                                                        .id(10L)
                                                        .acquisitionChannel(
                                                            Pet.AcquisitionChannel.BREEDER
                                                        )
                                                        .category(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .microchipId("string")
                                                        .relatedCategory(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedCustomer(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedOrder(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedShelter(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedUser(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .status(PetStatus.AVAILABLE)
                                                        .addTag(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedPet(
                                            Pet.builder()
                                                .name("doggie")
                                                .addPhotoUrl("string")
                                                .id(10L)
                                                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                                                .category(JsonValue.from(mapOf<String, Any>()))
                                                .microchipId("string")
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .status(PetStatus.AVAILABLE)
                                                .addTag(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .state("CA")
                                        .street("437 Lytton")
                                        .zip("94301")
                                        .build()
                                )
                                .contact(
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(
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
                                .window(
                                    TransferLeg.Window.builder()
                                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .note("note")
                        .build()
                )
                .placementId("placementId")
                .type(PlacementEventRecordedWebhookEvent.Type.PLACEMENT_EVENT_RECORDED)
                .triggerValue("string")
                .build()

        assertThat(placementEventRecordedWebhookEvent.event())
            .isEqualTo(
                PlacementEvent.ofTransfer(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
                                    Address.builder()
                                        .city("Palo Alto")
                                        .geo(
                                            Address.GeoPoint.builder()
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
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedPet(
                                                    Pet.builder()
                                                        .name("doggie")
                                                        .addPhotoUrl("string")
                                                        .id(10L)
                                                        .acquisitionChannel(
                                                            Pet.AcquisitionChannel.BREEDER
                                                        )
                                                        .category(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .microchipId("string")
                                                        .relatedCategory(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedCustomer(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedOrder(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedShelter(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedUser(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .status(PetStatus.AVAILABLE)
                                                        .addTag(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedPet(
                                            Pet.builder()
                                                .name("doggie")
                                                .addPhotoUrl("string")
                                                .id(10L)
                                                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                                                .category(JsonValue.from(mapOf<String, Any>()))
                                                .microchipId("string")
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .status(PetStatus.AVAILABLE)
                                                .addTag(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .state("CA")
                                        .street("437 Lytton")
                                        .zip("94301")
                                        .build()
                                )
                                .contact(
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(
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
                                .window(
                                    TransferLeg.Window.builder()
                                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .note("note")
                        .build()
                )
            )
        assertThat(placementEventRecordedWebhookEvent.placementId()).isEqualTo("placementId")
        assertThat(placementEventRecordedWebhookEvent.type())
            .isEqualTo(PlacementEventRecordedWebhookEvent.Type.PLACEMENT_EVENT_RECORDED)
        assertThat(placementEventRecordedWebhookEvent.triggerValue())
            .isEqualTo(ConditionValue.ofRegex("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placementEventRecordedWebhookEvent =
            PlacementEventRecordedWebhookEvent.builder()
                .event(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
                                    Address.builder()
                                        .city("Palo Alto")
                                        .geo(
                                            Address.GeoPoint.builder()
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
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedPet(
                                                    Pet.builder()
                                                        .name("doggie")
                                                        .addPhotoUrl("string")
                                                        .id(10L)
                                                        .acquisitionChannel(
                                                            Pet.AcquisitionChannel.BREEDER
                                                        )
                                                        .category(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .microchipId("string")
                                                        .relatedCategory(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedCustomer(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedOrder(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedShelter(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .relatedUser(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .status(PetStatus.AVAILABLE)
                                                        .addTag(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedPet(
                                            Pet.builder()
                                                .name("doggie")
                                                .addPhotoUrl("string")
                                                .id(10L)
                                                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                                                .category(JsonValue.from(mapOf<String, Any>()))
                                                .microchipId("string")
                                                .relatedCategory(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedCustomer(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                                .relatedShelter(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                                .status(PetStatus.AVAILABLE)
                                                .addTag(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .state("CA")
                                        .street("437 Lytton")
                                        .zip("94301")
                                        .build()
                                )
                                .contact(
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(
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
                                .window(
                                    TransferLeg.Window.builder()
                                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .note("note")
                        .build()
                )
                .placementId("placementId")
                .type(PlacementEventRecordedWebhookEvent.Type.PLACEMENT_EVENT_RECORDED)
                .triggerValue("string")
                .build()

        val roundtrippedPlacementEventRecordedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placementEventRecordedWebhookEvent),
                jacksonTypeRef<PlacementEventRecordedWebhookEvent>(),
            )

        assertThat(roundtrippedPlacementEventRecordedWebhookEvent)
            .isEqualTo(placementEventRecordedWebhookEvent)
    }
}
