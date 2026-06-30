// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.client

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.getPackageVersion
import com.hello_world_testingggg.api.services.async.FileServiceAsync
import com.hello_world_testingggg.api.services.async.FileServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import com.hello_world_testingggg.api.services.async.PetServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.ProfileServiceAsync
import com.hello_world_testingggg.api.services.async.ProfileServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.StoreServiceAsync
import com.hello_world_testingggg.api.services.async.StoreServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.UserServiceAsync
import com.hello_world_testingggg.api.services.async.UserServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.WebhookServiceAsync
import com.hello_world_testingggg.api.services.async.WebhookServiceAsyncImpl

class HelloWorldTestinggggClientAsyncImpl(private val clientOptions: ClientOptions) :
    HelloWorldTestinggggClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: HelloWorldTestinggggClient by lazy {
        HelloWorldTestinggggClientImpl(clientOptions)
    }

    private val withRawResponse: HelloWorldTestinggggClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val profiles: ProfileServiceAsync by lazy {
        ProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): HelloWorldTestinggggClient = sync

    override fun withRawResponse(): HelloWorldTestinggggClientAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): HelloWorldTestinggggClientAsync =
        HelloWorldTestinggggClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pet(): PetServiceAsync = pet

    /** File storage operations */
    override fun files(): FileServiceAsync = files

    /** Pet owner profile and compliance operations */
    override fun profiles(): ProfileServiceAsync = profiles

    override fun webhooks(): WebhookServiceAsync = webhooks

    /** Access to Petstore orders */
    override fun store(): StoreServiceAsync = store

    /** Operations about user */
    override fun user(): UserServiceAsync = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HelloWorldTestinggggClientAsync.WithRawResponse {

        private val pet: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val profiles: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HelloWorldTestinggggClientAsync.WithRawResponse =
            HelloWorldTestinggggClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pet(): PetServiceAsync.WithRawResponse = pet

        /** File storage operations */
        override fun files(): FileServiceAsync.WithRawResponse = files

        /** Pet owner profile and compliance operations */
        override fun profiles(): ProfileServiceAsync.WithRawResponse = profiles

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        /** Access to Petstore orders */
        override fun store(): StoreServiceAsync.WithRawResponse = store

        /** Operations about user */
        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}
