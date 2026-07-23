// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.jsonMapper
import com.hello_world_testingggg.api.models.pet.ConnectClientEvent
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/hello-world-testingggg-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            HelloWorldTestinggggOkHttpClient.builder()
                .apiKey("My API Key")
                .basicAuthUsername("My Basic Auth Username")
                .basicAuthPassword("My Basic Auth Password")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.pet()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.profiles()).isNotNull()
        assertThat(client.adoptions()).isNotNull()
        assertThat(client.placements()).isNotNull()
        assertThat(client.veterinary()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.notifications()).isNotNull()
        assertThat(client.store()).isNotNull()
        assertThat(client.user()).isNotNull()
        assertThat(client.ai()).isNotNull()
        assertThat(client.media()).isNotNull()
    }

    @Test
    fun petRoundtrip() {
        val jsonMapper = jsonMapper()
        val pet =
            Pet.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .acquisitionChannel(Pet.AcquisitionChannel.BREEDER)
                .category(
                    Pet.Category.builder().id(1L).name("Dogs").subcategories(listOf()).build()
                )
                .microchipId("string")
                .status(PetStatus.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .build()

        val roundtrippedPet =
            jsonMapper.readValue(jsonMapper.writeValueAsString(pet), jacksonTypeRef<Pet>())

        assertThat(roundtrippedPet).isEqualTo(pet)
    }

    @Test
    fun connectClientEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val connectClientEvent = ConnectClientEvent.ofPing()

        val roundtrippedConnectClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectClientEvent),
                jacksonTypeRef<ConnectClientEvent>(),
            )

        assertThat(roundtrippedConnectClientEvent).isEqualTo(connectClientEvent)
    }

    @Test
    fun petStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val petStatus = PetStatus.AVAILABLE

        val roundtrippedPetStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petStatus),
                jacksonTypeRef<PetStatus>(),
            )

        assertThat(roundtrippedPetStatus).isEqualTo(petStatus)
    }
}
