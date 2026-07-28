// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
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
            StoreRetrieveActivityResponse.Listed.builder()
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
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.Listed.Family.LISTED)
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
                StoreRetrieveActivityResponse.Listed.builder()
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
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.Listed.Family.LISTED)
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
            StoreRetrieveActivityResponse.Sold.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                .category(
                    Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                )
                .microchipId("string")
                .status(PetStatus.SOLD)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.Sold.Family.SOLD)
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
                StoreRetrieveActivityResponse.Sold.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(
                        Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                    )
                    .microchipId("string")
                    .status(PetStatus.SOLD)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.Sold.Family.SOLD)
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
            StoreRetrieveActivityResponse.Archived.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                .category(
                    Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                )
                .microchipId("string")
                .status(PetStatus.SOLD)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .activityId("activityId")
                .family(StoreRetrieveActivityResponse.Archived.Family.ARCHIVED)
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
                StoreRetrieveActivityResponse.Archived.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(
                        Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                    )
                    .microchipId("string")
                    .status(PetStatus.SOLD)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .activityId("activityId")
                    .family(StoreRetrieveActivityResponse.Archived.Family.ARCHIVED)
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
            StoreRetrieveActivityResponse.Transferred.builder()
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
                .family(StoreRetrieveActivityResponse.Transferred.Family.TRANSFERRED)
                .transferredTo(
                    StoreRetrieveActivityResponse.Transferred.TransferredTo.builder()
                        .name("name")
                        .address(
                            Address.builder()
                                .city("Palo Alto")
                                .geo(
                                    Address.Geo.builder()
                                        .latitude(37.4443)
                                        .longitude(-122.1598)
                                        .build()
                                )
                                .state("CA")
                                .street("437 Lytton")
                                .zip("94301")
                                .build()
                        )
                        .contact(
                            StoreRetrieveActivityResponse.Transferred.TransferredTo.Contact
                                .builder()
                                .primary(
                                    StoreRetrieveActivityResponse.Transferred.TransferredTo.Contact
                                        .Primary
                                        .builder()
                                        .availability(
                                            StoreRetrieveActivityResponse.Transferred.TransferredTo
                                                .Contact
                                                .Primary
                                                .Availability
                                                .builder()
                                                .weekday(
                                                    StoreRetrieveActivityResponse.Transferred
                                                        .TransferredTo
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
                                                    StoreRetrieveActivityResponse.Transferred
                                                        .TransferredTo
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
                            StoreRetrieveActivityResponse.Transferred.TransferredTo.Location
                                .builder()
                                .latitude(37.4443)
                                .longitude(-122.1598)
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
                StoreRetrieveActivityResponse.Transferred.builder()
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
                    .family(StoreRetrieveActivityResponse.Transferred.Family.TRANSFERRED)
                    .transferredTo(
                        StoreRetrieveActivityResponse.Transferred.TransferredTo.builder()
                            .name("name")
                            .address(
                                Address.builder()
                                    .city("Palo Alto")
                                    .geo(
                                        Address.Geo.builder()
                                            .latitude(37.4443)
                                            .longitude(-122.1598)
                                            .build()
                                    )
                                    .state("CA")
                                    .street("437 Lytton")
                                    .zip("94301")
                                    .build()
                            )
                            .contact(
                                StoreRetrieveActivityResponse.Transferred.TransferredTo.Contact
                                    .builder()
                                    .primary(
                                        StoreRetrieveActivityResponse.Transferred.TransferredTo
                                            .Contact
                                            .Primary
                                            .builder()
                                            .availability(
                                                StoreRetrieveActivityResponse.Transferred
                                                    .TransferredTo
                                                    .Contact
                                                    .Primary
                                                    .Availability
                                                    .builder()
                                                    .weekday(
                                                        StoreRetrieveActivityResponse.Transferred
                                                            .TransferredTo
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
                                                        StoreRetrieveActivityResponse.Transferred
                                                            .TransferredTo
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
                                StoreRetrieveActivityResponse.Transferred.TransferredTo.Location
                                    .builder()
                                    .latitude(37.4443)
                                    .longitude(-122.1598)
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
