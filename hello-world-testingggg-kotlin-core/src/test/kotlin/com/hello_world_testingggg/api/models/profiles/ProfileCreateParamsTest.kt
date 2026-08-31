// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.profiles

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileCreateParamsTest {

    @Test
    fun create() {
        ProfileCreateParams.builder()
            .idempotencyKey("profile-create-123")
            .profileCreateRequest(
                ProfileCreateRequest.builder()
                    .displayName("Ada Lovelace")
                    .email("ada@example.com")
                    .governmentId("governmentId")
                    .metadata(
                        ProfileCreateRequest.Metadata.builder()
                            .putAdditionalProperty("crm_id", JsonValue.from("crm_123"))
                            .build()
                    )
                    .preferences(
                        ProfileCreateRequest.Preferences.builder()
                            .alerts(
                                ProfileCreateRequest.Preferences.Alerts.builder()
                                    .putAdditionalProperty("inventory", JsonValue.from(true))
                                    .build()
                            )
                            .newsletter(true)
                            .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .secretNote("verified manually")
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            ProfileCreateParams.builder()
                .idempotencyKey("profile-create-123")
                .profileCreateRequest(
                    ProfileCreateRequest.builder()
                        .displayName("Ada Lovelace")
                        .email("ada@example.com")
                        .governmentId("governmentId")
                        .metadata(
                            ProfileCreateRequest.Metadata.builder()
                                .putAdditionalProperty("crm_id", JsonValue.from("crm_123"))
                                .build()
                        )
                        .preferences(
                            ProfileCreateRequest.Preferences.builder()
                                .alerts(
                                    ProfileCreateRequest.Preferences.Alerts.builder()
                                        .putAdditionalProperty("inventory", JsonValue.from(true))
                                        .build()
                                )
                                .newsletter(true)
                                .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .secretNote("verified manually")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "profile-create-123").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            ProfileCreateParams.builder()
                .profileCreateRequest(
                    ProfileCreateRequest.builder().displayName("Ada Lovelace").build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProfileCreateParams.builder()
                .idempotencyKey("profile-create-123")
                .profileCreateRequest(
                    ProfileCreateRequest.builder()
                        .displayName("Ada Lovelace")
                        .email("ada@example.com")
                        .governmentId("governmentId")
                        .metadata(
                            ProfileCreateRequest.Metadata.builder()
                                .putAdditionalProperty("crm_id", JsonValue.from("crm_123"))
                                .build()
                        )
                        .preferences(
                            ProfileCreateRequest.Preferences.builder()
                                .alerts(
                                    ProfileCreateRequest.Preferences.Alerts.builder()
                                        .putAdditionalProperty("inventory", JsonValue.from(true))
                                        .build()
                                )
                                .newsletter(true)
                                .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .secretNote("verified manually")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProfileCreateRequest.builder()
                    .displayName("Ada Lovelace")
                    .email("ada@example.com")
                    .governmentId("governmentId")
                    .metadata(
                        ProfileCreateRequest.Metadata.builder()
                            .putAdditionalProperty("crm_id", JsonValue.from("crm_123"))
                            .build()
                    )
                    .preferences(
                        ProfileCreateRequest.Preferences.builder()
                            .alerts(
                                ProfileCreateRequest.Preferences.Alerts.builder()
                                    .putAdditionalProperty("inventory", JsonValue.from(true))
                                    .build()
                            )
                            .newsletter(true)
                            .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .secretNote("verified manually")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfileCreateParams.builder()
                .profileCreateRequest(
                    ProfileCreateRequest.builder().displayName("Ada Lovelace").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ProfileCreateRequest.builder().displayName("Ada Lovelace").build())
    }
}
