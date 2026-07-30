// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.adoptions

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.AdoptionPolicyCreateParams
import com.hello_world_testingggg.api.models.AdoptionPolicyListPageAsync
import com.hello_world_testingggg.api.models.AdoptionPolicyListParams
import com.hello_world_testingggg.api.models.AdoptionPolicyRetrieveParams
import com.hello_world_testingggg.api.models.AdoptionPolicyUpdateParams
import com.hello_world_testingggg.api.models.Policy

/** Adoption policies and applications */
interface PolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PolicyServiceAsync

    /**
     * Creates an adoption policy from a set of eligibility rules, regional overrides, and an
     * optional escalation rule group.
     */
    suspend fun create(
        params: AdoptionPolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a single adoption policy. */
    suspend fun retrieve(
        policyId: String,
        params: AdoptionPolicyRetrieveParams = AdoptionPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AdoptionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** @see retrieve */
    suspend fun retrieve(policyId: String, requestOptions: RequestOptions): Policy =
        retrieve(policyId, AdoptionPolicyRetrieveParams.none(), requestOptions)

    /** Updates either the policy details or its lifecycle state. */
    suspend fun update(
        policyId: String,
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = update(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AdoptionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a cursor-paginated list of adoption policies. */
    suspend fun list(
        params: AdoptionPolicyListParams = AdoptionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdoptionPolicyListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AdoptionPolicyListPageAsync =
        list(AdoptionPolicyListParams.none(), requestOptions)

    /**
     * A view of [PolicyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PolicyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /adoptions/policies`, but is otherwise the same as
         * [PolicyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AdoptionPolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            policyId: String,
            params: AdoptionPolicyRetrieveParams = AdoptionPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AdoptionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            policyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Policy> =
            retrieve(policyId, AdoptionPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            policyId: String,
            params: AdoptionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            update(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AdoptionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies`, but is otherwise the same as
         * [PolicyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AdoptionPolicyListParams = AdoptionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdoptionPolicyListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AdoptionPolicyListPageAsync> =
            list(AdoptionPolicyListParams.none(), requestOptions)
    }
}
