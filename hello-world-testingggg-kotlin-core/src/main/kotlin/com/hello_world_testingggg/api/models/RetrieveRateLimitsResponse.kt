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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class RetrieveRateLimitsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val remaining: JsonField<Int>,
    private val resetAt: JsonField<OffsetDateTime>,
    private val tiers: JsonField<List<Tier>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("remaining") @ExcludeMissing remaining: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("resetAt")
        @ExcludeMissing
        resetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
    ) : this(remaining, resetAt, tiers, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remaining(): Int = remaining.getRequired("remaining")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resetAt(): OffsetDateTime = resetAt.getRequired("resetAt")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun tiers(): List<Tier>? = tiers.getNullable("tiers")

    /**
     * Returns the raw JSON value of [remaining].
     *
     * Unlike [remaining], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remaining") @ExcludeMissing fun _remaining(): JsonField<Int> = remaining

    /**
     * Returns the raw JSON value of [resetAt].
     *
     * Unlike [resetAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resetAt") @ExcludeMissing fun _resetAt(): JsonField<OffsetDateTime> = resetAt

    /**
     * Returns the raw JSON value of [tiers].
     *
     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
         * Returns a mutable builder for constructing an instance of [RetrieveRateLimitsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .remaining()
         * .resetAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RetrieveRateLimitsResponse]. */
    class Builder internal constructor() {

        private var remaining: JsonField<Int>? = null
        private var resetAt: JsonField<OffsetDateTime>? = null
        private var tiers: JsonField<MutableList<Tier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(retrieveRateLimitsResponse: RetrieveRateLimitsResponse) = apply {
            remaining = retrieveRateLimitsResponse.remaining
            resetAt = retrieveRateLimitsResponse.resetAt
            tiers = retrieveRateLimitsResponse.tiers.map { it.toMutableList() }
            additionalProperties = retrieveRateLimitsResponse.additionalProperties.toMutableMap()
        }

        fun remaining(remaining: Int) = remaining(JsonField.of(remaining))

        /**
         * Sets [Builder.remaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remaining] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remaining(remaining: JsonField<Int>) = apply { this.remaining = remaining }

        fun resetAt(resetAt: OffsetDateTime) = resetAt(JsonField.of(resetAt))

        /**
         * Sets [Builder.resetAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resetAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resetAt(resetAt: JsonField<OffsetDateTime>) = apply { this.resetAt = resetAt }

        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /**
         * Sets [Builder.tiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Tier] to [tiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTier(tier: Tier) = apply {
            tiers =
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
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
         * Returns an immutable instance of [RetrieveRateLimitsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .remaining()
         * .resetAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetrieveRateLimitsResponse =
            RetrieveRateLimitsResponse(
                checkRequired("remaining", remaining),
                checkRequired("resetAt", resetAt),
                (tiers ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RetrieveRateLimitsResponse = apply {
        if (validated) {
            return@apply
        }

        remaining()
        resetAt()
        tiers()?.forEach { it.validate() }
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
        (if (remaining.asKnown() == null) 0 else 1) +
            (if (resetAt.asKnown() == null) 0 else 1) +
            (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Tier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val quota: JsonField<Quota>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quota") @ExcludeMissing quota: JsonField<Quota> = JsonMissing.of(),
        ) : this(name, quota, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun quota(): Quota? = quota.getNullable("quota")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [quota].
         *
         * Unlike [quota], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quota") @ExcludeMissing fun _quota(): JsonField<Quota> = quota

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
             * Returns a mutable builder for constructing an instance of [Tier].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var quota: JsonField<Quota> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tier: Tier) = apply {
                name = tier.name
                quota = tier.quota
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun quota(quota: Quota) = quota(JsonField.of(quota))

            /**
             * Sets [Builder.quota] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quota] with a well-typed [Quota] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun quota(quota: JsonField<Quota>) = apply { this.quota = quota }

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
             * Returns an immutable instance of [Tier].
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
            fun build(): Tier =
                Tier(checkRequired("name", name), quota, additionalProperties.toMutableMap())
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
        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            name()
            quota()?.validate()
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
        internal fun validity(): Int =
            (if (name.asKnown() == null) 0 else 1) + (quota.asKnown()?.validity() ?: 0)

        class Quota
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val requests: JsonField<Int>,
            private val window: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("requests")
                @ExcludeMissing
                requests: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("window") @ExcludeMissing window: JsonField<String> = JsonMissing.of(),
            ) : this(requests, window, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun requests(): Int? = requests.getNullable("requests")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun window(): String? = window.getNullable("window")

            /**
             * Returns the raw JSON value of [requests].
             *
             * Unlike [requests], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requests") @ExcludeMissing fun _requests(): JsonField<Int> = requests

            /**
             * Returns the raw JSON value of [window].
             *
             * Unlike [window], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("window") @ExcludeMissing fun _window(): JsonField<String> = window

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

                /** Returns a mutable builder for constructing an instance of [Quota]. */
                fun builder() = Builder()
            }

            /** A builder for [Quota]. */
            class Builder internal constructor() {

                private var requests: JsonField<Int> = JsonMissing.of()
                private var window: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(quota: Quota) = apply {
                    requests = quota.requests
                    window = quota.window
                    additionalProperties = quota.additionalProperties.toMutableMap()
                }

                fun requests(requests: Int) = requests(JsonField.of(requests))

                /**
                 * Sets [Builder.requests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requests] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun requests(requests: JsonField<Int>) = apply { this.requests = requests }

                fun window(window: String) = window(JsonField.of(window))

                /**
                 * Sets [Builder.window] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.window] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun window(window: JsonField<String>) = apply { this.window = window }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Quota].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Quota = Quota(requests, window, additionalProperties.toMutableMap())
            }

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
            fun validate(): Quota = apply {
                if (validated) {
                    return@apply
                }

                requests()
                window()
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
            internal fun validity(): Int =
                (if (requests.asKnown() == null) 0 else 1) +
                    (if (window.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Quota &&
                    requests == other.requests &&
                    window == other.window &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(requests, window, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Quota{requests=$requests, window=$window, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tier &&
                name == other.name &&
                quota == other.quota &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, quota, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{name=$name, quota=$quota, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieveRateLimitsResponse &&
            remaining == other.remaining &&
            resetAt == other.resetAt &&
            tiers == other.tiers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(remaining, resetAt, tiers, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrieveRateLimitsResponse{remaining=$remaining, resetAt=$resetAt, tiers=$tiers, additionalProperties=$additionalProperties}"
}
