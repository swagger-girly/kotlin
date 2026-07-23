// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserVerifyIdentityParamsTest {

    @Test
    fun create() {
        UserVerifyIdentityParams.builder().username("username").build()
    }

    @Test
    fun pathParams() {
        val params = UserVerifyIdentityParams.builder().username("username").build()

        assertThat(params._pathParam(0)).isEqualTo("username")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
