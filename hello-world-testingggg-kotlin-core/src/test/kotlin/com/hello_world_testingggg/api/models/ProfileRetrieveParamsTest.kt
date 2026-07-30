// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRetrieveParamsTest {

    @Test
    fun create() {
        ProfileRetrieveParams.builder().profileId("profileId").build()
    }

    @Test
    fun pathParams() {
        val params = ProfileRetrieveParams.builder().profileId("profileId").build()

        assertThat(params._pathParam(0)).isEqualTo("profileId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
