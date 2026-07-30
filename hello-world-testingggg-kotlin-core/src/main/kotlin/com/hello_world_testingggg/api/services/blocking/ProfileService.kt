// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.Profile
import com.hello_world_testingggg.api.models.ProfileCreateParams
import com.hello_world_testingggg.api.models.ProfileCreateRequest
import com.hello_world_testingggg.api.models.ProfileLegacySearchParams
import com.hello_world_testingggg.api.models.ProfileRetrieveParams
import com.hello_world_testingggg.api.models.ProfileUpdateParams

/** Pet owner profile and compliance operations */
interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileService

    /**
     * Creates a pet owner profile with nested preferences, metadata maps, and compliance-only write
     * fields.
     */
    fun create(
        params: ProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile

    /** @see create */
    fun create(
        profileCreateRequest: ProfileCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile =
        create(
            ProfileCreateParams.builder().profileCreateRequest(profileCreateRequest).build(),
            requestOptions,
        )

    /** Returns a profile with read-only version fields and nullable contact preferences. */
    fun retrieve(
        profileId: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile = retrieve(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile

    /** @see retrieve */
    fun retrieve(profileId: String, requestOptions: RequestOptions): Profile =
        retrieve(profileId, ProfileRetrieveParams.none(), requestOptions)

    /** Updates either public profile details or archival state. */
    fun update(
        profileId: String,
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile = update(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see update */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Profile

    /** Deprecated profile search endpoint kept for compatibility. */
    @Deprecated("deprecated")
    fun legacySearch(
        params: ProfileLegacySearchParams = ProfileLegacySearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Profile>

    /** @see legacySearch */
    @Deprecated("deprecated")
    fun legacySearch(requestOptions: RequestOptions): List<Profile> =
        legacySearch(ProfileLegacySearchParams.none(), requestOptions)

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /profiles`, but is otherwise the same as
         * [ProfileService.create].
         */
        @MustBeClosed
        fun create(
            params: ProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile>

        /** @see create */
        @MustBeClosed
        fun create(
            profileCreateRequest: ProfileCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile> =
            create(
                ProfileCreateParams.builder().profileCreateRequest(profileCreateRequest).build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /profiles/{profileId}`, but is otherwise the same as
         * [ProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            profileId: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile> =
            retrieve(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(profileId: String, requestOptions: RequestOptions): HttpResponseFor<Profile> =
            retrieve(profileId, ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /profiles/{profileId}`, but is otherwise the same
         * as [ProfileService.update].
         */
        @MustBeClosed
        fun update(
            profileId: String,
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile> =
            update(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Profile>

        /**
         * Returns a raw HTTP response for `get /profiles/legacy-search`, but is otherwise the same
         * as [ProfileService.legacySearch].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun legacySearch(
            params: ProfileLegacySearchParams = ProfileLegacySearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Profile>>

        /** @see legacySearch */
        @Deprecated("deprecated")
        @MustBeClosed
        fun legacySearch(requestOptions: RequestOptions): HttpResponseFor<List<Profile>> =
            legacySearch(ProfileLegacySearchParams.none(), requestOptions)
    }
}
