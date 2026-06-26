// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveResponseTest {

    @Test
    fun create() {
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        assertThat(userRetrieveResponse.id()).isEqualTo(10L)
        assertThat(userRetrieveResponse.email()).isEqualTo("john@email.com")
        assertThat(userRetrieveResponse.firstName()).isEqualTo("John")
        assertThat(userRetrieveResponse.lastName()).isEqualTo("James")
        assertThat(userRetrieveResponse.password()).isEqualTo("12345")
        assertThat(userRetrieveResponse.phone()).isEqualTo("12345")
        assertThat(userRetrieveResponse.username()).isEqualTo("theUser")
        assertThat(userRetrieveResponse.userStatus()).isEqualTo(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        val roundtrippedUserRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveResponse),
                jacksonTypeRef<UserRetrieveResponse>(),
            )

        assertThat(roundtrippedUserRetrieveResponse).isEqualTo(userRetrieveResponse)
    }
}
