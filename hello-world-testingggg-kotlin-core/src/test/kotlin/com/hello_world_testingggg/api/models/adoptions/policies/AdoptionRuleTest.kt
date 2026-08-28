// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionRuleTest {

    @Test
    fun create() {
        val adoptionRule =
            AdoptionRule.builder()
                .attribute(RuleAttribute.PET_STATUS)
                .operation(AdoptionRule.Operation.IS_ONE_OF)
                .value("string")
                .build()

        assertThat(adoptionRule.attribute()).isEqualTo(RuleAttribute.PET_STATUS)
        assertThat(adoptionRule.operation()).isEqualTo(AdoptionRule.Operation.IS_ONE_OF)
        assertThat(adoptionRule.value()).isEqualTo(ConditionValue.ofRegex("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adoptionRule =
            AdoptionRule.builder()
                .attribute(RuleAttribute.PET_STATUS)
                .operation(AdoptionRule.Operation.IS_ONE_OF)
                .value("string")
                .build()

        val roundtrippedAdoptionRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adoptionRule),
                jacksonTypeRef<AdoptionRule>(),
            )

        assertThat(roundtrippedAdoptionRule).isEqualTo(adoptionRule)
    }
}
