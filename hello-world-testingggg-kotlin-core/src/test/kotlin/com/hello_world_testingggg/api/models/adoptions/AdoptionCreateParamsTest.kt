// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions

import com.hello_world_testingggg.api.models.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionCreateParamsTest {

    @Test
    fun create() {
        AdoptionCreateParams.builder()
            .body(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            AdoptionCreateParams.builder()
                .body(
                    AdoptionCreateParams.Body.Individual.builder()
                        .name("name")
                        .address(
                            Address.builder()
                                .city("Palo Alto")
                                .geo(
                                    Address.Geo.builder()
                                        .latitude(37.4443)
                                        .longitude(-122.1598)
                                        .build()
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AdoptionCreateParams.Body.ofIndividual(
                    AdoptionCreateParams.Body.Individual.builder()
                        .name("name")
                        .address(
                            Address.builder()
                                .city("Palo Alto")
                                .geo(
                                    Address.Geo.builder()
                                        .latitude(37.4443)
                                        .longitude(-122.1598)
                                        .build()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AdoptionCreateParams.builder().individualBody("name").build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AdoptionCreateParams.Body.ofIndividual(
                    AdoptionCreateParams.Body.Individual.builder().name("name").build()
                )
            )
    }
}
