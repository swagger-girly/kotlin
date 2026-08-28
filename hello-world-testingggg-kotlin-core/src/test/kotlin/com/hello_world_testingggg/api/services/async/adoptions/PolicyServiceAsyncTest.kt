// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.adoptions

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.policies.AdoptionRule
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams
import com.hello_world_testingggg.api.models.adoptions.policies.RuleAttribute
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
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
                    .feeCap(
                        Money.builder()
                            .amount(2500L)
                            .currency("USD")
                            .relatedAddress(
                                Address.builder()
                                    .city("Palo Alto")
                                    .geo(
                                        Address.Geo.builder()
                                            .latitude(37.4443)
                                            .longitude(-122.1598)
                                            .build()
                                    )
                                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                    .relatedPet(
                                        Pet.builder()
                                            .name("doggie")
                                            .addPhotoUrl("string")
                                            .id(10L)
                                            .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                                            .category(JsonValue.from(mapOf<String, Any>()))
                                            .microchipId("string")
                                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                            .status(PetStatus.AVAILABLE)
                                            .addTag(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                    .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                    .state("CA")
                                    .street("437 Lytton")
                                    .zip("94301")
                                    .build()
                            )
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedPet(
                                Pet.builder()
                                    .name("doggie")
                                    .addPhotoUrl("string")
                                    .id(10L)
                                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                                    .category(JsonValue.from(mapOf<String, Any>()))
                                    .microchipId("string")
                                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                    .status(PetStatus.AVAILABLE)
                                    .addTag(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
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
