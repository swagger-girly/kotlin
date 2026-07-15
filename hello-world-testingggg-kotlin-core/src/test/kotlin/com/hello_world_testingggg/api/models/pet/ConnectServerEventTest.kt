// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConnectServerEventTest {

    @Test
    fun ofPong() {
        val connectServerEvent = ConnectServerEvent.ofPong()

        assertThat(connectServerEvent.pong()).isEqualTo(JsonValue.from(mapOf("type" to "pong")))
        assertThat(connectServerEvent.status()).isNull()
    }

    @Test
    fun ofPongRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectServerEvent = ConnectServerEvent.ofPong()

        val roundtrippedConnectServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectServerEvent),
                jacksonTypeRef<ConnectServerEvent>(),
            )

        assertThat(roundtrippedConnectServerEvent).isEqualTo(connectServerEvent)
    }

    @Test
    fun ofStatus() {
        val status =
            ConnectServerEvent.Status.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(
                            Pet.Category.builder()
                                .id(1L)
                                .name("Dogs")
                                .subcategories(listOf())
                                .build()
                        )
                        .microchipId("string")
                        .status(PetStatus.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .build()

        val connectServerEvent = ConnectServerEvent.ofStatus(status)

        assertThat(connectServerEvent.pong()).isNull()
        assertThat(connectServerEvent.status()).isEqualTo(status)
    }

    @Test
    fun ofStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectServerEvent =
            ConnectServerEvent.ofStatus(
                ConnectServerEvent.Status.builder()
                    .pet(
                        Pet.builder()
                            .name("doggie")
                            .addPhotoUrl("string")
                            .id(10L)
                            .category(
                                Pet.Category.builder()
                                    .id(1L)
                                    .name("Dogs")
                                    .subcategories(listOf())
                                    .build()
                            )
                            .microchipId("string")
                            .status(PetStatus.AVAILABLE)
                            .addTag(Pet.Tag.builder().id(0L).name("name").build())
                            .build()
                    )
                    .build()
            )

        val roundtrippedConnectServerEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectServerEvent),
                jacksonTypeRef<ConnectServerEvent>(),
            )

        assertThat(roundtrippedConnectServerEvent).isEqualTo(connectServerEvent)
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
        val connectServerEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConnectServerEvent>())

        val e =
            assertThrows<HelloWorldTestinggggInvalidDataException> { connectServerEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
