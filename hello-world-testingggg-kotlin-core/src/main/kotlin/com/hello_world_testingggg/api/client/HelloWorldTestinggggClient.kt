// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.ClientHealthParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsResponse
import com.hello_world_testingggg.api.models.SystemHealth
import com.hello_world_testingggg.api.services.blocking.AdoptionService
import com.hello_world_testingggg.api.services.blocking.AiService
import com.hello_world_testingggg.api.services.blocking.FileService
import com.hello_world_testingggg.api.services.blocking.MediaService
import com.hello_world_testingggg.api.services.blocking.NotificationService
import com.hello_world_testingggg.api.services.blocking.PetService
import com.hello_world_testingggg.api.services.blocking.PlacementService
import com.hello_world_testingggg.api.services.blocking.ProfileService
import com.hello_world_testingggg.api.services.blocking.StoreService
import com.hello_world_testingggg.api.services.blocking.UserService
import com.hello_world_testingggg.api.services.blocking.VeterinaryService
import com.hello_world_testingggg.api.services.blocking.WebhookService

/**
 * A client for interacting with the Hello World Testingggg REST API synchronously. You can also
 * switch to asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface HelloWorldTestinggggClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): HelloWorldTestinggggClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HelloWorldTestinggggClient

    /** Everything about your Pets */
    fun pet(): PetService

    /** File storage operations */
    fun files(): FileService

    /** Pet owner profile and compliance operations */
    fun profiles(): ProfileService

    /** Adoption policies and applications */
    fun adoptions(): AdoptionService

    /** Post-adoption placement tracking */
    fun placements(): PlacementService

    fun veterinary(): VeterinaryService

    fun webhooks(): WebhookService

    fun notifications(): NotificationService

    /** Access to Petstore orders */
    fun store(): StoreService

    /** Operations about user */
    fun user(): UserService

    fun ai(): AiService

    fun media(): MediaService

    /** Returns the current API health, including per-service statuses. */
    fun health(
        params: ClientHealthParams = ClientHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SystemHealth

    /** @see health */
    fun health(requestOptions: RequestOptions): SystemHealth =
        health(ClientHealthParams.none(), requestOptions)

    /** Returns the caller's current rate-limit budget. */
    fun retrieveRateLimits(
        params: ClientRetrieveRateLimitsParams = ClientRetrieveRateLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientRetrieveRateLimitsResponse

    /** @see retrieveRateLimits */
    fun retrieveRateLimits(requestOptions: RequestOptions): ClientRetrieveRateLimitsResponse =
        retrieveRateLimits(ClientRetrieveRateLimitsParams.none(), requestOptions)

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [HelloWorldTestinggggClient] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HelloWorldTestinggggClient.WithRawResponse

        /** Everything about your Pets */
        fun pet(): PetService.WithRawResponse

        /** File storage operations */
        fun files(): FileService.WithRawResponse

        /** Pet owner profile and compliance operations */
        fun profiles(): ProfileService.WithRawResponse

        /** Adoption policies and applications */
        fun adoptions(): AdoptionService.WithRawResponse

        /** Post-adoption placement tracking */
        fun placements(): PlacementService.WithRawResponse

        fun veterinary(): VeterinaryService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        fun notifications(): NotificationService.WithRawResponse

        /** Access to Petstore orders */
        fun store(): StoreService.WithRawResponse

        /** Operations about user */
        fun user(): UserService.WithRawResponse

        fun ai(): AiService.WithRawResponse

        fun media(): MediaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HelloWorldTestinggggClient.health].
         */
        @MustBeClosed
        fun health(
            params: ClientHealthParams = ClientHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SystemHealth>

        /** @see health */
        @MustBeClosed
        fun health(requestOptions: RequestOptions): HttpResponseFor<SystemHealth> =
            health(ClientHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rate_limits`, but is otherwise the same as
         * [HelloWorldTestinggggClient.retrieveRateLimits].
         */
        @MustBeClosed
        fun retrieveRateLimits(
            params: ClientRetrieveRateLimitsParams = ClientRetrieveRateLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientRetrieveRateLimitsResponse>

        /** @see retrieveRateLimits */
        @MustBeClosed
        fun retrieveRateLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<ClientRetrieveRateLimitsResponse> =
            retrieveRateLimits(ClientRetrieveRateLimitsParams.none(), requestOptions)
    }
}
