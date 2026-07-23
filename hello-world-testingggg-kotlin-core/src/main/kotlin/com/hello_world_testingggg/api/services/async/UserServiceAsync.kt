// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.user.UserCreateParams
import com.hello_world_testingggg.api.models.user.UserCreateResponse
import com.hello_world_testingggg.api.models.user.UserCreateWithListParams
import com.hello_world_testingggg.api.models.user.UserCreateWithListResponse
import com.hello_world_testingggg.api.models.user.UserDeleteParams
import com.hello_world_testingggg.api.models.user.UserLoginParams
import com.hello_world_testingggg.api.models.user.UserLogoutParams
import com.hello_world_testingggg.api.models.user.UserRetrieveParams
import com.hello_world_testingggg.api.models.user.UserRetrieveResponse
import com.hello_world_testingggg.api.models.user.UserUpdateParams
import com.hello_world_testingggg.api.models.user.UserVerifyIdentityParams
import com.hello_world_testingggg.api.models.user.UserVerifyIdentityResponse

/** Operations about user */
interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    /** This can only be done by the logged in user. */
    suspend fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): UserCreateResponse =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    suspend fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse =
        retrieve(params.toBuilder().username(username).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(username: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(username, UserRetrieveParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    suspend fun update(
        pathUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().pathUsername(pathUsername).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    suspend fun update(pathUsername: String, requestOptions: RequestOptions) =
        update(pathUsername, UserUpdateParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    suspend fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().username(username).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(username: String, requestOptions: RequestOptions) =
        delete(username, UserDeleteParams.none(), requestOptions)

    /** Creates list of users with given input array */
    suspend fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateWithListResponse

    /** @see createWithList */
    suspend fun createWithList(
        body: List<UserCreateWithListParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateWithListResponse =
        createWithList(UserCreateWithListParams.builder().body(body).build(), requestOptions)

    /** @see createWithList */
    suspend fun createWithList(requestOptions: RequestOptions): UserCreateWithListResponse =
        createWithList(UserCreateWithListParams.none(), requestOptions)

    /** Logs user into the system */
    suspend fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see login */
    suspend fun login(requestOptions: RequestOptions): String =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    suspend fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see logout */
    suspend fun logout(requestOptions: RequestOptions) =
        logout(UserLogoutParams.none(), requestOptions)

    /**
     * Casing probe replicating lithic: inline oneOf response whose variant is a kebab-named
     * component (kyb-kyc-verification) so adjacent default initialisms glue into KYBKYC in the
     * operation-scoped variant name
     */
    suspend fun verifyIdentity(
        username: String,
        params: UserVerifyIdentityParams = UserVerifyIdentityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserVerifyIdentityResponse =
        verifyIdentity(params.toBuilder().username(username).build(), requestOptions)

    /** @see verifyIdentity */
    suspend fun verifyIdentity(
        params: UserVerifyIdentityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserVerifyIdentityResponse

    /** @see verifyIdentity */
    suspend fun verifyIdentity(
        username: String,
        requestOptions: RequestOptions,
    ): UserVerifyIdentityResponse =
        verifyIdentity(username, UserVerifyIdentityParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<UserCreateResponse> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().username(username).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            username: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(username, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            pathUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().pathUsername(pathUsername).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        suspend fun update(pathUsername: String, requestOptions: RequestOptions): HttpResponse =
            update(pathUsername, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().username(username).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(username: String, requestOptions: RequestOptions): HttpResponse =
            delete(username, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserServiceAsync.createWithList].
         */
        @MustBeClosed
        suspend fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateWithListResponse>

        /** @see createWithList */
        @MustBeClosed
        suspend fun createWithList(
            body: List<UserCreateWithListParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateWithListResponse> =
            createWithList(UserCreateWithListParams.builder().body(body).build(), requestOptions)

        /** @see createWithList */
        @MustBeClosed
        suspend fun createWithList(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserCreateWithListResponse> =
            createWithList(UserCreateWithListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserServiceAsync.login].
         */
        @MustBeClosed
        suspend fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see login */
        @MustBeClosed
        suspend fun login(requestOptions: RequestOptions): HttpResponseFor<String> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserServiceAsync.logout].
         */
        @MustBeClosed
        suspend fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see logout */
        @MustBeClosed
        suspend fun logout(requestOptions: RequestOptions): HttpResponse =
            logout(UserLogoutParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/{username}/verifyIdentity`, but is otherwise
         * the same as [UserServiceAsync.verifyIdentity].
         */
        @MustBeClosed
        suspend fun verifyIdentity(
            username: String,
            params: UserVerifyIdentityParams = UserVerifyIdentityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserVerifyIdentityResponse> =
            verifyIdentity(params.toBuilder().username(username).build(), requestOptions)

        /** @see verifyIdentity */
        @MustBeClosed
        suspend fun verifyIdentity(
            params: UserVerifyIdentityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserVerifyIdentityResponse>

        /** @see verifyIdentity */
        @MustBeClosed
        suspend fun verifyIdentity(
            username: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserVerifyIdentityResponse> =
            verifyIdentity(username, UserVerifyIdentityParams.none(), requestOptions)
    }
}
