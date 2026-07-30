// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Objects

/**
 * Typed query-parameter probe matrix: an object-schema query param mints a typed params model, an
 * array-of-object query param mints a singularized element type, an empty object
 * (additionalProperties:false) stays a bare object, and a scalar stays scalar. Isolates the emitter
 * query-parameter type-resolution branches so object/array-of-object/empty-object params are each
 * exercised.
 */
class PetSearchParams
private constructor(
    private val filters: Filters?,
    private val maxResults: Int?,
    private val rawFilter: JsonValue?,
    private val tagFilters: List<TagFilter>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Object-schema query parameter: mints a typed params model instead of collapsing to a bare
     * object.
     */
    fun filters(): Filters? = filters

    /** Scalar query parameter: stays a plain scalar (control probe). */
    fun maxResults(): Int? = maxResults

    /**
     * Empty-object query parameter (additionalProperties:false): stays a bare object, exercising
     * the empty-object branch.
     */
    fun rawFilter(): JsonValue? = rawFilter

    /** Array-of-object query parameter: emitters mint a singularized element type for each item. */
    fun tagFilters(): List<TagFilter>? = tagFilters

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PetSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PetSearchParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PetSearchParams]. */
    class Builder internal constructor() {

        private var filters: Filters? = null
        private var maxResults: Int? = null
        private var rawFilter: JsonValue? = null
        private var tagFilters: MutableList<TagFilter>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(petSearchParams: PetSearchParams) = apply {
            filters = petSearchParams.filters
            maxResults = petSearchParams.maxResults
            rawFilter = petSearchParams.rawFilter
            tagFilters = petSearchParams.tagFilters?.toMutableList()
            additionalHeaders = petSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = petSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Object-schema query parameter: mints a typed params model instead of collapsing to a bare
         * object.
         */
        fun filters(filters: Filters?) = apply { this.filters = filters }

        /** Scalar query parameter: stays a plain scalar (control probe). */
        fun maxResults(maxResults: Int?) = apply { this.maxResults = maxResults }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Int) = maxResults(maxResults as Int?)

        /**
         * Empty-object query parameter (additionalProperties:false): stays a bare object,
         * exercising the empty-object branch.
         */
        fun rawFilter(rawFilter: JsonValue?) = apply { this.rawFilter = rawFilter }

        /**
         * Array-of-object query parameter: emitters mint a singularized element type for each item.
         */
        fun tagFilters(tagFilters: List<TagFilter>?) = apply {
            this.tagFilters = tagFilters?.toMutableList()
        }

        /**
         * Adds a single [TagFilter] to [tagFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagFilter(tagFilter: TagFilter) = apply {
            tagFilters = (tagFilters ?: mutableListOf()).apply { add(tagFilter) }
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
         * Returns an immutable instance of [PetSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PetSearchParams =
            PetSearchParams(
                filters,
                maxResults,
                rawFilter,
                tagFilters?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filters?.let {
                    it.color()?.let { put("filters[color]", it) }
                    it.size()?.let { put("filters[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filters[$key]", value)
                        }
                    }
                }
                maxResults?.let { put("max_results", it.toString()) }
                tagFilters?.let { put("tag_filters", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Object-schema query parameter: mints a typed params model instead of collapsing to a bare
     * object.
     */
    class Filters
    private constructor(
        private val color: String?,
        private val size: Int?,
        private val additionalProperties: QueryParams,
    ) {

        fun color(): String? = color

        fun size(): Int? = size

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var color: String? = null
            private var size: Int? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(filters: Filters) = apply {
                color = filters.color
                size = filters.size
                additionalProperties = filters.additionalProperties.toBuilder()
            }

            fun color(color: String?) = apply { this.color = color }

            fun size(size: Int?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Int) = size(size as Int?)

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters = Filters(color, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters &&
                color == other.color &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(color, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filters{color=$color, size=$size, additionalProperties=$additionalProperties}"
    }

    class TagFilter
    private constructor(
        private val key: String?,
        private val match: Match?,
        private val additionalProperties: QueryParams,
    ) {

        fun key(): String? = key

        fun match(): Match? = match

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [TagFilter]. */
            fun builder() = Builder()
        }

        /** A builder for [TagFilter]. */
        class Builder internal constructor() {

            private var key: String? = null
            private var match: Match? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(tagFilter: TagFilter) = apply {
                key = tagFilter.key
                match = tagFilter.match
                additionalProperties = tagFilter.additionalProperties.toBuilder()
            }

            fun key(key: String?) = apply { this.key = key }

            fun match(match: Match?) = apply { this.match = match }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [TagFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TagFilter = TagFilter(key, match, additionalProperties.build())
        }

        class Match @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EXACT = of("exact")

                val PREFIX = of("prefix")

                fun of(value: String) = Match(JsonField.of(value))
            }

            /** An enum containing [Match]'s known values. */
            enum class Known {
                EXACT,
                PREFIX,
            }

            /**
             * An enum containing [Match]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Match] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXACT,
                PREFIX,
                /**
                 * An enum member indicating that [Match] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EXACT -> Value.EXACT
                    PREFIX -> Value.PREFIX
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HelloWorldTestinggggInvalidDataException if this class instance's value is a
             *   not a known member.
             */
            fun known(): Known =
                when (this) {
                    EXACT -> Known.EXACT
                    PREFIX -> Known.PREFIX
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Match: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HelloWorldTestinggggInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw HelloWorldTestinggggInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Match = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Match && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TagFilter &&
                key == other.key &&
                match == other.match &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(key, match, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TagFilter{key=$key, match=$match, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetSearchParams &&
            filters == other.filters &&
            maxResults == other.maxResults &&
            rawFilter == other.rawFilter &&
            tagFilters == other.tagFilters &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filters,
            maxResults,
            rawFilter,
            tagFilters,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PetSearchParams{filters=$filters, maxResults=$maxResults, rawFilter=$rawFilter, tagFilters=$tagFilters, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
