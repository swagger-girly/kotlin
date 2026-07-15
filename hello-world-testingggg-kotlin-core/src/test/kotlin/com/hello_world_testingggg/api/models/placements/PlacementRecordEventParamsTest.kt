// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlacementRecordEventParamsTest {

    @Test
    fun create() {
        PlacementRecordEventParams.builder()
            .placementId("placementId")
            .placementEvent(
                PlacementEvent.PlacementTransferEvent.builder()
                    .id("id")
                    .leg(
                        TransferLeg.builder()
                            .location(
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
                            .contact(
                                TransferLeg.Contact.builder().name("name").phone("phone").build()
                            )
                            .cost(Money.builder().amount(2500L).currency("USD").build())
                            .window(
                                TransferLeg.Window.builder()
                                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                    .note("note")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("placementId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
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
                                .contact(
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(Money.builder().amount(2500L).currency("USD").build())
                                .window(
                                    TransferLeg.Window.builder()
                                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .note("note")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlacementEvent.ofTransfer(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(
                            TransferLeg.builder()
                                .location(
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
                                .contact(
                                    TransferLeg.Contact.builder()
                                        .name("name")
                                        .phone("phone")
                                        .build()
                                )
                                .cost(Money.builder().amount(2500L).currency("USD").build())
                                .window(
                                    TransferLeg.Window.builder()
                                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .note("note")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlacementRecordEventParams.builder()
                .placementId("placementId")
                .placementEvent(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PlacementEvent.ofTransfer(
                    PlacementEvent.PlacementTransferEvent.builder()
                        .id("id")
                        .leg(TransferLeg.builder().location(Address.builder().build()).build())
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PlacementEvent.PlacementTransferEvent.Type.TRANSFER)
                        .build()
                )
            )
    }
}
