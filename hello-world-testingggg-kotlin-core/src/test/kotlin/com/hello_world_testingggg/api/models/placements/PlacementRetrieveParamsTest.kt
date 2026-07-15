// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlacementRetrieveParamsTest {

    @Test
    fun create() {
        PlacementRetrieveParams.builder().placementId("placementId").build()
    }

    @Test
    fun pathParams() {
        val params = PlacementRetrieveParams.builder().placementId("placementId").build()

        assertThat(params._pathParam(0)).isEqualTo("placementId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
