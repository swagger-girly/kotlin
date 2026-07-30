// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async.store

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.OrderCreateResponse
import com.hello_world_testingggg.api.models.OrderRetrieveResponse
import com.hello_world_testingggg.api.models.StoreOrderCreateParams
import com.hello_world_testingggg.api.models.StoreOrderDeleteParams
import com.hello_world_testingggg.api.models.StoreOrderRetrieveParams

/** Access to Petstore orders */
interface OrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderServiceAsync

    /** Place a new order in the store */
    suspend fun create(
        params: StoreOrderCreateParams = StoreOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): OrderCreateResponse =
        create(StoreOrderCreateParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    suspend fun retrieve(
        orderId: Long,
        params: StoreOrderRetrieveParams = StoreOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderRetrieveResponse = retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: StoreOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(orderId: Long, requestOptions: RequestOptions): OrderRetrieveResponse =
        retrieve(orderId, StoreOrderRetrieveParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    suspend fun delete(
        orderId: Long,
        params: StoreOrderDeleteParams = StoreOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: StoreOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(orderId: Long, requestOptions: RequestOptions) =
        delete(orderId, StoreOrderDeleteParams.none(), requestOptions)

    /** A view of [OrderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /store/order`, but is otherwise the same as
         * [OrderServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: StoreOrderCreateParams = StoreOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<OrderCreateResponse> =
            create(StoreOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/order/{orderId}`, but is otherwise the same
         * as [OrderServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            orderId: Long,
            params: StoreOrderRetrieveParams = StoreOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderRetrieveResponse> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: StoreOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            orderId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderRetrieveResponse> =
            retrieve(orderId, StoreOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /store/order/{orderId}`, but is otherwise the
         * same as [OrderServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            orderId: Long,
            params: StoreOrderDeleteParams = StoreOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: StoreOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(orderId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(orderId, StoreOrderDeleteParams.none(), requestOptions)
    }
}
