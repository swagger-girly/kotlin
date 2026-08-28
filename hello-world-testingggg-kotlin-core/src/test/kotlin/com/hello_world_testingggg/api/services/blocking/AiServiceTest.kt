// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.ai.AiAiQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun aiQuery() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val aiService = client.ai()

        val response =
            aiService.aiQuery(
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
            )

        response.validate()
    }
}
