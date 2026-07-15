// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.adoptions.AdoptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdoptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val adoptionService = client.adoptions()

        val application =
            adoptionService.create(
                AdoptionCreateParams.Body.Individual.builder()
                    .name("name")
                    .address(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build()
                            )
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
    fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val adoptionService = client.adoptions()

        val application = adoptionService.retrieve("applicationId")

        application.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDecision() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val adoptionService = client.adoptions()

        val response = adoptionService.retrieveDecision("applicationId")

        response.validate()
    }
}
