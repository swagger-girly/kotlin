// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionRetrieveDecisionParamsTest {

    @Test
    fun create() {
        AdoptionRetrieveDecisionParams.builder().applicationId("applicationId").build()
    }

    @Test
    fun pathParams() {
        val params = AdoptionRetrieveDecisionParams.builder().applicationId("applicationId").build()

        assertThat(params._pathParam(0)).isEqualTo("applicationId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
