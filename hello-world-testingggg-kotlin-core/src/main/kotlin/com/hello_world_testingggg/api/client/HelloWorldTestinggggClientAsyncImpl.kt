// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.client

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.getPackageVersion
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.ClientHealthParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsResponse
import com.hello_world_testingggg.api.models.SystemHealth
import com.hello_world_testingggg.api.services.async.AdoptionServiceAsync
import com.hello_world_testingggg.api.services.async.AdoptionServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.AiServiceAsync
import com.hello_world_testingggg.api.services.async.AiServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.FileServiceAsync
import com.hello_world_testingggg.api.services.async.FileServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.MediaServiceAsync
import com.hello_world_testingggg.api.services.async.MediaServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.NotificationServiceAsync
import com.hello_world_testingggg.api.services.async.NotificationServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import com.hello_world_testingggg.api.services.async.PetServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.PlacementServiceAsync
import com.hello_world_testingggg.api.services.async.PlacementServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.ProfileServiceAsync
import com.hello_world_testingggg.api.services.async.ProfileServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.StoreServiceAsync
import com.hello_world_testingggg.api.services.async.StoreServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.UserServiceAsync
import com.hello_world_testingggg.api.services.async.UserServiceAsyncImpl
import com.hello_world_testingggg.api.services.async.VeterinaryServiceAsync
import com.hello_world_testingggg.api.services.async.VeterinaryServiceAsyncImpl
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

    private val adoptions: AdoptionServiceAsync by lazy {
        AdoptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val placements: PlacementServiceAsync by lazy {
        PlacementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val veterinary: VeterinaryServiceAsync by lazy {
        VeterinaryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notifications: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val ai: AiServiceAsync by lazy { AiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val media: MediaServiceAsync by lazy {
        MediaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

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

    /** Adoption policies and applications */
    override fun adoptions(): AdoptionServiceAsync = adoptions

    /** Post-adoption placement tracking */
    override fun placements(): PlacementServiceAsync = placements

    override fun veterinary(): VeterinaryServiceAsync = veterinary

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun notifications(): NotificationServiceAsync = notifications

    /** Access to Petstore orders */
    override fun store(): StoreServiceAsync = store

    /** Operations about user */
    override fun user(): UserServiceAsync = user

    override fun ai(): AiServiceAsync = ai

    override fun media(): MediaServiceAsync = media

    override suspend fun health(
        params: ClientHealthParams,
        requestOptions: RequestOptions,
    ): SystemHealth =
        // get /health
        withRawResponse().health(params, requestOptions).parse()

    override suspend fun retrieveRateLimits(
        params: ClientRetrieveRateLimitsParams,
        requestOptions: RequestOptions,
    ): ClientRetrieveRateLimitsResponse =
        // get /rate_limits
        withRawResponse().retrieveRateLimits(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HelloWorldTestinggggClientAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pet: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val profiles: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val adoptions: AdoptionServiceAsync.WithRawResponse by lazy {
            AdoptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val placements: PlacementServiceAsync.WithRawResponse by lazy {
            PlacementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val veterinary: VeterinaryServiceAsync.WithRawResponse by lazy {
            VeterinaryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationServiceAsync.WithRawResponse by lazy {
            NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiServiceAsync.WithRawResponse by lazy {
            AiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaServiceAsync.WithRawResponse by lazy {
            MediaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        /** Adoption policies and applications */
        override fun adoptions(): AdoptionServiceAsync.WithRawResponse = adoptions

        /** Post-adoption placement tracking */
        override fun placements(): PlacementServiceAsync.WithRawResponse = placements

        override fun veterinary(): VeterinaryServiceAsync.WithRawResponse = veterinary

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun notifications(): NotificationServiceAsync.WithRawResponse = notifications

        /** Access to Petstore orders */
        override fun store(): StoreServiceAsync.WithRawResponse = store

        /** Operations about user */
        override fun user(): UserServiceAsync.WithRawResponse = user

        override fun ai(): AiServiceAsync.WithRawResponse = ai

        override fun media(): MediaServiceAsync.WithRawResponse = media

        private val healthHandler: Handler<SystemHealth> =
            jsonHandler<SystemHealth>(clientOptions.jsonMapper)

        override suspend fun health(
            params: ClientHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SystemHealth> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { healthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveRateLimitsHandler: Handler<ClientRetrieveRateLimitsResponse> =
            jsonHandler<ClientRetrieveRateLimitsResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveRateLimits(
            params: ClientRetrieveRateLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientRetrieveRateLimitsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rate_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRateLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
