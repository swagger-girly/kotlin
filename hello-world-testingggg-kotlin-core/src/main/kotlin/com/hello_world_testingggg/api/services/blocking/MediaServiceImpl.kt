// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.handlers.stringHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepare
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

class MediaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaService {

    private val withRawResponse: MediaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MediaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MediaService =
        MediaServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun binaryAndJson(
        params: MediaBinaryAndJsonParams,
        requestOptions: RequestOptions,
    ): MediaBinaryAndJsonResponse =
        // get /media/binary-and-json
        withRawResponse().binaryAndJson(params, requestOptions).parse()

    override fun jsonAndXml(
        params: MediaJsonAndXmlParams,
        requestOptions: RequestOptions,
    ): MediaJsonAndXmlResponse =
        // get /media/json-and-xml
        withRawResponse().jsonAndXml(params, requestOptions).parse()

    override fun jsonFirst(
        params: MediaJsonFirstParams,
        requestOptions: RequestOptions,
    ): MediaJsonFirstResponse =
        // get /media/json-first
        withRawResponse().jsonFirst(params, requestOptions).parse()

    override fun schemaOnJson(
        params: MediaSchemaOnJsonParams,
        requestOptions: RequestOptions,
    ): MediaSchemaOnJsonResponse =
        // get /media/schema-on-json
        withRawResponse().schemaOnJson(params, requestOptions).parse()

    override fun schemaOnText(params: MediaSchemaOnTextParams, requestOptions: RequestOptions) {
        // get /media/schema-on-text
        withRawResponse().schemaOnText(params, requestOptions)
    }

    override fun textFirst(
        params: MediaTextFirstParams,
        requestOptions: RequestOptions,
    ): MediaTextFirstResponse =
        // get /media/text-first
        withRawResponse().textFirst(params, requestOptions).parse()

    override fun textOnly(params: MediaTextOnlyParams, requestOptions: RequestOptions): String =
        // get /media/text-only
        withRawResponse().textOnly(params, requestOptions).parse()

    override fun vendorJson(
        params: MediaVendorJsonParams,
        requestOptions: RequestOptions,
    ): MediaVendorJsonResponse =
        // get /media/vendor-json
        withRawResponse().vendorJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MediaService.WithRawResponse =
            MediaServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val binaryAndJsonHandler: Handler<MediaBinaryAndJsonResponse> =
            jsonHandler<MediaBinaryAndJsonResponse>(clientOptions.jsonMapper)

        override fun binaryAndJson(
            params: MediaBinaryAndJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBinaryAndJsonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "binary-and-json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { binaryAndJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val jsonAndXmlHandler: Handler<MediaJsonAndXmlResponse> =
            jsonHandler<MediaJsonAndXmlResponse>(clientOptions.jsonMapper)

        override fun jsonAndXml(
            params: MediaJsonAndXmlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaJsonAndXmlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "json-and-xml")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { jsonAndXmlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val jsonFirstHandler: Handler<MediaJsonFirstResponse> =
            jsonHandler<MediaJsonFirstResponse>(clientOptions.jsonMapper)

        override fun jsonFirst(
            params: MediaJsonFirstParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaJsonFirstResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "json-first")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { jsonFirstHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val schemaOnJsonHandler: Handler<MediaSchemaOnJsonResponse> =
            jsonHandler<MediaSchemaOnJsonResponse>(clientOptions.jsonMapper)

        override fun schemaOnJson(
            params: MediaSchemaOnJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaSchemaOnJsonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "schema-on-json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { schemaOnJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val schemaOnTextHandler: Handler<Void?> = emptyHandler()

        override fun schemaOnText(
            params: MediaSchemaOnTextParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "schema-on-text")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { schemaOnTextHandler.handle(it) }
            }
        }

        private val textFirstHandler: Handler<MediaTextFirstResponse> =
            jsonHandler<MediaTextFirstResponse>(clientOptions.jsonMapper)

        override fun textFirst(
            params: MediaTextFirstParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaTextFirstResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "text-first")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { textFirstHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val textOnlyHandler: Handler<String> = stringHandler()

        override fun textOnly(
            params: MediaTextOnlyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "text-only")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { textOnlyHandler.handle(it) }
            }
        }

        private val vendorJsonHandler: Handler<MediaVendorJsonResponse> =
            jsonHandler<MediaVendorJsonResponse>(clientOptions.jsonMapper)

        override fun vendorJson(
            params: MediaVendorJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaVendorJsonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", "vendor-json")
                    .putHeader("Accept", "application/vnd.pet.v2+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { vendorJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
