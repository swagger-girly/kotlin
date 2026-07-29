// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.notifications.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PetModerationWebhookEventTest {

    @Test
    fun ofApproved() {
        val approved =
            PetModerationWebhookEvent.PetModerationApproved.builder()
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .build()

        val petModerationWebhookEvent = PetModerationWebhookEvent.ofApproved(approved)

        assertThat(petModerationWebhookEvent.approved()).isEqualTo(approved)
        assertThat(petModerationWebhookEvent.rejected()).isNull()
    }

    @Test
    fun ofApprovedRoundtrip() {
        val jsonMapper = jsonMapper()
        val petModerationWebhookEvent =
            PetModerationWebhookEvent.ofApproved(
                PetModerationWebhookEvent.PetModerationApproved.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .build()
            )

        val roundtrippedPetModerationWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petModerationWebhookEvent),
                jacksonTypeRef<PetModerationWebhookEvent>(),
            )

        assertThat(roundtrippedPetModerationWebhookEvent).isEqualTo(petModerationWebhookEvent)
    }

    @Test
    fun ofRejected() {
        val rejected =
            PetModerationWebhookEvent.PetModerationRejected.builder()
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
                .reason(PetModerationWebhookEvent.PetModerationRejected.Reason.POLICY_VIOLATION)
                .addReviewNote(
                    PetModerationWebhookEvent.PetModerationRejected.ReviewNote.builder()
                        .message("message")
                        .reviewer(
                            PetModerationWebhookEvent.PetModerationRejected.ReviewNote.Reviewer
                                .builder()
                                .id(10L)
                                .email("john@email.com")
                                .firstName("John")
                                .lastName("James")
                                .password("12345")
                                .phone("12345")
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
                                .username("theUser")
                                .userStatus(1)
                                .build()
                        )
                        .build()
                )
                .build()

        val petModerationWebhookEvent = PetModerationWebhookEvent.ofRejected(rejected)

        assertThat(petModerationWebhookEvent.approved()).isNull()
        assertThat(petModerationWebhookEvent.rejected()).isEqualTo(rejected)
    }

    @Test
    fun ofRejectedRoundtrip() {
        val jsonMapper = jsonMapper()
        val petModerationWebhookEvent =
            PetModerationWebhookEvent.ofRejected(
                PetModerationWebhookEvent.PetModerationRejected.builder()
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
                    .reason(PetModerationWebhookEvent.PetModerationRejected.Reason.POLICY_VIOLATION)
                    .addReviewNote(
                        PetModerationWebhookEvent.PetModerationRejected.ReviewNote.builder()
                            .message("message")
                            .reviewer(
                                PetModerationWebhookEvent.PetModerationRejected.ReviewNote.Reviewer
                                    .builder()
                                    .id(10L)
                                    .email("john@email.com")
                                    .firstName("John")
                                    .lastName("James")
                                    .password("12345")
                                    .phone("12345")
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
                                    .username("theUser")
                                    .userStatus(1)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedPetModerationWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petModerationWebhookEvent),
                jacksonTypeRef<PetModerationWebhookEvent>(),
            )

        assertThat(roundtrippedPetModerationWebhookEvent).isEqualTo(petModerationWebhookEvent)
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
        val petModerationWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PetModerationWebhookEvent>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> {
                petModerationWebhookEvent.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
