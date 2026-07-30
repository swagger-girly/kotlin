// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaccinationRecordTest {

    @Test
    fun create() {
        val vaccinationRecord =
            VaccinationRecord.builder()
                .id("id")
                .administeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vaccine("vaccine")
                .audit(
                    VaccinationRecord.AuditStamp.builder()
                        .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordedBy("recordedBy")
                        .source(VaccinationRecord.AuditStamp.Source.MANUAL)
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

        assertThat(vaccinationRecord.id()).isEqualTo("id")
        assertThat(vaccinationRecord.administeredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaccinationRecord.vaccine()).isEqualTo("vaccine")
        assertThat(vaccinationRecord.audit())
            .isEqualTo(
                VaccinationRecord.AuditStamp.builder()
                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordedBy("recordedBy")
                    .source(VaccinationRecord.AuditStamp.Source.MANUAL)
                    .build()
            )
        assertThat(vaccinationRecord.boosterSchedule())
            .containsExactly(
                VaccinationRecord.BoosterSchedule.builder()
                    .due(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .completed(true)
                    .dose(0.0)
                    .build()
            )
        assertThat(vaccinationRecord.veterinarian())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaccinationRecord =
            VaccinationRecord.builder()
                .id("id")
                .administeredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vaccine("vaccine")
                .audit(
                    VaccinationRecord.AuditStamp.builder()
                        .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordedBy("recordedBy")
                        .source(VaccinationRecord.AuditStamp.Source.MANUAL)
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

        val roundtrippedVaccinationRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaccinationRecord),
                jacksonTypeRef<VaccinationRecord>(),
            )

        assertThat(roundtrippedVaccinationRecord).isEqualTo(vaccinationRecord)
    }
}
