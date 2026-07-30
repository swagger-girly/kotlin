// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking.store

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
interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService

    /** Place a new order in the store */
    fun create(
        params: StoreOrderCreateParams = StoreOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** @see create */
    fun create(requestOptions: RequestOptions): OrderCreateResponse =
        create(StoreOrderCreateParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    fun retrieve(
        orderId: Long,
        params: StoreOrderRetrieveParams = StoreOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderRetrieveResponse = retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: StoreOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(orderId: Long, requestOptions: RequestOptions): OrderRetrieveResponse =
        retrieve(orderId, StoreOrderRetrieveParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    fun delete(
        orderId: Long,
        params: StoreOrderDeleteParams = StoreOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: StoreOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(orderId: Long, requestOptions: RequestOptions) =
        delete(orderId, StoreOrderDeleteParams.none(), requestOptions)

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /store/order`, but is otherwise the same as
         * [OrderService.create].
         */
        @MustBeClosed
        fun create(
            params: StoreOrderCreateParams = StoreOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<OrderCreateResponse> =
            create(StoreOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/order/{orderId}`, but is otherwise the same
         * as [OrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            orderId: Long,
            params: StoreOrderRetrieveParams = StoreOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderRetrieveResponse> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StoreOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderRetrieveResponse> =
            retrieve(orderId, StoreOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /store/order/{orderId}`, but is otherwise the
         * same as [OrderService.delete].
         */
        @MustBeClosed
        fun delete(
            orderId: Long,
            params: StoreOrderDeleteParams = StoreOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StoreOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(orderId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(orderId, StoreOrderDeleteParams.none(), requestOptions)
    }
}
