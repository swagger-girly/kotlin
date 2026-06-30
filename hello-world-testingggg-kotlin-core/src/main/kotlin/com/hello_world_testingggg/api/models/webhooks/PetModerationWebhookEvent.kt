// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.pet.Pet
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = PetModerationWebhookEvent.Deserializer::class)
@JsonSerialize(using = PetModerationWebhookEvent.Serializer::class)
class PetModerationWebhookEvent
private constructor(
    private val approved: PetModerationApproved? = null,
    private val rejected: PetModerationRejected? = null,
    private val _json: JsonValue? = null,
) {

    fun approved(): PetModerationApproved? = approved

    fun rejected(): PetModerationRejected? = rejected

    fun isApproved(): Boolean = approved != null

    fun isRejected(): Boolean = rejected != null

    fun asApproved(): PetModerationApproved = approved.getOrThrow("approved")

    fun asRejected(): PetModerationRejected = rejected.getOrThrow("rejected")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.hello_world_testingggg.api.core.JsonValue
     *
     * val result: String? = petModerationWebhookEvent.accept(object : PetModerationWebhookEvent.Visitor<String?> {
     *     override fun visitApproved(approved: PetModerationApproved): String? = approved.toString()
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
     * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            approved != null -> visitor.visitApproved(approved)
            rejected != null -> visitor.visitRejected(rejected)
            else -> visitor.unknown(_json)
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
    fun validate(): PetModerationWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitApproved(approved: PetModerationApproved) {
                    approved.validate()
                }

                override fun visitRejected(rejected: PetModerationRejected) {
                    rejected.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitApproved(approved: PetModerationApproved) = approved.validity()

                override fun visitRejected(rejected: PetModerationRejected) = rejected.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetModerationWebhookEvent &&
            approved == other.approved &&
            rejected == other.rejected
    }

    override fun hashCode(): Int = Objects.hash(approved, rejected)

    override fun toString(): String =
        when {
            approved != null -> "PetModerationWebhookEvent{approved=$approved}"
            rejected != null -> "PetModerationWebhookEvent{rejected=$rejected}"
            _json != null -> "PetModerationWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PetModerationWebhookEvent")
        }

    companion object {

        fun ofApproved(approved: PetModerationApproved) =
            PetModerationWebhookEvent(approved = approved)

        fun ofRejected(rejected: PetModerationRejected) =
            PetModerationWebhookEvent(rejected = rejected)
    }

    /**
     * An interface that defines how to map each variant of [PetModerationWebhookEvent] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitApproved(approved: PetModerationApproved): T

        fun visitRejected(rejected: PetModerationRejected): T

        /**
         * Maps an unknown variant of [PetModerationWebhookEvent] to a value of type [T].
         *
         * An instance of [PetModerationWebhookEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException(
                "Unknown PetModerationWebhookEvent: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<PetModerationWebhookEvent>(PetModerationWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PetModerationWebhookEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "pet.moderation.approved" -> {
                    return tryDeserialize(node, jacksonTypeRef<PetModerationApproved>())?.let {
                        PetModerationWebhookEvent(approved = it, _json = json)
                    } ?: PetModerationWebhookEvent(_json = json)
                }
                "pet.moderation.rejected" -> {
                    return tryDeserialize(node, jacksonTypeRef<PetModerationRejected>())?.let {
                        PetModerationWebhookEvent(rejected = it, _json = json)
                    } ?: PetModerationWebhookEvent(_json = json)
                }
            }

            return PetModerationWebhookEvent(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<PetModerationWebhookEvent>(PetModerationWebhookEvent::class) {

        override fun serialize(
            value: PetModerationWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.approved != null -> generator.writeObject(value.approved)
                value.rejected != null -> generator.writeObject(value.rejected)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PetModerationWebhookEvent")
            }
        }
    }

    class PetModerationApproved
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val pet: JsonField<Pet>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(approvedAt, pet, type, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun pet(): Pet = pet.getRequired("pet")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("pet.moderation.approved")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * Returns the raw JSON value of [pet].
         *
         * Unlike [pet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pet") @ExcludeMissing fun _pet(): JsonField<Pet> = pet

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
             * Returns a mutable builder for constructing an instance of [PetModerationApproved].
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .pet()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PetModerationApproved]. */
        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var pet: JsonField<Pet>? = null
            private var type: JsonValue = JsonValue.from("pet.moderation.approved")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(petModerationApproved: PetModerationApproved) = apply {
                approvedAt = petModerationApproved.approvedAt
                pet = petModerationApproved.pet
                type = petModerationApproved.type
                additionalProperties = petModerationApproved.additionalProperties.toMutableMap()
            }

            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            fun pet(pet: Pet) = pet(JsonField.of(pet))

            /**
             * Sets [Builder.pet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pet] with a well-typed [Pet] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pet(pet: JsonField<Pet>) = apply { this.pet = pet }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("pet.moderation.approved")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             * Returns an immutable instance of [PetModerationApproved].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .pet()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PetModerationApproved =
                PetModerationApproved(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("pet", pet),
                    type,
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
        fun validate(): PetModerationApproved = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            pet().validate()
            _type().let {
                if (it != JsonValue.from("pet.moderation.approved")) {
                    throw HelloWorldTestinggggInvalidDataException(
                        "'type' is invalid, received $it"
                    )
                }
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
            (if (approvedAt.asKnown() == null) 0 else 1) +
                (pet.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("pet.moderation.approved")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PetModerationApproved &&
                approvedAt == other.approvedAt &&
                pet == other.pet &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(approvedAt, pet, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PetModerationApproved{approvedAt=$approvedAt, pet=$pet, type=$type, additionalProperties=$additionalProperties}"
    }

    class PetModerationRejected
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pet: JsonField<Pet>,
        private val reason: JsonField<Reason>,
        private val type: JsonValue,
        private val reviewNotes: JsonField<List<ReviewNote>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("review_notes")
            @ExcludeMissing
            reviewNotes: JsonField<List<ReviewNote>> = JsonMissing.of(),
        ) : this(pet, reason, type, reviewNotes, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun pet(): Pet = pet.getRequired("pet")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("pet.moderation.rejected")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reviewNotes(): List<ReviewNote>? = reviewNotes.getNullable("review_notes")

        /**
         * Returns the raw JSON value of [pet].
         *
         * Unlike [pet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pet") @ExcludeMissing fun _pet(): JsonField<Pet> = pet

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [reviewNotes].
         *
         * Unlike [reviewNotes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("review_notes")
        @ExcludeMissing
        fun _reviewNotes(): JsonField<List<ReviewNote>> = reviewNotes

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
             * Returns a mutable builder for constructing an instance of [PetModerationRejected].
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PetModerationRejected]. */
        class Builder internal constructor() {

            private var pet: JsonField<Pet>? = null
            private var reason: JsonField<Reason>? = null
            private var type: JsonValue = JsonValue.from("pet.moderation.rejected")
            private var reviewNotes: JsonField<MutableList<ReviewNote>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(petModerationRejected: PetModerationRejected) = apply {
                pet = petModerationRejected.pet
                reason = petModerationRejected.reason
                type = petModerationRejected.type
                reviewNotes = petModerationRejected.reviewNotes.map { it.toMutableList() }
                additionalProperties = petModerationRejected.additionalProperties.toMutableMap()
            }

            fun pet(pet: Pet) = pet(JsonField.of(pet))

            /**
             * Sets [Builder.pet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pet] with a well-typed [Pet] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pet(pet: JsonField<Pet>) = apply { this.pet = pet }

            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("pet.moderation.rejected")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun reviewNotes(reviewNotes: List<ReviewNote>) = reviewNotes(JsonField.of(reviewNotes))

            /**
             * Sets [Builder.reviewNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewNotes] with a well-typed `List<ReviewNote>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reviewNotes(reviewNotes: JsonField<List<ReviewNote>>) = apply {
                this.reviewNotes = reviewNotes.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReviewNote] to [reviewNotes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReviewNote(reviewNote: ReviewNote) = apply {
                reviewNotes =
                    (reviewNotes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reviewNotes", it).add(reviewNote)
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
             * Returns an immutable instance of [PetModerationRejected].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PetModerationRejected =
                PetModerationRejected(
                    checkRequired("pet", pet),
                    checkRequired("reason", reason),
                    type,
                    (reviewNotes ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): PetModerationRejected = apply {
            if (validated) {
                return@apply
            }

            pet().validate()
            reason().validate()
            _type().let {
                if (it != JsonValue.from("pet.moderation.rejected")) {
                    throw HelloWorldTestinggggInvalidDataException(
                        "'type' is invalid, received $it"
                    )
                }
            }
            reviewNotes()?.forEach { it.validate() }
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
            (pet.asKnown()?.validity() ?: 0) +
                (reason.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("pet.moderation.rejected")) 1 else 0 } +
                (reviewNotes.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val POLICY_VIOLATION = of("policy_violation")

                val DUPLICATE = of("duplicate")

                val UNSAFE_CONTENT = of("unsafe-content")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                POLICY_VIOLATION,
                DUPLICATE,
                UNSAFE_CONTENT,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                POLICY_VIOLATION,
                DUPLICATE,
                UNSAFE_CONTENT,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    POLICY_VIOLATION -> Value.POLICY_VIOLATION
                    DUPLICATE -> Value.DUPLICATE
                    UNSAFE_CONTENT -> Value.UNSAFE_CONTENT
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
                    POLICY_VIOLATION -> Known.POLICY_VIOLATION
                    DUPLICATE -> Known.DUPLICATE
                    UNSAFE_CONTENT -> Known.UNSAFE_CONTENT
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Reason: $value")
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
            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ReviewNote
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val message: JsonField<String>,
            private val reviewer: JsonField<Reviewer>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reviewer")
                @ExcludeMissing
                reviewer: JsonField<Reviewer> = JsonMissing.of(),
            ) : this(message, reviewer, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reviewer(): Reviewer? = reviewer.getNullable("reviewer")

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [reviewer].
             *
             * Unlike [reviewer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reviewer")
            @ExcludeMissing
            fun _reviewer(): JsonField<Reviewer> = reviewer

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
                 * Returns a mutable builder for constructing an instance of [ReviewNote].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .message()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ReviewNote]. */
            class Builder internal constructor() {

                private var message: JsonField<String>? = null
                private var reviewer: JsonField<Reviewer> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(reviewNote: ReviewNote) = apply {
                    message = reviewNote.message
                    reviewer = reviewNote.reviewer
                    additionalProperties = reviewNote.additionalProperties.toMutableMap()
                }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun reviewer(reviewer: Reviewer) = reviewer(JsonField.of(reviewer))

                /**
                 * Sets [Builder.reviewer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reviewer] with a well-typed [Reviewer] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reviewer(reviewer: JsonField<Reviewer>) = apply { this.reviewer = reviewer }

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
                 * Returns an immutable instance of [ReviewNote].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReviewNote =
                    ReviewNote(
                        checkRequired("message", message),
                        reviewer,
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
            fun validate(): ReviewNote = apply {
                if (validated) {
                    return@apply
                }

                message()
                reviewer()?.validate()
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
                (if (message.asKnown() == null) 0 else 1) + (reviewer.asKnown()?.validity() ?: 0)

            class Reviewer
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<Long>,
                private val email: JsonField<String>,
                private val firstName: JsonField<String>,
                private val lastName: JsonField<String>,
                private val password: JsonField<String>,
                private val phone: JsonField<String>,
                private val username: JsonField<String>,
                private val userStatus: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("firstName")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lastName")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("password")
                    @ExcludeMissing
                    password: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone")
                    @ExcludeMissing
                    phone: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("username")
                    @ExcludeMissing
                    username: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("userStatus")
                    @ExcludeMissing
                    userStatus: JsonField<Int> = JsonMissing.of(),
                ) : this(
                    id,
                    email,
                    firstName,
                    lastName,
                    password,
                    phone,
                    username,
                    userStatus,
                    mutableMapOf(),
                )

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Long? = id.getNullable("id")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun firstName(): String? = firstName.getNullable("firstName")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun lastName(): String? = lastName.getNullable("lastName")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun password(): String? = password.getNullable("password")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun phone(): String? = phone.getNullable("phone")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun username(): String? = username.getNullable("username")

                /**
                 * User Status
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun userStatus(): Int? = userStatus.getNullable("userStatus")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("firstName")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("lastName")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [password].
                 *
                 * Unlike [password], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("password")
                @ExcludeMissing
                fun _password(): JsonField<String> = password

                /**
                 * Returns the raw JSON value of [phone].
                 *
                 * Unlike [phone], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

                /**
                 * Returns the raw JSON value of [username].
                 *
                 * Unlike [username], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("username")
                @ExcludeMissing
                fun _username(): JsonField<String> = username

                /**
                 * Returns the raw JSON value of [userStatus].
                 *
                 * Unlike [userStatus], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("userStatus")
                @ExcludeMissing
                fun _userStatus(): JsonField<Int> = userStatus

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

                    /** Returns a mutable builder for constructing an instance of [Reviewer]. */
                    fun builder() = Builder()
                }

                /** A builder for [Reviewer]. */
                class Builder internal constructor() {

                    private var id: JsonField<Long> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var password: JsonField<String> = JsonMissing.of()
                    private var phone: JsonField<String> = JsonMissing.of()
                    private var username: JsonField<String> = JsonMissing.of()
                    private var userStatus: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(reviewer: Reviewer) = apply {
                        id = reviewer.id
                        email = reviewer.email
                        firstName = reviewer.firstName
                        lastName = reviewer.lastName
                        password = reviewer.password
                        phone = reviewer.phone
                        username = reviewer.username
                        userStatus = reviewer.userStatus
                        additionalProperties = reviewer.additionalProperties.toMutableMap()
                    }

                    fun id(id: Long) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun id(id: JsonField<Long>) = apply { this.id = id }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    fun password(password: String) = password(JsonField.of(password))

                    /**
                     * Sets [Builder.password] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.password] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun password(password: JsonField<String>) = apply { this.password = password }

                    fun phone(phone: String) = phone(JsonField.of(phone))

                    /**
                     * Sets [Builder.phone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phone] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                    fun username(username: String) = username(JsonField.of(username))

                    /**
                     * Sets [Builder.username] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.username] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun username(username: JsonField<String>) = apply { this.username = username }

                    /** User Status */
                    fun userStatus(userStatus: Int) = userStatus(JsonField.of(userStatus))

                    /**
                     * Sets [Builder.userStatus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userStatus] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun userStatus(userStatus: JsonField<Int>) = apply {
                        this.userStatus = userStatus
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
                     * Returns an immutable instance of [Reviewer].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Reviewer =
                        Reviewer(
                            id,
                            email,
                            firstName,
                            lastName,
                            password,
                            phone,
                            username,
                            userStatus,
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
                fun validate(): Reviewer = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    email()
                    firstName()
                    lastName()
                    password()
                    phone()
                    username()
                    userStatus()
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
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (firstName.asKnown() == null) 0 else 1) +
                        (if (lastName.asKnown() == null) 0 else 1) +
                        (if (password.asKnown() == null) 0 else 1) +
                        (if (phone.asKnown() == null) 0 else 1) +
                        (if (username.asKnown() == null) 0 else 1) +
                        (if (userStatus.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reviewer &&
                        id == other.id &&
                        email == other.email &&
                        firstName == other.firstName &&
                        lastName == other.lastName &&
                        password == other.password &&
                        phone == other.phone &&
                        username == other.username &&
                        userStatus == other.userStatus &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        email,
                        firstName,
                        lastName,
                        password,
                        phone,
                        username,
                        userStatus,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Reviewer{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, username=$username, userStatus=$userStatus, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReviewNote &&
                    message == other.message &&
                    reviewer == other.reviewer &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(message, reviewer, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReviewNote{message=$message, reviewer=$reviewer, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PetModerationRejected &&
                pet == other.pet &&
                reason == other.reason &&
                type == other.type &&
                reviewNotes == other.reviewNotes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pet, reason, type, reviewNotes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PetModerationRejected{pet=$pet, reason=$reason, type=$type, reviewNotes=$reviewNotes, additionalProperties=$additionalProperties}"
    }
}
