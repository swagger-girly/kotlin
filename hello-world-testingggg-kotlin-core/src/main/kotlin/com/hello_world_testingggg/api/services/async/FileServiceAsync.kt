// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.files.Archive
import com.hello_world_testingggg.api.models.files.File
import com.hello_world_testingggg.api.models.files.FileCreateArchiveParams
import com.hello_world_testingggg.api.models.files.FileDeleteParams
import com.hello_world_testingggg.api.models.files.FileDownloadParams
import com.hello_world_testingggg.api.models.files.FileListParams
import com.hello_world_testingggg.api.models.files.FileUpdateParams
import com.hello_world_testingggg.api.models.files.FileUploadDirectParams
import com.hello_world_testingggg.api.models.files.FileUploadParams
import com.hello_world_testingggg.api.models.files.Fileslist

/** File storage operations */
interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync

    /** Updates a stored file with either a multipart file part or a URL. */
    suspend fun update(
        path: String,
        params: FileUpdateParams = FileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = update(params.toBuilder().path(path).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see update */
    suspend fun update(path: String, requestOptions: RequestOptions): File =
        update(path, FileUpdateParams.none(), requestOptions)

    /** Returns all files in descending order. */
    suspend fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Fileslist

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): Fileslist =
        list(FileListParams.none(), requestOptions)

    /** Deletes a file while preserving slashes in the file path parameter. */
    suspend fun delete(
        path: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().path(path).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(path: String, requestOptions: RequestOptions) =
        delete(path, FileDeleteParams.none(), requestOptions)

    /** Uploads multiple files and nested manifest metadata as multipart/form-data. */
    suspend fun createArchive(
        params: FileCreateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Archive

    /** Downloads a file while preserving slashes in the file path parameter. */
    @MustBeClosed
    suspend fun download(
        path: String,
        params: FileDownloadParams = FileDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().path(path).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    suspend fun download(
        params: FileDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    suspend fun download(path: String, requestOptions: RequestOptions): HttpResponse =
        download(path, FileDownloadParams.none(), requestOptions)

    /** Uploads a file via multipart/form-data with metadata and optional storage path. */
    suspend fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Uploads a whole request body as application/octet-stream. */
    suspend fun uploadDirect(
        body: String,
        params: FileUploadDirectParams = FileUploadDirectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = uploadDirect(params.toBuilder().body(body).build(), requestOptions)

    /** @see uploadDirect */
    suspend fun uploadDirect(
        body: String,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = uploadDirect(FileUploadDirectParams.builder().body(body).build(), requestOptions)

    /** @see uploadDirect */
    suspend fun uploadDirect(
        params: FileUploadDirectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see uploadDirect */
    suspend fun uploadDirect(body: String, requestOptions: RequestOptions): File =
        uploadDirect(body, FileUploadDirectParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /files/{path}`, but is otherwise the same as
         * [FileServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            path: String,
            params: FileUpdateParams = FileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = update(params.toBuilder().path(path).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see update */
        @MustBeClosed
        suspend fun update(path: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            update(path, FileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Fileslist>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<Fileslist> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/{path}`, but is otherwise the same as
         * [FileServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            path: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().path(path).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(path: String, requestOptions: RequestOptions): HttpResponse =
            delete(path, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/archive`, but is otherwise the same as
         * [FileServiceAsync.createArchive].
         */
        @MustBeClosed
        suspend fun createArchive(
            params: FileCreateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Archive>

        /**
         * Returns a raw HTTP response for `get /files/{path}`, but is otherwise the same as
         * [FileServiceAsync.download].
         */
        @MustBeClosed
        suspend fun download(
            path: String,
            params: FileDownloadParams = FileDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().path(path).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        suspend fun download(
            params: FileDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        suspend fun download(path: String, requestOptions: RequestOptions): HttpResponse =
            download(path, FileDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files`, but is otherwise the same as
         * [FileServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `post /files/direct`, but is otherwise the same as
         * [FileServiceAsync.uploadDirect].
         */
        @MustBeClosed
        suspend fun uploadDirect(
            body: String,
            params: FileUploadDirectParams = FileUploadDirectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            uploadDirect(params.toBuilder().body(body).build(), requestOptions)

        /** @see uploadDirect */
        @MustBeClosed
        suspend fun uploadDirect(
            body: String,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            uploadDirect(FileUploadDirectParams.builder().body(body).build(), requestOptions)

        /** @see uploadDirect */
        @MustBeClosed
        suspend fun uploadDirect(
            params: FileUploadDirectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see uploadDirect */
        @MustBeClosed
        suspend fun uploadDirect(
            body: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> = uploadDirect(body, FileUploadDirectParams.none(), requestOptions)
    }
}
