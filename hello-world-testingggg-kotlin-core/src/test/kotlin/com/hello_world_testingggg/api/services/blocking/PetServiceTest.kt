// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetFindByStatusParams
import com.hello_world_testingggg.api.models.pet.PetFindByTagsParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.pet.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageParams
import com.hello_world_testingggg.api.models.pet.PetWatchStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val pet =
            petService.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val pet =
            petService.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val page = petService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        petService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val pets =
            petService.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByTags() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFakePage() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val page = petService.listFakePage()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFakePageInferred() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val response = petService.listFakePageInferred()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUnpaginated() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val response =
            petService.listUnpaginated(
                PetListUnpaginatedParams.builder().cursor("cursor").limit(0L).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateWithForm() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        petService.updateWithForm(
            PetUpdateWithFormParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val response =
            petService.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .body("Example data")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun watchStatusStreaming() {
        val client = HelloWorldTestinggggOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pet()

        val petStreamResponse =
            petService.watchStatusStreaming(
                PetWatchStatusParams.builder().petId(0L).lastEventId("Last-Event-ID").build()
            )

        petStreamResponse.use { petStreamResponse.asSequence().forEach { pet -> pet.validate() } }
    }
}
