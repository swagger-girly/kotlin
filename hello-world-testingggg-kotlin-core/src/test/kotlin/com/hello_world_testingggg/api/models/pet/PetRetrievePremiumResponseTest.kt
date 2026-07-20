// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetRetrievePremiumResponseTest {

    @Test
    fun create() {
        val petRetrievePremiumResponse =
            PetRetrievePremiumResponse.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                .category(
                    Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                )
                .microchipId("string")
                .status(PetStatus.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .premiumSince(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .coverageLimit(0L)
                .insurance(
                    PetRetrievePremiumResponse.Insurance.builder()
                        .planId("planId")
                        .provider("provider")
                        .deductible(0L)
                        .premium(Money.builder().amount(2500L).currency("USD").build())
                        .tier(PetRetrievePremiumResponse.Insurance.Tier.BASIC)
                        .build()
                )
                .pedigree(
                    PetRetrievePremiumResponse.Pedigree.builder()
                        .certified(true)
                        .addLineage("string")
                        .registry("registry")
                        .build()
                )
                .build()

        assertThat(petRetrievePremiumResponse.name()).isEqualTo("doggie")
        assertThat(petRetrievePremiumResponse.photoUrls()).containsExactly("string")
        assertThat(petRetrievePremiumResponse.id()).isEqualTo(10L)
        assertThat(petRetrievePremiumResponse.acquisitionChannel())
            .isEqualTo(Pet.AcquisitionChannel.BREEDER)
        assertThat(petRetrievePremiumResponse.category())
            .isEqualTo(Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build())
        assertThat(petRetrievePremiumResponse.microchipId())
            .isEqualTo(Pet.MicrochipId.ofString("string"))
        assertThat(petRetrievePremiumResponse.status()).isEqualTo(PetStatus.AVAILABLE)
        assertThat(petRetrievePremiumResponse.tags())
            .containsExactly(Pet.Tag.builder().id(0L).name("name").build())
        assertThat(petRetrievePremiumResponse.premiumSince())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(petRetrievePremiumResponse.coverageLimit())
            .isEqualTo(PetRetrievePremiumResponse.CoverageLimit.ofLong(0L))
        assertThat(petRetrievePremiumResponse.insurance())
            .isEqualTo(
                PetRetrievePremiumResponse.Insurance.builder()
                    .planId("planId")
                    .provider("provider")
                    .deductible(0L)
                    .premium(Money.builder().amount(2500L).currency("USD").build())
                    .tier(PetRetrievePremiumResponse.Insurance.Tier.BASIC)
                    .build()
            )
        assertThat(petRetrievePremiumResponse.pedigree())
            .isEqualTo(
                PetRetrievePremiumResponse.Pedigree.builder()
                    .certified(true)
                    .addLineage("string")
                    .registry("registry")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petRetrievePremiumResponse =
            PetRetrievePremiumResponse.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                .category(
                    Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                )
                .microchipId("string")
                .status(PetStatus.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .premiumSince(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .coverageLimit(0L)
                .insurance(
                    PetRetrievePremiumResponse.Insurance.builder()
                        .planId("planId")
                        .provider("provider")
                        .deductible(0L)
                        .premium(Money.builder().amount(2500L).currency("USD").build())
                        .tier(PetRetrievePremiumResponse.Insurance.Tier.BASIC)
                        .build()
                )
                .pedigree(
                    PetRetrievePremiumResponse.Pedigree.builder()
                        .certified(true)
                        .addLineage("string")
                        .registry("registry")
                        .build()
                )
                .build()

        val roundtrippedPetRetrievePremiumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petRetrievePremiumResponse),
                jacksonTypeRef<PetRetrievePremiumResponse>(),
            )

        assertThat(roundtrippedPetRetrievePremiumResponse).isEqualTo(petRetrievePremiumResponse)
    }
}
