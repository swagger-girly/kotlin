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
import com.hello_world_testingggg.api.core.prepare
import com.hello_world_testingggg.api.models.ClientHealthParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsResponse
import com.hello_world_testingggg.api.models.SystemHealth
import com.hello_world_testingggg.api.services.blocking.AdoptionService
import com.hello_world_testingggg.api.services.blocking.AdoptionServiceImpl
import com.hello_world_testingggg.api.services.blocking.AiService
import com.hello_world_testingggg.api.services.blocking.AiServiceImpl
import com.hello_world_testingggg.api.services.blocking.FileService
import com.hello_world_testingggg.api.services.blocking.FileServiceImpl
import com.hello_world_testingggg.api.services.blocking.MediaService
import com.hello_world_testingggg.api.services.blocking.MediaServiceImpl
import com.hello_world_testingggg.api.services.blocking.NotificationService
import com.hello_world_testingggg.api.services.blocking.NotificationServiceImpl
import com.hello_world_testingggg.api.services.blocking.PetService
import com.hello_world_testingggg.api.services.blocking.PetServiceImpl
import com.hello_world_testingggg.api.services.blocking.PlacementService
import com.hello_world_testingggg.api.services.blocking.PlacementServiceImpl
import com.hello_world_testingggg.api.services.blocking.ProfileService
import com.hello_world_testingggg.api.services.blocking.ProfileServiceImpl
import com.hello_world_testingggg.api.services.blocking.StoreService
import com.hello_world_testingggg.api.services.blocking.StoreServiceImpl
import com.hello_world_testingggg.api.services.blocking.UserService
import com.hello_world_testingggg.api.services.blocking.UserServiceImpl
import com.hello_world_testingggg.api.services.blocking.VeterinaryService
import com.hello_world_testingggg.api.services.blocking.VeterinaryServiceImpl
import com.hello_world_testingggg.api.services.blocking.WebhookService
import com.hello_world_testingggg.api.services.blocking.WebhookServiceImpl

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

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val profiles: ProfileService by lazy { ProfileServiceImpl(clientOptionsWithUserAgent) }

    private val adoptions: AdoptionService by lazy {
        AdoptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val placements: PlacementService by lazy {
        PlacementServiceImpl(clientOptionsWithUserAgent)
    }

    private val veterinary: VeterinaryService by lazy {
        VeterinaryServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val notifications: NotificationService by lazy {
        NotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val ai: AiService by lazy { AiServiceImpl(clientOptionsWithUserAgent) }

    private val media: MediaService by lazy { MediaServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HelloWorldTestinggggClientAsync = async

    override fun withRawResponse(): HelloWorldTestinggggClient.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): HelloWorldTestinggggClient =
        HelloWorldTestinggggClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pet(): PetService = pet

    /** File storage operations */
    override fun files(): FileService = files

    /** Pet owner profile and compliance operations */
    override fun profiles(): ProfileService = profiles

    /** Adoption policies and applications */
    override fun adoptions(): AdoptionService = adoptions

    /** Post-adoption placement tracking */
    override fun placements(): PlacementService = placements

    override fun veterinary(): VeterinaryService = veterinary

    override fun webhooks(): WebhookService = webhooks

    override fun notifications(): NotificationService = notifications

    /** Access to Petstore orders */
    override fun store(): StoreService = store

    /** Operations about user */
    override fun user(): UserService = user

    override fun ai(): AiService = ai

    override fun media(): MediaService = media

    override fun health(params: ClientHealthParams, requestOptions: RequestOptions): SystemHealth =
        // get /health
        withRawResponse().health(params, requestOptions).parse()

    override fun retrieveRateLimits(
        params: ClientRetrieveRateLimitsParams,
        requestOptions: RequestOptions,
    ): ClientRetrieveRateLimitsResponse =
        // get /rate_limits
        withRawResponse().retrieveRateLimits(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HelloWorldTestinggggClient.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pet: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val profiles: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val adoptions: AdoptionService.WithRawResponse by lazy {
            AdoptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val placements: PlacementService.WithRawResponse by lazy {
            PlacementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val veterinary: VeterinaryService.WithRawResponse by lazy {
            VeterinaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationService.WithRawResponse by lazy {
            NotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiService.WithRawResponse by lazy {
            AiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaService.WithRawResponse by lazy {
            MediaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HelloWorldTestinggggClient.WithRawResponse =
            HelloWorldTestinggggClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pet(): PetService.WithRawResponse = pet

        /** File storage operations */
        override fun files(): FileService.WithRawResponse = files

        /** Pet owner profile and compliance operations */
        override fun profiles(): ProfileService.WithRawResponse = profiles

        /** Adoption policies and applications */
        override fun adoptions(): AdoptionService.WithRawResponse = adoptions

        /** Post-adoption placement tracking */
        override fun placements(): PlacementService.WithRawResponse = placements

        override fun veterinary(): VeterinaryService.WithRawResponse = veterinary

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun notifications(): NotificationService.WithRawResponse = notifications

        /** Access to Petstore orders */
        override fun store(): StoreService.WithRawResponse = store

        /** Operations about user */
        override fun user(): UserService.WithRawResponse = user

        override fun ai(): AiService.WithRawResponse = ai

        override fun media(): MediaService.WithRawResponse = media

        private val healthHandler: Handler<SystemHealth> =
            jsonHandler<SystemHealth>(clientOptions.jsonMapper)

        override fun health(
            params: ClientHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SystemHealth> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieveRateLimits(
            params: ClientRetrieveRateLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientRetrieveRateLimitsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rate_limits")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
