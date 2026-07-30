// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdoptionPolicyRetrieveParamsTest {

    @Test
    fun create() {
        AdoptionPolicyRetrieveParams.builder().policyId("policyId").build()
    }

    @Test
    fun pathParams() {
        val params = AdoptionPolicyRetrieveParams.builder().policyId("policyId").build()

        assertThat(params._pathParam(0)).isEqualTo("policyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
