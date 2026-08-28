// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.ai

import com.hello_world_testingggg.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiAiQueryParamsTest {

    @Test
    fun create() {
        AiAiQueryParams.builder()
            .addDataToExtract(
                AiAiQueryParams.DataToExtract.builder()
                    .datapointName("datapoint_name")
                    .datapointType(AiAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .build()
            )
            .domain("domain")
            .authentication3ds(
                AiAiQueryParams.Authentication3ds.builder()
                    .addChallengeRule(
                        AiAiQueryParams.Authentication3ds.ChallengeRule.builder()
                            .challengeKind("challenge_kind")
                            .build()
                    )
                    .addFallbackCheck(
                        AiAiQueryParams.Authentication3ds.FallbackCheck.builder()
                            .checkName("check_name")
                            .build()
                    )
                    .build()
            )
            .datapointObjectSchema(
                AiAiQueryParams.DatapointObjectSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addExtractionRule(
                AiAiQueryParams.ExtractionRule.builder()
                    .ruleName("rule_name")
                    .ruleSeverity(AiAiQueryParams.ExtractionRule.RuleSeverity.LOW)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AiAiQueryParams.builder()
                .addDataToExtract(
                    AiAiQueryParams.DataToExtract.builder()
                        .datapointName("datapoint_name")
                        .datapointType(AiAiQueryParams.DataToExtract.DatapointType.TEXT)
                        .build()
                )
                .domain("domain")
                .authentication3ds(
                    AiAiQueryParams.Authentication3ds.builder()
                        .addChallengeRule(
                            AiAiQueryParams.Authentication3ds.ChallengeRule.builder()
                                .challengeKind("challenge_kind")
                                .build()
                        )
                        .addFallbackCheck(
                            AiAiQueryParams.Authentication3ds.FallbackCheck.builder()
                                .checkName("check_name")
                                .build()
                        )
                        .build()
                )
                .datapointObjectSchema(
                    AiAiQueryParams.DatapointObjectSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addExtractionRule(
                    AiAiQueryParams.ExtractionRule.builder()
                        .ruleName("rule_name")
                        .ruleSeverity(AiAiQueryParams.ExtractionRule.RuleSeverity.LOW)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.dataToExtract())
            .containsExactly(
                AiAiQueryParams.DataToExtract.builder()
                    .datapointName("datapoint_name")
                    .datapointType(AiAiQueryParams.DataToExtract.DatapointType.TEXT)
                    .build()
            )
        assertThat(body.domain()).isEqualTo("domain")
        assertThat(body.authentication3ds())
            .isEqualTo(
                AiAiQueryParams.Authentication3ds.builder()
                    .addChallengeRule(
                        AiAiQueryParams.Authentication3ds.ChallengeRule.builder()
                            .challengeKind("challenge_kind")
                            .build()
                    )
                    .addFallbackCheck(
                        AiAiQueryParams.Authentication3ds.FallbackCheck.builder()
                            .checkName("check_name")
                            .build()
                    )
                    .build()
            )
        assertThat(body.datapointObjectSchema())
            .isEqualTo(
                AiAiQueryParams.DatapointObjectSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.extractionRules())
            .containsExactly(
                AiAiQueryParams.ExtractionRule.builder()
                    .ruleName("rule_name")
                    .ruleSeverity(AiAiQueryParams.ExtractionRule.RuleSeverity.LOW)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AiAiQueryParams.builder()
                .addDataToExtract(
                    AiAiQueryParams.DataToExtract.builder().datapointName("datapoint_name").build()
                )
                .domain("domain")
                .build()

        val body = params._body()

        assertThat(body.dataToExtract())
            .containsExactly(
                AiAiQueryParams.DataToExtract.builder().datapointName("datapoint_name").build()
            )
        assertThat(body.domain()).isEqualTo("domain")
    }
}
