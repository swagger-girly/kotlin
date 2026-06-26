// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetListParamsTest {

    @Test
    fun create() {
        PetListParams.builder().cursor("cursor").limit(0L).build()
    }

    @Test
    fun queryParams() {
        val params = PetListParams.builder().cursor("cursor").limit(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
