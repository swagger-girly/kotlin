// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.Pet
import com.hello_world_testingggg.api.models.PetCreateParams
import com.hello_world_testingggg.api.models.PetDeleteParams
import com.hello_world_testingggg.api.models.PetFindByStatusParams
import com.hello_world_testingggg.api.models.PetFindByTagsParams
import com.hello_world_testingggg.api.models.PetListFakePageInferredPageAsync
import com.hello_world_testingggg.api.models.PetListFakePageInferredParams
import com.hello_world_testingggg.api.models.PetListFakePageParams
import com.hello_world_testingggg.api.models.PetListFakePageResponse
import com.hello_world_testingggg.api.models.PetListLeaderboardParams
import com.hello_world_testingggg.api.models.PetListLeaderboardResponse
import com.hello_world_testingggg.api.models.PetListPageAsync
import com.hello_world_testingggg.api.models.PetListParams
import com.hello_world_testingggg.api.models.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.PetListUnpaginatedResponse
import com.hello_world_testingggg.api.models.PetRetrieveParams
import com.hello_world_testingggg.api.models.PetRetrievePremiumParams
import com.hello_world_testingggg.api.models.PetRetrievePremiumResponse
import com.hello_world_testingggg.api.models.PetSearchParams
import com.hello_world_testingggg.api.models.PetUpdateParams
import com.hello_world_testingggg.api.models.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.PetUploadImageParams
import com.hello_world_testingggg.api.models.PetUploadImageResponse

