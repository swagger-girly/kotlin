// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.UserCreateParams
import com.hello_world_testingggg.api.models.UserCreateResponse
import com.hello_world_testingggg.api.models.UserCreateWithListParams
import com.hello_world_testingggg.api.models.UserCreateWithListResponse
import com.hello_world_testingggg.api.models.UserDeleteParams
import com.hello_world_testingggg.api.models.UserLoginParams
import com.hello_world_testingggg.api.models.UserLogoutParams
import com.hello_world_testingggg.api.models.UserRetrieveParams
import com.hello_world_testingggg.api.models.UserRetrieveResponse
import com.hello_world_testingggg.api.models.UserUpdateParams
import com.hello_world_testingggg.api.models.UserVerifyIdentityParams
import com.hello_world_testingggg.api.models.UserVerifyIdentityResponse

/** Operations about user */
interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    /** This can only be done by the logged in user. */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateResponse

    /** @see create */
    fun create(requestOptions: RequestOptions): UserCreateResponse =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse =
        retrieve(params.toBuilder().username(username).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    fun retrieve(username: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(username, UserRetrieveParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun update(
        pathUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathUsername(pathUsername).build(), requestOptions)

    /** @see update */
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(pathUsername: String, requestOptions: RequestOptions) =
        update(pathUsername, UserUpdateParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().username(username).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(username: String, requestOptions: RequestOptions) =
        delete(username, UserDeleteParams.none(), requestOptions)

    /** Creates list of users with given input array */
    fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateWithListResponse

    /** @see createWithList */
    fun createWithList(
        body: List<UserCreateWithListParams.User>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateWithListResponse =
        createWithList(UserCreateWithListParams.builder().body(body).build(), requestOptions)

    /** @see createWithList */
    fun createWithList(requestOptions: RequestOptions): UserCreateWithListResponse =
        createWithList(UserCreateWithListParams.none(), requestOptions)

    /** Logs user into the system */
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see login */
    fun login(requestOptions: RequestOptions): String =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see logout */
    fun logout(requestOptions: RequestOptions) = logout(UserLogoutParams.none(), requestOptions)

    /**
     * Casing probe replicating lithic: inline oneOf response whose variant is a kebab-named
     * component (kyb-kyc-verification) so adjacent default initialisms glue into KYBKYC in the
     * operation-scoped variant name
     */
    fun verifyIdentity(
        username: String,
        params: UserVerifyIdentityParams = UserVerifyIdentityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserVerifyIdentityResponse =
        verifyIdentity(params.toBuilder().username(username).build(), requestOptions)

    /** @see verifyIdentity */
    fun verifyIdentity(
        params: UserVerifyIdentityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserVerifyIdentityResponse

    /** @see verifyIdentity */
    fun verifyIdentity(
        username: String,
        requestOptions: RequestOptions,
    ): UserVerifyIdentityResponse =
        verifyIdentity(username, UserVerifyIdentityParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<UserCreateResponse> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().username(username).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            username: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(username, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            pathUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().pathUsername(pathUsername).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(pathUsername: String, requestOptions: RequestOptions): HttpResponse =
            update(pathUsername, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().username(username).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(username: String, requestOptions: RequestOptions): HttpResponse =
            delete(username, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserService.createWithList].
         */
        @MustBeClosed
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateWithListResponse>

        /** @see createWithList */
        @MustBeClosed
        fun createWithList(
            body: List<UserCreateWithListParams.User>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateWithListResponse> =
            createWithList(UserCreateWithListParams.builder().body(body).build(), requestOptions)

        /** @see createWithList */
        @MustBeClosed
        fun createWithList(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserCreateWithListResponse> =
            createWithList(UserCreateWithListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserService.login].
         */
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see login */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<String> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserService.logout].
         */
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see logout */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponse =
            logout(UserLogoutParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/{username}/verifyIdentity`, but is otherwise
         * the same as [UserService.verifyIdentity].
         */
        @MustBeClosed
        fun verifyIdentity(
            username: String,
            params: UserVerifyIdentityParams = UserVerifyIdentityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserVerifyIdentityResponse> =
            verifyIdentity(params.toBuilder().username(username).build(), requestOptions)

        /** @see verifyIdentity */
        @MustBeClosed
        fun verifyIdentity(
            params: UserVerifyIdentityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserVerifyIdentityResponse>

        /** @see verifyIdentity */
        @MustBeClosed
        fun verifyIdentity(
            username: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserVerifyIdentityResponse> =
            verifyIdentity(username, UserVerifyIdentityParams.none(), requestOptions)
    }
}
