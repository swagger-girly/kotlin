// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
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
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val pet = petServiceAsync.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.update(
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
    suspend fun list() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val page = petServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        petServiceAsync.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun findByStatus() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
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
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listFakePage() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val response = petServiceAsync.listFakePage()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listFakePageInferred() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val page = petServiceAsync.listFakePageInferred()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listLeaderboard() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val response = petServiceAsync.listLeaderboard()

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listUnpaginated() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
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
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val response = petServiceAsync.retrievePremium(0L)

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun search() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.search(
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
    suspend fun updateWithForm() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
        val petServiceAsync = client.pet()

        petServiceAsync.updateWithForm(
            PetUpdateWithFormParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client =
            HelloWorldTestinggggOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()
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
