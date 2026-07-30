// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrieveRateLimitsResponseTest {

    @Test
    fun create() {
        val retrieveRateLimitsResponse =
            RetrieveRateLimitsResponse.builder()
                .remaining(0)
                .resetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTier(
                    RetrieveRateLimitsResponse.Tier.builder()
                        .name("name")
                        .quota(
                            RetrieveRateLimitsResponse.Tier.Quota.builder()
                                .requests(0)
                                .window("1m")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(retrieveRateLimitsResponse.remaining()).isEqualTo(0)
        assertThat(retrieveRateLimitsResponse.resetAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(retrieveRateLimitsResponse.tiers())
            .containsExactly(
                RetrieveRateLimitsResponse.Tier.builder()
                    .name("name")
                    .quota(
                        RetrieveRateLimitsResponse.Tier.Quota.builder()
                            .requests(0)
                            .window("1m")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrieveRateLimitsResponse =
            RetrieveRateLimitsResponse.builder()
                .remaining(0)
                .resetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTier(
                    RetrieveRateLimitsResponse.Tier.builder()
                        .name("name")
                        .quota(
                            RetrieveRateLimitsResponse.Tier.Quota.builder()
                                .requests(0)
                                .window("1m")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedRetrieveRateLimitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrieveRateLimitsResponse),
                jacksonTypeRef<RetrieveRateLimitsResponse>(),
            )

        assertThat(roundtrippedRetrieveRateLimitsResponse).isEqualTo(retrieveRateLimitsResponse)
    }
}
