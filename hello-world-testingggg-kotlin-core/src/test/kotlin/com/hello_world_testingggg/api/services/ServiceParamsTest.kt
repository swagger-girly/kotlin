// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.putRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.Pet
import com.hello_world_testingggg.api.models.PetStatus
import com.hello_world_testingggg.api.models.PetUpdateParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: HelloWorldTestinggggClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            HelloWorldTestinggggOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val petService = client.pet()
        stubFor(put(anyUrl()).willReturn(ok("{}")))

        petService.update(
            PetUpdateParams.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                        .category(JsonValue.from(mapOf<String, Any>()))
                        .microchipId("string")
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
                                .relatedMoney(
                                    Money.builder()
                                        .amount(2500L)
                                        .currency("USD")
                                        .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                        .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                        .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
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
                        .relatedMoney(
                            Money.builder()
                                .amount(2500L)
                                .currency("USD")
                                .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                        .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                        .relatedUser(JsonValue.from(mapOf<String, Any>()))
                        .status(PetStatus.AVAILABLE)
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            putRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
