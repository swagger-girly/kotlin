// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

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
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.veterinary.VaccinationRecord
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A placement history entry; the shape depends on the event kind and carries no discriminator
 * mapping.
 */
@JsonDeserialize(using = PlacementEvent.Deserializer::class)
@JsonSerialize(using = PlacementEvent.Serializer::class)
class PlacementEvent
private constructor(
    private val transfer: PlacementTransferEvent? = null,
    private val checkup: PlacementCheckupEvent? = null,
    private val disruption: PlacementDisruptionEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun transfer(): PlacementTransferEvent? = transfer

    fun checkup(): PlacementCheckupEvent? = checkup

    fun disruption(): PlacementDisruptionEvent? = disruption

    fun isTransfer(): Boolean = transfer != null

    fun isCheckup(): Boolean = checkup != null

    fun isDisruption(): Boolean = disruption != null

    fun asTransfer(): PlacementTransferEvent = transfer.getOrThrow("transfer")

    fun asCheckup(): PlacementCheckupEvent = checkup.getOrThrow("checkup")

    fun asDisruption(): PlacementDisruptionEvent = disruption.getOrThrow("disruption")

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
     * val result: String? = placementEvent.accept(object : PlacementEvent.Visitor<String?> {
     *     override fun visitTransfer(transfer: PlacementTransferEvent): String? = transfer.toString()
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
            transfer != null -> visitor.visitTransfer(transfer)
            checkup != null -> visitor.visitCheckup(checkup)
            disruption != null -> visitor.visitDisruption(disruption)
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
    fun validate(): PlacementEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTransfer(transfer: PlacementTransferEvent) {
                    transfer.validate()
                }

                override fun visitCheckup(checkup: PlacementCheckupEvent) {
                    checkup.validate()
                }

                override fun visitDisruption(disruption: PlacementDisruptionEvent) {
                    disruption.validate()
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
                override fun visitTransfer(transfer: PlacementTransferEvent) = transfer.validity()

                override fun visitCheckup(checkup: PlacementCheckupEvent) = checkup.validity()

                override fun visitDisruption(disruption: PlacementDisruptionEvent) =
                    disruption.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlacementEvent &&
            transfer == other.transfer &&
            checkup == other.checkup &&
            disruption == other.disruption
    }

    override fun hashCode(): Int = Objects.hash(transfer, checkup, disruption)

    override fun toString(): String =
        when {
            transfer != null -> "PlacementEvent{transfer=$transfer}"
            checkup != null -> "PlacementEvent{checkup=$checkup}"
            disruption != null -> "PlacementEvent{disruption=$disruption}"
            _json != null -> "PlacementEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PlacementEvent")
        }

    companion object {

        fun ofTransfer(transfer: PlacementTransferEvent) = PlacementEvent(transfer = transfer)

        fun ofCheckup(checkup: PlacementCheckupEvent) = PlacementEvent(checkup = checkup)

        fun ofDisruption(disruption: PlacementDisruptionEvent) =
            PlacementEvent(disruption = disruption)
    }

    /**
     * An interface that defines how to map each variant of [PlacementEvent] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitTransfer(transfer: PlacementTransferEvent): T

        fun visitCheckup(checkup: PlacementCheckupEvent): T

        fun visitDisruption(disruption: PlacementDisruptionEvent): T

        /**
         * Maps an unknown variant of [PlacementEvent] to a value of type [T].
         *
         * An instance of [PlacementEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException("Unknown PlacementEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PlacementEvent>(PlacementEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PlacementEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PlacementTransferEvent>())?.let {
                            PlacementEvent(transfer = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PlacementCheckupEvent>())?.let {
                            PlacementEvent(checkup = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PlacementDisruptionEvent>())?.let {
                            PlacementEvent(disruption = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PlacementEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PlacementEvent>(PlacementEvent::class) {

        override fun serialize(
            value: PlacementEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.transfer != null -> generator.writeObject(value.transfer)
                value.checkup != null -> generator.writeObject(value.checkup)
                value.disruption != null -> generator.writeObject(value.disruption)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PlacementEvent")
            }
        }
    }

    class PlacementTransferEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val leg: JsonField<TransferLeg>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val note: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("leg") @ExcludeMissing leg: JsonField<TransferLeg> = JsonMissing.of(),
            @JsonProperty("occurredAt")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        ) : this(id, leg, occurredAt, type, note, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun leg(): TransferLeg = leg.getRequired("leg")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun note(): String? = note.getNullable("note")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [leg].
         *
         * Unlike [leg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("leg") @ExcludeMissing fun _leg(): JsonField<TransferLeg> = leg

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurredAt")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

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
             * Returns a mutable builder for constructing an instance of [PlacementTransferEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .leg()
             * .occurredAt()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlacementTransferEvent]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var leg: JsonField<TransferLeg>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var type: JsonField<Type>? = null
            private var note: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(placementTransferEvent: PlacementTransferEvent) = apply {
                id = placementTransferEvent.id
                leg = placementTransferEvent.leg
                occurredAt = placementTransferEvent.occurredAt
                type = placementTransferEvent.type
                note = placementTransferEvent.note
                additionalProperties = placementTransferEvent.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun leg(leg: TransferLeg) = leg(JsonField.of(leg))

            /**
             * Sets [Builder.leg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.leg] with a well-typed [TransferLeg] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun leg(leg: JsonField<TransferLeg>) = apply { this.leg = leg }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun note(note: String?) = note(JsonField.ofNullable(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

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
             * Returns an immutable instance of [PlacementTransferEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .leg()
             * .occurredAt()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlacementTransferEvent =
                PlacementTransferEvent(
                    checkRequired("id", id),
                    checkRequired("leg", leg),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("type", type),
                    note,
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
        fun validate(): PlacementTransferEvent = apply {
            if (validated) {
                return@apply
            }

            id()
            leg().validate()
            occurredAt()
            type().validate()
            note()
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
                (leg.asKnown()?.validity() ?: 0) +
                (if (occurredAt.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (note.asKnown() == null) 0 else 1)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val TRANSFER = of("transfer")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TRANSFER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRANSFER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    TRANSFER -> Value.TRANSFER
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
                    TRANSFER -> Known.TRANSFER
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlacementTransferEvent &&
                id == other.id &&
                leg == other.leg &&
                occurredAt == other.occurredAt &&
                type == other.type &&
                note == other.note &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, leg, occurredAt, type, note, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlacementTransferEvent{id=$id, leg=$leg, occurredAt=$occurredAt, type=$type, note=$note, additionalProperties=$additionalProperties}"
    }

    class PlacementCheckupEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val followUp: JsonField<FollowUp>,
        private val note: JsonField<String>,
        private val record: JsonField<VaccinationRecord>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occurredAt")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("followUp")
            @ExcludeMissing
            followUp: JsonField<FollowUp> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record")
            @ExcludeMissing
            record: JsonField<VaccinationRecord> = JsonMissing.of(),
        ) : this(id, occurredAt, type, followUp, note, record, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun followUp(): FollowUp? = followUp.getNullable("followUp")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun note(): String? = note.getNullable("note")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun record(): VaccinationRecord? = record.getNullable("record")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurredAt")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [followUp].
         *
         * Unlike [followUp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("followUp") @ExcludeMissing fun _followUp(): JsonField<FollowUp> = followUp

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record") @ExcludeMissing fun _record(): JsonField<VaccinationRecord> = record

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
             * Returns a mutable builder for constructing an instance of [PlacementCheckupEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .occurredAt()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlacementCheckupEvent]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var type: JsonField<Type>? = null
            private var followUp: JsonField<FollowUp> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var record: JsonField<VaccinationRecord> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(placementCheckupEvent: PlacementCheckupEvent) = apply {
                id = placementCheckupEvent.id
                occurredAt = placementCheckupEvent.occurredAt
                type = placementCheckupEvent.type
                followUp = placementCheckupEvent.followUp
                note = placementCheckupEvent.note
                record = placementCheckupEvent.record
                additionalProperties = placementCheckupEvent.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun followUp(followUp: FollowUp) = followUp(JsonField.of(followUp))

            /**
             * Sets [Builder.followUp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.followUp] with a well-typed [FollowUp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun followUp(followUp: JsonField<FollowUp>) = apply { this.followUp = followUp }

            fun note(note: String?) = note(JsonField.ofNullable(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

            fun record(record: VaccinationRecord) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [VaccinationRecord] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<VaccinationRecord>) = apply { this.record = record }

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
             * Returns an immutable instance of [PlacementCheckupEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .occurredAt()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlacementCheckupEvent =
                PlacementCheckupEvent(
                    checkRequired("id", id),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("type", type),
                    followUp,
                    note,
                    record,
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
        fun validate(): PlacementCheckupEvent = apply {
            if (validated) {
                return@apply
            }

            id()
            occurredAt()
            type().validate()
            followUp()?.validate()
            note()
            record()?.validate()
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
                (if (occurredAt.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (followUp.asKnown()?.validity() ?: 0) +
                (if (note.asKnown() == null) 0 else 1) +
                (record.asKnown()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val CHECKUP = of("checkup")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CHECKUP
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKUP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CHECKUP -> Value.CHECKUP
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
                    CHECKUP -> Known.CHECKUP
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class FollowUp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val due: JsonField<OffsetDateTime>,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("due")
                @ExcludeMissing
                due: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(due, reason, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun due(): OffsetDateTime? = due.getNullable("due")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Returns the raw JSON value of [due].
             *
             * Unlike [due], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("due") @ExcludeMissing fun _due(): JsonField<OffsetDateTime> = due

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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

                /** Returns a mutable builder for constructing an instance of [FollowUp]. */
                fun builder() = Builder()
            }

            /** A builder for [FollowUp]. */
            class Builder internal constructor() {

                private var due: JsonField<OffsetDateTime> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(followUp: FollowUp) = apply {
                    due = followUp.due
                    reason = followUp.reason
                    additionalProperties = followUp.additionalProperties.toMutableMap()
                }

                fun due(due: OffsetDateTime) = due(JsonField.of(due))

                /**
                 * Sets [Builder.due] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.due] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun due(due: JsonField<OffsetDateTime>) = apply { this.due = due }

                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [FollowUp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FollowUp = FollowUp(due, reason, additionalProperties.toMutableMap())
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
            fun validate(): FollowUp = apply {
                if (validated) {
                    return@apply
                }

                due()
                reason()
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
                (if (due.asKnown() == null) 0 else 1) + (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FollowUp &&
                    due == other.due &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(due, reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FollowUp{due=$due, reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlacementCheckupEvent &&
                id == other.id &&
                occurredAt == other.occurredAt &&
                type == other.type &&
                followUp == other.followUp &&
                note == other.note &&
                record == other.record &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, occurredAt, type, followUp, note, record, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlacementCheckupEvent{id=$id, occurredAt=$occurredAt, type=$type, followUp=$followUp, note=$note, record=$record, additionalProperties=$additionalProperties}"
    }

    class PlacementDisruptionEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val severity: JsonField<Severity>,
        private val type: JsonField<Type>,
        private val note: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occurredAt")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        ) : this(id, occurredAt, severity, type, note, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

        /**
         * A numeric severity score or a structured assessment.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun severity(): Severity = severity.getRequired("severity")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun note(): String? = note.getNullable("note")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurredAt")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

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
             * Returns a mutable builder for constructing an instance of [PlacementDisruptionEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .occurredAt()
             * .severity()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlacementDisruptionEvent]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var severity: JsonField<Severity>? = null
            private var type: JsonField<Type>? = null
            private var note: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(placementDisruptionEvent: PlacementDisruptionEvent) = apply {
                id = placementDisruptionEvent.id
                occurredAt = placementDisruptionEvent.occurredAt
                severity = placementDisruptionEvent.severity
                type = placementDisruptionEvent.type
                note = placementDisruptionEvent.note
                additionalProperties = placementDisruptionEvent.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
            }

            /** A numeric severity score or a structured assessment. */
            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            /** Alias for calling [severity] with `Severity.ofInt(int)`. */
            fun severity(int: Int) = severity(Severity.ofInt(int))

            /** Alias for calling [severity] with `Severity.ofAssessment(assessment)`. */
            fun severity(assessment: Severity.Assessment) =
                severity(Severity.ofAssessment(assessment))

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun note(note: String?) = note(JsonField.ofNullable(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

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
             * Returns an immutable instance of [PlacementDisruptionEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .occurredAt()
             * .severity()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlacementDisruptionEvent =
                PlacementDisruptionEvent(
                    checkRequired("id", id),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("severity", severity),
                    checkRequired("type", type),
                    note,
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
        fun validate(): PlacementDisruptionEvent = apply {
            if (validated) {
                return@apply
            }

            id()
            occurredAt()
            severity().validate()
            type().validate()
            note()
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
                (if (occurredAt.asKnown() == null) 0 else 1) +
                (severity.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (note.asKnown() == null) 0 else 1)

        /** A numeric severity score or a structured assessment. */
        @JsonDeserialize(using = Severity.Deserializer::class)
        @JsonSerialize(using = Severity.Serializer::class)
        class Severity
        private constructor(
            private val int: Int? = null,
            private val assessment: Assessment? = null,
            private val _json: JsonValue? = null,
        ) {

            fun int(): Int? = int

            fun assessment(): Assessment? = assessment

            fun isInt(): Boolean = int != null

            fun isAssessment(): Boolean = assessment != null

            fun asInt(): Int = int.getOrThrow("int")

            fun asAssessment(): Assessment = assessment.getOrThrow("assessment")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.hello_world_testingggg.api.core.JsonValue
             *
             * val result: String? = severity.accept(object : Severity.Visitor<String?> {
             *     override fun visitInt(int: Int): String? = int.toString()
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
             * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not
             *   overridden in [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    int != null -> visitor.visitInt(int)
                    assessment != null -> visitor.visitAssessment(assessment)
                    else -> visitor.unknown(_json)
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
            fun validate(): Severity = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInt(int: Int) {}

                        override fun visitAssessment(assessment: Assessment) {
                            assessment.validate()
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
                        override fun visitInt(int: Int) = 1

                        override fun visitAssessment(assessment: Assessment) = assessment.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Severity && int == other.int && assessment == other.assessment
            }

            override fun hashCode(): Int = Objects.hash(int, assessment)

            override fun toString(): String =
                when {
                    int != null -> "Severity{int=$int}"
                    assessment != null -> "Severity{assessment=$assessment}"
                    _json != null -> "Severity{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Severity")
                }

            companion object {

                fun ofInt(int: Int) = Severity(int = int)

                fun ofAssessment(assessment: Assessment) = Severity(assessment = assessment)
            }

            /**
             * An interface that defines how to map each variant of [Severity] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitInt(int: Int): T

                fun visitAssessment(assessment: Assessment): T

                /**
                 * Maps an unknown variant of [Severity] to a value of type [T].
                 *
                 * An instance of [Severity] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HelloWorldTestinggggInvalidDataException("Unknown Severity: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Severity>(Severity::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Severity {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Assessment>())?.let {
                                    Severity(assessment = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Int>())?.let {
                                    Severity(int = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Severity(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Severity>(Severity::class) {

                override fun serialize(
                    value: Severity,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.int != null -> generator.writeObject(value.int)
                        value.assessment != null -> generator.writeObject(value.assessment)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Severity")
                    }
                }
            }

            class Assessment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val level: JsonField<Level>,
                private val reviewer: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("level")
                    @ExcludeMissing
                    level: JsonField<Level> = JsonMissing.of(),
                    @JsonProperty("reviewer")
                    @ExcludeMissing
                    reviewer: JsonField<String> = JsonMissing.of(),
                ) : this(level, reviewer, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun level(): Level = level.getRequired("level")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun reviewer(): String? = reviewer.getNullable("reviewer")

                /**
                 * Returns the raw JSON value of [level].
                 *
                 * Unlike [level], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

                /**
                 * Returns the raw JSON value of [reviewer].
                 *
                 * Unlike [reviewer], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reviewer")
                @ExcludeMissing
                fun _reviewer(): JsonField<String> = reviewer

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
                     * Returns a mutable builder for constructing an instance of [Assessment].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .level()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Assessment]. */
                class Builder internal constructor() {

                    private var level: JsonField<Level>? = null
                    private var reviewer: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(assessment: Assessment) = apply {
                        level = assessment.level
                        reviewer = assessment.reviewer
                        additionalProperties = assessment.additionalProperties.toMutableMap()
                    }

                    fun level(level: Level) = level(JsonField.of(level))

                    /**
                     * Sets [Builder.level] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.level] with a well-typed [Level] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun level(level: JsonField<Level>) = apply { this.level = level }

                    fun reviewer(reviewer: String) = reviewer(JsonField.of(reviewer))

                    /**
                     * Sets [Builder.reviewer] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reviewer] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reviewer(reviewer: JsonField<String>) = apply { this.reviewer = reviewer }

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
                     * Returns an immutable instance of [Assessment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .level()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Assessment =
                        Assessment(
                            checkRequired("level", level),
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
                fun validate(): Assessment = apply {
                    if (validated) {
                        return@apply
                    }

                    level().validate()
                    reviewer()
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
                    (level.asKnown()?.validity() ?: 0) + (if (reviewer.asKnown() == null) 0 else 1)

                class Level @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val LOW = of("low")

                        val HIGH = of("high")

                        val CRITICAL = of("critical")

                        fun of(value: String) = Level(JsonField.of(value))
                    }

                    /** An enum containing [Level]'s known values. */
                    enum class Known {
                        LOW,
                        HIGH,
                        CRITICAL,
                    }

                    /**
                     * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Level] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOW,
                        HIGH,
                        CRITICAL,
                        /**
                         * An enum member indicating that [Level] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            LOW -> Value.LOW
                            HIGH -> Value.HIGH
                            CRITICAL -> Value.CRITICAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws HelloWorldTestinggggInvalidDataException if this class instance's
                     *   value is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            HIGH -> Known.HIGH
                            CRITICAL -> Known.CRITICAL
                            else ->
                                throw HelloWorldTestinggggInvalidDataException(
                                    "Unknown Level: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws HelloWorldTestinggggInvalidDataException if this class instance's
                     *   value does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw HelloWorldTestinggggInvalidDataException(
                                "Value is not a String"
                            )

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
                    fun validate(): Level = apply {
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

                        return other is Level && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Assessment &&
                        level == other.level &&
                        reviewer == other.reviewer &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(level, reviewer, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Assessment{level=$level, reviewer=$reviewer, additionalProperties=$additionalProperties}"
            }
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val DISRUPTION = of("disruption")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DISRUPTION
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISRUPTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DISRUPTION -> Value.DISRUPTION
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
                    DISRUPTION -> Known.DISRUPTION
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlacementDisruptionEvent &&
                id == other.id &&
                occurredAt == other.occurredAt &&
                severity == other.severity &&
                type == other.type &&
                note == other.note &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, occurredAt, severity, type, note, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlacementDisruptionEvent{id=$id, occurredAt=$occurredAt, severity=$severity, type=$type, note=$note, additionalProperties=$additionalProperties}"
    }
}
