// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .city("Palo Alto")
                .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
                .state("CA")
                .street("437 Lytton")
                .zip("94301")
                .build()

        assertThat(address.city()).isEqualTo("Palo Alto")
        assertThat(address.geo())
            .isEqualTo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
        assertThat(address.state()).isEqualTo("CA")
        assertThat(address.street()).isEqualTo("437 Lytton")
        assertThat(address.zip()).isEqualTo("94301")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .city("Palo Alto")
                .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
                .state("CA")
                .street("437 Lytton")
                .zip("94301")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
