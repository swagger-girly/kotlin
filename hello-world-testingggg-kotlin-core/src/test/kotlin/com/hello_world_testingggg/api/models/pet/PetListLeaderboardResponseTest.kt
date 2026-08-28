// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetListLeaderboardResponseTest {

    @Test
    fun create() {
        val petListLeaderboardResponse =
            PetListLeaderboardResponse.builder()
                .petId(0L)
                .badge(PetListLeaderboardResponse.Badge.builder().build())
                .docsRef(PetListLeaderboardResponse.DocsRef.TOP_ADOPTER)
                .rank(0L)
                .roi(
                    PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
                )
                .sevenDayStreak(0L)
                .build()

        assertThat(petListLeaderboardResponse.petId()).isEqualTo(0L)
        assertThat(petListLeaderboardResponse.badge())
            .isEqualTo(PetListLeaderboardResponse.Badge.builder().build())
        assertThat(petListLeaderboardResponse.docsRef())
            .isEqualTo(PetListLeaderboardResponse.DocsRef.TOP_ADOPTER)
        assertThat(petListLeaderboardResponse.rank()).isEqualTo(0L)
        assertThat(petListLeaderboardResponse.roi())
            .isEqualTo(
                PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
            )
        assertThat(petListLeaderboardResponse.sevenDayStreak()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petListLeaderboardResponse =
            PetListLeaderboardResponse.builder()
                .petId(0L)
                .badge(PetListLeaderboardResponse.Badge.builder().build())
                .docsRef(PetListLeaderboardResponse.DocsRef.TOP_ADOPTER)
                .rank(0L)
                .roi(
                    PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
                )
                .sevenDayStreak(0L)
                .build()

        val roundtrippedPetListLeaderboardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petListLeaderboardResponse),
                jacksonTypeRef<PetListLeaderboardResponse>(),
            )

        assertThat(roundtrippedPetListLeaderboardResponse).isEqualTo(petListLeaderboardResponse)
    }
}
