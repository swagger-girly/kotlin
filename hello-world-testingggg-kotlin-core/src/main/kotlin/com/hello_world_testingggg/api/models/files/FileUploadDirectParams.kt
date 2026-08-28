// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.files

import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import java.util.Objects

/** Uploads a whole request body as application/octet-stream. */
class FileUploadDirectParams
private constructor(
    private val path: String?,
    private val xFileName: String?,
    private val body: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Optional storage path for the raw file. */
    fun path(): String? = path

    fun xFileName(): String? = xFileName

    fun body(): String? = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): FileUploadDirectParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileUploadDirectParams]. */
        fun builder() = Builder()
    }

    /** A builder for [FileUploadDirectParams]. */
    class Builder internal constructor() {

        private var path: String? = null
        private var xFileName: String? = null
        private var body: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(fileUploadDirectParams: FileUploadDirectParams) = apply {
            path = fileUploadDirectParams.path
            xFileName = fileUploadDirectParams.xFileName
            body = fileUploadDirectParams.body
            additionalHeaders = fileUploadDirectParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileUploadDirectParams.additionalQueryParams.toBuilder()
        }

        /** Optional storage path for the raw file. */
        fun path(path: String?) = apply { this.path = path }

        fun xFileName(xFileName: String?) = apply { this.xFileName = xFileName }

        fun body(body: String?) = apply { this.body = body }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FileUploadDirectParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileUploadDirectParams =
            FileUploadDirectParams(
                path,
                xFileName,
                body,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): String? = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xFileName?.let { put("X-File-Name", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                path?.let { put("path", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUploadDirectParams &&
            path == other.path &&
            xFileName == other.xFileName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(path, xFileName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileUploadDirectParams{path=$path, xFileName=$xFileName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
