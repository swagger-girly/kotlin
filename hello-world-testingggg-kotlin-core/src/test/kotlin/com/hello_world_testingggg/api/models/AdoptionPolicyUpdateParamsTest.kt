// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionPolicyUpdateParamsTest {

    @Test
    fun create() {
        AdoptionPolicyUpdateParams.builder()
            .policyId("policyId")
            .body(
                AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                    .escalation(
                        AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.RuleGroup
                            .builder()
                            .operator(
                                AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate
                                    .RuleGroup
                                    .Operator
                                    .ALL
                            )
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
                    .name("name")
                    .notificationTarget("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AdoptionPolicyUpdateParams.builder()
                .policyId("policyId")
                .body(AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("policyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AdoptionPolicyUpdateParams.builder()
                .policyId("policyId")
                .body(
                    AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                        .escalation(
                            AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.RuleGroup
                                .builder()
                                .operator(
                                    AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate
                                        .RuleGroup
                                        .Operator
                                        .ALL
                                )
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
                        .name("name")
                        .notificationTarget("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AdoptionPolicyUpdateParams.Body.ofAdoptionPolicyDetailsUpdate(
                    AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                        .escalation(
                            AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.RuleGroup
                                .builder()
                                .operator(
                                    AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate
                                        .RuleGroup
                                        .Operator
                                        .ALL
                                )
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
                        .name("name")
                        .notificationTarget("string")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdoptionPolicyUpdateParams.builder()
                .policyId("policyId")
                .body(AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AdoptionPolicyUpdateParams.Body.ofAdoptionPolicyDetailsUpdate(
                    AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build()
                )
            )
    }
}
