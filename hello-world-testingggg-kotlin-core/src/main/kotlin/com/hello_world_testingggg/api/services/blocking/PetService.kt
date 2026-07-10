// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.StreamResponse
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetCreateParams
import com.hello_world_testingggg.api.models.pet.PetDeleteParams
import com.hello_world_testingggg.api.models.pet.PetFindByStatusParams
import com.hello_world_testingggg.api.models.pet.PetFindByTagsParams
import com.hello_world_testingggg.api.models.pet.PetListFakePageInferredParams
import com.hello_world_testingggg.api.models.pet.PetListFakePageInferredResponse
import com.hello_world_testingggg.api.models.pet.PetListFakePagePage
import com.hello_world_testingggg.api.models.pet.PetListFakePageParams
import com.hello_world_testingggg.api.models.pet.PetListPage
import com.hello_world_testingggg.api.models.pet.PetListParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedResponse
import com.hello_world_testingggg.api.models.pet.PetRetrieveParams
import com.hello_world_testingggg.api.models.pet.PetUpdateParams
import com.hello_world_testingggg.api.models.pet.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageResponse
import com.hello_world_testingggg.api.models.pet.PetWatchStatusParams

/** Everything about your Pets */
interface PetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetService

    /** Add a new pet to the store */
    fun create(params: PetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Pet

    /** @see create */
    fun create(pet: Pet, requestOptions: RequestOptions = RequestOptions.none()): Pet =
        create(PetCreateParams.builder().pet(pet).build(), requestOptions)

    /** Returns a single pet */
    fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** @see retrieve */
    fun retrieve(petId: Long, requestOptions: RequestOptions): Pet =
        retrieve(petId, PetRetrieveParams.none(), requestOptions)

    /** Update an existing pet by Id */
    fun update(params: PetUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Pet

    /** @see update */
    fun update(pet: Pet, requestOptions: RequestOptions = RequestOptions.none()): Pet =
        update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

    /** Returns a cursor-paginated list of pets. */
    fun list(
        params: PetListParams = PetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PetListPage =
        list(PetListParams.none(), requestOptions)

    /** Deletes a pet */
    fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(petId: Long, requestOptions: RequestOptions) =
        delete(petId, PetDeleteParams.none(), requestOptions)

    /** Multiple status values can be provided with comma separated strings */
    fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see findByStatus */
    fun findByStatus(requestOptions: RequestOptions): List<Pet> =
        findByStatus(PetFindByStatusParams.none(), requestOptions)

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see findByTags */
    fun findByTags(requestOptions: RequestOptions): List<Pet> =
        findByTags(PetFindByTagsParams.none(), requestOptions)

    /** Returns a single page-shaped pet response without SDK pagination helpers. */
    fun listFakePage(
        params: PetListFakePageParams = PetListFakePageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListFakePagePage

    /** @see listFakePage */
    fun listFakePage(requestOptions: RequestOptions): PetListFakePagePage =
        listFakePage(PetListFakePageParams.none(), requestOptions)

    /**
     * Returns a single page-shaped pet response whose fake pagination behavior is inferred from the
     * Stainless config scheme.
     */
    fun listFakePageInferred(
        params: PetListFakePageInferredParams = PetListFakePageInferredParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListFakePageInferredResponse

    /** @see listFakePageInferred */
    fun listFakePageInferred(requestOptions: RequestOptions): PetListFakePageInferredResponse =
        listFakePageInferred(PetListFakePageInferredParams.none(), requestOptions)

    /** Returns the same cursor-shaped pet list response without enabling SDK pagination helpers. */
    fun listUnpaginated(
        params: PetListUnpaginatedParams = PetListUnpaginatedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetListUnpaginatedResponse

    /** @see listUnpaginated */
    fun listUnpaginated(requestOptions: RequestOptions): PetListUnpaginatedResponse =
        listUnpaginated(PetListUnpaginatedParams.none(), requestOptions)

    /** Updates a pet in the store with form data */
    fun updateWithForm(
        petId: Long,
        params: PetUpdateWithFormParams = PetUpdateWithFormParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateWithForm(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see updateWithForm */
    fun updateWithForm(
        params: PetUpdateWithFormParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateWithForm */
    fun updateWithForm(petId: Long, requestOptions: RequestOptions) =
        updateWithForm(petId, PetUpdateWithFormParams.none(), requestOptions)

    /** uploads an image */
    fun uploadImage(
        petId: Long,
        body: String,
        params: PetUploadImageParams = PetUploadImageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse =
        uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

    /** @see uploadImage */
    fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse

    /** @see uploadImage */
    fun uploadImage(
        petId: Long,
        body: String,
        requestOptions: RequestOptions,
    ): PetUploadImageResponse =
        uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)

    /**
     * Streams pet status updates over Server-Sent Events. Each `status` event contains a full `Pet`
     * payload.
     */
    @MustBeClosed
    fun watchStatusStreaming(
        petId: Long,
        params: PetWatchStatusParams = PetWatchStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<Pet> =
        watchStatusStreaming(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see watchStatusStreaming */
    @MustBeClosed
    fun watchStatusStreaming(
        params: PetWatchStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<Pet>

    /** @see watchStatusStreaming */
    @MustBeClosed
    fun watchStatusStreaming(petId: Long, requestOptions: RequestOptions): StreamResponse<Pet> =
        watchStatusStreaming(petId, PetWatchStatusParams.none(), requestOptions)

    /** A view of [PetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pet`, but is otherwise the same as
         * [PetService.create].
         */
        @MustBeClosed
        fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see create */
        @MustBeClosed
        fun create(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = create(PetCreateParams.builder().pet(pet).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/{petId}`, but is otherwise the same as
         * [PetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(petId: Long, requestOptions: RequestOptions): HttpResponseFor<Pet> =
            retrieve(petId, PetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /pet`, but is otherwise the same as
         * [PetService.update].
         */
        @MustBeClosed
        fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see update */
        @MustBeClosed
        fun update(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet`, but is otherwise the same as
         * [PetService.list].
         */
        @MustBeClosed
        fun list(
            params: PetListParams = PetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PetListPage> =
            list(PetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /pet/{petId}`, but is otherwise the same as
         * [PetService.delete].
         */
        @MustBeClosed
        fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(petId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(petId, PetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByStatus`, but is otherwise the same as
         * [PetService.findByStatus].
         */
        @MustBeClosed
        fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see findByStatus */
        @MustBeClosed
        fun findByStatus(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByStatus(PetFindByStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByTags`, but is otherwise the same as
         * [PetService.findByTags].
         */
        @MustBeClosed
        fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see findByTags */
        @MustBeClosed
        fun findByTags(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByTags(PetFindByTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/fake-page`, but is otherwise the same as
         * [PetService.listFakePage].
         */
        @MustBeClosed
        fun listFakePage(
            params: PetListFakePageParams = PetListFakePageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListFakePagePage>

        /** @see listFakePage */
        @MustBeClosed
        fun listFakePage(requestOptions: RequestOptions): HttpResponseFor<PetListFakePagePage> =
            listFakePage(PetListFakePageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/fake-page-inferred`, but is otherwise the same
         * as [PetService.listFakePageInferred].
         */
        @MustBeClosed
        fun listFakePageInferred(
            params: PetListFakePageInferredParams = PetListFakePageInferredParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListFakePageInferredResponse>

        /** @see listFakePageInferred */
        @MustBeClosed
        fun listFakePageInferred(
            requestOptions: RequestOptions
        ): HttpResponseFor<PetListFakePageInferredResponse> =
            listFakePageInferred(PetListFakePageInferredParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/unpaginated`, but is otherwise the same as
         * [PetService.listUnpaginated].
         */
        @MustBeClosed
        fun listUnpaginated(
            params: PetListUnpaginatedParams = PetListUnpaginatedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetListUnpaginatedResponse>

        /** @see listUnpaginated */
        @MustBeClosed
        fun listUnpaginated(
            requestOptions: RequestOptions
        ): HttpResponseFor<PetListUnpaginatedResponse> =
            listUnpaginated(PetListUnpaginatedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}`, but is otherwise the same as
         * [PetService.updateWithForm].
         */
        @MustBeClosed
        fun updateWithForm(
            petId: Long,
            params: PetUpdateWithFormParams = PetUpdateWithFormParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateWithForm(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see updateWithForm */
        @MustBeClosed
        fun updateWithForm(
            params: PetUpdateWithFormParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateWithForm */
        @MustBeClosed
        fun updateWithForm(petId: Long, requestOptions: RequestOptions): HttpResponse =
            updateWithForm(petId, PetUpdateWithFormParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}/uploadImage`, but is otherwise the
         * same as [PetService.uploadImage].
         */
        @MustBeClosed
        fun uploadImage(
            petId: Long,
            body: String,
            params: PetUploadImageParams = PetUploadImageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

        /** @see uploadImage */
        @MustBeClosed
        fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse>

        /** @see uploadImage */
        @MustBeClosed
        fun uploadImage(
            petId: Long,
            body: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/{petId}/status/stream`, but is otherwise the
         * same as [PetService.watchStatusStreaming].
         */
        @MustBeClosed
        fun watchStatusStreaming(
            petId: Long,
            params: PetWatchStatusParams = PetWatchStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<Pet>> =
            watchStatusStreaming(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see watchStatusStreaming */
        @MustBeClosed
        fun watchStatusStreaming(
            params: PetWatchStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<Pet>>

        /** @see watchStatusStreaming */
        @MustBeClosed
        fun watchStatusStreaming(
            petId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<Pet>> =
            watchStatusStreaming(petId, PetWatchStatusParams.none(), requestOptions)
    }
}
