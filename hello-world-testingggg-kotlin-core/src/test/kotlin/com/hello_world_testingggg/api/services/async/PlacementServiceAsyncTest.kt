// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.placements.PlacementCreateParams
import com.hello_world_testingggg.api.models.placements.PlacementEvent
import com.hello_world_testingggg.api.models.placements.PlacementRecordEventParams
import com.hello_world_testingggg.api.models.placements.TransferLeg
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlacementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val placementServiceAsync = client.placements()

        val placement =
            placementServiceAsync.create(
                PlacementCreateParams.builder()
                    .applicationId("applicationId")
                    .initialEvent(
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
                    .logistics(
                        PlacementCreateParams.Logistics.builder()
                            .delivery(
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
                            .handler(
                                PlacementCreateParams.Logistics.Handler.builder()
                                    .certification(
                                        PlacementCreateParams.Logistics.Handler.Certification
                                            .builder()
                                            .level(
                                                PlacementCreateParams.Logistics.Handler
                                                    .Certification
                                                    .Level
                                                    .STANDARD
                                            )
                                            .audit(
                                                PlacementCreateParams.Logistics.Handler
                                                    .Certification
                                                    .Audit
                                                    .builder()
                                                    .recordedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .recordedBy("recordedBy")
                                                    .source(
                                                        PlacementCreateParams.Logistics.Handler
                                                            .Certification
                                                            .Audit
                                                            .Source
                                                            .MANUAL
                                                    )
                                                    .build()
                                            )
                                            .issuedBy("issuedBy")
                                            .build()
                                    )
                                    .name("name")
                                    .build()
                            )
                            .pickup(
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
                            .build()
                    )
                    .scheduledFor(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        placement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val placementServiceAsync = client.placements()

        val placement = placementServiceAsync.retrieve("placementId")

        placement.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val placementServiceAsync = client.placements()

        val page = placementServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun recordEvent() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val placementServiceAsync = client.placements()

        val placement =
            placementServiceAsync.recordEvent(
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
            )

        placement.validate()
    }
}
