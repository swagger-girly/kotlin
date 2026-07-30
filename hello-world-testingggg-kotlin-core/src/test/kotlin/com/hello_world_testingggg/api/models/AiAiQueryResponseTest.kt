// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiAiQueryResponseTest {

    @Test
    fun create() {
        val aiAiQueryResponse =
            AiAiQueryResponse.builder()
                .addDataExtracted(
                    AiAiQueryResponse.DataExtracted.builder()
                        .datapointValue("datapoint_value")
                        .build()
                )
                .addMatchedRule(AiAiQueryResponse.MatchedRule.builder().matchScore(0.0).build())
                .build()

        assertThat(aiAiQueryResponse.dataExtracted())
            .containsExactly(
                AiAiQueryResponse.DataExtracted.builder().datapointValue("datapoint_value").build()
            )
        assertThat(aiAiQueryResponse.matchedRules())
            .containsExactly(AiAiQueryResponse.MatchedRule.builder().matchScore(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiAiQueryResponse =
            AiAiQueryResponse.builder()
                .addDataExtracted(
                    AiAiQueryResponse.DataExtracted.builder()
                        .datapointValue("datapoint_value")
                        .build()
                )
                .addMatchedRule(AiAiQueryResponse.MatchedRule.builder().matchScore(0.0).build())
                .build()

        val roundtrippedAiAiQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiAiQueryResponse),
                jacksonTypeRef<AiAiQueryResponse>(),
            )

        assertThat(roundtrippedAiAiQueryResponse).isEqualTo(aiAiQueryResponse)
    }
}
