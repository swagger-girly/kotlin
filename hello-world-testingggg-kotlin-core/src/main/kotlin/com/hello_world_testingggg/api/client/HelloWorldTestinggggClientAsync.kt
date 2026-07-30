// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.ClientHealthParams
import com.hello_world_testingggg.api.models.ClientRetrieveRateLimitsParams
import com.hello_world_testingggg.api.models.RetrieveRateLimitsResponse
import com.hello_world_testingggg.api.models.SystemHealth
import com.hello_world_testingggg.api.services.async.AdoptionServiceAsync
import com.hello_world_testingggg.api.services.async.AiServiceAsync
import com.hello_world_testingggg.api.services.async.FileServiceAsync
import com.hello_world_testingggg.api.services.async.MediaServiceAsync
import com.hello_world_testingggg.api.services.async.NotificationServiceAsync
import com.hello_world_testingggg.api.services.async.PetServiceAsync
import com.hello_world_testingggg.api.services.async.PlacementServiceAsync
import com.hello_world_testingggg.api.services.async.ProfileServiceAsync
import com.hello_world_testingggg.api.services.async.StoreServiceAsync
import com.hello_world_testingggg.api.services.async.UserServiceAsync
import com.hello_world_testingggg.api.services.async.VeterinaryServiceAsync
import com.hello_world_testingggg.api.services.async.WebhookServiceAsync

/**
 * A client for interacting with the Hello World Testingggg REST API asynchronously. You can also
 * switch to synchronous execution via the [sync] method.
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
interface HelloWorldTestinggggClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): HelloWorldTestinggggClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HelloWorldTestinggggClientAsync

    /** Everything about your Pets */
    fun pet(): PetServiceAsync

    /** File storage operations */
    fun files(): FileServiceAsync

    /** Pet owner profile and compliance operations */
    fun profiles(): ProfileServiceAsync

    /** Adoption policies and applications */
    fun adoptions(): AdoptionServiceAsync

    /** Post-adoption placement tracking */
    fun placements(): PlacementServiceAsync

    fun veterinary(): VeterinaryServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun notifications(): NotificationServiceAsync

    /** Access to Petstore orders */
    fun store(): StoreServiceAsync

    /** Operations about user */
    fun user(): UserServiceAsync

    fun ai(): AiServiceAsync

    fun media(): MediaServiceAsync

    /** Returns the current API health, including per-service statuses. */
    suspend fun health(
        params: ClientHealthParams = ClientHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SystemHealth

    /** @see health */
    suspend fun health(requestOptions: RequestOptions): SystemHealth =
        health(ClientHealthParams.none(), requestOptions)

    /** Returns the caller's current rate-limit budget. */
    suspend fun retrieveRateLimits(
        params: ClientRetrieveRateLimitsParams = ClientRetrieveRateLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetrieveRateLimitsResponse

    /** @see retrieveRateLimits */
    suspend fun retrieveRateLimits(requestOptions: RequestOptions): RetrieveRateLimitsResponse =
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
     * A view of [HelloWorldTestinggggClientAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HelloWorldTestinggggClientAsync.WithRawResponse

        /** Everything about your Pets */
        fun pet(): PetServiceAsync.WithRawResponse

        /** File storage operations */
        fun files(): FileServiceAsync.WithRawResponse

        /** Pet owner profile and compliance operations */
        fun profiles(): ProfileServiceAsync.WithRawResponse

        /** Adoption policies and applications */
        fun adoptions(): AdoptionServiceAsync.WithRawResponse

        /** Post-adoption placement tracking */
        fun placements(): PlacementServiceAsync.WithRawResponse

        fun veterinary(): VeterinaryServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse

        fun notifications(): NotificationServiceAsync.WithRawResponse

        /** Access to Petstore orders */
        fun store(): StoreServiceAsync.WithRawResponse

        /** Operations about user */
        fun user(): UserServiceAsync.WithRawResponse

        fun ai(): AiServiceAsync.WithRawResponse

        fun media(): MediaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HelloWorldTestinggggClientAsync.health].
         */
        @MustBeClosed
        suspend fun health(
            params: ClientHealthParams = ClientHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SystemHealth>

        /** @see health */
        @MustBeClosed
        suspend fun health(requestOptions: RequestOptions): HttpResponseFor<SystemHealth> =
            health(ClientHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rate_limits`, but is otherwise the same as
         * [HelloWorldTestinggggClientAsync.retrieveRateLimits].
         */
        @MustBeClosed
        suspend fun retrieveRateLimits(
            params: ClientRetrieveRateLimitsParams = ClientRetrieveRateLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetrieveRateLimitsResponse>

        /** @see retrieveRateLimits */
        @MustBeClosed
        suspend fun retrieveRateLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<RetrieveRateLimitsResponse> =
            retrieveRateLimits(ClientRetrieveRateLimitsParams.none(), requestOptions)
    }
}
