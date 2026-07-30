// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.multipartFormData
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.Archive
import com.hello_world_testingggg.api.models.File
import com.hello_world_testingggg.api.models.FileCreateArchiveParams
import com.hello_world_testingggg.api.models.FileDeleteParams
import com.hello_world_testingggg.api.models.FileDownloadParams
import com.hello_world_testingggg.api.models.FileListParams
import com.hello_world_testingggg.api.models.FileUpdateParams
import com.hello_world_testingggg.api.models.FileUploadDirectParams
import com.hello_world_testingggg.api.models.FileUploadParams
import com.hello_world_testingggg.api.models.Fileslist

/** File storage operations */
class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun update(params: FileUpdateParams, requestOptions: RequestOptions): File =
        // put /files/{path}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(params: FileListParams, requestOptions: RequestOptions): Fileslist =
        // get /files
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: FileDeleteParams, requestOptions: RequestOptions) {
        // delete /files/{path}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun createArchive(
        params: FileCreateArchiveParams,
        requestOptions: RequestOptions,
    ): Archive =
        // post /files/archive
        withRawResponse().createArchive(params, requestOptions).parse()

    override suspend fun download(
        params: FileDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /files/{path}
        withRawResponse().download(params, requestOptions)

    override suspend fun upload(params: FileUploadParams, requestOptions: RequestOptions): File =
        // post /files
        withRawResponse().upload(params, requestOptions).parse()

    override suspend fun uploadDirect(
        params: FileUploadDirectParams,
        requestOptions: RequestOptions,
    ): File =
        // post /files/direct
        withRawResponse().uploadDirect(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FileServiceAsync.WithRawResponse =
            FileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val updateHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override suspend fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<Fileslist> =
            jsonHandler<Fileslist>(clientOptions.jsonMapper)

        override suspend fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Fileslist> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createArchiveHandler: Handler<Archive> =
            jsonHandler<Archive>(clientOptions.jsonMapper)

        override suspend fun createArchive(
            params: FileCreateArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Archive> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "archive")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createArchiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override suspend fun download(
            params: FileDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", params._pathParam(0))
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override suspend fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadDirectHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override suspend fun uploadDirect(
            params: FileUploadDirectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("body", params._body())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "direct")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadDirectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
