// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports.inventory.daily

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailyRetrieveParamsTest {

    @Test
    fun create() {
        DailyRetrieveParams.builder()
            .reportId("reportId")
            .date(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DailyRetrieveParams.builder()
                .reportId("reportId")
                .date(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("reportId")
        assertThat(params._pathParam(1)).isEqualTo("2019-12-27")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
