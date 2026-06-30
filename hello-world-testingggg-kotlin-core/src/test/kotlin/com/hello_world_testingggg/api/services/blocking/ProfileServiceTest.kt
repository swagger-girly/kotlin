// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.profiles.ProfileCreateParams
import com.hello_world_testingggg.api.models.profiles.ProfileCreateRequest
import com.hello_world_testingggg.api.models.profiles.ProfileLegacySearchParams
import com.hello_world_testingggg.api.models.profiles.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profile =
            profileService.create(
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
                                            .putAdditionalProperty(
                                                "inventory",
                                                JsonValue.from(true),
                                            )
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
            )

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profile = profileService.retrieve("profileId")

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profile =
            profileService.update(
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
                                ProfileUpdateParams.Body.ProfileDetailsUpdate.Preferences.builder()
                                    .alerts(
                                        ProfileUpdateParams.Body.ProfileDetailsUpdate.Preferences
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
            )

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun legacySearch() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.profiles()

        val profiles =
            profileService.legacySearch(
                ProfileLegacySearchParams.builder().includeArchived(true).q("q").build()
            )

        profiles.forEach { it.validate() }
    }
}
