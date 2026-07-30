// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class File
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lastModified: JsonField<OffsetDateTime>,
    private val path: JsonField<String>,
    private val size: JsonField<Long>,
    private val contentType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lastModified")
        @ExcludeMissing
        lastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
    ) : this(lastModified, path, size, contentType, mutableMapOf())

    /**
     * Timestamp when the file was last modified.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastModified(): OffsetDateTime = lastModified.getRequired("lastModified")

    /**
     * Path to the file in storage.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = path.getRequired("path")

    /**
     * Size of the file in bytes.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun size(): Long = size.getRequired("size")

    /**
     * Detected MIME type for the file.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun contentType(): String? = contentType.getNullable("contentType")

    /**
     * Returns the raw JSON value of [lastModified].
     *
     * Unlike [lastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModified")
    @ExcludeMissing
    fun _lastModified(): JsonField<OffsetDateTime> = lastModified

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentType") @ExcludeMissing fun _contentType(): JsonField<String> = contentType

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
         * Returns a mutable builder for constructing an instance of [File].
         *
         * The following fields are required:
         * ```kotlin
         * .lastModified()
         * .path()
         * .size()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [File]. */
    class Builder internal constructor() {

        private var lastModified: JsonField<OffsetDateTime>? = null
        private var path: JsonField<String>? = null
        private var size: JsonField<Long>? = null
        private var contentType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(file: File) = apply {
            lastModified = file.lastModified
            path = file.path
            size = file.size
            contentType = file.contentType
            additionalProperties = file.additionalProperties.toMutableMap()
        }

        /** Timestamp when the file was last modified. */
        fun lastModified(lastModified: OffsetDateTime) = lastModified(JsonField.of(lastModified))

        /**
         * Sets [Builder.lastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModified(lastModified: JsonField<OffsetDateTime>) = apply {
            this.lastModified = lastModified
        }

        /** Path to the file in storage. */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** Size of the file in bytes. */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        /** Detected MIME type for the file. */
        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

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
         * Returns an immutable instance of [File].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .lastModified()
         * .path()
         * .size()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): File =
            File(
                checkRequired("lastModified", lastModified),
                checkRequired("path", path),
                checkRequired("size", size),
                contentType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HelloWorldTestinggggInvalidDataException if any value type in this object doesn't
     *   match its expected type.
     */
    fun validate(): File = apply {
        if (validated) {
            return@apply
        }

        lastModified()
        path()
        size()
        contentType()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HelloWorldTestinggggInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (lastModified.asKnown() == null) 0 else 1) +
            (if (path.asKnown() == null) 0 else 1) +
            (if (size.asKnown() == null) 0 else 1) +
            (if (contentType.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is File &&
            lastModified == other.lastModified &&
            path == other.path &&
            size == other.size &&
            contentType == other.contentType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(lastModified, path, size, contentType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "File{lastModified=$lastModified, path=$path, size=$size, contentType=$contentType, additionalProperties=$additionalProperties}"
}
