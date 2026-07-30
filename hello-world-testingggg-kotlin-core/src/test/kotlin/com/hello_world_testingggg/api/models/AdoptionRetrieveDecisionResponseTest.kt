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

internal class AdoptionRetrieveDecisionResponseTest {

    @Test
    fun ofDecisionApproved() {
        val decisionApproved =
            AdoptionRetrieveDecisionResponse.DecisionApproved.builder()
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outcome(AdoptionRetrieveDecisionResponse.DecisionApproved.Outcome.APPROVED)
                .addCondition("string")
                .build()

        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionApproved(decisionApproved)

        assertThat(adoptionRetrieveDecisionResponse.decisionApproved()).isEqualTo(decisionApproved)
        assertThat(adoptionRetrieveDecisionResponse.decisionRejected()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionEscalated()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionWithdrawn()).isNull()
    }

    @Test
    fun ofDecisionApprovedRoundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionApproved(
                AdoptionRetrieveDecisionResponse.DecisionApproved.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outcome(AdoptionRetrieveDecisionResponse.DecisionApproved.Outcome.APPROVED)
                    .addCondition("string")
                    .build()
            )

        val roundtrippedAdoptionRetrieveDecisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionRetrieveDecisionResponse),
                jacksonTypeRef<AdoptionRetrieveDecisionResponse>(),
            )

        assertThat(roundtrippedAdoptionRetrieveDecisionResponse)
            .isEqualTo(adoptionRetrieveDecisionResponse)
    }

    @Test
    fun ofDecisionRejected() {
        val decisionRejected =
            AdoptionRetrieveDecisionResponse.DecisionRejected.builder()
                .outcome(AdoptionRetrieveDecisionResponse.DecisionRejected.Outcome.REJECTED)
                .reason(AdoptionRetrieveDecisionResponse.DecisionRejected.Reason.POLICY)
                .appealDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionRejected(decisionRejected)

        assertThat(adoptionRetrieveDecisionResponse.decisionApproved()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionRejected()).isEqualTo(decisionRejected)
        assertThat(adoptionRetrieveDecisionResponse.decisionEscalated()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionWithdrawn()).isNull()
    }

    @Test
    fun ofDecisionRejectedRoundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionRejected(
                AdoptionRetrieveDecisionResponse.DecisionRejected.builder()
                    .outcome(AdoptionRetrieveDecisionResponse.DecisionRejected.Outcome.REJECTED)
                    .reason(AdoptionRetrieveDecisionResponse.DecisionRejected.Reason.POLICY)
                    .appealDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedAdoptionRetrieveDecisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionRetrieveDecisionResponse),
                jacksonTypeRef<AdoptionRetrieveDecisionResponse>(),
            )

        assertThat(roundtrippedAdoptionRetrieveDecisionResponse)
            .isEqualTo(adoptionRetrieveDecisionResponse)
    }

    @Test
    fun ofDecisionEscalated() {
        val decisionEscalated =
            AdoptionRetrieveDecisionResponse.DecisionEscalated.builder()
                .escalatedTo(
                    AdoptionRetrieveDecisionResponse.DecisionEscalated.EscalatedTo.builder()
                        .team("team")
                        .contact(
                            AdoptionRetrieveDecisionResponse.DecisionEscalated.EscalatedTo.Contact
                                .builder()
                                .email("email")
                                .hours("hours")
                                .build()
                        )
                        .build()
                )
                .outcome(AdoptionRetrieveDecisionResponse.DecisionEscalated.Outcome.ESCALATED)
                .reviewAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionEscalated(decisionEscalated)

        assertThat(adoptionRetrieveDecisionResponse.decisionApproved()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionRejected()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionEscalated())
            .isEqualTo(decisionEscalated)
        assertThat(adoptionRetrieveDecisionResponse.decisionWithdrawn()).isNull()
    }

    @Test
    fun ofDecisionEscalatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionEscalated(
                AdoptionRetrieveDecisionResponse.DecisionEscalated.builder()
                    .escalatedTo(
                        AdoptionRetrieveDecisionResponse.DecisionEscalated.EscalatedTo.builder()
                            .team("team")
                            .contact(
                                AdoptionRetrieveDecisionResponse.DecisionEscalated.EscalatedTo
                                    .Contact
                                    .builder()
                                    .email("email")
                                    .hours("hours")
                                    .build()
                            )
                            .build()
                    )
                    .outcome(AdoptionRetrieveDecisionResponse.DecisionEscalated.Outcome.ESCALATED)
                    .reviewAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedAdoptionRetrieveDecisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionRetrieveDecisionResponse),
                jacksonTypeRef<AdoptionRetrieveDecisionResponse>(),
            )

        assertThat(roundtrippedAdoptionRetrieveDecisionResponse)
            .isEqualTo(adoptionRetrieveDecisionResponse)
    }

    @Test
    fun ofDecisionWithdrawn() {
        val decisionWithdrawn =
            AdoptionRetrieveDecisionResponse.DecisionWithdrawn.builder()
                .outcome(AdoptionRetrieveDecisionResponse.DecisionWithdrawn.Outcome.WITHDRAWN)
                .withdrawnBy(
                    AdoptionRetrieveDecisionResponse.DecisionWithdrawn.WithdrawnBy.APPLICANT
                )
                .withdrawnAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionWithdrawn(decisionWithdrawn)

        assertThat(adoptionRetrieveDecisionResponse.decisionApproved()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionRejected()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionEscalated()).isNull()
        assertThat(adoptionRetrieveDecisionResponse.decisionWithdrawn())
            .isEqualTo(decisionWithdrawn)
    }

    @Test
    fun ofDecisionWithdrawnRoundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionRetrieveDecisionResponse =
            AdoptionRetrieveDecisionResponse.ofDecisionWithdrawn(
                AdoptionRetrieveDecisionResponse.DecisionWithdrawn.builder()
                    .outcome(AdoptionRetrieveDecisionResponse.DecisionWithdrawn.Outcome.WITHDRAWN)
                    .withdrawnBy(
                        AdoptionRetrieveDecisionResponse.DecisionWithdrawn.WithdrawnBy.APPLICANT
                    )
                    .withdrawnAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedAdoptionRetrieveDecisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionRetrieveDecisionResponse),
                jacksonTypeRef<AdoptionRetrieveDecisionResponse>(),
            )

        assertThat(roundtrippedAdoptionRetrieveDecisionResponse)
            .isEqualTo(adoptionRetrieveDecisionResponse)
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
        val adoptionRetrieveDecisionResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<AdoptionRetrieveDecisionResponse>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> {
                adoptionRetrieveDecisionResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
