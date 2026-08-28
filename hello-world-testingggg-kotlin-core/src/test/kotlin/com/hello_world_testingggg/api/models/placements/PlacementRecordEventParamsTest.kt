// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlacementRecordEventParamsTest {

    @Test
    fun create() {
        PlacementRecordEventParams.builder()
            .placementId("placementId")
            .placementEvent(
                PlacementEvent.PlacementTransferEvent.builder()
                    .id("id")
                    .leg(
                        TransferLeg.builder()
                            .location(
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
                                            .relatedPet(
                                                Pet.builder()
                                                    .name("doggie")
                                                    .addPhotoUrl("string")
                                                    .id(10L)
                                                    .acquisitionChannel(
                                                        Pet.AcquisitionChannel.BREEDER
                                                    )
                                                    .category(JsonValue.from(mapOf<String, Any>()))
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
                                                    .addTag(JsonValue.from(mapOf<String, Any>()))
                                                    .build()
                                            )
                                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
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
                                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
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
                                TransferLeg.Contact.builder().name("name").phone("phone").build()
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("placementId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
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
                .build()

        val body = params._body()

        assertThat(body)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlacementEvent.ofTransfer(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
            )
    }
}
