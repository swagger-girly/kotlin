// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetListFakePageInferredPageResponseTest {

    @Test
    fun create() {
        val petListFakePageInferredPageResponse =
            PetListFakePageInferredPageResponse.builder()
                .addData(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Pet.Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(petListFakePageInferredPageResponse.data())
            .containsExactly(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
        assertThat(petListFakePageInferredPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petListFakePageInferredPageResponse =
            PetListFakePageInferredPageResponse.builder()
                .addData(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Pet.Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedPetListFakePageInferredPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petListFakePageInferredPageResponse),
                jacksonTypeRef<PetListFakePageInferredPageResponse>(),
            )

        assertThat(roundtrippedPetListFakePageInferredPageResponse)
            .isEqualTo(petListFakePageInferredPageResponse)
    }
}
