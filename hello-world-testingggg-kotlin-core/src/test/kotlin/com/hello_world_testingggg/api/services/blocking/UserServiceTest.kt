// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.user.UserCreateParams
import com.hello_world_testingggg.api.models.user.UserCreateWithListParams
import com.hello_world_testingggg.api.models.user.UserLoginParams
import com.hello_world_testingggg.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        val user =
            userService.create(
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
    fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        val user = userService.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        userService.update(
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
    fun delete() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        userService.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWithList() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        val response =
            userService.createWithList(
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
    fun login() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        userService.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.user()

        userService.logout()
    }
}
