// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Money
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyCreateParamsTest {

    @Test
    fun create() {
        PolicyCreateParams.builder()
            .name("name")
            .addRule(
                AdoptionRule.builder()
                    .attribute(RuleAttribute.PET_STATUS)
                    .operation(AdoptionRule.Operation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
            .escalation(
                PolicyCreateParams.Escalation.builder()
                    .operator(PolicyCreateParams.Escalation.Operator.ALL)
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
                PolicyCreateParams.RegionalOverrides.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PolicyCreateParams.builder()
                .name("name")
                .addRule(
                    AdoptionRule.builder()
                        .attribute(RuleAttribute.PET_STATUS)
                        .operation(AdoptionRule.Operation.IS_ONE_OF)
                        .value("string")
                        .build()
                )
                .escalation(
                    PolicyCreateParams.Escalation.builder()
                        .operator(PolicyCreateParams.Escalation.Operator.ALL)
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
                    PolicyCreateParams.RegionalOverrides.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.rules())
            .containsExactly(
                AdoptionRule.builder()
                    .attribute(RuleAttribute.PET_STATUS)
                    .operation(AdoptionRule.Operation.IS_ONE_OF)
                    .value("string")
                    .build()
            )
        assertThat(body.escalation())
            .isEqualTo(
                PolicyCreateParams.Escalation.builder()
                    .operator(PolicyCreateParams.Escalation.Operator.ALL)
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
        assertThat(body.feeCap()).isEqualTo(Money.builder().amount(2500L).currency("USD").build())
        assertThat(body.notificationTarget())
            .isEqualTo(PolicyCreateParams.NotificationTarget.ofEmail("string"))
        assertThat(body.regionalOverrides())
            .isEqualTo(
                PolicyCreateParams.RegionalOverrides.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PolicyCreateParams.builder()
                .name("name")
                .addRule(
                    AdoptionRule.builder()
                        .attribute(RuleAttribute.PET_STATUS)
                        .operation(AdoptionRule.Operation.IS_ONE_OF)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.rules())
            .containsExactly(
                AdoptionRule.builder()
                    .attribute(RuleAttribute.PET_STATUS)
                    .operation(AdoptionRule.Operation.IS_ONE_OF)
                    .build()
            )
    }
}
