// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateParamsTest {

    @Test
    fun create() {
        ProfileUpdateParams.builder()
            .profileId("profileId")
            .idempotencyKey("profile-update-123")
            .body(
                ProfileUpdateParams.Body.ProfileDetailsUpdate.builder()
                    .displayName("displayName")
                    .email("email")
                    .metadata(
                        ProfileUpdateParams.Body.ProfileDetailsUpdate.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .preferences(
                        ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences.builder()
                            .alerts(
                                ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                    .Alerts
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .newsletter(true)
                            .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileUpdateParams.builder()
                .profileId("profileId")
                .body(ProfileUpdateParams.Body.ProfileDetailsUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("profileId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ProfileUpdateParams.builder()
                .profileId("profileId")
                .idempotencyKey("profile-update-123")
                .body(
                    ProfileUpdateParams.Body.ProfileDetailsUpdate.builder()
                        .displayName("displayName")
                        .email("email")
                        .metadata(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .preferences(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                .builder()
                                .alerts(
                                    ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                        .Alerts
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .newsletter(true)
                                .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "profile-update-123").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            ProfileUpdateParams.builder()
                .profileId("profileId")
                .body(ProfileUpdateParams.Body.ProfileDetailsUpdate.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProfileUpdateParams.builder()
                .profileId("profileId")
                .idempotencyKey("profile-update-123")
                .body(
                    ProfileUpdateParams.Body.ProfileDetailsUpdate.builder()
                        .displayName("displayName")
                        .email("email")
                        .metadata(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .preferences(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                .builder()
                                .alerts(
                                    ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                        .Alerts
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .newsletter(true)
                                .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProfileUpdateParams.Body.ofProfileDetailsUpdate(
                    ProfileUpdateParams.Body.ProfileDetailsUpdate.builder()
                        .displayName("displayName")
                        .email("email")
                        .metadata(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .preferences(
                            ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                .builder()
                                .alerts(
                                    ProfileUpdateParams.Body.ProfileDetailsUpdate.ProfilePreferences
                                        .Alerts
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .newsletter(true)
                                .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfileUpdateParams.builder()
                .profileId("profileId")
                .body(ProfileUpdateParams.Body.ProfileDetailsUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProfileUpdateParams.Body.ofProfileDetailsUpdate(
                    ProfileUpdateParams.Body.ProfileDetailsUpdate.builder().build()
                )
            )
    }
}
