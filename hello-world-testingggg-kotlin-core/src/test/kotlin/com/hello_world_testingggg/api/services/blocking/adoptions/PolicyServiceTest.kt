// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.adoptions

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.policies.AdoptionRule
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams
import com.hello_world_testingggg.api.models.adoptions.policies.RuleAttribute
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.adoptions().policies()

        val policy =
            policyService.create(
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
            )

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.adoptions().policies()

        val policy = policyService.retrieve("policyId")

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.adoptions().policies()

        val policy =
            policyService.update(
                PolicyUpdateParams.builder()
                    .policyId("policyId")
                    .body(
                        PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                            .escalation(
                                PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.Escalation
                                    .builder()
                                    .operator(
                                        PolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate
                                            .Escalation
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
            )

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.adoptions().policies()

        val page = policyService.list()

        page.response().validate()
    }
}
