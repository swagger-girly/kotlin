// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.profiles

import com.hello_world_testingggg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileLegacySearchParamsTest {

    @Test
    fun create() {
        ProfileLegacySearchParams.builder().includeArchived(true).q("q").build()
    }

    @Test
    fun queryParams() {
        val params = ProfileLegacySearchParams.builder().includeArchived(true).q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_archived", "true").put("q", "q").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProfileLegacySearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
