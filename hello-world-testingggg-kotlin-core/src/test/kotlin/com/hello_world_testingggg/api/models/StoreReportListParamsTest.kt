// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreReportListParamsTest {

    @Test
    fun create() {
        StoreReportListParams.builder()
            .endingBefore("ending_before")
            .pageSize(0)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StoreReportListParams.builder()
                .endingBefore("ending_before")
                .pageSize(0)
                .startingAfter("starting_after")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "ending_before")
                    .put("page_size", "0")
                    .put("starting_after", "starting_after")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StoreReportListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
