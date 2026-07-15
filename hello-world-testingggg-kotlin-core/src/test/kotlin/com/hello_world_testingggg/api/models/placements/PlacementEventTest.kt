// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.veterinary.VaccinationRecord
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PlacementEventTest {

    @Test
    fun ofTransfer() {
        val transfer =
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
                        .contact(TransferLeg.Contact.builder().name("name").phone("phone").build())
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

        val placementEvent = PlacementEvent.ofTransfer(transfer)

        assertThat(placementEvent.transfer()).isEqualTo(transfer)
        assertThat(placementEvent.checkup()).isNull()
        assertThat(placementEvent.disruption()).isNull()
    }

    @Test
    fun ofTransferRoundtrip() {
        val jsonMapper = jsonMapper()
        val placementEvent =
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

        val roundtrippedPlacementEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placementEvent),
                jacksonTypeRef<PlacementEvent>(),
            )

        assertThat(roundtrippedPlacementEvent).isEqualTo(placementEvent)
    }

    @Test
    fun ofCheckup() {
        val checkup =
            PlacementEvent.PlacementCheckupEvent.builder()
                .id("id")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PlacementEvent.PlacementCheckupEvent.Type.CHECKUP)
                .followUp(
                    PlacementEvent.PlacementCheckupEvent.FollowUp.builder()
                        .due(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .build()
                )
                .note("note")
                .record(
                    VaccinationRecord.builder()
                        .id("id")
                        .administeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vaccine("vaccine")
                        .audit(
                            VaccinationRecord.Audit.builder()
                                .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .recordedBy("recordedBy")
                                .source(VaccinationRecord.Audit.Source.MANUAL)
                                .build()
                        )
                        .addBoosterSchedule(
                            VaccinationRecord.BoosterSchedule.builder()
                                .due(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .completed(true)
                                .dose(0.0)
                                .build()
                        )
                        .veterinarian(
                            VaccinationRecord.Veterinarian.builder()
                                .license(
                                    VaccinationRecord.Veterinarian.License.builder()
                                        .number("number")
                                        .region("region")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val placementEvent = PlacementEvent.ofCheckup(checkup)

        assertThat(placementEvent.transfer()).isNull()
        assertThat(placementEvent.checkup()).isEqualTo(checkup)
        assertThat(placementEvent.disruption()).isNull()
    }

    @Test
    fun ofCheckupRoundtrip() {
        val jsonMapper = jsonMapper()
        val placementEvent =
            PlacementEvent.ofCheckup(
                PlacementEvent.PlacementCheckupEvent.builder()
                    .id("id")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PlacementEvent.PlacementCheckupEvent.Type.CHECKUP)
                    .followUp(
                        PlacementEvent.PlacementCheckupEvent.FollowUp.builder()
                            .due(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reason("reason")
                            .build()
                    )
                    .note("note")
                    .record(
                        VaccinationRecord.builder()
                            .id("id")
                            .administeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .vaccine("vaccine")
                            .audit(
                                VaccinationRecord.Audit.builder()
                                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .recordedBy("recordedBy")
                                    .source(VaccinationRecord.Audit.Source.MANUAL)
                                    .build()
                            )
                            .addBoosterSchedule(
                                VaccinationRecord.BoosterSchedule.builder()
                                    .due(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .completed(true)
                                    .dose(0.0)
                                    .build()
                            )
                            .veterinarian(
                                VaccinationRecord.Veterinarian.builder()
                                    .license(
                                        VaccinationRecord.Veterinarian.License.builder()
                                            .number("number")
                                            .region("region")
                                            .build()
                                    )
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedPlacementEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placementEvent),
                jacksonTypeRef<PlacementEvent>(),
            )

        assertThat(roundtrippedPlacementEvent).isEqualTo(placementEvent)
    }

    @Test
    fun ofDisruption() {
        val disruption =
            PlacementEvent.PlacementDisruptionEvent.builder()
                .id("id")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .severity(0)
                .type(PlacementEvent.PlacementDisruptionEvent.Type.DISRUPTION)
                .note("note")
                .build()

        val placementEvent = PlacementEvent.ofDisruption(disruption)

        assertThat(placementEvent.transfer()).isNull()
        assertThat(placementEvent.checkup()).isNull()
        assertThat(placementEvent.disruption()).isEqualTo(disruption)
    }

    @Test
    fun ofDisruptionRoundtrip() {
        val jsonMapper = jsonMapper()
        val placementEvent =
            PlacementEvent.ofDisruption(
                PlacementEvent.PlacementDisruptionEvent.builder()
                    .id("id")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .severity(0)
                    .type(PlacementEvent.PlacementDisruptionEvent.Type.DISRUPTION)
                    .note("note")
                    .build()
            )

        val roundtrippedPlacementEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placementEvent),
                jacksonTypeRef<PlacementEvent>(),
            )

        assertThat(roundtrippedPlacementEvent).isEqualTo(placementEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val placementEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PlacementEvent>())

        val e = assertThrows<HelloWorldTestinggggInvalidDataException> { placementEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
