// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.Pet
import com.hello_world_testingggg.api.models.PetFindByStatusParams
import com.hello_world_testingggg.api.models.PetFindByTagsParams
import com.hello_world_testingggg.api.models.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.PetSearchParams
import com.hello_world_testingggg.api.models.PetStatus
import com.hello_world_testingggg.api.models.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.PetUploadImageParams
import com.hello_world_testingggg.api.models.PetWatchStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val pet =
            petService.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(JsonValue.from(mapOf<String, Any>()))
                    .microchipId("string")
                    .relatedAddress(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.GeoPoint.builder()
                                    .latitude(37.4443)
                                    .longitude(-122.1598)
                                    .build()
                            )
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedMoney(
                                Money.builder()
                                    .amount(2500L)
                                    .currency("USD")
                                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                    .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .state("CA")
                            .street("437 Lytton")
                            .zip("94301")
                            .build()
                    )
                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                    .relatedMoney(
                        Money.builder()
                            .amount(2500L)
                            .currency("USD")
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                    .status(PetStatus.AVAILABLE)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val pet =
            petService.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                    .category(JsonValue.from(mapOf<String, Any>()))
                    .microchipId("string")
                    .relatedAddress(
                        Address.builder()
                            .city("Palo Alto")
                            .geo(
                                Address.GeoPoint.builder()
                                    .latitude(37.4443)
                                    .longitude(-122.1598)
                                    .build()
                            )
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedMoney(
                                Money.builder()
                                    .amount(2500L)
                                    .currency("USD")
                                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                                    .relatedTag(JsonValue.from(mapOf<String, Any>()))
                                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .state("CA")
                            .street("437 Lytton")
                            .zip("94301")
                            .build()
                    )
                    .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                    .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                    .relatedMoney(
                        Money.builder()
                            .amount(2500L)
                            .currency("USD")
                            .relatedCategory(JsonValue.from(mapOf<String, Any>()))
                            .relatedCustomer(JsonValue.from(mapOf<String, Any>()))
                            .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                            .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                            .relatedTag(JsonValue.from(mapOf<String, Any>()))
                            .relatedUser(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .relatedOrder(JsonValue.from(mapOf<String, Any>()))
                    .relatedShelter(JsonValue.from(mapOf<String, Any>()))
                    .relatedUser(JsonValue.from(mapOf<String, Any>()))
                    .status(PetStatus.AVAILABLE)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val page = petService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        petService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
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
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFakePage() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val response = petService.listFakePage()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFakePageInferred() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val page = petService.listFakePageInferred()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLeaderboard() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val response = petService.listLeaderboard()

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUnpaginated() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val response =
            petService.listUnpaginated(
                PetListUnpaginatedParams.builder().cursor("cursor").limit(0L).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePremium() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val response = petService.retrievePremium(0L)

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val pets =
            petService.search(
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
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateWithForm() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        petService.updateWithForm(
            PetUpdateWithFormParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
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
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petService = client.pet()

        val petStreamResponse =
            petService.watchStatusStreaming(
                PetWatchStatusParams.builder().petId(0L).lastEventId("Last-Event-ID").build()
            )

        petStreamResponse.use { petStreamResponse.asSequence().forEach { pet -> pet.validate() } }
    }
}
