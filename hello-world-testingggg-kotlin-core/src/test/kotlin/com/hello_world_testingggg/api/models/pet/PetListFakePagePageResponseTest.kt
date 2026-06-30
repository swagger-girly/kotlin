// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetListFakePagePageResponseTest {

    @Test
    fun create() {
        val petListFakePagePageResponse =
            PetListFakePagePageResponse.builder()
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

        assertThat(petListFakePagePageResponse.data())
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
        assertThat(petListFakePagePageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petListFakePagePageResponse =
            PetListFakePagePageResponse.builder()
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

        val roundtrippedPetListFakePagePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petListFakePagePageResponse),
                jacksonTypeRef<PetListFakePagePageResponse>(),
            )

        assertThat(roundtrippedPetListFakePagePageResponse).isEqualTo(petListFakePagePageResponse)
    }
}
