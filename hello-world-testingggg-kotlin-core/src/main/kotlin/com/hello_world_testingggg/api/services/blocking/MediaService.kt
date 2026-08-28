// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.media.MediaBinaryAndJsonParams
import com.hello_world_testingggg.api.models.media.MediaBinaryAndJsonResponse
import com.hello_world_testingggg.api.models.media.MediaJsonAndXmlParams
import com.hello_world_testingggg.api.models.media.MediaJsonAndXmlResponse
import com.hello_world_testingggg.api.models.media.MediaJsonFirstParams
import com.hello_world_testingggg.api.models.media.MediaJsonFirstResponse
import com.hello_world_testingggg.api.models.media.MediaSchemaOnJsonParams
import com.hello_world_testingggg.api.models.media.MediaSchemaOnJsonResponse
import com.hello_world_testingggg.api.models.media.MediaSchemaOnTextParams
import com.hello_world_testingggg.api.models.media.MediaTextFirstParams
import com.hello_world_testingggg.api.models.media.MediaTextFirstResponse
import com.hello_world_testingggg.api.models.media.MediaTextOnlyParams
import com.hello_world_testingggg.api.models.media.MediaVendorJsonParams
import com.hello_world_testingggg.api.models.media.MediaVendorJsonResponse

interface MediaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaService

    /** A binary body alongside a JSON media type. */
    fun binaryAndJson(
        params: MediaBinaryAndJsonParams = MediaBinaryAndJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaBinaryAndJsonResponse

    /** @see binaryAndJson */
    fun binaryAndJson(requestOptions: RequestOptions): MediaBinaryAndJsonResponse =
        binaryAndJson(MediaBinaryAndJsonParams.none(), requestOptions)

    /** JSON alongside an XML media type. */
    fun jsonAndXml(
        params: MediaJsonAndXmlParams = MediaJsonAndXmlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaJsonAndXmlResponse

    /** @see jsonAndXml */
    fun jsonAndXml(requestOptions: RequestOptions): MediaJsonAndXmlResponse =
        jsonAndXml(MediaJsonAndXmlParams.none(), requestOptions)

    /** JSON listed before a text media type. */
    fun jsonFirst(
        params: MediaJsonFirstParams = MediaJsonFirstParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaJsonFirstResponse

    /** @see jsonFirst */
    fun jsonFirst(requestOptions: RequestOptions): MediaJsonFirstResponse =
        jsonFirst(MediaJsonFirstParams.none(), requestOptions)

    /** Schema present on application/json but absent on a text/plain listed first. */
    fun schemaOnJson(
        params: MediaSchemaOnJsonParams = MediaSchemaOnJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaSchemaOnJsonResponse

    /** @see schemaOnJson */
    fun schemaOnJson(requestOptions: RequestOptions): MediaSchemaOnJsonResponse =
        schemaOnJson(MediaSchemaOnJsonParams.none(), requestOptions)

    /** Schema present on text/plain but absent on application/json. */
    fun schemaOnText(
        params: MediaSchemaOnTextParams = MediaSchemaOnTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schemaOnText */
    fun schemaOnText(requestOptions: RequestOptions) =
        schemaOnText(MediaSchemaOnTextParams.none(), requestOptions)

    /** Text media type listed before JSON (both with a schema). */
    fun textFirst(
        params: MediaTextFirstParams = MediaTextFirstParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaTextFirstResponse

    /** @see textFirst */
    fun textFirst(requestOptions: RequestOptions): MediaTextFirstResponse =
        textFirst(MediaTextFirstParams.none(), requestOptions)

    /** A single text/plain body. */
    fun textOnly(
        params: MediaTextOnlyParams = MediaTextOnlyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see textOnly */
    fun textOnly(requestOptions: RequestOptions): String =
        textOnly(MediaTextOnlyParams.none(), requestOptions)

    /** A vendor application/vnd.pet.v2+json media type. */
    fun vendorJson(
        params: MediaVendorJsonParams = MediaVendorJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaVendorJsonResponse

    /** @see vendorJson */
    fun vendorJson(requestOptions: RequestOptions): MediaVendorJsonResponse =
        vendorJson(MediaVendorJsonParams.none(), requestOptions)

    /** A view of [MediaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /media/binary-and-json`, but is otherwise the same
         * as [MediaService.binaryAndJson].
         */
        @MustBeClosed
        fun binaryAndJson(
            params: MediaBinaryAndJsonParams = MediaBinaryAndJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaBinaryAndJsonResponse>

        /** @see binaryAndJson */
        @MustBeClosed
        fun binaryAndJson(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaBinaryAndJsonResponse> =
            binaryAndJson(MediaBinaryAndJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/json-and-xml`, but is otherwise the same as
         * [MediaService.jsonAndXml].
         */
        @MustBeClosed
        fun jsonAndXml(
            params: MediaJsonAndXmlParams = MediaJsonAndXmlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaJsonAndXmlResponse>

        /** @see jsonAndXml */
        @MustBeClosed
        fun jsonAndXml(requestOptions: RequestOptions): HttpResponseFor<MediaJsonAndXmlResponse> =
            jsonAndXml(MediaJsonAndXmlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/json-first`, but is otherwise the same as
         * [MediaService.jsonFirst].
         */
        @MustBeClosed
        fun jsonFirst(
            params: MediaJsonFirstParams = MediaJsonFirstParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaJsonFirstResponse>

        /** @see jsonFirst */
        @MustBeClosed
        fun jsonFirst(requestOptions: RequestOptions): HttpResponseFor<MediaJsonFirstResponse> =
            jsonFirst(MediaJsonFirstParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/schema-on-json`, but is otherwise the same as
         * [MediaService.schemaOnJson].
         */
        @MustBeClosed
        fun schemaOnJson(
            params: MediaSchemaOnJsonParams = MediaSchemaOnJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaSchemaOnJsonResponse>

        /** @see schemaOnJson */
        @MustBeClosed
        fun schemaOnJson(
            requestOptions: RequestOptions
        ): HttpResponseFor<MediaSchemaOnJsonResponse> =
            schemaOnJson(MediaSchemaOnJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/schema-on-text`, but is otherwise the same as
         * [MediaService.schemaOnText].
         */
        @MustBeClosed
        fun schemaOnText(
            params: MediaSchemaOnTextParams = MediaSchemaOnTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schemaOnText */
        @MustBeClosed
        fun schemaOnText(requestOptions: RequestOptions): HttpResponse =
            schemaOnText(MediaSchemaOnTextParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/text-first`, but is otherwise the same as
         * [MediaService.textFirst].
         */
        @MustBeClosed
        fun textFirst(
            params: MediaTextFirstParams = MediaTextFirstParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaTextFirstResponse>

        /** @see textFirst */
        @MustBeClosed
        fun textFirst(requestOptions: RequestOptions): HttpResponseFor<MediaTextFirstResponse> =
            textFirst(MediaTextFirstParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/text-only`, but is otherwise the same as
         * [MediaService.textOnly].
         */
        @MustBeClosed
        fun textOnly(
            params: MediaTextOnlyParams = MediaTextOnlyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see textOnly */
        @MustBeClosed
        fun textOnly(requestOptions: RequestOptions): HttpResponseFor<String> =
            textOnly(MediaTextOnlyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /media/vendor-json`, but is otherwise the same as
         * [MediaService.vendorJson].
         */
        @MustBeClosed
        fun vendorJson(
            params: MediaVendorJsonParams = MediaVendorJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaVendorJsonResponse>

        /** @see vendorJson */
        @MustBeClosed
        fun vendorJson(requestOptions: RequestOptions): HttpResponseFor<MediaVendorJsonResponse> =
            vendorJson(MediaVendorJsonParams.none(), requestOptions)
    }
}
