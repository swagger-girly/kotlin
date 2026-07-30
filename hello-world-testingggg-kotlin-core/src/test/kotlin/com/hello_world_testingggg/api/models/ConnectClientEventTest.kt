// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConnectClientEventTest {

    @Test
    fun ofPing() {
        val ping =
            ConnectClientEvent.PetClientPingEvent.builder()
                .type(ConnectClientEvent.PetClientPingEvent.Type.PING)
                .build()

        val connectClientEvent = ConnectClientEvent.ofPing(ping)

        assertThat(connectClientEvent.ping()).isEqualTo(ping)
        assertThat(connectClientEvent.subscribe()).isNull()
    }

    @Test
    fun ofPingRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectClientEvent =
            ConnectClientEvent.ofPing(
                ConnectClientEvent.PetClientPingEvent.builder()
                    .type(ConnectClientEvent.PetClientPingEvent.Type.PING)
                    .build()
            )

        val roundtrippedConnectClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectClientEvent),
                jacksonTypeRef<ConnectClientEvent>(),
            )

        assertThat(roundtrippedConnectClientEvent).isEqualTo(connectClientEvent)
    }

    @Test
    fun ofSubscribe() {
        val subscribe =
            ConnectClientEvent.PetClientSubscribeEvent.builder()
                .status(PetStatus.AVAILABLE)
                .type(ConnectClientEvent.PetClientSubscribeEvent.Type.SUBSCRIBE)
                .build()

        val connectClientEvent = ConnectClientEvent.ofSubscribe(subscribe)

        assertThat(connectClientEvent.ping()).isNull()
        assertThat(connectClientEvent.subscribe()).isEqualTo(subscribe)
    }

    @Test
    fun ofSubscribeRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectClientEvent =
            ConnectClientEvent.ofSubscribe(
                ConnectClientEvent.PetClientSubscribeEvent.builder()
                    .status(PetStatus.AVAILABLE)
                    .type(ConnectClientEvent.PetClientSubscribeEvent.Type.SUBSCRIBE)
                    .build()
            )

        val roundtrippedConnectClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectClientEvent),
                jacksonTypeRef<ConnectClientEvent>(),
            )

        assertThat(roundtrippedConnectClientEvent).isEqualTo(connectClientEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val connectClientEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConnectClientEvent>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> { connectClientEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
