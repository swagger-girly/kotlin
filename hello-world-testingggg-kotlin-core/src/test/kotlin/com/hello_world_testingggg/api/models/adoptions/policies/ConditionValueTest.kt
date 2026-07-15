// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConditionValueTest {

    @Test
    fun ofRegex() {
        val regex = "string"

        val conditionValue = ConditionValue.ofRegex(regex)

        assertThat(conditionValue.regex()).isEqualTo(regex)
        assertThat(conditionValue.long()).isNull()
        assertThat(conditionValue.double()).isNull()
        assertThat(conditionValue.listOfStrings()).isNull()
        assertThat(conditionValue.timestamp()).isNull()
    }

    @Test
    fun ofRegexRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionValue = ConditionValue.ofRegex("string")

        val roundtrippedConditionValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionValue),
                jacksonTypeRef<ConditionValue>(),
            )

        assertThat(roundtrippedConditionValue).isEqualTo(conditionValue)
    }

    @Test
    fun ofLong() {
        val long = 0L

        val conditionValue = ConditionValue.ofLong(long)

        assertThat(conditionValue.regex()).isNull()
        assertThat(conditionValue.long()).isEqualTo(long)
        assertThat(conditionValue.double()).isNull()
        assertThat(conditionValue.listOfStrings()).isNull()
        assertThat(conditionValue.timestamp()).isNull()
    }

    @Test
    fun ofLongRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionValue = ConditionValue.ofLong(0L)

        val roundtrippedConditionValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionValue),
                jacksonTypeRef<ConditionValue>(),
            )

        assertThat(roundtrippedConditionValue).isEqualTo(conditionValue)
    }

    @Test
    fun ofDouble() {
        val double = 0.0

        val conditionValue = ConditionValue.ofDouble(double)

        assertThat(conditionValue.regex()).isNull()
        assertThat(conditionValue.long()).isNull()
        assertThat(conditionValue.double()).isEqualTo(double)
        assertThat(conditionValue.listOfStrings()).isNull()
        assertThat(conditionValue.timestamp()).isNull()
    }

    @Test
    fun ofDoubleRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionValue = ConditionValue.ofDouble(0.0)

        val roundtrippedConditionValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionValue),
                jacksonTypeRef<ConditionValue>(),
            )

        assertThat(roundtrippedConditionValue).isEqualTo(conditionValue)
    }

    @Test
    fun ofListOfStrings() {
        val listOfStrings = listOf("string")

        val conditionValue = ConditionValue.ofListOfStrings(listOfStrings)

        assertThat(conditionValue.regex()).isNull()
        assertThat(conditionValue.long()).isNull()
        assertThat(conditionValue.double()).isNull()
        assertThat(conditionValue.listOfStrings()).isEqualTo(listOfStrings)
        assertThat(conditionValue.timestamp()).isNull()
    }

    @Test
    fun ofListOfStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionValue = ConditionValue.ofListOfStrings(listOf("string"))

        val roundtrippedConditionValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionValue),
                jacksonTypeRef<ConditionValue>(),
            )

        assertThat(roundtrippedConditionValue).isEqualTo(conditionValue)
    }

    @Test
    fun ofTimestamp() {
        val timestamp = OffsetDateTime.parse("2019-12-27T18:11:19.117Z")

        val conditionValue = ConditionValue.ofTimestamp(timestamp)

        assertThat(conditionValue.regex()).isNull()
        assertThat(conditionValue.long()).isNull()
        assertThat(conditionValue.double()).isNull()
        assertThat(conditionValue.listOfStrings()).isNull()
        assertThat(conditionValue.timestamp()).isEqualTo(timestamp)
    }

    @Test
    fun ofTimestampRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionValue =
            ConditionValue.ofTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))

        val roundtrippedConditionValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionValue),
                jacksonTypeRef<ConditionValue>(),
            )

        assertThat(roundtrippedConditionValue).isEqualTo(conditionValue)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val conditionValue =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConditionValue>())

        val e = assertThrows<HelloWorldTestinggggInvalidDataException> { conditionValue.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
