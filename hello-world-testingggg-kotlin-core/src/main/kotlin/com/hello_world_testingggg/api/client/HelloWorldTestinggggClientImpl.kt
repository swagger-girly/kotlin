// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.client

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.getPackageVersion
import com.hello_world_testingggg.api.services.blocking.PetService
import com.hello_world_testingggg.api.services.blocking.PetServiceImpl
import com.hello_world_testingggg.api.services.blocking.StoreService
import com.hello_world_testingggg.api.services.blocking.StoreServiceImpl
import com.hello_world_testingggg.api.services.blocking.UserService
import com.hello_world_testingggg.api.services.blocking.UserServiceImpl

class HelloWorldTestinggggClientImpl(private val clientOptions: ClientOptions) :
    HelloWorldTestinggggClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HelloWorldTestinggggClientAsync by lazy {
        HelloWorldTestinggggClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: HelloWorldTestinggggClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HelloWorldTestinggggClientAsync = async

    override fun withRawResponse(): HelloWorldTestinggggClient.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): HelloWorldTestinggggClient =
        HelloWorldTestinggggClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pet(): PetService = pet

    /** Access to Petstore orders */
    override fun store(): StoreService = store

    /** Operations about user */
    override fun user(): UserService = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HelloWorldTestinggggClient.WithRawResponse {

        private val pet: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HelloWorldTestinggggClient.WithRawResponse =
            HelloWorldTestinggggClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pet(): PetService.WithRawResponse = pet

        /** Access to Petstore orders */
        override fun store(): StoreService.WithRawResponse = store

        /** Operations about user */
        override fun user(): UserService.WithRawResponse = user
    }
}
