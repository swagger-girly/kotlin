// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.adoptions

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.AdoptionPolicyCreateParams
import com.hello_world_testingggg.api.models.AdoptionPolicyListPage
import com.hello_world_testingggg.api.models.AdoptionPolicyListParams
import com.hello_world_testingggg.api.models.AdoptionPolicyRetrieveParams
import com.hello_world_testingggg.api.models.AdoptionPolicyUpdateParams
import com.hello_world_testingggg.api.models.Policy

/** Adoption policies and applications */
interface PolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyService

    /**
     * Creates an adoption policy from a set of eligibility rules, regional overrides, and an
     * optional escalation rule group.
     */
    fun create(
        params: AdoptionPolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a single adoption policy. */
    fun retrieve(
        policyId: String,
        params: AdoptionPolicyRetrieveParams = AdoptionPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AdoptionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** @see retrieve */
    fun retrieve(policyId: String, requestOptions: RequestOptions): Policy =
        retrieve(policyId, AdoptionPolicyRetrieveParams.none(), requestOptions)

    /** Updates either the policy details or its lifecycle state. */
    fun update(
        policyId: String,
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = update(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see update */
    fun update(
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a cursor-paginated list of adoption policies. */
    fun list(
        params: AdoptionPolicyListParams = AdoptionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionPolicyListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): AdoptionPolicyListPage =
        list(AdoptionPolicyListParams.none(), requestOptions)

    /** A view of [PolicyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /adoptions/policies`, but is otherwise the same as
         * [PolicyService.create].
         */
        @MustBeClosed
        fun create(
            params: AdoptionPolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            policyId: String,
            params: AdoptionPolicyRetrieveParams = AdoptionPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AdoptionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(policyId: String, requestOptions: RequestOptions): HttpResponseFor<Policy> =
            retrieve(policyId, AdoptionPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyService.update].
         */
        @MustBeClosed
        fun update(
            policyId: String,
            params: AdoptionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            update(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AdoptionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies`, but is otherwise the same as
         * [PolicyService.list].
         */
        @MustBeClosed
        fun list(
            params: AdoptionPolicyListParams = AdoptionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdoptionPolicyListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AdoptionPolicyListPage> =
            list(AdoptionPolicyListParams.none(), requestOptions)
    }
}
