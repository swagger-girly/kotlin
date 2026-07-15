// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.policies.AdoptionRule
import com.hello_world_testingggg.api.models.adoptions.policies.Policy
import com.hello_world_testingggg.api.models.adoptions.policies.RuleAttribute
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionsPolicyChangedWebhookEventTest {

    @Test
    fun create() {
        val adoptionsPolicyChangedWebhookEvent =
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

        assertThat(adoptionsPolicyChangedWebhookEvent.id()).isEqualTo("id")
        assertThat(adoptionsPolicyChangedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(adoptionsPolicyChangedWebhookEvent.policy())
            .isEqualTo(
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
        assertThat(adoptionsPolicyChangedWebhookEvent.previous())
            .isEqualTo(
                AdoptionsPolicyChangedWebhookEvent.Previous.builder()
                    .notificationTarget("string")
                    .status(AdoptionsPolicyChangedWebhookEvent.Previous.Status.DRAFT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionsPolicyChangedWebhookEvent =
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

        val roundtrippedAdoptionsPolicyChangedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionsPolicyChangedWebhookEvent),
                jacksonTypeRef<AdoptionsPolicyChangedWebhookEvent>(),
            )

        assertThat(roundtrippedAdoptionsPolicyChangedWebhookEvent)
            .isEqualTo(adoptionsPolicyChangedWebhookEvent)
    }
}
