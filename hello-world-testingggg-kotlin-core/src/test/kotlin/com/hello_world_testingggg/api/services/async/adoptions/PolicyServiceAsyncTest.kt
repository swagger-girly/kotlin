// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.adoptions

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.policies.AdoptionRule
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams
import com.hello_world_testingggg.api.models.adoptions.policies.RuleAttribute
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyServiceAsync = client.adoptions().policies()

        val policy =
            policyServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyServiceAsync = client.adoptions().policies()

        val policy = policyServiceAsync.retrieve("policyId")

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyServiceAsync = client.adoptions().policies()

        val policy =
            policyServiceAsync.update(
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
    suspend fun list() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyServiceAsync = client.adoptions().policies()

        val page = policyServiceAsync.list()

        page.response().validate()
    }
}
