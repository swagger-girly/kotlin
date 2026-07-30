// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

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

/** Uploads multiple files and nested manifest metadata as multipart/form-data. */
class FileCreateArchiveParams
private constructor(
    private val body: FileArchiveRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Files to include in the archive.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun files(): List<InputStream> = body.files()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun manifest(): Manifest? = body.manifest()

    /**
     * Returns the raw multipart value of [files].
     *
     * Unlike [files], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _files(): MultipartField<List<InputStream>> = body._files()

    /**
     * Returns the raw multipart value of [manifest].
     *
     * Unlike [manifest], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _manifest(): MultipartField<Manifest> = body._manifest()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileCreateArchiveParams].
         *
         * The following fields are required:
         * ```kotlin
         * .files()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [FileCreateArchiveParams]. */
    class Builder internal constructor() {

        private var body: FileArchiveRequest.Builder = FileArchiveRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(fileCreateArchiveParams: FileCreateArchiveParams) = apply {
            body = fileCreateArchiveParams.body.toBuilder()
            additionalHeaders = fileCreateArchiveParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileCreateArchiveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [files]
         * - [manifest]
         */
        fun body(body: FileArchiveRequest) = apply { this.body = body.toBuilder() }

        /** Files to include in the archive. */
        fun files(files: List<InputStream>) = apply { body.files(files) }

        /**
         * Sets [Builder.files] to an arbitrary multipart value.
         *
         * You should usually call [Builder.files] with a well-typed `List<InputStream>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun files(files: MultipartField<List<InputStream>>) = apply { body.files(files) }

        /**
         * Adds a single [InputStream] to [files].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFile(file: InputStream) = apply { body.addFile(file) }

        /** Files to include in the archive. */
        fun addFile(file: ByteArray) = apply { body.addFile(file) }

        /** Files to include in the archive. */
        fun addFile(path: Path) = apply { body.addFile(path) }

        fun manifest(manifest: Manifest) = apply { body.manifest(manifest) }

        /**
         * Sets [Builder.manifest] to an arbitrary multipart value.
         *
         * You should usually call [Builder.manifest] with a well-typed [Manifest] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun manifest(manifest: MultipartField<Manifest>) = apply { body.manifest(manifest) }

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
         * Returns an immutable instance of [FileCreateArchiveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .files()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileCreateArchiveParams =
            FileCreateArchiveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("files" to _files(), "manifest" to _manifest()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class FileArchiveRequest
    private constructor(
        private val files: MultipartField<List<InputStream>>,
        private val manifest: MultipartField<Manifest>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Files to include in the archive.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun files(): List<InputStream> = files.value.getRequired("files")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun manifest(): Manifest? = manifest.value.getNullable("manifest")

        /**
         * Returns the raw multipart value of [files].
         *
         * Unlike [files], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("files")
        @ExcludeMissing
        fun _files(): MultipartField<List<InputStream>> = files

        /**
         * Returns the raw multipart value of [manifest].
         *
         * Unlike [manifest], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("manifest")
        @ExcludeMissing
        fun _manifest(): MultipartField<Manifest> = manifest

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
             * Returns a mutable builder for constructing an instance of [FileArchiveRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .files()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [FileArchiveRequest]. */
        class Builder internal constructor() {

            private var files: MultipartField<MutableList<InputStream>>? = null
            private var manifest: MultipartField<Manifest> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fileArchiveRequest: FileArchiveRequest) = apply {
                files = fileArchiveRequest.files.map { it.toMutableList() }
                manifest = fileArchiveRequest.manifest
                additionalProperties = fileArchiveRequest.additionalProperties.toMutableMap()
            }

            /** Files to include in the archive. */
            fun files(files: List<InputStream>) =
                files(
                    MultipartField.builder<List<InputStream>>()
                        .value(files)
                        .contentType("application/octet-stream")
                        .build()
                )

            /**
             * Sets [Builder.files] to an arbitrary multipart value.
             *
             * You should usually call [Builder.files] with a well-typed `List<InputStream>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun files(files: MultipartField<List<InputStream>>) = apply {
                this.files = files.map { it.toMutableList() }
            }

            /**
             * Adds a single [InputStream] to [files].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFile(file: InputStream) = apply {
                files =
                    (files
                            ?: MultipartField.builder<MutableList<InputStream>>()
                                .value(mutableListOf())
                                .contentType("application/octet-stream")
                                .build())
                        .also { checkKnown("files", it).add(file) }
            }

            /** Files to include in the archive. */
            fun addFile(file: ByteArray) = addFile(file.inputStream())

            /** Files to include in the archive. */
            fun addFile(path: Path) =
                addFile(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun manifest(manifest: Manifest) = manifest(MultipartField.of(manifest))

            /**
             * Sets [Builder.manifest] to an arbitrary multipart value.
             *
             * You should usually call [Builder.manifest] with a well-typed [Manifest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manifest(manifest: MultipartField<Manifest>) = apply { this.manifest = manifest }

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
             * Returns an immutable instance of [FileArchiveRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .files()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FileArchiveRequest =
                FileArchiveRequest(
                    checkRequired("files", files).map { it.toImmutable() },
                    manifest,
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
        fun validate(): FileArchiveRequest = apply {
            if (validated) {
                return@apply
            }

            files()
            manifest()?.validate()
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

            return other is FileArchiveRequest &&
                files == other.files &&
                manifest == other.manifest &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(files, manifest, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FileArchiveRequest{files=$files, manifest=$manifest, additionalProperties=$additionalProperties}"
    }

    class Manifest
    private constructor(
        private val name: MultipartField<String>,
        private val labels: MultipartField<List<String>>,
        private val preservePaths: MultipartField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.value.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun labels(): List<String>? = labels.value.getNullable("labels")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preservePaths(): Boolean? = preservePaths.value.getNullable("preservePaths")

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [labels].
         *
         * Unlike [labels], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("labels") @ExcludeMissing fun _labels(): MultipartField<List<String>> = labels

        /**
         * Returns the raw multipart value of [preservePaths].
         *
         * Unlike [preservePaths], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("preservePaths")
        @ExcludeMissing
        fun _preservePaths(): MultipartField<Boolean> = preservePaths

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
             * Returns a mutable builder for constructing an instance of [Manifest].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Manifest]. */
        class Builder internal constructor() {

            private var name: MultipartField<String>? = null
            private var labels: MultipartField<MutableList<String>>? = null
            private var preservePaths: MultipartField<Boolean> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(manifest: Manifest) = apply {
                name = manifest.name
                labels = manifest.labels.map { it.toMutableList() }
                preservePaths = manifest.preservePaths
                additionalProperties = manifest.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            fun labels(labels: List<String>) = labels(MultipartField.of(labels))

            /**
             * Sets [Builder.labels] to an arbitrary multipart value.
             *
             * You should usually call [Builder.labels] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun labels(labels: MultipartField<List<String>>) = apply {
                this.labels = labels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [labels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLabel(label: String) = apply {
                labels =
                    (labels ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("labels", it).add(label)
                    }
            }

            fun preservePaths(preservePaths: Boolean) =
                preservePaths(MultipartField.of(preservePaths))

            /**
             * Sets [Builder.preservePaths] to an arbitrary multipart value.
             *
             * You should usually call [Builder.preservePaths] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preservePaths(preservePaths: MultipartField<Boolean>) = apply {
                this.preservePaths = preservePaths
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
             * Returns an immutable instance of [Manifest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Manifest =
                Manifest(
                    checkRequired("name", name),
                    (labels ?: MultipartField.of(null)).map { it.toImmutable() },
                    preservePaths,
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
        fun validate(): Manifest = apply {
            if (validated) {
                return@apply
            }

            name()
            labels()
            preservePaths()
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

            return other is Manifest &&
                name == other.name &&
                labels == other.labels &&
                preservePaths == other.preservePaths &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, labels, preservePaths, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Manifest{name=$name, labels=$labels, preservePaths=$preservePaths, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileCreateArchiveParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileCreateArchiveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
