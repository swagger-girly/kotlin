// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferLegTest {

    @Test
    fun create() {
        val transferLeg =
            TransferLeg.builder()
                .location(
                    Address.builder()
                        .city("Palo Alto")
                        .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
                        .state("CA")
                        .street("437 Lytton")
                        .zip("94301")
                        .build()
                )
                .contact(TransferLeg.Contact.builder().name("name").phone("phone").build())
                .cost(Money.builder().amount(2500L).currency("USD").build())
                .window(
                    TransferLeg.Window.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(transferLeg.location())
            .isEqualTo(
                Address.builder()
                    .city("Palo Alto")
                    .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
                    .state("CA")
                    .street("437 Lytton")
                    .zip("94301")
                    .build()
            )
        assertThat(transferLeg.contact())
            .isEqualTo(TransferLeg.Contact.builder().name("name").phone("phone").build())
        assertThat(transferLeg.cost())
            .isEqualTo(Money.builder().amount(2500L).currency("USD").build())
        assertThat(transferLeg.window())
            .isEqualTo(
                TransferLeg.Window.builder()
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferLeg =
            TransferLeg.builder()
                .location(
                    Address.builder()
                        .city("Palo Alto")
                        .geo(Address.Geo.builder().latitude(37.4443).longitude(-122.1598).build())
                        .state("CA")
                        .street("437 Lytton")
                        .zip("94301")
                        .build()
                )
                .contact(TransferLeg.Contact.builder().name("name").phone("phone").build())
                .cost(Money.builder().amount(2500L).currency("USD").build())
                .window(
                    TransferLeg.Window.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedTransferLeg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferLeg),
                jacksonTypeRef<TransferLeg>(),
            )

        assertThat(roundtrippedTransferLeg).isEqualTo(transferLeg)
    }
}
