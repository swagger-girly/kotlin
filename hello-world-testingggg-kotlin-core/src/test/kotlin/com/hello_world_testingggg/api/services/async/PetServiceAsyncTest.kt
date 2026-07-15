// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetFindByStatusParams
import com.hello_world_testingggg.api.models.pet.PetFindByTagsParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.pet.PetStatus
import com.hello_world_testingggg.api.models.pet.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.create(
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

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val pet = petServiceAsync.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.update(
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

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val page = petServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        petServiceAsync.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun findByStatus() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun findByTags() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listFakePage() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val response = petServiceAsync.listFakePage()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listFakePageInferred() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val page = petServiceAsync.listFakePageInferred()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listUnpaginated() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val response =
            petServiceAsync.listUnpaginated(
                PetListUnpaginatedParams.builder().cursor("cursor").limit(0L).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrievePremium() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val response = petServiceAsync.retrievePremium(0L)

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateWithForm() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        petServiceAsync.updateWithForm(
            PetUpdateWithFormParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client = HelloWorldTestinggggOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pet()

        val response =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .body("Example data")
                    .build()
            )

        response.validate()
    }
}
