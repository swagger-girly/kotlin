// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.adoptions

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.adoptions.policies.Policy
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyCreateParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListPage
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyListParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyRetrieveParams
import com.hello_world_testingggg.api.models.adoptions.policies.PolicyUpdateParams

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
        params: PolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a single adoption policy. */
    fun retrieve(
        policyId: String,
        params: PolicyRetrieveParams = PolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** @see retrieve */
    fun retrieve(policyId: String, requestOptions: RequestOptions): Policy =
        retrieve(policyId, PolicyRetrieveParams.none(), requestOptions)

    /** Updates either the policy details or its lifecycle state. */
    fun update(
        policyId: String,
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy = update(params.toBuilder().policyId(policyId).build(), requestOptions)

    /** @see update */
    fun update(
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Policy

    /** Returns a cursor-paginated list of adoption policies. */
    fun list(
        params: PolicyListParams = PolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PolicyListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PolicyListPage =
        list(PolicyListParams.none(), requestOptions)

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
            params: PolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            policyId: String,
            params: PolicyRetrieveParams = PolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            retrieve(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(policyId: String, requestOptions: RequestOptions): HttpResponseFor<Policy> =
            retrieve(policyId, PolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /adoptions/policies/{policyId}`, but is otherwise
         * the same as [PolicyService.update].
         */
        @MustBeClosed
        fun update(
            policyId: String,
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy> =
            update(params.toBuilder().policyId(policyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Policy>

        /**
         * Returns a raw HTTP response for `get /adoptions/policies`, but is otherwise the same as
         * [PolicyService.list].
         */
        @MustBeClosed
        fun list(
            params: PolicyListParams = PolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PolicyListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PolicyListPage> =
            list(PolicyListParams.none(), requestOptions)
    }
}
