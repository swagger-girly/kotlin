// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApplicationTest {

    @Test
    fun create() {
        val application =
            Application.builder()
                .id("id")
                .applicant(
                    Application.Applicant.Individual.builder()
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
                        .age(0)
                        .email("email")
                        .build()
                )
                .status(Application.Status.RECEIVED)
                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decision(
                    Application.Decision.DecisionApproved.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outcome(Application.Decision.DecisionApproved.Outcome.APPROVED)
                        .addCondition("string")
                        .build()
                )
                .fee(Money.builder().amount(2500L).currency("USD").build())
                .addHistory(
                    Application.History.builder()
                        .changedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Application.History.Status.RECEIVED)
                        .note("note")
                        .build()
                )
                .latestRejection(
                    Application.LatestRejection.builder()
                        .outcome(Application.LatestRejection.Outcome.REJECTED)
                        .reason(Application.LatestRejection.Reason.POLICY)
                        .appealDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
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
                .build()

        assertThat(application.id()).isEqualTo("id")
        assertThat(application.applicant())
            .isEqualTo(
                Application.Applicant.ofIndividual(
                    Application.Applicant.Individual.builder()
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
                        .age(0)
                        .email("email")
                        .build()
                )
            )
        assertThat(application.status()).isEqualTo(Application.Status.RECEIVED)
        assertThat(application.submittedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(application.decision())
            .isEqualTo(
                Application.Decision.ofApproved(
                    Application.Decision.DecisionApproved.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outcome(Application.Decision.DecisionApproved.Outcome.APPROVED)
                        .addCondition("string")
                        .build()
                )
            )
        assertThat(application.fee())
            .isEqualTo(Money.builder().amount(2500L).currency("USD").build())
        assertThat(application.history())
            .containsExactly(
                Application.History.builder()
                    .changedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Application.History.Status.RECEIVED)
                    .note("note")
                    .build()
            )
        assertThat(application.latestRejection())
            .isEqualTo(
                Application.LatestRejection.builder()
                    .outcome(Application.LatestRejection.Outcome.REJECTED)
                    .reason(Application.LatestRejection.Reason.POLICY)
                    .appealDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(application.pet())
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(
                        Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                    )
                    .microchipId("string")
                    .status(PetStatus.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val application =
            Application.builder()
                .id("id")
                .applicant(
                    Application.Applicant.Individual.builder()
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
                        .age(0)
                        .email("email")
                        .build()
                )
                .status(Application.Status.RECEIVED)
                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decision(
                    Application.Decision.DecisionApproved.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outcome(Application.Decision.DecisionApproved.Outcome.APPROVED)
                        .addCondition("string")
                        .build()
                )
                .fee(Money.builder().amount(2500L).currency("USD").build())
                .addHistory(
                    Application.History.builder()
                        .changedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Application.History.Status.RECEIVED)
                        .note("note")
                        .build()
                )
                .latestRejection(
                    Application.LatestRejection.builder()
                        .outcome(Application.LatestRejection.Outcome.REJECTED)
                        .reason(Application.LatestRejection.Reason.POLICY)
                        .appealDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
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
                .build()

        val roundtrippedApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(application),
                jacksonTypeRef<Application>(),
            )

        assertThat(roundtrippedApplication).isEqualTo(application)
    }
}
