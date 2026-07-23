// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.user.UserCreateParams
import com.hello_world_testingggg.api.models.user.UserCreateWithListParams
import com.hello_world_testingggg.api.models.user.UserLoginParams
import com.hello_world_testingggg.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val user =
            userServiceAsync.create(
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
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val user = userServiceAsync.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.update(
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
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createWithList() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val response =
            userServiceAsync.createWithList(
                listOf(
                    UserCreateWithListParams.Body.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        userServiceAsync.logout()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun verifyIdentity() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.user()

        val response = userServiceAsync.verifyIdentity("username")

        response.validate()
    }
}
