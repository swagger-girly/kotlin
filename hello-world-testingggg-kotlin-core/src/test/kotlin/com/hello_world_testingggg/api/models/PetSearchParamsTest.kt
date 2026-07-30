// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetSearchParamsTest {

    @Test
    fun create() {
        PetSearchParams.builder()
            .filters(PetSearchParams.Filters.builder().color("color").size(0).build())
            .maxResults(0)
            .rawFilter(JsonValue.from(mapOf<String, Any>()))
            .addTagFilter(
                PetSearchParams.TagFilter.builder()
                    .key("key")
                    .match(PetSearchParams.TagFilter.Match.EXACT)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PetSearchParams.builder()
                .filters(PetSearchParams.Filters.builder().color("color").size(0).build())
                .maxResults(0)
                .rawFilter(JsonValue.from(mapOf<String, Any>()))
                .addTagFilter(
                    PetSearchParams.TagFilter.builder()
                        .key("key")
                        .match(PetSearchParams.TagFilter.Match.EXACT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filters[color]", "color")
                    .put("filters[size]", "0")
                    .put("max_results", "0")
                    .put("tag_filters", listOf("key", "exact").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
