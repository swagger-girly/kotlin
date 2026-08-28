// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.veterinary

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MedicalSummaryTest {

    @Test
    fun create() {
        val medicalSummary =
            MedicalSummary.builder()
                .petId(0L)
                .audit(
                    MedicalSummary.Audit.builder()
                        .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordedBy("recordedBy")
                        .source(MedicalSummary.Audit.Source.MANUAL)
                        .build()
                )
                .addCondition(
                    MedicalSummary.Condition.builder()
                        .code("code")
                        .severity(MedicalSummary.Condition.Severity.MILD)
                        .treatment(
                            MedicalSummary.Condition.Treatment.builder()
                                .addMedication(
                                    MedicalSummary.Condition.Treatment.Medication.builder()
                                        .name("name")
                                        .dosage("string")
                                        .build()
                                )
                                .plan("plan")
                                .build()
                        )
                        .build()
                )
                .addVaccination(
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

        assertThat(medicalSummary.petId()).isEqualTo(0L)
        assertThat(medicalSummary.audit())
            .isEqualTo(
                MedicalSummary.Audit.builder()
                    .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordedBy("recordedBy")
                    .source(MedicalSummary.Audit.Source.MANUAL)
                    .build()
            )
        assertThat(medicalSummary.conditions())
            .containsExactly(
                MedicalSummary.Condition.builder()
                    .code("code")
                    .severity(MedicalSummary.Condition.Severity.MILD)
                    .treatment(
                        MedicalSummary.Condition.Treatment.builder()
                            .addMedication(
                                MedicalSummary.Condition.Treatment.Medication.builder()
                                    .name("name")
                                    .dosage("string")
                                    .build()
                            )
                            .plan("plan")
                            .build()
                    )
                    .build()
            )
        assertThat(medicalSummary.vaccinations())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val medicalSummary =
            MedicalSummary.builder()
                .petId(0L)
                .audit(
                    MedicalSummary.Audit.builder()
                        .recordedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordedBy("recordedBy")
                        .source(MedicalSummary.Audit.Source.MANUAL)
                        .build()
                )
                .addCondition(
                    MedicalSummary.Condition.builder()
                        .code("code")
                        .severity(MedicalSummary.Condition.Severity.MILD)
                        .treatment(
                            MedicalSummary.Condition.Treatment.builder()
                                .addMedication(
                                    MedicalSummary.Condition.Treatment.Medication.builder()
                                        .name("name")
                                        .dosage("string")
                                        .build()
                                )
                                .plan("plan")
                                .build()
                        )
                        .build()
                )
                .addVaccination(
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

        val roundtrippedMedicalSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(medicalSummary),
                jacksonTypeRef<MedicalSummary>(),
            )

        assertThat(roundtrippedMedicalSummary).isEqualTo(medicalSummary)
    }
}
