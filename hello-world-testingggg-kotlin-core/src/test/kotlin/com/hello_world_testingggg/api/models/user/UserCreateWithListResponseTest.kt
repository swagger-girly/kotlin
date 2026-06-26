// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateWithListResponseTest {

    @Test
    fun create() {
        val userCreateWithListResponse =
            UserCreateWithListResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        assertThat(userCreateWithListResponse.id()).isEqualTo(10L)
        assertThat(userCreateWithListResponse.email()).isEqualTo("john@email.com")
        assertThat(userCreateWithListResponse.firstName()).isEqualTo("John")
        assertThat(userCreateWithListResponse.lastName()).isEqualTo("James")
        assertThat(userCreateWithListResponse.password()).isEqualTo("12345")
        assertThat(userCreateWithListResponse.phone()).isEqualTo("12345")
        assertThat(userCreateWithListResponse.username()).isEqualTo("theUser")
        assertThat(userCreateWithListResponse.userStatus()).isEqualTo(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userCreateWithListResponse =
            UserCreateWithListResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        val roundtrippedUserCreateWithListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userCreateWithListResponse),
                jacksonTypeRef<UserCreateWithListResponse>(),
            )

        assertThat(roundtrippedUserCreateWithListResponse).isEqualTo(userCreateWithListResponse)
    }
}
