// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.policies.AdoptionRule
import com.hello_world_testingggg.api.models.adoptions.policies.Policy
import com.hello_world_testingggg.api.models.adoptions.policies.RuleAttribute
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import com.hello_world_testingggg.api.models.placements.PlacementEvent
import com.hello_world_testingggg.api.models.placements.TransferLeg
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
                .type(PetCreatedWebhookEvent.Type.PET_CREATED)
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetCreated(petCreated)

        assertThat(parsedWebhookEvent.petCreated()).isEqualTo(petCreated)
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetUpdated(petUpdated)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isEqualTo(petUpdated)
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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
                        .total(Money.builder().amount(2500L).currency("USD").build())
                        .build()
                )
                .addLocation(
                    Address.builder()
                        .city("Palo Alto")
                        .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
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
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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
                            .total(Money.builder().amount(2500L).currency("USD").build())
                            .build()
                    )
                    .addLocation(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build()
                            )
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
                .type(ParsedWebhookEvent.PetModerationApprovedEvent.Type.PET_MODERATION_APPROVED)
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofPetModerationApproved(petModerationApproved)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isEqualTo(petModerationApproved)
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
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

    @Test
    fun ofAdoptionsPolicyChanged() {
        val adoptionsPolicyChanged =
            AdoptionsPolicyChangedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .policy(
                    Policy.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .addRule(
                            AdoptionRule.builder()
                                .attribute(RuleAttribute.PET_STATUS)
                                .operation(AdoptionRule.Operation.IS_ONE_OF)
                                .value("string")
                                .build()
                        )
                        .status(Policy.Status.DRAFT)
                        .escalation(
                            Policy.Escalation.builder()
                                .operator(Policy.Escalation.Operator.ALL)
                                .groups(listOf())
                                .addRule(
                                    AdoptionRule.builder()
                                        .attribute(RuleAttribute.PET_STATUS)
                                        .operation(AdoptionRule.Operation.IS_ONE_OF)
                                        .value("string")
                                        .build()
                                )
                                .build()
                        )
                        .feeCap(Money.builder().amount(2500L).currency("USD").build())
                        .notificationTarget("string")
                        .regionalOverrides(
                            Policy.RegionalOverrides.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .previous(
                    AdoptionsPolicyChangedWebhookEvent.Previous.builder()
                        .notificationTarget("string")
                        .status(AdoptionsPolicyChangedWebhookEvent.Previous.Status.DRAFT)
                        .build()
                )
                .build()

        val parsedWebhookEvent = ParsedWebhookEvent.ofAdoptionsPolicyChanged(adoptionsPolicyChanged)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isEqualTo(adoptionsPolicyChanged)
        assertThat(parsedWebhookEvent.placementEventRecorded()).isNull()
    }

    @Test
    fun ofAdoptionsPolicyChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofAdoptionsPolicyChanged(
                AdoptionsPolicyChangedWebhookEvent.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .policy(
                        Policy.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .name("name")
                            .addRule(
                                AdoptionRule.builder()
                                    .attribute(RuleAttribute.PET_STATUS)
                                    .operation(AdoptionRule.Operation.IS_ONE_OF)
                                    .value("string")
                                    .build()
                            )
                            .status(Policy.Status.DRAFT)
                            .escalation(
                                Policy.Escalation.builder()
                                    .operator(Policy.Escalation.Operator.ALL)
                                    .groups(listOf())
                                    .addRule(
                                        AdoptionRule.builder()
                                            .attribute(RuleAttribute.PET_STATUS)
                                            .operation(AdoptionRule.Operation.IS_ONE_OF)
                                            .value("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .feeCap(Money.builder().amount(2500L).currency("USD").build())
                            .notificationTarget("string")
                            .regionalOverrides(
                                Policy.RegionalOverrides.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .previous(
                        AdoptionsPolicyChangedWebhookEvent.Previous.builder()
                            .notificationTarget("string")
                            .status(AdoptionsPolicyChangedWebhookEvent.Previous.Status.DRAFT)
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
    fun ofPlacementEventRecorded() {
        val placementEventRecorded =
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
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(Money.builder().amount(2500L).currency("USD").build())
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

        val parsedWebhookEvent = ParsedWebhookEvent.ofPlacementEventRecorded(placementEventRecorded)

        assertThat(parsedWebhookEvent.petCreated()).isNull()
        assertThat(parsedWebhookEvent.petUpdated()).isNull()
        assertThat(parsedWebhookEvent.petInventoryLow()).isNull()
        assertThat(parsedWebhookEvent.petModerationApproved()).isNull()
        assertThat(parsedWebhookEvent.petModerationRejected()).isNull()
        assertThat(parsedWebhookEvent.storeReportGenerated()).isNull()
        assertThat(parsedWebhookEvent.adoptionsPolicyChanged()).isNull()
        assertThat(parsedWebhookEvent.placementEventRecorded()).isEqualTo(placementEventRecorded)
    }

    @Test
    fun ofPlacementEventRecordedRoundtrip() {
        val jsonMapper = jsonMapper()
        val parsedWebhookEvent =
            ParsedWebhookEvent.ofPlacementEventRecorded(
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
                                        TransferLeg.Contact.builder()
                                            .name("name")
                                            .phone("phone")
                                            .build()
                                    )
                                    .cost(Money.builder().amount(2500L).currency("USD").build())
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
