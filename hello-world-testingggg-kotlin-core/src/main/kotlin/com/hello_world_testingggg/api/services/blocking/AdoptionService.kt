// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.adoptions.AdoptionCreateParams
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveDecisionParams
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveDecisionResponse
import com.hello_world_testingggg.api.models.adoptions.AdoptionRetrieveParams
import com.hello_world_testingggg.api.models.adoptions.Application
import com.hello_world_testingggg.api.services.blocking.adoptions.PolicyService

/** Adoption policies and applications */
interface AdoptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdoptionService

    /** Adoption policies and applications */
    fun policies(): PolicyService

    /** Submits an adoption application for an individual or an organization applicant. */
    fun create(
        params: AdoptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application

    /** @see create */
    fun create(
        body: AdoptionCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    fun create(
        individual: AdoptionCreateParams.Body.Individual,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.Body.ofIndividual(individual), requestOptions)

    /** @see create */
    fun create(
        organization: AdoptionCreateParams.Body.Organization,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application = create(AdoptionCreateParams.Body.ofOrganization(organization), requestOptions)

    /** Returns a single adoption application. */
    fun retrieve(
        applicationId: String,
        params: AdoptionRetrieveParams = AdoptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application =
        retrieve(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AdoptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Application

    /** @see retrieve */
    fun retrieve(applicationId: String, requestOptions: RequestOptions): Application =
        retrieve(applicationId, AdoptionRetrieveParams.none(), requestOptions)

    /**
     * Returns the decision for an application. The decision shape depends on the outcome and
     * carries no discriminator mapping.
     */
    fun retrieveDecision(
        applicationId: String,
        params: AdoptionRetrieveDecisionParams = AdoptionRetrieveDecisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionRetrieveDecisionResponse =
        retrieveDecision(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see retrieveDecision */
    fun retrieveDecision(
        params: AdoptionRetrieveDecisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionRetrieveDecisionResponse

    /** @see retrieveDecision */
    fun retrieveDecision(
        applicationId: String,
        requestOptions: RequestOptions,
    ): AdoptionRetrieveDecisionResponse =
        retrieveDecision(applicationId, AdoptionRetrieveDecisionParams.none(), requestOptions)

    /** A view of [AdoptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdoptionService.WithRawResponse

        /** Adoption policies and applications */
        fun policies(): PolicyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /adoptions/applications`, but is otherwise the same
         * as [AdoptionService.create].
         */
        @MustBeClosed
        fun create(
            params: AdoptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application>

        /** @see create */
        @MustBeClosed
        fun create(
            body: AdoptionCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            individual: AdoptionCreateParams.Body.Individual,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.Body.ofIndividual(individual), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            organization: AdoptionCreateParams.Body.Organization,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            create(AdoptionCreateParams.Body.ofOrganization(organization), requestOptions)

        /**
         * Returns a raw HTTP response for `get /adoptions/applications/{applicationId}`, but is
         * otherwise the same as [AdoptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            applicationId: String,
            params: AdoptionRetrieveParams = AdoptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application> =
            retrieve(params.toBuilder().applicationId(applicationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AdoptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Application>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            applicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Application> =
            retrieve(applicationId, AdoptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /adoptions/applications/{applicationId}/decision`,
         * but is otherwise the same as [AdoptionService.retrieveDecision].
         */
        @MustBeClosed
        fun retrieveDecision(
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
        fun retrieveDecision(
            params: AdoptionRetrieveDecisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse>

        /** @see retrieveDecision */
        @MustBeClosed
        fun retrieveDecision(
            applicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdoptionRetrieveDecisionResponse> =
            retrieveDecision(applicationId, AdoptionRetrieveDecisionParams.none(), requestOptions)
    }
}
