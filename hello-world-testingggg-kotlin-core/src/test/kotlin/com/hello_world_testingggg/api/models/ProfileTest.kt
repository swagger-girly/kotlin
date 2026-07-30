// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileTest {

    @Test
    fun create() {
        val profile =
            Profile.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("displayName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0)
                .auditTrail(
                    Profile.AuditTrail.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .email("email")
                .legacyCode("legacyCode")
                .metadata(
                    Profile.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addPhoneNumber("string")
                .preferences(
                    Profile.ProfilePreferences.builder()
                        .alerts(
                            Profile.ProfilePreferences.Alerts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .newsletter(true)
                        .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(profile.id()).isEqualTo("id")
        assertThat(profile.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(profile.displayName()).isEqualTo("displayName")
        assertThat(profile.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(profile.version()).isEqualTo(0)
        assertThat(profile.auditTrail())
            .isEqualTo(
                Profile.AuditTrail.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(profile.email()).isEqualTo("email")
        assertThat(profile.legacyCode()).isEqualTo("legacyCode")
        assertThat(profile.metadata())
            .isEqualTo(
                Profile.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(profile.phoneNumbers()).containsExactly("string")
        assertThat(profile.preferences())
            .isEqualTo(
                Profile.ProfilePreferences.builder()
                    .alerts(
                        Profile.ProfilePreferences.Alerts.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .newsletter(true)
                    .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profile =
            Profile.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("displayName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0)
                .auditTrail(
                    Profile.AuditTrail.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .email("email")
                .legacyCode("legacyCode")
                .metadata(
                    Profile.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addPhoneNumber("string")
                .preferences(
                    Profile.ProfilePreferences.builder()
                        .alerts(
                            Profile.ProfilePreferences.Alerts.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .newsletter(true)
                        .scoreByRegion(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedProfile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(profile), jacksonTypeRef<Profile>())

        assertThat(roundtrippedProfile).isEqualTo(profile)
    }
}
