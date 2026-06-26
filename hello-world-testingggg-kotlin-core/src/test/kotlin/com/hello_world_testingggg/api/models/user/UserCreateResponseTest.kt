// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateResponseTest {

    @Test
    fun create() {
        val userCreateResponse =
            UserCreateResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        assertThat(userCreateResponse.id()).isEqualTo(10L)
        assertThat(userCreateResponse.email()).isEqualTo("john@email.com")
        assertThat(userCreateResponse.firstName()).isEqualTo("John")
        assertThat(userCreateResponse.lastName()).isEqualTo("James")
        assertThat(userCreateResponse.password()).isEqualTo("12345")
        assertThat(userCreateResponse.phone()).isEqualTo("12345")
        assertThat(userCreateResponse.username()).isEqualTo("theUser")
        assertThat(userCreateResponse.userStatus()).isEqualTo(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userCreateResponse =
            UserCreateResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        val roundtrippedUserCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userCreateResponse),
                jacksonTypeRef<UserCreateResponse>(),
            )

        assertThat(roundtrippedUserCreateResponse).isEqualTo(userCreateResponse)
    }
}
