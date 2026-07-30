// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UserVerifyIdentityResponseTest {

    @Test
    fun ofKybKycVerification() {
        val kybKycVerification =
            UserVerifyIdentityResponse.KybKycVerification.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerIndividual(
                    UserVerifyIdentityResponse.KybKycVerification.BeneficialOwnerIndividual
                        .builder()
                        .ownerName("owner_name")
                        .build()
                )
                .addStatusReason(
                    UserVerifyIdentityResponse.KybKycVerification.StatusReason.builder()
                        .reasonCode("reason_code")
                        .build()
                )
                .verificationApplication(
                    UserVerifyIdentityResponse.KybKycVerification.VerificationApplication.builder()
                        .addStatusReason(
                            UserVerifyIdentityResponse.KybKycVerification.VerificationApplication
                                .StatusReason
                                .builder()
                                .applicationNote("application_note")
                                .build()
                        )
                        .build()
                )
                .addVerificationDocument(
                    UserVerifyIdentityResponse.KybKycVerification.VerificationDocument.builder()
                        .documentId("document_id")
                        .build()
                )
                .build()

        val userVerifyIdentityResponse =
            UserVerifyIdentityResponse.ofKybKycVerification(kybKycVerification)

        assertThat(userVerifyIdentityResponse.kybKycVerification()).isEqualTo(kybKycVerification)
        assertThat(userVerifyIdentityResponse.basicVerification()).isNull()
    }

    @Test
    fun ofKybKycVerificationRoundtrip() {
        val jsonMapper = jsonMapper()
        val userVerifyIdentityResponse =
            UserVerifyIdentityResponse.ofKybKycVerification(
                UserVerifyIdentityResponse.KybKycVerification.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBeneficialOwnerIndividual(
                        UserVerifyIdentityResponse.KybKycVerification.BeneficialOwnerIndividual
                            .builder()
                            .ownerName("owner_name")
                            .build()
                    )
                    .addStatusReason(
                        UserVerifyIdentityResponse.KybKycVerification.StatusReason.builder()
                            .reasonCode("reason_code")
                            .build()
                    )
                    .verificationApplication(
                        UserVerifyIdentityResponse.KybKycVerification.VerificationApplication
                            .builder()
                            .addStatusReason(
                                UserVerifyIdentityResponse.KybKycVerification
                                    .VerificationApplication
                                    .StatusReason
                                    .builder()
                                    .applicationNote("application_note")
                                    .build()
                            )
                            .build()
                    )
                    .addVerificationDocument(
                        UserVerifyIdentityResponse.KybKycVerification.VerificationDocument.builder()
                            .documentId("document_id")
                            .build()
                    )
                    .build()
            )

        val roundtrippedUserVerifyIdentityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userVerifyIdentityResponse),
                jacksonTypeRef<UserVerifyIdentityResponse>(),
            )

        assertThat(roundtrippedUserVerifyIdentityResponse).isEqualTo(userVerifyIdentityResponse)
    }

    @Test
    fun ofBasicVerification() {
        val basicVerification =
            UserVerifyIdentityResponse.BasicVerification.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .verified(true)
                .build()

        val userVerifyIdentityResponse =
            UserVerifyIdentityResponse.ofBasicVerification(basicVerification)

        assertThat(userVerifyIdentityResponse.kybKycVerification()).isNull()
        assertThat(userVerifyIdentityResponse.basicVerification()).isEqualTo(basicVerification)
    }

    @Test
    fun ofBasicVerificationRoundtrip() {
        val jsonMapper = jsonMapper()
        val userVerifyIdentityResponse =
            UserVerifyIdentityResponse.ofBasicVerification(
                UserVerifyIdentityResponse.BasicVerification.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .verified(true)
                    .build()
            )

        val roundtrippedUserVerifyIdentityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userVerifyIdentityResponse),
                jacksonTypeRef<UserVerifyIdentityResponse>(),
            )

        assertThat(roundtrippedUserVerifyIdentityResponse).isEqualTo(userVerifyIdentityResponse)
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
        val userVerifyIdentityResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UserVerifyIdentityResponse>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> {
                userVerifyIdentityResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
