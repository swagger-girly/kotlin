// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.MultipartField
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Uploads a file via multipart/form-data with metadata and optional storage path. */
class FileUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The file to upload.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * Optional expiration in seconds.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Int? = body.expiresIn()

    /**
     * Additional metadata to store with the file.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Optional storage path for the uploaded file.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun path(): String? = body.path()

    /**
     * Whether the file should be publicly readable.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun public_(): Boolean? = body.public_()

    /**
     * Tags to associate with the file.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String>? = body.tags()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _expiresIn(): MultipartField<Int> = body._expiresIn()

    /**
     * Returns the raw multipart value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _metadata(): MultipartField<Metadata> = body._metadata()

    /**
     * Returns the raw multipart value of [path].
     *
     * Unlike [path], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _path(): MultipartField<String> = body._path()

    /**
     * Returns the raw multipart value of [public_].
     *
     * Unlike [public_], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _public_(): MultipartField<Boolean> = body._public_()

    /**
     * Returns the raw multipart value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _tags(): MultipartField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileUploadParams].
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [FileUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(fileUploadParams: FileUploadParams) = apply {
            body = fileUploadParams.body.toBuilder()
            additionalHeaders = fileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [expiresIn]
         * - [metadata]
         * - [path]
         * - [public_]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The file to upload. */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** The file to upload. */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** The file to upload. */
        fun file(path: Path) = apply { body.file(path) }

        /** Optional expiration in seconds. */
        fun expiresIn(expiresIn: Int) = apply { body.expiresIn(expiresIn) }

        /**
         * Sets [Builder.expiresIn] to an arbitrary multipart value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: MultipartField<Int>) = apply { body.expiresIn(expiresIn) }

        /** Additional metadata to store with the file. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: MultipartField<Metadata>) = apply { body.metadata(metadata) }

        /** Optional storage path for the uploaded file. */
        fun path(path: String) = apply { body.path(path) }

        /**
         * Sets [Builder.path] to an arbitrary multipart value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: MultipartField<String>) = apply { body.path(path) }

        /** Whether the file should be publicly readable. */
        fun public_(public_: Boolean) = apply { body.public_(public_) }

        /**
         * Sets [Builder.public_] to an arbitrary multipart value.
         *
         * You should usually call [Builder.public_] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun public_(public_: MultipartField<Boolean>) = apply { body.public_(public_) }

        /** Tags to associate with the file. */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary multipart value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: MultipartField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [FileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileUploadParams =
            FileUploadParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "expiresIn" to _expiresIn(),
                "metadata" to _metadata(),
                "path" to _path(),
                "public" to _public_(),
                "tags" to _tags(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val expiresIn: MultipartField<Int>,
        private val metadata: MultipartField<Metadata>,
        private val path: MultipartField<String>,
        private val public_: MultipartField<Boolean>,
        private val tags: MultipartField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The file to upload.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * Optional expiration in seconds.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun expiresIn(): Int? = expiresIn.value.getNullable("expiresIn")

        /**
         * Additional metadata to store with the file.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.value.getNullable("metadata")

        /**
         * Optional storage path for the uploaded file.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun path(): String? = path.value.getNullable("path")

        /**
         * Whether the file should be publicly readable.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun public_(): Boolean? = public_.value.getNullable("public")

        /**
         * Tags to associate with the file.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String>? = tags.value.getNullable("tags")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [expiresIn].
         *
         * Unlike [expiresIn], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("expiresIn") @ExcludeMissing fun _expiresIn(): MultipartField<Int> = expiresIn

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): MultipartField<Metadata> = metadata

        /**
         * Returns the raw multipart value of [path].
         *
         * Unlike [path], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): MultipartField<String> = path

        /**
         * Returns the raw multipart value of [public_].
         *
         * Unlike [public_], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("public") @ExcludeMissing fun _public_(): MultipartField<Boolean> = public_

        /**
         * Returns the raw multipart value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): MultipartField<List<String>> = tags

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var expiresIn: MultipartField<Int> = MultipartField.of(null)
            private var metadata: MultipartField<Metadata> = MultipartField.of(null)
            private var path: MultipartField<String> = MultipartField.of(null)
            private var public_: MultipartField<Boolean> = MultipartField.of(null)
            private var tags: MultipartField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                file = body.file
                expiresIn = body.expiresIn
                metadata = body.metadata
                path = body.path
                public_ = body.public_
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The file to upload. */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** The file to upload. */
            fun file(file: ByteArray) = file(file.inputStream())

            /** The file to upload. */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Optional expiration in seconds. */
            fun expiresIn(expiresIn: Int) = expiresIn(MultipartField.of(expiresIn))

            /**
             * Sets [Builder.expiresIn] to an arbitrary multipart value.
             *
             * You should usually call [Builder.expiresIn] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresIn(expiresIn: MultipartField<Int>) = apply { this.expiresIn = expiresIn }

            /** Additional metadata to store with the file. */
            fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<Metadata>) = apply { this.metadata = metadata }

            /** Optional storage path for the uploaded file. */
            fun path(path: String) = path(MultipartField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary multipart value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: MultipartField<String>) = apply { this.path = path }

            /** Whether the file should be publicly readable. */
            fun public_(public_: Boolean) = public_(MultipartField.of(public_))

            /**
             * Sets [Builder.public_] to an arbitrary multipart value.
             *
             * You should usually call [Builder.public_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun public_(public_: MultipartField<Boolean>) = apply { this.public_ = public_ }

            /** Tags to associate with the file. */
            fun tags(tags: List<String>) = tags(MultipartField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary multipart value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: MultipartField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("tags", it).add(tag)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("file", file),
                    expiresIn,
                    metadata,
                    path,
                    public_,
                    (tags ?: MultipartField.of(null)).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HelloWorldTestinggggInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            expiresIn()
            metadata()?.validate()
            path()
            public_()
            tags()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HelloWorldTestinggggInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                expiresIn == other.expiresIn &&
                metadata == other.metadata &&
                path == other.path &&
                public_ == other.public_ &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(file, expiresIn, metadata, path, public_, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, expiresIn=$expiresIn, metadata=$metadata, path=$path, public_=$public_, tags=$tags, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata to store with the file. */
    class Metadata
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HelloWorldTestinggggInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HelloWorldTestinggggInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
