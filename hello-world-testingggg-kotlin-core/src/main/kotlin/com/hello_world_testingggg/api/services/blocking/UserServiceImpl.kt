// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.handlers.stringHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepare
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
class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): UserCreateResponse =
        // post /user
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): UserRetrieveResponse =
        // get /user/{username}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: UserUpdateParams, requestOptions: RequestOptions) {
        // put /user/{username}
        withRawResponse().update(params, requestOptions)
    }

    override fun delete(params: UserDeleteParams, requestOptions: RequestOptions) {
        // delete /user/{username}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createWithList(
        params: UserCreateWithListParams,
        requestOptions: RequestOptions,
    ): UserCreateWithListResponse =
        // post /user/createWithList
        withRawResponse().createWithList(params, requestOptions).parse()

    override fun login(params: UserLoginParams, requestOptions: RequestOptions): String =
        // get /user/login
        withRawResponse().login(params, requestOptions).parse()

    override fun logout(params: UserLogoutParams, requestOptions: RequestOptions) {
        // get /user/logout
        withRawResponse().logout(params, requestOptions)
    }

    override fun verifyIdentity(
        params: UserVerifyIdentityParams,
        requestOptions: RequestOptions,
    ): UserVerifyIdentityResponse =
        // post /user/{username}/verifyIdentity
        withRawResponse().verifyIdentity(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<UserCreateResponse> =
            jsonHandler<UserCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<UserRetrieveResponse> =
            jsonHandler<UserRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("username", params.username())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathUsername", params.pathUsername())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("username", params.username())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createWithListHandler: Handler<UserCreateWithListResponse> =
            jsonHandler<UserCreateWithListResponse>(clientOptions.jsonMapper)

        override fun createWithList(
            params: UserCreateWithListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserCreateWithListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "createWithList")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createWithListHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val loginHandler: Handler<String> = stringHandler()

        override fun login(
            params: UserLoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "login")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { loginHandler.handle(it) }
            }
        }

        private val logoutHandler: Handler<Void?> = emptyHandler()

        override fun logout(
            params: UserLogoutParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "logout")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { logoutHandler.handle(it) }
            }
        }

        private val verifyIdentityHandler: Handler<UserVerifyIdentityResponse> =
            jsonHandler<UserVerifyIdentityResponse>(clientOptions.jsonMapper)

        override fun verifyIdentity(
            params: UserVerifyIdentityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserVerifyIdentityResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("username", params.username())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0), "verifyIdentity")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyIdentityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
