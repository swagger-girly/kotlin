// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions

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
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** The decision for an application; the shape depends on the outcome. */
@JsonDeserialize(using = AdoptionRetrieveDecisionResponse.Deserializer::class)
@JsonSerialize(using = AdoptionRetrieveDecisionResponse.Serializer::class)
class AdoptionRetrieveDecisionResponse
private constructor(
    private val decisionApproved: DecisionApproved? = null,
    private val decisionRejected: DecisionRejected? = null,
    private val decisionEscalated: DecisionEscalated? = null,
    private val _json: JsonValue? = null,
) {

    fun decisionApproved(): DecisionApproved? = decisionApproved

    fun decisionRejected(): DecisionRejected? = decisionRejected

    fun decisionEscalated(): DecisionEscalated? = decisionEscalated

    fun isDecisionApproved(): Boolean = decisionApproved != null

    fun isDecisionRejected(): Boolean = decisionRejected != null

    fun isDecisionEscalated(): Boolean = decisionEscalated != null

    fun asDecisionApproved(): DecisionApproved = decisionApproved.getOrThrow("decisionApproved")

    fun asDecisionRejected(): DecisionRejected = decisionRejected.getOrThrow("decisionRejected")

    fun asDecisionEscalated(): DecisionEscalated = decisionEscalated.getOrThrow("decisionEscalated")

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
     * val result: String? = adoptionRetrieveDecisionResponse.accept(object : AdoptionRetrieveDecisionResponse.Visitor<String?> {
     *     override fun visitDecisionApproved(decisionApproved: DecisionApproved): String? = decisionApproved.toString()
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
            decisionApproved != null -> visitor.visitDecisionApproved(decisionApproved)
            decisionRejected != null -> visitor.visitDecisionRejected(decisionRejected)
            decisionEscalated != null -> visitor.visitDecisionEscalated(decisionEscalated)
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
    fun validate(): AdoptionRetrieveDecisionResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDecisionApproved(decisionApproved: DecisionApproved) {
                    decisionApproved.validate()
                }

                override fun visitDecisionRejected(decisionRejected: DecisionRejected) {
                    decisionRejected.validate()
                }

                override fun visitDecisionEscalated(decisionEscalated: DecisionEscalated) {
                    decisionEscalated.validate()
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
                override fun visitDecisionApproved(decisionApproved: DecisionApproved) =
                    decisionApproved.validity()

                override fun visitDecisionRejected(decisionRejected: DecisionRejected) =
                    decisionRejected.validity()

                override fun visitDecisionEscalated(decisionEscalated: DecisionEscalated) =
                    decisionEscalated.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdoptionRetrieveDecisionResponse &&
            decisionApproved == other.decisionApproved &&
            decisionRejected == other.decisionRejected &&
            decisionEscalated == other.decisionEscalated
    }

    override fun hashCode(): Int =
        Objects.hash(decisionApproved, decisionRejected, decisionEscalated)

    override fun toString(): String =
        when {
            decisionApproved != null ->
                "AdoptionRetrieveDecisionResponse{decisionApproved=$decisionApproved}"
            decisionRejected != null ->
                "AdoptionRetrieveDecisionResponse{decisionRejected=$decisionRejected}"
            decisionEscalated != null ->
                "AdoptionRetrieveDecisionResponse{decisionEscalated=$decisionEscalated}"
            _json != null -> "AdoptionRetrieveDecisionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AdoptionRetrieveDecisionResponse")
        }

    companion object {

        fun ofDecisionApproved(decisionApproved: DecisionApproved) =
            AdoptionRetrieveDecisionResponse(decisionApproved = decisionApproved)

        fun ofDecisionRejected(decisionRejected: DecisionRejected) =
            AdoptionRetrieveDecisionResponse(decisionRejected = decisionRejected)

        fun ofDecisionEscalated(decisionEscalated: DecisionEscalated) =
            AdoptionRetrieveDecisionResponse(decisionEscalated = decisionEscalated)
    }

    /**
     * An interface that defines how to map each variant of [AdoptionRetrieveDecisionResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitDecisionApproved(decisionApproved: DecisionApproved): T

        fun visitDecisionRejected(decisionRejected: DecisionRejected): T

        fun visitDecisionEscalated(decisionEscalated: DecisionEscalated): T

        /**
         * Maps an unknown variant of [AdoptionRetrieveDecisionResponse] to a value of type [T].
         *
         * An instance of [AdoptionRetrieveDecisionResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException(
                "Unknown AdoptionRetrieveDecisionResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<AdoptionRetrieveDecisionResponse>(
            AdoptionRetrieveDecisionResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): AdoptionRetrieveDecisionResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<DecisionApproved>())?.let {
                            AdoptionRetrieveDecisionResponse(decisionApproved = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DecisionRejected>())?.let {
                            AdoptionRetrieveDecisionResponse(decisionRejected = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DecisionEscalated>())?.let {
                            AdoptionRetrieveDecisionResponse(decisionEscalated = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AdoptionRetrieveDecisionResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<AdoptionRetrieveDecisionResponse>(AdoptionRetrieveDecisionResponse::class) {

        override fun serialize(
            value: AdoptionRetrieveDecisionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.decisionApproved != null -> generator.writeObject(value.decisionApproved)
                value.decisionRejected != null -> generator.writeObject(value.decisionRejected)
                value.decisionEscalated != null -> generator.writeObject(value.decisionEscalated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AdoptionRetrieveDecisionResponse")
            }
        }
    }

    class DecisionApproved
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val outcome: JsonField<Outcome>,
        private val conditions: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approvedAt")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("conditions")
            @ExcludeMissing
            conditions: JsonField<List<String>> = JsonMissing.of(),
        ) : this(approvedAt, outcome, conditions, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approvedAt")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outcome(): Outcome = outcome.getRequired("outcome")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun conditions(): List<String>? = conditions.getNullable("conditions")

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approvedAt")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [conditions].
         *
         * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("conditions")
        @ExcludeMissing
        fun _conditions(): JsonField<List<String>> = conditions

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
             * Returns a mutable builder for constructing an instance of [DecisionApproved].
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .outcome()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DecisionApproved]. */
        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var outcome: JsonField<Outcome>? = null
            private var conditions: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decisionApproved: DecisionApproved) = apply {
                approvedAt = decisionApproved.approvedAt
                outcome = decisionApproved.outcome
                conditions = decisionApproved.conditions.map { it.toMutableList() }
                additionalProperties = decisionApproved.additionalProperties.toMutableMap()
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

            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            fun conditions(conditions: List<String>) = conditions(JsonField.of(conditions))

            /**
             * Sets [Builder.conditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conditions] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conditions(conditions: JsonField<List<String>>) = apply {
                this.conditions = conditions.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [conditions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCondition(condition: String) = apply {
                conditions =
                    (conditions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("conditions", it).add(condition)
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
             * Returns an immutable instance of [DecisionApproved].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .outcome()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DecisionApproved =
                DecisionApproved(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("outcome", outcome),
                    (conditions ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): DecisionApproved = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            outcome().validate()
            conditions()
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
                (outcome.asKnown()?.validity() ?: 0) +
                (conditions.asKnown()?.size ?: 0)

        class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val APPROVED = of("approved")

                fun of(value: String) = Outcome(JsonField.of(value))
            }

            /** An enum containing [Outcome]'s known values. */
            enum class Known {
                APPROVED
            }

            /**
             * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Outcome] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                /**
                 * An enum member indicating that [Outcome] was instantiated with an unknown value.
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
                    APPROVED -> Value.APPROVED
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
                    APPROVED -> Known.APPROVED
                    else ->
                        throw HelloWorldTestinggggInvalidDataException("Unknown Outcome: $value")
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
            fun validate(): Outcome = apply {
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

                return other is Outcome && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DecisionApproved &&
                approvedAt == other.approvedAt &&
                outcome == other.outcome &&
                conditions == other.conditions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(approvedAt, outcome, conditions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DecisionApproved{approvedAt=$approvedAt, outcome=$outcome, conditions=$conditions, additionalProperties=$additionalProperties}"
    }

    class DecisionRejected
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val outcome: JsonField<Outcome>,
        private val reason: JsonField<Reason>,
        private val appealDeadline: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("appealDeadline")
            @ExcludeMissing
            appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(outcome, reason, appealDeadline, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outcome(): Outcome = outcome.getRequired("outcome")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun appealDeadline(): OffsetDateTime? = appealDeadline.getNullable("appealDeadline")

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [appealDeadline].
         *
         * Unlike [appealDeadline], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("appealDeadline")
        @ExcludeMissing
        fun _appealDeadline(): JsonField<OffsetDateTime> = appealDeadline

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
             * Returns a mutable builder for constructing an instance of [DecisionRejected].
             *
             * The following fields are required:
             * ```kotlin
             * .outcome()
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DecisionRejected]. */
        class Builder internal constructor() {

            private var outcome: JsonField<Outcome>? = null
            private var reason: JsonField<Reason>? = null
            private var appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decisionRejected: DecisionRejected) = apply {
                outcome = decisionRejected.outcome
                reason = decisionRejected.reason
                appealDeadline = decisionRejected.appealDeadline
                additionalProperties = decisionRejected.additionalProperties.toMutableMap()
            }

            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun appealDeadline(appealDeadline: OffsetDateTime?) =
                appealDeadline(JsonField.ofNullable(appealDeadline))

            /**
             * Sets [Builder.appealDeadline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appealDeadline] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appealDeadline(appealDeadline: JsonField<OffsetDateTime>) = apply {
                this.appealDeadline = appealDeadline
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
             * Returns an immutable instance of [DecisionRejected].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .outcome()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DecisionRejected =
                DecisionRejected(
                    checkRequired("outcome", outcome),
                    checkRequired("reason", reason),
                    appealDeadline,
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
        fun validate(): DecisionRejected = apply {
            if (validated) {
                return@apply
            }

            outcome().validate()
            reason().validate()
            appealDeadline()
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
            (outcome.asKnown()?.validity() ?: 0) +
                (reason.asKnown()?.validity() ?: 0) +
                (if (appealDeadline.asKnown() == null) 0 else 1)

        class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val REJECTED = of("rejected")

                fun of(value: String) = Outcome(JsonField.of(value))
            }

            /** An enum containing [Outcome]'s known values. */
            enum class Known {
                REJECTED
            }

            /**
             * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Outcome] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REJECTED,
                /**
                 * An enum member indicating that [Outcome] was instantiated with an unknown value.
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
                    REJECTED -> Value.REJECTED
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
                    REJECTED -> Known.REJECTED
                    else ->
                        throw HelloWorldTestinggggInvalidDataException("Unknown Outcome: $value")
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
            fun validate(): Outcome = apply {
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

                return other is Outcome && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                val POLICY = of("policy")

                val CAPACITY = of("capacity")

                val INCOMPLETE = of("incomplete")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                POLICY,
                CAPACITY,
                INCOMPLETE,
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
                POLICY,
                CAPACITY,
                INCOMPLETE,
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
                    POLICY -> Value.POLICY
                    CAPACITY -> Value.CAPACITY
                    INCOMPLETE -> Value.INCOMPLETE
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
                    POLICY -> Known.POLICY
                    CAPACITY -> Known.CAPACITY
                    INCOMPLETE -> Known.INCOMPLETE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DecisionRejected &&
                outcome == other.outcome &&
                reason == other.reason &&
                appealDeadline == other.appealDeadline &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(outcome, reason, appealDeadline, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DecisionRejected{outcome=$outcome, reason=$reason, appealDeadline=$appealDeadline, additionalProperties=$additionalProperties}"
    }

    class DecisionEscalated
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val escalatedTo: JsonField<EscalatedTo>,
        private val outcome: JsonField<Outcome>,
        private val reviewAfter: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("escalatedTo")
            @ExcludeMissing
            escalatedTo: JsonField<EscalatedTo> = JsonMissing.of(),
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("reviewAfter")
            @ExcludeMissing
            reviewAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(escalatedTo, outcome, reviewAfter, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun escalatedTo(): EscalatedTo = escalatedTo.getRequired("escalatedTo")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun outcome(): Outcome = outcome.getRequired("outcome")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reviewAfter(): OffsetDateTime? = reviewAfter.getNullable("reviewAfter")

        /**
         * Returns the raw JSON value of [escalatedTo].
         *
         * Unlike [escalatedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("escalatedTo")
        @ExcludeMissing
        fun _escalatedTo(): JsonField<EscalatedTo> = escalatedTo

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [reviewAfter].
         *
         * Unlike [reviewAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reviewAfter")
        @ExcludeMissing
        fun _reviewAfter(): JsonField<OffsetDateTime> = reviewAfter

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
             * Returns a mutable builder for constructing an instance of [DecisionEscalated].
             *
             * The following fields are required:
             * ```kotlin
             * .escalatedTo()
             * .outcome()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DecisionEscalated]. */
        class Builder internal constructor() {

            private var escalatedTo: JsonField<EscalatedTo>? = null
            private var outcome: JsonField<Outcome>? = null
            private var reviewAfter: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(decisionEscalated: DecisionEscalated) = apply {
                escalatedTo = decisionEscalated.escalatedTo
                outcome = decisionEscalated.outcome
                reviewAfter = decisionEscalated.reviewAfter
                additionalProperties = decisionEscalated.additionalProperties.toMutableMap()
            }

            fun escalatedTo(escalatedTo: EscalatedTo) = escalatedTo(JsonField.of(escalatedTo))

            /**
             * Sets [Builder.escalatedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.escalatedTo] with a well-typed [EscalatedTo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun escalatedTo(escalatedTo: JsonField<EscalatedTo>) = apply {
                this.escalatedTo = escalatedTo
            }

            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            fun reviewAfter(reviewAfter: OffsetDateTime) = reviewAfter(JsonField.of(reviewAfter))

            /**
             * Sets [Builder.reviewAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewAfter] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reviewAfter(reviewAfter: JsonField<OffsetDateTime>) = apply {
                this.reviewAfter = reviewAfter
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
             * Returns an immutable instance of [DecisionEscalated].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .escalatedTo()
             * .outcome()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DecisionEscalated =
                DecisionEscalated(
                    checkRequired("escalatedTo", escalatedTo),
                    checkRequired("outcome", outcome),
                    reviewAfter,
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
        fun validate(): DecisionEscalated = apply {
            if (validated) {
                return@apply
            }

            escalatedTo().validate()
            outcome().validate()
            reviewAfter()
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
            (escalatedTo.asKnown()?.validity() ?: 0) +
                (outcome.asKnown()?.validity() ?: 0) +
                (if (reviewAfter.asKnown() == null) 0 else 1)

        class EscalatedTo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val team: JsonField<String>,
            private val contact: JsonField<Contact>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("team") @ExcludeMissing team: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contact")
                @ExcludeMissing
                contact: JsonField<Contact> = JsonMissing.of(),
            ) : this(team, contact, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun team(): String = team.getRequired("team")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun contact(): Contact? = contact.getNullable("contact")

            /**
             * Returns the raw JSON value of [team].
             *
             * Unlike [team], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team") @ExcludeMissing fun _team(): JsonField<String> = team

            /**
             * Returns the raw JSON value of [contact].
             *
             * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

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
                 * Returns a mutable builder for constructing an instance of [EscalatedTo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .team()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EscalatedTo]. */
            class Builder internal constructor() {

                private var team: JsonField<String>? = null
                private var contact: JsonField<Contact> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(escalatedTo: EscalatedTo) = apply {
                    team = escalatedTo.team
                    contact = escalatedTo.contact
                    additionalProperties = escalatedTo.additionalProperties.toMutableMap()
                }

                fun team(team: String) = team(JsonField.of(team))

                /**
                 * Sets [Builder.team] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.team] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun team(team: JsonField<String>) = apply { this.team = team }

                fun contact(contact: Contact) = contact(JsonField.of(contact))

                /**
                 * Sets [Builder.contact] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contact] with a well-typed [Contact] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

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
                 * Returns an immutable instance of [EscalatedTo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .team()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EscalatedTo =
                    EscalatedTo(
                        checkRequired("team", team),
                        contact,
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
            fun validate(): EscalatedTo = apply {
                if (validated) {
                    return@apply
                }

                team()
                contact()?.validate()
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
                (if (team.asKnown() == null) 0 else 1) + (contact.asKnown()?.validity() ?: 0)

            class Contact
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val email: JsonField<String>,
                private val hours: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("hours")
                    @ExcludeMissing
                    hours: JsonField<String> = JsonMissing.of(),
                ) : this(email, hours, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun hours(): String? = hours.getNullable("hours")

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [hours].
                 *
                 * Unlike [hours], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<String> = hours

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

                    /** Returns a mutable builder for constructing an instance of [Contact]. */
                    fun builder() = Builder()
                }

                /** A builder for [Contact]. */
                class Builder internal constructor() {

                    private var email: JsonField<String> = JsonMissing.of()
                    private var hours: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(contact: Contact) = apply {
                        email = contact.email
                        hours = contact.hours
                        additionalProperties = contact.additionalProperties.toMutableMap()
                    }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun hours(hours: String) = hours(JsonField.of(hours))

                    /**
                     * Sets [Builder.hours] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hours] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hours(hours: JsonField<String>) = apply { this.hours = hours }

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
                     * Returns an immutable instance of [Contact].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Contact =
                        Contact(email, hours, additionalProperties.toMutableMap())
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
                fun validate(): Contact = apply {
                    if (validated) {
                        return@apply
                    }

                    email()
                    hours()
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
                    (if (email.asKnown() == null) 0 else 1) +
                        (if (hours.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contact &&
                        email == other.email &&
                        hours == other.hours &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(email, hours, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contact{email=$email, hours=$hours, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EscalatedTo &&
                    team == other.team &&
                    contact == other.contact &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(team, contact, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EscalatedTo{team=$team, contact=$contact, additionalProperties=$additionalProperties}"
        }

        class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val ESCALATED = of("escalated")

                fun of(value: String) = Outcome(JsonField.of(value))
            }

            /** An enum containing [Outcome]'s known values. */
            enum class Known {
                ESCALATED
            }

            /**
             * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Outcome] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ESCALATED,
                /**
                 * An enum member indicating that [Outcome] was instantiated with an unknown value.
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
                    ESCALATED -> Value.ESCALATED
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
                    ESCALATED -> Known.ESCALATED
                    else ->
                        throw HelloWorldTestinggggInvalidDataException("Unknown Outcome: $value")
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
            fun validate(): Outcome = apply {
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

                return other is Outcome && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DecisionEscalated &&
                escalatedTo == other.escalatedTo &&
                outcome == other.outcome &&
                reviewAfter == other.reviewAfter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(escalatedTo, outcome, reviewAfter, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DecisionEscalated{escalatedTo=$escalatedTo, outcome=$outcome, reviewAfter=$reviewAfter, additionalProperties=$additionalProperties}"
    }
}
