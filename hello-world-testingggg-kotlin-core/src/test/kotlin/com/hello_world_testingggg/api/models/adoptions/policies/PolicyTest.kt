// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyTest {

    @Test
    fun create() {
        val policy =
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

        assertThat(policy.id()).isEqualTo("id")
        assertThat(policy.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(policy.name()).isEqualTo("name")
        assertThat(policy.rules())
            .containsExactly(
                AdoptionRule.builder()
                    .attribute(RuleAttribute.PET_STATUS)
                    .operation(AdoptionRule.Operation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
        assertThat(policy.status()).isEqualTo(Policy.Status.DRAFT)
        assertThat(policy.escalation())
            .isEqualTo(
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
        assertThat(policy.feeCap()).isEqualTo(Money.builder().amount(2500L).currency("USD").build())
        assertThat(policy.notificationTarget())
            .isEqualTo(Policy.NotificationTarget.ofEmail("string"))
        assertThat(policy.regionalOverrides())
            .isEqualTo(
                Policy.RegionalOverrides.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val policy =
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

        val roundtrippedPolicy =
            jsonMapper.readValue(jsonMapper.writeValueAsString(policy), jacksonTypeRef<Policy>())

        assertThat(roundtrippedPolicy).isEqualTo(policy)
    }
}
