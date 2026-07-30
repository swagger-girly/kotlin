// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class StoreRetrieveActivityResponseTest {

    @Test
    fun ofListed() {
        val listed =
            StoreRetrieveActivityResponse.StoreActivityListed.builder()
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
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.StoreActivityListed.Family.LISTED)
                .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val storeRetrieveActivityResponse = StoreRetrieveActivityResponse.ofListed(listed)

        assertThat(storeRetrieveActivityResponse.listed()).isEqualTo(listed)
        assertThat(storeRetrieveActivityResponse.sold()).isNull()
        assertThat(storeRetrieveActivityResponse.archived()).isNull()
        assertThat(storeRetrieveActivityResponse.transferred()).isNull()
    }

    @Test
    fun ofListedRoundtrip() {
        val jsonMapper = jsonMapper()
        val storeRetrieveActivityResponse =
            StoreRetrieveActivityResponse.ofListed(
                StoreRetrieveActivityResponse.StoreActivityListed.builder()
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
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.StoreActivityListed.Family.LISTED)
                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedStoreRetrieveActivityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeRetrieveActivityResponse),
                jacksonTypeRef<StoreRetrieveActivityResponse>(),
            )

        assertThat(roundtrippedStoreRetrieveActivityResponse)
            .isEqualTo(storeRetrieveActivityResponse)
    }

    @Test
    fun ofSold() {
        val sold =
            StoreRetrieveActivityResponse.StoreActivitySold.builder()
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
                .status(PetStatus.SOLD)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.StoreActivitySold.Family.SOLD)
                .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val storeRetrieveActivityResponse = StoreRetrieveActivityResponse.ofSold(sold)

        assertThat(storeRetrieveActivityResponse.listed()).isNull()
        assertThat(storeRetrieveActivityResponse.sold()).isEqualTo(sold)
        assertThat(storeRetrieveActivityResponse.archived()).isNull()
        assertThat(storeRetrieveActivityResponse.transferred()).isNull()
    }

    @Test
    fun ofSoldRoundtrip() {
        val jsonMapper = jsonMapper()
        val storeRetrieveActivityResponse =
            StoreRetrieveActivityResponse.ofSold(
                StoreRetrieveActivityResponse.StoreActivitySold.builder()
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
                    .status(PetStatus.SOLD)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.StoreActivitySold.Family.SOLD)
                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedStoreRetrieveActivityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeRetrieveActivityResponse),
                jacksonTypeRef<StoreRetrieveActivityResponse>(),
            )

        assertThat(roundtrippedStoreRetrieveActivityResponse)
            .isEqualTo(storeRetrieveActivityResponse)
    }

    @Test
    fun ofArchived() {
        val archived =
            StoreRetrieveActivityResponse.StoreActivityArchived.builder()
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
                .status(PetStatus.SOLD)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.StoreActivityArchived.Family.ARCHIVED)
                .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedReason("archivedReason")
                .build()

        val storeRetrieveActivityResponse = StoreRetrieveActivityResponse.ofArchived(archived)

        assertThat(storeRetrieveActivityResponse.listed()).isNull()
        assertThat(storeRetrieveActivityResponse.sold()).isNull()
        assertThat(storeRetrieveActivityResponse.archived()).isEqualTo(archived)
        assertThat(storeRetrieveActivityResponse.transferred()).isNull()
    }

    @Test
    fun ofArchivedRoundtrip() {
        val jsonMapper = jsonMapper()
        val storeRetrieveActivityResponse =
            StoreRetrieveActivityResponse.ofArchived(
                StoreRetrieveActivityResponse.StoreActivityArchived.builder()
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
                    .status(PetStatus.SOLD)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.StoreActivityArchived.Family.ARCHIVED)
                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedReason("archivedReason")
                    .build()
            )

        val roundtrippedStoreRetrieveActivityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeRetrieveActivityResponse),
                jacksonTypeRef<StoreRetrieveActivityResponse>(),
            )

        assertThat(roundtrippedStoreRetrieveActivityResponse)
            .isEqualTo(storeRetrieveActivityResponse)
    }

    @Test
    fun ofTransferred() {
        val transferred =
            StoreRetrieveActivityResponse.StoreActivityTransferred.builder()
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
                .family(StoreRetrieveActivityResponse.StoreActivityTransferred.Family.TRANSFERRED)
                .transferredTo(
                    StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter.builder()
                        .name("name")
                        .address(
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
                            StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter.Contact
                                .builder()
                                .primary(
                                    StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter
                                        .Contact
                                        .Primary
                                        .builder()
                                        .availability(
                                            StoreRetrieveActivityResponse.StoreActivityTransferred
                                                .Shelter
                                                .Contact
                                                .Primary
                                                .Availability
                                                .builder()
                                                .weekday(
                                                    StoreRetrieveActivityResponse
                                                        .StoreActivityTransferred
                                                        .Shelter
                                                        .Contact
                                                        .Primary
                                                        .Availability
                                                        .Weekday
                                                        .builder()
                                                        .close("17:00")
                                                        .open("09:00")
                                                        .build()
                                                )
                                                .weekend(
                                                    StoreRetrieveActivityResponse
                                                        .StoreActivityTransferred
                                                        .Shelter
                                                        .Contact
                                                        .Primary
                                                        .Availability
                                                        .Weekend
                                                        .builder()
                                                        .close("close")
                                                        .open("open")
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .build()
                        )
                        .location(
                            StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter.GeoPoint
                                .builder()
                                .latitude(37.4443)
                                .longitude(-122.1598)
                                .build()
                        )
                        .relatedAddress(
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
                        .build()
                )
                .build()

        val storeRetrieveActivityResponse = StoreRetrieveActivityResponse.ofTransferred(transferred)

        assertThat(storeRetrieveActivityResponse.listed()).isNull()
        assertThat(storeRetrieveActivityResponse.sold()).isNull()
        assertThat(storeRetrieveActivityResponse.archived()).isNull()
        assertThat(storeRetrieveActivityResponse.transferred()).isEqualTo(transferred)
    }

    @Test
    fun ofTransferredRoundtrip() {
        val jsonMapper = jsonMapper()
        val storeRetrieveActivityResponse =
            StoreRetrieveActivityResponse.ofTransferred(
                StoreRetrieveActivityResponse.StoreActivityTransferred.builder()
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
                    .family(
                        StoreRetrieveActivityResponse.StoreActivityTransferred.Family.TRANSFERRED
                    )
                    .transferredTo(
                        StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter.builder()
                            .name("name")
                            .address(
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
                                StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter
                                    .Contact
                                    .builder()
                                    .primary(
                                        StoreRetrieveActivityResponse.StoreActivityTransferred
                                            .Shelter
                                            .Contact
                                            .Primary
                                            .builder()
                                            .availability(
                                                StoreRetrieveActivityResponse
                                                    .StoreActivityTransferred
                                                    .Shelter
                                                    .Contact
                                                    .Primary
                                                    .Availability
                                                    .builder()
                                                    .weekday(
                                                        StoreRetrieveActivityResponse
                                                            .StoreActivityTransferred
                                                            .Shelter
                                                            .Contact
                                                            .Primary
                                                            .Availability
                                                            .Weekday
                                                            .builder()
                                                            .close("17:00")
                                                            .open("09:00")
                                                            .build()
                                                    )
                                                    .weekend(
                                                        StoreRetrieveActivityResponse
                                                            .StoreActivityTransferred
                                                            .Shelter
                                                            .Contact
                                                            .Primary
                                                            .Availability
                                                            .Weekend
                                                            .builder()
                                                            .close("close")
                                                            .open("open")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .name("name")
                                            .phone("phone")
                                            .build()
                                    )
                                    .build()
                            )
                            .location(
                                StoreRetrieveActivityResponse.StoreActivityTransferred.Shelter
                                    .GeoPoint
                                    .builder()
                                    .latitude(37.4443)
                                    .longitude(-122.1598)
                                    .build()
                            )
                            .relatedAddress(
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
                            .build()
                    )
                    .build()
            )

        val roundtrippedStoreRetrieveActivityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeRetrieveActivityResponse),
                jacksonTypeRef<StoreRetrieveActivityResponse>(),
            )

        assertThat(roundtrippedStoreRetrieveActivityResponse)
            .isEqualTo(storeRetrieveActivityResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val storeRetrieveActivityResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<StoreRetrieveActivityResponse>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> {
                storeRetrieveActivityResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
