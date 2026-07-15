// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemHealthTest {

    @Test
    fun create() {
        val systemHealth =
            SystemHealth.builder()
                .checkedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SystemHealth.Status.OK)
                .services(
                    SystemHealth.Services.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "ok",
                                    "lastIncident" to
                                        mapOf(
                                            "openedAt" to "2019-12-27T18:11:19.117Z",
                                            "resolution" to "string",
                                        ),
                                    "latencyMs" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(systemHealth.checkedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(systemHealth.status()).isEqualTo(SystemHealth.Status.OK)
        assertThat(systemHealth.services())
            .isEqualTo(
                SystemHealth.Services.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "status" to "ok",
                                "lastIncident" to
                                    mapOf(
                                        "openedAt" to "2019-12-27T18:11:19.117Z",
                                        "resolution" to "string",
                                    ),
                                "latencyMs" to 0,
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemHealth =
            SystemHealth.builder()
                .checkedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SystemHealth.Status.OK)
                .services(
                    SystemHealth.Services.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "ok",
                                    "lastIncident" to
                                        mapOf(
                                            "openedAt" to "2019-12-27T18:11:19.117Z",
                                            "resolution" to "string",
                                        ),
                                    "latencyMs" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedSystemHealth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemHealth),
                jacksonTypeRef<SystemHealth>(),
            )

        assertThat(roundtrippedSystemHealth).isEqualTo(systemHealth)
    }
}
