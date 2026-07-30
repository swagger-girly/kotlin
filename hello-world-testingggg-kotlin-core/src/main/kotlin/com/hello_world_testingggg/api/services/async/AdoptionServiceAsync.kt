// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.AdoptionCreateParams
import com.hello_world_testingggg.api.models.AdoptionRetrieveDecisionParams
import com.hello_world_testingggg.api.models.AdoptionRetrieveDecisionResponse
import com.hello_world_testingggg.api.models.AdoptionRetrieveParams
import com.hello_world_testingggg.api.models.Application
import com.hello_world_testingggg.api.services.async.adoptions.PolicyServiceAsync

/** Adoption policies and applications */
interface AdoptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdoptionServiceAsync

    /** Adoption policies and applications */
    fun policies(): PolicyServiceAsync

    /** Submits an adoption application for an individual or an organization applicant. */
    suspend fun create(
        params: AdoptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application

    /** @see create */
    suspend fun create(
        body: AdoptionCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    suspend fun create(
        individual: AdoptionCreateParams.Body.IndividualApplicant,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.Body.ofIndividual(individual), requestOptions)

    /** @see create */
    suspend fun create(
        organization: AdoptionCreateParams.Body.OrganizationApplicant,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.Body.ofOrganization(organization), requestOptions)

    /** Returns a single adoption application. */
    suspend fun retrieve(
        applicationId: String,
        params: AdoptionRetrieveParams = AdoptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application =
        retrieve(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AdoptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application

    /** @see retrieve */
    suspend fun retrieve(applicationId: String, requestOptions: RequestOptions): Application =
        retrieve(applicationId, AdoptionRetrieveParams.none(), requestOptions)

    /**
     * Returns the decision for an application. The decision shape depends on the outcome and
     * carries no discriminator mapping.
     */
    suspend fun retrieveDecision(
        applicationId: String,
        params: AdoptionRetrieveDecisionParams = AdoptionRetrieveDecisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionRetrieveDecisionResponse =
        retrieveDecision(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see retrieveDecision */
    suspend fun retrieveDecision(
        params: AdoptionRetrieveDecisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionRetrieveDecisionResponse

    /** @see retrieveDecision */
    suspend fun retrieveDecision(
        applicationId: String,
        requestOptions: RequestOptions,
    ): AdoptionRetrieveDecisionResponse =
        retrieveDecision(applicationId, AdoptionRetrieveDecisionParams.none(), requestOptions)

    /**
     * A view of [AdoptionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdoptionServiceAsync.WithRawResponse

        /** Adoption policies and applications */
        fun policies(): PolicyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /adoptions/applications`, but is otherwise the same
         * as [AdoptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AdoptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            body: AdoptionCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            individual: AdoptionCreateParams.Body.IndividualApplicant,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.Body.ofIndividual(individual), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            organization: AdoptionCreateParams.Body.OrganizationApplicant,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.Body.ofOrganization(organization), requestOptions)

        /**
         * Returns a raw HTTP response for `get /adoptions/applications/{applicationId}`, but is
         * otherwise the same as [AdoptionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            applicationId: String,
            params: AdoptionRetrieveParams = AdoptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            retrieve(params.toBuilder().applicationId(applicationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AdoptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            applicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Application> =
            retrieve(applicationId, AdoptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /adoptions/applications/{applicationId}/decision`,
         * but is otherwise the same as [AdoptionServiceAsync.retrieveDecision].
         */
        @MustBeClosed
        suspend fun retrieveDecision(
            applicationId: String,
            params: AdoptionRetrieveDecisionParams = AdoptionRetrieveDecisionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse> =
            retrieveDecision(
                params.toBuilder().applicationId(applicationId).build(),
                requestOptions,
            )

        /** @see retrieveDecision */
        @MustBeClosed
        suspend fun retrieveDecision(
            params: AdoptionRetrieveDecisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse>

        /** @see retrieveDecision */
        @MustBeClosed
        suspend fun retrieveDecision(
            applicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse> =
            retrieveDecision(applicationId, AdoptionRetrieveDecisionParams.none(), requestOptions)
    }
}
