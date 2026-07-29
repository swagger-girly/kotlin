// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.adoptions.AdoptionCreateParams
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdoptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val adoptionServiceAsync = client.adoptions()

        val application =
            adoptionServiceAsync.create(
                AdoptionCreateParams.Body.Individual.builder()
                    .name("name")
                    .address(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build()
                            )
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedMoney(
                                Money.builder()
                                    .amount(2500L)
                                    .currency("USD")
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
                    .age(0)
                    .email("email")
                    .build()
            )

        application.validate()
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
        val adoptionServiceAsync = client.adoptions()

        val application = adoptionServiceAsync.retrieve("applicationId")

        application.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveDecision() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val adoptionServiceAsync = client.adoptions()

        val response = adoptionServiceAsync.retrieveDecision("applicationId")

        response.validate()
    }
}
