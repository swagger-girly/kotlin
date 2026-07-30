// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.BaseDeserializer
import com.hello_world_testingggg.api.core.BaseSerializer
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Updates either public profile details or archival state. */
class ProfileUpdateParams
private constructor(
    private val profileId: String?,
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun profileId(): String? = profileId

    fun idempotencyKey(): String? = idempotencyKey

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProfileUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProfileUpdateParams]. */
    class Builder internal constructor() {

        private var profileId: String? = null
        private var idempotencyKey: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(profileUpdateParams: ProfileUpdateParams) = apply {
            profileId = profileUpdateParams.profileId
            idempotencyKey = profileUpdateParams.idempotencyKey
            body = profileUpdateParams.body
            additionalHeaders = profileUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = profileUpdateParams.additionalQueryParams.toBuilder()
        }

        fun profileId(profileId: String?) = apply { this.profileId = profileId }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofProfileDetailsUpdate(profileDetailsUpdate)`. */
        fun body(profileDetailsUpdate: Body.ProfileDetailsUpdate) =
            body(Body.ofProfileDetailsUpdate(profileDetailsUpdate))

        /** Alias for calling [body] with `Body.ofProfileArchiveUpdate(profileArchiveUpdate)`. */
        fun body(profileArchiveUpdate: Body.ProfileArchiveUpdate) =
            body(Body.ofProfileArchiveUpdate(profileArchiveUpdate))

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
         * Returns an immutable instance of [ProfileUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileUpdateParams =
            ProfileUpdateParams(
                profileId,
                idempotencyKey,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> profileId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val profileDetailsUpdate: ProfileDetailsUpdate? = null,
        private val profileArchiveUpdate: ProfileArchiveUpdate? = null,
        private val _json: JsonValue? = null,
    ) {

        fun profileDetailsUpdate(): ProfileDetailsUpdate? = profileDetailsUpdate

        fun profileArchiveUpdate(): ProfileArchiveUpdate? = profileArchiveUpdate

        fun isProfileDetailsUpdate(): Boolean = profileDetailsUpdate != null

        fun isProfileArchiveUpdate(): Boolean = profileArchiveUpdate != null

        fun asProfileDetailsUpdate(): ProfileDetailsUpdate =
            profileDetailsUpdate.getOrThrow("profileDetailsUpdate")

        fun asProfileArchiveUpdate(): ProfileArchiveUpdate =
            profileArchiveUpdate.getOrThrow("profileArchiveUpdate")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.hello_world_testingggg.api.core.JsonValue
         *
         * val result: String? = body.accept(object : Body.Visitor<String?> {
         *     override fun visitProfileDetailsUpdate(profileDetailsUpdate: ProfileDetailsUpdate): String? = profileDetailsUpdate.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not overridden
         *   in [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                profileDetailsUpdate != null ->
                    visitor.visitProfileDetailsUpdate(profileDetailsUpdate)
                profileArchiveUpdate != null ->
                    visitor.visitProfileArchiveUpdate(profileArchiveUpdate)
                else -> visitor.unknown(_json)
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

            accept(
                object : Visitor<Unit> {
                    override fun visitProfileDetailsUpdate(
                        profileDetailsUpdate: ProfileDetailsUpdate
                    ) {
                        profileDetailsUpdate.validate()
                    }

                    override fun visitProfileArchiveUpdate(
                        profileArchiveUpdate: ProfileArchiveUpdate
                    ) {
                        profileArchiveUpdate.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitProfileDetailsUpdate(
                        profileDetailsUpdate: ProfileDetailsUpdate
                    ) = profileDetailsUpdate.validity()

                    override fun visitProfileArchiveUpdate(
                        profileArchiveUpdate: ProfileArchiveUpdate
                    ) = profileArchiveUpdate.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                profileDetailsUpdate == other.profileDetailsUpdate &&
                profileArchiveUpdate == other.profileArchiveUpdate
        }

        override fun hashCode(): Int = Objects.hash(profileDetailsUpdate, profileArchiveUpdate)

        override fun toString(): String =
            when {
                profileDetailsUpdate != null -> "Body{profileDetailsUpdate=$profileDetailsUpdate}"
                profileArchiveUpdate != null -> "Body{profileArchiveUpdate=$profileArchiveUpdate}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofProfileDetailsUpdate(profileDetailsUpdate: ProfileDetailsUpdate) =
                Body(profileDetailsUpdate = profileDetailsUpdate)

            fun ofProfileArchiveUpdate(profileArchiveUpdate: ProfileArchiveUpdate) =
                Body(profileArchiveUpdate = profileArchiveUpdate)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitProfileDetailsUpdate(profileDetailsUpdate: ProfileDetailsUpdate): T

            fun visitProfileArchiveUpdate(profileArchiveUpdate: ProfileArchiveUpdate): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ProfileDetailsUpdate>())?.let {
                                Body(profileDetailsUpdate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProfileArchiveUpdate>())?.let {
                                Body(profileArchiveUpdate = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.profileDetailsUpdate != null ->
                        generator.writeObject(value.profileDetailsUpdate)
                    value.profileArchiveUpdate != null ->
                        generator.writeObject(value.profileArchiveUpdate)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class ProfileDetailsUpdate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val displayName: JsonField<String>,
            private val email: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val preferences: JsonField<ProfilePreferences>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("displayName")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("preferences")
                @ExcludeMissing
                preferences: JsonField<ProfilePreferences> = JsonMissing.of(),
            ) : this(displayName, email, metadata, preferences, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun displayName(): String? = displayName.getNullable("displayName")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun preferences(): ProfilePreferences? = preferences.getNullable("preferences")

            /**
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("displayName")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [preferences].
             *
             * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("preferences")
            @ExcludeMissing
            fun _preferences(): JsonField<ProfilePreferences> = preferences

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
                 * Returns a mutable builder for constructing an instance of [ProfileDetailsUpdate].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ProfileDetailsUpdate]. */
            class Builder internal constructor() {

                private var displayName: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var preferences: JsonField<ProfilePreferences> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(profileDetailsUpdate: ProfileDetailsUpdate) = apply {
                    displayName = profileDetailsUpdate.displayName
                    email = profileDetailsUpdate.email
                    metadata = profileDetailsUpdate.metadata
                    preferences = profileDetailsUpdate.preferences
                    additionalProperties = profileDetailsUpdate.additionalProperties.toMutableMap()
                }

                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
                }

                fun email(email: String?) = email(JsonField.ofNullable(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun preferences(preferences: ProfilePreferences) =
                    preferences(JsonField.of(preferences))

                /**
                 * Sets [Builder.preferences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preferences] with a well-typed
                 * [ProfilePreferences] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun preferences(preferences: JsonField<ProfilePreferences>) = apply {
                    this.preferences = preferences
                }

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
                 * Returns an immutable instance of [ProfileDetailsUpdate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProfileDetailsUpdate =
                    ProfileDetailsUpdate(
                        displayName,
                        email,
                        metadata,
                        preferences,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): ProfileDetailsUpdate = apply {
                if (validated) {
                    return@apply
                }

                displayName()
                email()
                metadata()?.validate()
                preferences()?.validate()
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
                (if (displayName.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (preferences.asKnown()?.validity() ?: 0)

            class Metadata
            @JsonCreator
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
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

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
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

            class ProfilePreferences
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val alerts: JsonField<Alerts>,
                private val newsletter: JsonField<Boolean>,
                private val scoreByRegion: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("alerts")
                    @ExcludeMissing
                    alerts: JsonField<Alerts> = JsonMissing.of(),
                    @JsonProperty("newsletter")
                    @ExcludeMissing
                    newsletter: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("scoreByRegion")
                    @ExcludeMissing
                    scoreByRegion: JsonValue = JsonMissing.of(),
                ) : this(alerts, newsletter, scoreByRegion, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun alerts(): Alerts? = alerts.getNullable("alerts")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun newsletter(): Boolean? = newsletter.getNullable("newsletter")

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = profilePreferences.scoreByRegion().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("scoreByRegion")
                @ExcludeMissing
                fun _scoreByRegion(): JsonValue = scoreByRegion

                /**
                 * Returns the raw JSON value of [alerts].
                 *
                 * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("alerts") @ExcludeMissing fun _alerts(): JsonField<Alerts> = alerts

                /**
                 * Returns the raw JSON value of [newsletter].
                 *
                 * Unlike [newsletter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("newsletter")
                @ExcludeMissing
                fun _newsletter(): JsonField<Boolean> = newsletter

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
                     * Returns a mutable builder for constructing an instance of
                     * [ProfilePreferences].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ProfilePreferences]. */
                class Builder internal constructor() {

                    private var alerts: JsonField<Alerts> = JsonMissing.of()
                    private var newsletter: JsonField<Boolean> = JsonMissing.of()
                    private var scoreByRegion: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(profilePreferences: ProfilePreferences) = apply {
                        alerts = profilePreferences.alerts
                        newsletter = profilePreferences.newsletter
                        scoreByRegion = profilePreferences.scoreByRegion
                        additionalProperties =
                            profilePreferences.additionalProperties.toMutableMap()
                    }

                    fun alerts(alerts: Alerts) = alerts(JsonField.of(alerts))

                    /**
                     * Sets [Builder.alerts] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.alerts] with a well-typed [Alerts] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun alerts(alerts: JsonField<Alerts>) = apply { this.alerts = alerts }

                    fun newsletter(newsletter: Boolean) = newsletter(JsonField.of(newsletter))

                    /**
                     * Sets [Builder.newsletter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.newsletter] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun newsletter(newsletter: JsonField<Boolean>) = apply {
                        this.newsletter = newsletter
                    }

                    fun scoreByRegion(scoreByRegion: JsonValue) = apply {
                        this.scoreByRegion = scoreByRegion
                    }

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
                     * Returns an immutable instance of [ProfilePreferences].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ProfilePreferences =
                        ProfilePreferences(
                            alerts,
                            newsletter,
                            scoreByRegion,
                            additionalProperties.toMutableMap(),
                        )
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
                fun validate(): ProfilePreferences = apply {
                    if (validated) {
                        return@apply
                    }

                    alerts()?.validate()
                    newsletter()
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
                    (alerts.asKnown()?.validity() ?: 0) +
                        (if (newsletter.asKnown() == null) 0 else 1)

                class Alerts
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Alerts]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Alerts]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(alerts: Alerts) = apply {
                            additionalProperties = alerts.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Alerts].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Alerts = Alerts(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HelloWorldTestinggggInvalidDataException if any value type in this
                     *   object doesn't match its expected type.
                     */
                    fun validate(): Alerts = apply {
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

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Alerts && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Alerts{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ProfilePreferences &&
                        alerts == other.alerts &&
                        newsletter == other.newsletter &&
                        scoreByRegion == other.scoreByRegion &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(alerts, newsletter, scoreByRegion, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ProfilePreferences{alerts=$alerts, newsletter=$newsletter, scoreByRegion=$scoreByRegion, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProfileDetailsUpdate &&
                    displayName == other.displayName &&
                    email == other.email &&
                    metadata == other.metadata &&
                    preferences == other.preferences &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(displayName, email, metadata, preferences, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProfileDetailsUpdate{displayName=$displayName, email=$email, metadata=$metadata, preferences=$preferences, additionalProperties=$additionalProperties}"
        }

        class ProfileArchiveUpdate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val archivedAt: JsonField<OffsetDateTime>,
            private val archivedReason: JsonField<ArchivedReason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("archivedAt")
                @ExcludeMissing
                archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("archivedReason")
                @ExcludeMissing
                archivedReason: JsonField<ArchivedReason> = JsonMissing.of(),
            ) : this(archivedAt, archivedReason, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun archivedAt(): OffsetDateTime = archivedAt.getRequired("archivedAt")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun archivedReason(): ArchivedReason = archivedReason.getRequired("archivedReason")

            /**
             * Returns the raw JSON value of [archivedAt].
             *
             * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("archivedAt")
            @ExcludeMissing
            fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

            /**
             * Returns the raw JSON value of [archivedReason].
             *
             * Unlike [archivedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("archivedReason")
            @ExcludeMissing
            fun _archivedReason(): JsonField<ArchivedReason> = archivedReason

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
                 * Returns a mutable builder for constructing an instance of [ProfileArchiveUpdate].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .archivedAt()
                 * .archivedReason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ProfileArchiveUpdate]. */
            class Builder internal constructor() {

                private var archivedAt: JsonField<OffsetDateTime>? = null
                private var archivedReason: JsonField<ArchivedReason>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(profileArchiveUpdate: ProfileArchiveUpdate) = apply {
                    archivedAt = profileArchiveUpdate.archivedAt
                    archivedReason = profileArchiveUpdate.archivedReason
                    additionalProperties = profileArchiveUpdate.additionalProperties.toMutableMap()
                }

                fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

                /**
                 * Sets [Builder.archivedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                    this.archivedAt = archivedAt
                }

                fun archivedReason(archivedReason: ArchivedReason) =
                    archivedReason(JsonField.of(archivedReason))

                /**
                 * Sets [Builder.archivedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.archivedReason] with a well-typed
                 * [ArchivedReason] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun archivedReason(archivedReason: JsonField<ArchivedReason>) = apply {
                    this.archivedReason = archivedReason
                }

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
                 * Returns an immutable instance of [ProfileArchiveUpdate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .archivedAt()
                 * .archivedReason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProfileArchiveUpdate =
                    ProfileArchiveUpdate(
                        checkRequired("archivedAt", archivedAt),
                        checkRequired("archivedReason", archivedReason),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): ProfileArchiveUpdate = apply {
                if (validated) {
                    return@apply
                }

                archivedAt()
                archivedReason().validate()
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
                (if (archivedAt.asKnown() == null) 0 else 1) +
                    (archivedReason.asKnown()?.validity() ?: 0)

            class ArchivedReason
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DUPLICATE = of("duplicate")

                    val REQUESTED = of("requested")

                    val POLICY_VIOLATION = of("policy_violation")

                    fun of(value: String) = ArchivedReason(JsonField.of(value))
                }

                /** An enum containing [ArchivedReason]'s known values. */
                enum class Known {
                    DUPLICATE,
                    REQUESTED,
                    POLICY_VIOLATION,
                }

                /**
                 * An enum containing [ArchivedReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ArchivedReason] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DUPLICATE,
                    REQUESTED,
                    POLICY_VIOLATION,
                    /**
                     * An enum member indicating that [ArchivedReason] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DUPLICATE -> Value.DUPLICATE
                        REQUESTED -> Value.REQUESTED
                        POLICY_VIOLATION -> Value.POLICY_VIOLATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   is a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        DUPLICATE -> Known.DUPLICATE
                        REQUESTED -> Known.REQUESTED
                        POLICY_VIOLATION -> Known.POLICY_VIOLATION
                        else ->
                            throw HelloWorldTestinggggInvalidDataException(
                                "Unknown ArchivedReason: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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
                fun validate(): ArchivedReason = apply {
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

                    return other is ArchivedReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProfileArchiveUpdate &&
                    archivedAt == other.archivedAt &&
                    archivedReason == other.archivedReason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(archivedAt, archivedReason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProfileArchiveUpdate{archivedAt=$archivedAt, archivedReason=$archivedReason, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileUpdateParams &&
            profileId == other.profileId &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(profileId, idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProfileUpdateParams{profileId=$profileId, idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
