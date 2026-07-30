// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.MediaBinaryAndJsonParams
import com.hello_world_testingggg.api.models.MediaBinaryAndJsonResponse
import com.hello_world_testingggg.api.models.MediaJsonAndXmlParams
import com.hello_world_testingggg.api.models.MediaJsonAndXmlResponse
import com.hello_world_testingggg.api.models.MediaJsonFirstParams
import com.hello_world_testingggg.api.models.MediaJsonFirstResponse
import com.hello_world_testingggg.api.models.MediaSchemaOnJsonParams
import com.hello_world_testingggg.api.models.MediaSchemaOnJsonResponse
import com.hello_world_testingggg.api.models.MediaSchemaOnTextParams
import com.hello_world_testingggg.api.models.MediaTextFirstParams
import com.hello_world_testingggg.api.models.MediaTextFirstResponse
import com.hello_world_testingggg.api.models.MediaTextOnlyParams
import com.hello_world_testingggg.api.models.MediaVendorJsonParams
import com.hello_world_testingggg.api.models.MediaVendorJsonResponse

interface MediaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaServiceAsync

    /** A binary body alongside a JSON media type. */
    suspend fun binaryAndJson(
        params: MediaBinaryAndJsonParams = MediaBinaryAndJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBinaryAndJsonResponse

    /** @see binaryAndJson */
    suspend fun binaryAndJson(requestOptions: RequestOptions): MediaBinaryAndJsonResponse =
        binaryAndJson(MediaBinaryAndJsonParams.none(), requestOptions)

    /** JSON alongside an XML media type. */
    suspend fun jsonAndXml(
        params: MediaJsonAndXmlParams = MediaJsonAndXmlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaJsonAndXmlResponse

    /** @see jsonAndXml */
    suspend fun jsonAndXml(requestOptions: RequestOptions): MediaJsonAndXmlResponse =
        jsonAndXml(MediaJsonAndXmlParams.none(), requestOptions)

    /** JSON listed before a text media type. */
    suspend fun jsonFirst(
        params: MediaJsonFirstParams = MediaJsonFirstParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaJsonFirstResponse

    /** @see jsonFirst */
    suspend fun jsonFirst(requestOptions: RequestOptions): MediaJsonFirstResponse =
        jsonFirst(MediaJsonFirstParams.none(), requestOptions)

    /** Schema present on application/json but absent on a text/plain listed first. */
    suspend fun schemaOnJson(
        params: MediaSchemaOnJsonParams = MediaSchemaOnJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaSchemaOnJsonResponse

    /** @see schemaOnJson */
    suspend fun schemaOnJson(requestOptions: RequestOptions): MediaSchemaOnJsonResponse =
        schemaOnJson(MediaSchemaOnJsonParams.none(), requestOptions)

    /** Schema present on text/plain but absent on application/json. */
    suspend fun schemaOnText(
        params: MediaSchemaOnTextParams = MediaSchemaOnTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schemaOnText */
    suspend fun schemaOnText(requestOptions: RequestOptions) =
        schemaOnText(MediaSchemaOnTextParams.none(), requestOptions)

    /** Text media type listed before JSON (both with a schema). */
    suspend fun textFirst(
        params: MediaTextFirstParams = MediaTextFirstParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaTextFirstResponse

    /** @see textFirst */
    suspend fun textFirst(requestOptions: RequestOptions): MediaTextFirstResponse =
        textFirst(MediaTextFirstParams.none(), requestOptions)

    /** A single text/plain body. */
    suspend fun textOnly(
        params: MediaTextOnlyParams = MediaTextOnlyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see textOnly */
    suspend fun textOnly(requestOptions: RequestOptions): String =
        textOnly(MediaTextOnlyParams.none(), requestOptions)

    /** A vendor application/vnd.pet.v2+json media type. */
    suspend fun vendorJson(
        params: MediaVendorJsonParams = MediaVendorJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaVendorJsonResponse

    /** @see vendorJson */
    suspend fun vendorJson(requestOptions: RequestOptions): MediaVendorJsonResponse =
        vendorJson(MediaVendorJsonParams.none(), requestOptions)

    /** A view of [MediaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MediaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /media/binary-and-json`, but is otherwise the same
         * as [MediaServiceAsync.binaryAndJson].
         */
        @MustBeClosed
        suspend fun binaryAndJson(
            params: MediaBinaryAndJsonParams = MediaBinaryAndJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBinaryAndJsonResponse>

        /** @see binaryAndJson */
        @MustBeClosed
        suspend fun binaryAndJson(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaBinaryAndJsonResponse> =
            binaryAndJson(MediaBinaryAndJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/json-and-xml`, but is otherwise the same as
         * [MediaServiceAsync.jsonAndXml].
         */
        @MustBeClosed
        suspend fun jsonAndXml(
            params: MediaJsonAndXmlParams = MediaJsonAndXmlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaJsonAndXmlResponse>

        /** @see jsonAndXml */
        @MustBeClosed
        suspend fun jsonAndXml(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaJsonAndXmlResponse> =
            jsonAndXml(MediaJsonAndXmlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/json-first`, but is otherwise the same as
         * [MediaServiceAsync.jsonFirst].
         */
        @MustBeClosed
        suspend fun jsonFirst(
            params: MediaJsonFirstParams = MediaJsonFirstParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaJsonFirstResponse>

        /** @see jsonFirst */
        @MustBeClosed
        suspend fun jsonFirst(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaJsonFirstResponse> =
            jsonFirst(MediaJsonFirstParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/schema-on-json`, but is otherwise the same as
         * [MediaServiceAsync.schemaOnJson].
         */
        @MustBeClosed
        suspend fun schemaOnJson(
            params: MediaSchemaOnJsonParams = MediaSchemaOnJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaSchemaOnJsonResponse>

        /** @see schemaOnJson */
        @MustBeClosed
        suspend fun schemaOnJson(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaSchemaOnJsonResponse> =
            schemaOnJson(MediaSchemaOnJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/schema-on-text`, but is otherwise the same as
         * [MediaServiceAsync.schemaOnText].
         */
        @MustBeClosed
        suspend fun schemaOnText(
            params: MediaSchemaOnTextParams = MediaSchemaOnTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schemaOnText */
        @MustBeClosed
        suspend fun schemaOnText(requestOptions: RequestOptions): HttpResponse =
            schemaOnText(MediaSchemaOnTextParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/text-first`, but is otherwise the same as
         * [MediaServiceAsync.textFirst].
         */
        @MustBeClosed
        suspend fun textFirst(
            params: MediaTextFirstParams = MediaTextFirstParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaTextFirstResponse>

        /** @see textFirst */
        @MustBeClosed
        suspend fun textFirst(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaTextFirstResponse> =
            textFirst(MediaTextFirstParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/text-only`, but is otherwise the same as
         * [MediaServiceAsync.textOnly].
         */
        @MustBeClosed
        suspend fun textOnly(
            params: MediaTextOnlyParams = MediaTextOnlyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see textOnly */
        @MustBeClosed
        suspend fun textOnly(requestOptions: RequestOptions): HttpResponseFor<String> =
            textOnly(MediaTextOnlyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/vendor-json`, but is otherwise the same as
         * [MediaServiceAsync.vendorJson].
         */
        @MustBeClosed
        suspend fun vendorJson(
            params: MediaVendorJsonParams = MediaVendorJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaVendorJsonResponse>

        /** @see vendorJson */
        @MustBeClosed
        suspend fun vendorJson(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaVendorJsonResponse> =
            vendorJson(MediaVendorJsonParams.none(), requestOptions)
    }
}
