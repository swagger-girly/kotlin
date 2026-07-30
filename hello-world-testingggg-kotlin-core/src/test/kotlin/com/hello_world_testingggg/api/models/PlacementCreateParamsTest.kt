// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlacementCreateParamsTest {

    @Test
    fun create() {
        PlacementCreateParams.builder()
            .applicationId("applicationId")
            .initialEvent(
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
            .logistics(
                PlacementCreateParams.PlacementLogistics.builder()
                    .delivery(
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
                    .handler(
                        PlacementCreateParams.PlacementLogistics.Handler.builder()
                            .certification(
                                PlacementCreateParams.PlacementLogistics.Handler.Certification
                                    .builder()
                                    .level(
                                        PlacementCreateParams.PlacementLogistics.Handler
                                            .Certification
                                            .Level
                                            .STANDARD
                                    )
                                    .audit(
                                        PlacementCreateParams.PlacementLogistics.Handler
                                            .Certification
                                            .AuditStamp
                                            .builder()
                                            .recordedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .recordedBy("recordedBy")
                                            .source(
                                                PlacementCreateParams.PlacementLogistics.Handler
                                                    .Certification
                                                    .AuditStamp
                                                    .Source
                                                    .MANUAL
                                            )
                                            .build()
                                    )
                                    .issuedBy("issuedBy")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .pickup(
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
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
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
                    .build()
            )
            .scheduledFor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            PlacementCreateParams.builder()
                .applicationId("applicationId")
                .initialEvent(
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
                .logistics(
                    PlacementCreateParams.PlacementLogistics.builder()
                        .delivery(
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
                        .handler(
                            PlacementCreateParams.PlacementLogistics.Handler.builder()
                                .certification(
                                    PlacementCreateParams.PlacementLogistics.Handler.Certification
                                        .builder()
                                        .level(
                                            PlacementCreateParams.PlacementLogistics.Handler
                                                .Certification
                                                .Level
                                                .STANDARD
                                        )
                                        .audit(
                                            PlacementCreateParams.PlacementLogistics.Handler
                                                .Certification
                                                .AuditStamp
                                                .builder()
                                                .recordedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .recordedBy("recordedBy")
                                                .source(
                                                    PlacementCreateParams.PlacementLogistics.Handler
                                                        .Certification
                                                        .AuditStamp
                                                        .Source
                                                        .MANUAL
                                                )
                                                .build()
                                        )
                                        .issuedBy("issuedBy")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .pickup(
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
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
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
                        .build()
                )
                .scheduledFor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.applicationId()).isEqualTo("applicationId")
        assertThat(body.initialEvent())
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
        assertThat(body.logistics())
            .isEqualTo(
                PlacementCreateParams.PlacementLogistics.builder()
                    .delivery(
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
                    .handler(
                        PlacementCreateParams.PlacementLogistics.Handler.builder()
                            .certification(
                                PlacementCreateParams.PlacementLogistics.Handler.Certification
                                    .builder()
                                    .level(
                                        PlacementCreateParams.PlacementLogistics.Handler
                                            .Certification
                                            .Level
                                            .STANDARD
                                    )
                                    .audit(
                                        PlacementCreateParams.PlacementLogistics.Handler
                                            .Certification
                                            .AuditStamp
                                            .builder()
                                            .recordedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .recordedBy("recordedBy")
                                            .source(
                                                PlacementCreateParams.PlacementLogistics.Handler
                                                    .Certification
                                                    .AuditStamp
                                                    .Source
                                                    .MANUAL
                                            )
                                            .build()
                                    )
                                    .issuedBy("issuedBy")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .pickup(
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
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
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
                    .build()
            )
        assertThat(body.scheduledFor()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlacementCreateParams.builder().applicationId("applicationId").build()

        val body = params._body()

        assertThat(body.applicationId()).isEqualTo("applicationId")
    }
}
