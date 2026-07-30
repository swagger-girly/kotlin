// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.adoptions

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.AdoptionPolicyCreateParams
import com.hello_world_testingggg.api.models.AdoptionPolicyUpdateParams
import com.hello_world_testingggg.api.models.AdoptionRule
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.Pet
import com.hello_world_testingggg.api.models.PetStatus
import com.hello_world_testingggg.api.models.RuleAttribute
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyService = client.adoptions().policies()

        val policy =
            policyService.create(
                AdoptionPolicyCreateParams.builder()
                    .name("name")
                    .addRule(
                        AdoptionRule.builder()
                            .attribute(RuleAttribute.PET_STATUS)
                            .operation(AdoptionRule.Operation.IS_ONE_OF)
                            .value("string")
                            .build()
                    )
                    .escalation(
                        AdoptionPolicyCreateParams.RuleGroup.builder()
                            .operator(AdoptionPolicyCreateParams.RuleGroup.Operator.ALL)
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
                                        Address.GeoPoint.builder()
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
                        AdoptionPolicyCreateParams.RegionalOverrides.builder()
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
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyService = client.adoptions().policies()

        val policy = policyService.retrieve("policyId")

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyService = client.adoptions().policies()

        val policy =
            policyService.update(
                AdoptionPolicyUpdateParams.builder()
                    .policyId("policyId")
                    .body(
                        AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate.builder()
                            .escalation(
                                AdoptionPolicyUpdateParams.Body.AdoptionPolicyDetailsUpdate
                                    .RuleGroup
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
            )

        policy.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val policyService = client.adoptions().policies()

        val page = policyService.list()

        page.response().validate()
    }
}
