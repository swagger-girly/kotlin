// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileCreateRequestTest {

    @Test
    fun create() {
        val profileCreateRequest =
            ProfileCreateRequest.builder()
                .displayName("displayName")
                .email("email")
                .governmentId("governmentId")
                .metadata(
                    ProfileCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .preferences(
                    ProfileCreateRequest.ProfilePreferences.builder()
                        .alerts(
                            ProfileCreateRequest.ProfilePreferences.Alerts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .newsletter(true)
                        .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .secretNote("secretNote")
                .build()

        assertThat(profileCreateRequest.displayName()).isEqualTo("displayName")
        assertThat(profileCreateRequest.email()).isEqualTo("email")
        assertThat(profileCreateRequest.governmentId()).isEqualTo("governmentId")
        assertThat(profileCreateRequest.metadata())
            .isEqualTo(
                ProfileCreateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(profileCreateRequest.preferences())
            .isEqualTo(
                ProfileCreateRequest.ProfilePreferences.builder()
                    .alerts(
                        ProfileCreateRequest.ProfilePreferences.Alerts.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .newsletter(true)
                    .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(profileCreateRequest.secretNote()).isEqualTo("secretNote")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileCreateRequest =
            ProfileCreateRequest.builder()
                .displayName("displayName")
                .email("email")
                .governmentId("governmentId")
                .metadata(
                    ProfileCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .preferences(
                    ProfileCreateRequest.ProfilePreferences.builder()
                        .alerts(
                            ProfileCreateRequest.ProfilePreferences.Alerts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .newsletter(true)
                        .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .secretNote("secretNote")
                .build()

        val roundtrippedProfileCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileCreateRequest),
                jacksonTypeRef<ProfileCreateRequest>(),
            )

        assertThat(roundtrippedProfileCreateRequest).isEqualTo(profileCreateRequest)
    }
}
