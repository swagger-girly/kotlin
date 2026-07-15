// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetListUnpaginatedResponseTest {

    @Test
    fun create() {
        val petListUnpaginatedResponse =
            PetListUnpaginatedResponse.builder()
                .addItem(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(
                            Pet.Category.builder()
                                .id(1L)
                                .name("Dogs")
                                .subcategories(listOf())
                                .build()
                        )
                        .microchipId("string")
                        .status(PetStatus.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(petListUnpaginatedResponse.items())
            .containsExactly(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(
                        Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                    )
                    .microchipId("string")
                    .status(PetStatus.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
        assertThat(petListUnpaginatedResponse.nextCursor()).isEqualTo("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petListUnpaginatedResponse =
            PetListUnpaginatedResponse.builder()
                .addItem(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(
                            Pet.Category.builder()
                                .id(1L)
                                .name("Dogs")
                                .subcategories(listOf())
                                .build()
                        )
                        .microchipId("string")
                        .status(PetStatus.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedPetListUnpaginatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petListUnpaginatedResponse),
                jacksonTypeRef<PetListUnpaginatedResponse>(),
            )

        assertThat(roundtrippedPetListUnpaginatedResponse).isEqualTo(petListUnpaginatedResponse)
    }
}
