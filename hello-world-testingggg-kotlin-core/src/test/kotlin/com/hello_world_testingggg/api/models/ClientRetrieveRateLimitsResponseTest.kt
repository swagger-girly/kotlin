// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientRetrieveRateLimitsResponseTest {

    @Test
    fun create() {
        val clientRetrieveRateLimitsResponse =
            ClientRetrieveRateLimitsResponse.builder()
                .remaining(0)
                .resetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTier(
                    ClientRetrieveRateLimitsResponse.Tier.builder()
                        .name("name")
                        .quota(
                            ClientRetrieveRateLimitsResponse.Tier.Quota.builder()
                                .requests(0)
                                .window("1m")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(clientRetrieveRateLimitsResponse.remaining()).isEqualTo(0)
        assertThat(clientRetrieveRateLimitsResponse.resetAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(clientRetrieveRateLimitsResponse.tiers())
            .containsExactly(
                ClientRetrieveRateLimitsResponse.Tier.builder()
                    .name("name")
                    .quota(
                        ClientRetrieveRateLimitsResponse.Tier.Quota.builder()
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
        val clientRetrieveRateLimitsResponse =
            ClientRetrieveRateLimitsResponse.builder()
                .remaining(0)
                .resetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTier(
                    ClientRetrieveRateLimitsResponse.Tier.builder()
                        .name("name")
                        .quota(
                            ClientRetrieveRateLimitsResponse.Tier.Quota.builder()
                                .requests(0)
                                .window("1m")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedClientRetrieveRateLimitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientRetrieveRateLimitsResponse),
                jacksonTypeRef<ClientRetrieveRateLimitsResponse>(),
            )

        assertThat(roundtrippedClientRetrieveRateLimitsResponse)
            .isEqualTo(clientRetrieveRateLimitsResponse)
    }
}
