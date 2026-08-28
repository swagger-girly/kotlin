// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyUpdateParamsTest {

    @Test
    fun create() {
        PolicyUpdateParams.builder()
            .policyId("policyId")
            .body(
                PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                    .escalation(
                        PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation.builder()
                            .operator(
                                PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation
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
            PolicyUpdateParams.builder()
                .policyId("policyId")
                .body(PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("policyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PolicyUpdateParams.builder()
                .policyId("policyId")
                .body(
                    PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                        .escalation(
                            PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation.builder()
                                .operator(
                                    PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation
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
                PolicyUpdateParams.Body.ofAdoptionPolicyDetailsUpdate(
                    PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                        .escalation(
                            PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation.builder()
                                .operator(
                                    PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation
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
            PolicyUpdateParams.builder()
                .policyId("policyId")
                .body(PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PolicyUpdateParams.Body.ofAdoptionPolicyDetailsUpdate(
                    PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder().build()
                )
            )
    }
}
