// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .pathUsername("username")
            .id(10L)
            .email("john@email.com")
            .firstName("John")
            .lastName("James")
            .password("12345")
            .phone("12345")
            .bodyUsername("theUser")
            .userStatus(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = UserUpdateParams.builder().pathUsername("username").build()

        assertThat(params._pathParam(0)).isEqualTo("username")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .pathUsername("username")
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .bodyUsername("theUser")
                .userStatus(1)
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo(10L)
        assertThat(body.email()).isEqualTo("john@email.com")
        assertThat(body.firstName()).isEqualTo("John")
        assertThat(body.lastName()).isEqualTo("James")
        assertThat(body.password()).isEqualTo("12345")
        assertThat(body.phone()).isEqualTo("12345")
        assertThat(body.bodyUsername()).isEqualTo("theUser")
        assertThat(body.userStatus()).isEqualTo(1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().pathUsername("username").build()

        val body = params._body()
    }
}
