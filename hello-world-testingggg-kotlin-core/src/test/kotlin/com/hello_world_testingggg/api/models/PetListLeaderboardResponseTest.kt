// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

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
                .rank(0L)
                .roi(
                    PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
                )
                .build()

        assertThat(petListLeaderboardResponse.petId()).isEqualTo(0L)
        assertThat(petListLeaderboardResponse.badge())
            .isEqualTo(PetListLeaderboardResponse.Badge.builder().build())
        assertThat(petListLeaderboardResponse.rank()).isEqualTo(0L)
        assertThat(petListLeaderboardResponse.roi())
            .isEqualTo(
                PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petListLeaderboardResponse =
            PetListLeaderboardResponse.builder()
                .petId(0L)
                .badge(PetListLeaderboardResponse.Badge.builder().build())
                .rank(0L)
                .roi(
                    PetListLeaderboardResponse.Roi.builder().currency("currency").times(0.0).build()
                )
                .build()

        val roundtrippedPetListLeaderboardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petListLeaderboardResponse),
                jacksonTypeRef<PetListLeaderboardResponse>(),
            )

        assertThat(roundtrippedPetListLeaderboardResponse).isEqualTo(petListLeaderboardResponse)
    }
}