/** Everything about your Pets */
interface PetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetServiceAsync

    /** Add a new pet to the store */
    suspend fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** @see create */
    suspend fun create(pet: Pet, requestOptions: RequestOptions = RequestOptions.none()): Pet =
        create(PetCreateParams.builder().pet(pet).build(), requestOptions)

    /** Returns a single pet */
    suspend fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** @see retrieve */
    suspend fun retrieve(petId: Long, requestOptions: RequestOptions): Pet =
        retrieve(petId, PetRetrieveParams.none(), requestOptions)

    /** Update an existing pet by Id */
    suspend fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** @see update */
    suspend fun update(pet: Pet, requestOptions: RequestOptions = RequestOptions.none()): Pet =
        update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

    /** Returns a cursor-paginated list of pets. */
    suspend fun list(
        params: PetListParams = PetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PetListPageAsync =
        list(PetListParams.none(), requestOptions)

    /** Deletes a pet */
    suspend fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(petId: Long, requestOptions: RequestOptions) =
        delete(petId, PetDeleteParams.none(), requestOptions)

    /** Multiple status values can be provided with comma separated strings */
    suspend fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see findByStatus */
    suspend fun findByStatus(requestOptions: RequestOptions): List<Pet> =
        findByStatus(PetFindByStatusParams.none(), requestOptions)

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    suspend fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see findByTags */
    suspend fun findByTags(requestOptions: RequestOptions): List<Pet> =
        findByTags(PetFindByTagsParams.none(), requestOptions)

    /** Returns a single page-shaped pet response without SDK pagination helpers. */
    suspend fun listFakePage(
        params: PetListFakePageParams = PetListFakePageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListFakePageResponse

    /** @see listFakePage */
    suspend fun listFakePage(requestOptions: RequestOptions): PetListFakePageResponse =
        listFakePage(PetListFakePageParams.none(), requestOptions)

    /**
     * Returns a single page-shaped pet response whose fake pagination behavior is inferred from the
     * config scheme.
     */
    suspend fun listFakePageInferred(
        params: PetListFakePageInferredParams = PetListFakePageInferredParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListFakePageInferredPageAsync

    /** @see listFakePageInferred */
    suspend fun listFakePageInferred(
        requestOptions: RequestOptions
    ): PetListFakePageInferredPageAsync =
        listFakePageInferred(PetListFakePageInferredParams.none(), requestOptions)

    /**
     * Returns a bare top-level array of inline objects so generators must mint a distinct element
     * type instead of reusing the response alias name.
     */
    suspend fun listLeaderboard(
        params: PetListLeaderboardParams = PetListLeaderboardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PetListLeaderboardResponse>

    /** @see listLeaderboard */
    suspend fun listLeaderboard(requestOptions: RequestOptions): List<PetListLeaderboardResponse> =
        listLeaderboard(PetListLeaderboardParams.none(), requestOptions)

    /** Returns the same cursor-shaped pet list response without enabling SDK pagination helpers. */
    suspend fun listUnpaginated(
        params: PetListUnpaginatedParams = PetListUnpaginatedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListUnpaginatedResponse

    /** @see listUnpaginated */
    suspend fun listUnpaginated(requestOptions: RequestOptions): PetListUnpaginatedResponse =
        listUnpaginated(PetListUnpaginatedParams.none(), requestOptions)

    /**
     * Returns the premium profile for a pet, extending the base pet with pedigree and insurance
     * details.
     */
    suspend fun retrievePremium(
        petId: Long,
        params: PetRetrievePremiumParams = PetRetrievePremiumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetRetrievePremiumResponse =
        retrievePremium(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see retrievePremium */
    suspend fun retrievePremium(
        params: PetRetrievePremiumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetRetrievePremiumResponse

    /** @see retrievePremium */
    suspend fun retrievePremium(
        petId: Long,
        requestOptions: RequestOptions,
    ): PetRetrievePremiumResponse =
        retrievePremium(petId, PetRetrievePremiumParams.none(), requestOptions)

    /**
     * Typed query-parameter probe matrix: an object-schema query param mints a typed params model,
     * an array-of-object query param mints a singularized element type, an empty object
     * (additionalProperties:false) stays a bare object, and a scalar stays scalar. Isolates the
     * emitter query-parameter type-resolution branches so object/array-of-object/empty-object
     * params are each exercised.
     */
    suspend fun search(
        params: PetSearchParams = PetSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see search */
    suspend fun search(requestOptions: RequestOptions): List<Pet> =
        search(PetSearchParams.none(), requestOptions)

    /** Updates a pet in the store with form data */
    suspend fun updateWithForm(
        petId: Long,
        params: PetUpdateWithFormParams = PetUpdateWithFormParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateWithForm(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see updateWithForm */
    suspend fun updateWithForm(
        params: PetUpdateWithFormParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateWithForm */
    suspend fun updateWithForm(petId: Long, requestOptions: RequestOptions) =
        updateWithForm(petId, PetUpdateWithFormParams.none(), requestOptions)

    /** uploads an image */
    suspend fun uploadImage(
        petId: Long,
        body: String,
        params: PetUploadImageParams = PetUploadImageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse =
        uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

    /** @see uploadImage */
    suspend fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse

    /** @see uploadImage */
    suspend fun uploadImage(
        petId: Long,
        body: String,
        requestOptions: RequestOptions,
    ): PetUploadImageResponse =
        uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)

    /** A view of [PetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pet`, but is otherwise the same as
         * [PetServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = create(PetCreateParams.builder().pet(pet).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(petId: Long, requestOptions: RequestOptions): HttpResponseFor<Pet> =
            retrieve(petId, PetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /pet`, but is otherwise the same as
         * [PetServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet`, but is otherwise the same as
         * [PetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PetListParams = PetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PetListPageAsync> =
            list(PetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(petId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(petId, PetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByStatus`, but is otherwise the same as
         * [PetServiceAsync.findByStatus].
         */
        @MustBeClosed
        suspend fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see findByStatus */
        @MustBeClosed
        suspend fun findByStatus(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByStatus(PetFindByStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByTags`, but is otherwise the same as
         * [PetServiceAsync.findByTags].
         */
        @MustBeClosed
        suspend fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see findByTags */
        @MustBeClosed
        suspend fun findByTags(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByTags(PetFindByTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/fake-page`, but is otherwise the same as
         * [PetServiceAsync.listFakePage].
         */
        @MustBeClosed
        suspend fun listFakePage(
            params: PetListFakePageParams = PetListFakePageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListFakePageResponse>

        /** @see listFakePage */
        @MustBeClosed
        suspend fun listFakePage(
            requestOptions: RequestOptions
        ): HttpResponseFor<PetListFakePageResponse> =
            listFakePage(PetListFakePageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/fake-page-inferred`, but is otherwise the same
         * as [PetServiceAsync.listFakePageInferred].
         */
        @MustBeClosed
        suspend fun listFakePageInferred(
            params: PetListFakePageInferredParams = PetListFakePageInferredParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListFakePageInferredPageAsync>

        /** @see listFakePageInferred */
        @MustBeClosed
        suspend fun listFakePageInferred(
            requestOptions: RequestOptions
        ): HttpResponseFor<PetListFakePageInferredPageAsync> =
            listFakePageInferred(PetListFakePageInferredParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/leaderboard`, but is otherwise the same as
         * [PetServiceAsync.listLeaderboard].
         */
        @MustBeClosed
        suspend fun listLeaderboard(
            params: PetListLeaderboardParams = PetListLeaderboardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PetListLeaderboardResponse>>

        /** @see listLeaderboard */
        @MustBeClosed
        suspend fun listLeaderboard(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<PetListLeaderboardResponse>> =
            listLeaderboard(PetListLeaderboardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/unpaginated`, but is otherwise the same as
         * [PetServiceAsync.listUnpaginated].
         */
        @MustBeClosed
        suspend fun listUnpaginated(
            params: PetListUnpaginatedParams = PetListUnpaginatedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListUnpaginatedResponse>

        /** @see listUnpaginated */
        @MustBeClosed
        suspend fun listUnpaginated(
            requestOptions: RequestOptions
        ): HttpResponseFor<PetListUnpaginatedResponse> =
            listUnpaginated(PetListUnpaginatedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/{petId}/premium`, but is otherwise the same as
         * [PetServiceAsync.retrievePremium].
         */
        @MustBeClosed
        suspend fun retrievePremium(
            petId: Long,
            params: PetRetrievePremiumParams = PetRetrievePremiumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetRetrievePremiumResponse> =
            retrievePremium(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see retrievePremium */
        @MustBeClosed
        suspend fun retrievePremium(
            params: PetRetrievePremiumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetRetrievePremiumResponse>

        /** @see retrievePremium */
        @MustBeClosed
        suspend fun retrievePremium(
            petId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetRetrievePremiumResponse> =
            retrievePremium(petId, PetRetrievePremiumParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/search`, but is otherwise the same as
         * [PetServiceAsync.search].
         */
        @MustBeClosed
        suspend fun search(
            params: PetSearchParams = PetSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see search */
        @MustBeClosed
        suspend fun search(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            search(PetSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.updateWithForm].
         */
        @MustBeClosed
        suspend fun updateWithForm(
            petId: Long,
            params: PetUpdateWithFormParams = PetUpdateWithFormParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateWithForm(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see updateWithForm */
        @MustBeClosed
        suspend fun updateWithForm(
            params: PetUpdateWithFormParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateWithForm */
        @MustBeClosed
        suspend fun updateWithForm(petId: Long, requestOptions: RequestOptions): HttpResponse =
            updateWithForm(petId, PetUpdateWithFormParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}/uploadImage`, but is otherwise the
         * same as [PetServiceAsync.uploadImage].
         */
        @MustBeClosed
        suspend fun uploadImage(
            petId: Long,
            body: String,
            params: PetUploadImageParams = PetUploadImageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

        /** @see uploadImage */
        @MustBeClosed
        suspend fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse>

        /** @see uploadImage */
        @MustBeClosed
        suspend fun uploadImage(
            petId: Long,
            body: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)
    }
}
