// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .id(10L)
            .email("john@email.com")
            .firstName("John")
            .lastName("James")
            .password("12345")
            .phone("12345")
            .username("theUser")
            .userStatus(1)
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo(10L)
        assertThat(body.email()).isEqualTo("john@email.com")
        assertThat(body.firstName()).isEqualTo("John")
        assertThat(body.lastName()).isEqualTo("James")
        assertThat(body.password()).isEqualTo("12345")
        assertThat(body.phone()).isEqualTo("12345")
        assertThat(body.username()).isEqualTo("theUser")
        assertThat(body.userStatus()).isEqualTo(1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().build()

        val body = params._body()
    }
}
