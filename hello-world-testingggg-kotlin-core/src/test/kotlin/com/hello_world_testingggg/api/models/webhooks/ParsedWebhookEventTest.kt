// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.store.reports.Report
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ParsedWebhookEventTest {

    @Test
    fun ofPetCreated() {
        val petCreated =
            PetCreatedWebhookEvent.builder()
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
                .type(PetCreatedWebhookEvent.Type.PET_CREATED)
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetCreated(petCreated)

        assertThat(parsedWebhookEvent.petCreated()).isEqualTo(petCreated)
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
    }

    @Test
    fun ofPetCreatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPetCreated(
                PetCreatedWebhookEvent.builder()
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
                    .type(PetCreatedWebhookEvent.Type.PET_CREATED)
                    .build()
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }

    @Test
    fun ofPetUpdated() {
        val petUpdated =
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

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetUpdated(petUpdated)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isEqualTo(petUpdated)
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
    }

    @Test
    fun ofPetUpdatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPetUpdated(
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
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }

    @Test
    fun ofPetInventoryLow() {
        val petInventoryLow =
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

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetInventoryLow(petInventoryLow)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isEqualTo(petInventoryLow)
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
    }

    @Test
    fun ofPetInventoryLowRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPetInventoryLow(
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
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }

    @Test
    fun ofPetModerationApproved() {
        val petModerationApproved =
            ParsedWebhookEvent.PetModerationApprovedEvent.builder()
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .type(ParsedWebhookEvent.PetModerationApprovedEvent.Type.PET_MODERATION_APPROVED)
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetModerationApproved(petModerationApproved)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isEqualTo(petModerationApproved)
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
    }

    @Test
    fun ofPetModerationApprovedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPetModerationApproved(
                ParsedWebhookEvent.PetModerationApprovedEvent.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .type(
                        ParsedWebhookEvent.PetModerationApprovedEvent.Type.PET_MODERATION_APPROVED
                    )
                    .build()
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }

    @Test
    fun ofPetModerationRejected() {
        val petModerationRejected =
            ParsedWebhookEvent.PetModerationRejectedEvent.builder()
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
                .reason(ParsedWebhookEvent.PetModerationRejectedEvent.Reason.POLICY_VIOLATION)
                .type(ParsedWebhookEvent.PetModerationRejectedEvent.Type.PET_MODERATION_REJECTED)
                .addReviewNote(
                    ParsedWebhookEvent.PetModerationRejectedEvent.ReviewNote.builder()
                        .message("message")
                        .reviewer(
                            ParsedWebhookEvent.PetModerationRejectedEvent.ReviewNote.Reviewer
                                .builder()
                                .id(10L)
                                .email("john@email.com")
                                .firstName("John")
                                .lastName("James")
                                .password("12345")
                                .phone("12345")
                                .username("theUser")
                                .userStatus(1)
                                .build()
                        )
                        .build()
                )
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetModerationRejected(petModerationRejected)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isEqualTo(petModerationRejected)
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
    }

    @Test
    fun ofPetModerationRejectedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPetModerationRejected(
                ParsedWebhookEvent.PetModerationRejectedEvent.builder()
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
                    .reason(ParsedWebhookEvent.PetModerationRejectedEvent.Reason.POLICY_VIOLATION)
                    .type(
                        ParsedWebhookEvent.PetModerationRejectedEvent.Type.PET_MODERATION_REJECTED
                    )
                    .addReviewNote(
                        ParsedWebhookEvent.PetModerationRejectedEvent.ReviewNote.builder()
                            .message("message")
                            .reviewer(
                                ParsedWebhookEvent.PetModerationRejectedEvent.ReviewNote.Reviewer
                                    .builder()
                                    .id(10L)
                                    .email("john@email.com")
                                    .firstName("John")
                                    .lastName("James")
                                    .password("12345")
                                    .phone("12345")
                                    .username("theUser")
                                    .userStatus(1)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
    }

    @Test
    fun ofStoreReportGenerated() {
        val storeReportGenerated =
            StoreReportGeneratedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metrics(JsonValue.from(mapOf<String, Any>()))
                .report(
                    Report.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Report.Status.QUEUED)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filters(
                            Report.Filters.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .totals(
                            Report.Totals.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofStoreReportGenerated(storeReportGenerated)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isEqualTo(storeReportGenerated)
    }

    @Test
    fun ofStoreReportGeneratedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofStoreReportGenerated(
                StoreReportGeneratedWebhookEvent.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metrics(JsonValue.from(mapOf<String, Any>()))
                    .report(
                        Report.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(Report.Status.QUEUED)
                            .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .filters(
                                Report.Filters.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .totals(
                                Report.Totals.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedParsedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsedWebhookEvent),
                jacksonTypeRef<ParsedWebhookEvent>(),
            )

        assertThat(roundtrippedParsedWebhookEvent).isEqualTo(parsedWebhookEvent)
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
        val parsedWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ParsedWebhookEvent>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> { parsedWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
