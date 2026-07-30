// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlacementEventRecordedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val event: JsonField<PlacementEvent>,
    private val placementId: JsonField<String>,
    private val type: JsonField<Type>,
    private val triggerValue: JsonField<ConditionValue>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event") @ExcludeMissing event: JsonField<PlacementEvent> = JsonMissing.of(),
        @JsonProperty("placementId")
        @ExcludeMissing
        placementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("triggerValue")
        @ExcludeMissing
        triggerValue: JsonField<ConditionValue> = JsonMissing.of(),
    ) : this(event, placementId, type, triggerValue, mutableMapOf())

    /**
     * A placement history entry; the shape depends on the event kind and carries no discriminator
     * mapping.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): PlacementEvent = event.getRequired("event")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun placementId(): String = placementId.getRequired("placementId")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The policy rule value that triggered this event, if any.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun triggerValue(): ConditionValue? = triggerValue.getNullable("triggerValue")

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<PlacementEvent> = event

    /**
     * Returns the raw JSON value of [placementId].
     *
     * Unlike [placementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("placementId") @ExcludeMissing fun _placementId(): JsonField<String> = placementId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [triggerValue].
     *
     * Unlike [triggerValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggerValue")
    @ExcludeMissing
    fun _triggerValue(): JsonField<ConditionValue> = triggerValue

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
         * [PlacementEventRecordedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .event()
         * .placementId()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlacementEventRecordedWebhookEvent]. */
    class Builder internal constructor() {

        private var event: JsonField<PlacementEvent>? = null
        private var placementId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var triggerValue: JsonField<ConditionValue> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(placementEventRecordedWebhookEvent: PlacementEventRecordedWebhookEvent) =
            apply {
                event = placementEventRecordedWebhookEvent.event
                placementId = placementEventRecordedWebhookEvent.placementId
                type = placementEventRecordedWebhookEvent.type
                triggerValue = placementEventRecordedWebhookEvent.triggerValue
                additionalProperties =
                    placementEventRecordedWebhookEvent.additionalProperties.toMutableMap()
            }

        /**
         * A placement history entry; the shape depends on the event kind and carries no
         * discriminator mapping.
         */
        fun event(event: PlacementEvent) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [PlacementEvent] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun event(event: JsonField<PlacementEvent>) = apply { this.event = event }

        /** Alias for calling [event] with `PlacementEvent.ofTransfer(transfer)`. */
        fun event(transfer: PlacementEvent.PlacementTransferEvent) =
            event(PlacementEvent.ofTransfer(transfer))

        /** Alias for calling [event] with `PlacementEvent.ofCheckup(checkup)`. */
        fun event(checkup: PlacementEvent.PlacementCheckupEvent) =
            event(PlacementEvent.ofCheckup(checkup))

        /** Alias for calling [event] with `PlacementEvent.ofDisruption(disruption)`. */
        fun event(disruption: PlacementEvent.PlacementDisruptionEvent) =
            event(PlacementEvent.ofDisruption(disruption))

        fun placementId(placementId: String) = placementId(JsonField.of(placementId))

        /**
         * Sets [Builder.placementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.placementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun placementId(placementId: JsonField<String>) = apply { this.placementId = placementId }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The policy rule value that triggered this event, if any. */
        fun triggerValue(triggerValue: ConditionValue) = triggerValue(JsonField.of(triggerValue))

        /**
         * Sets [Builder.triggerValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerValue] with a well-typed [ConditionValue] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggerValue(triggerValue: JsonField<ConditionValue>) = apply {
            this.triggerValue = triggerValue
        }

        /** Alias for calling [triggerValue] with `ConditionValue.ofRegex(regex)`. */
        fun triggerValue(regex: String) = triggerValue(ConditionValue.ofRegex(regex))

        /** Alias for calling [triggerValue] with `ConditionValue.ofLong(long)`. */
        fun triggerValue(long: Long) = triggerValue(ConditionValue.ofLong(long))

        /** Alias for calling [triggerValue] with `ConditionValue.ofDouble(double)`. */
        fun triggerValue(double: Double) = triggerValue(ConditionValue.ofDouble(double))

        /**
         * Alias for calling [triggerValue] with `ConditionValue.ofListOfStrings(listOfStrings)`.
         */
        fun triggerValueOfListOfStrings(listOfStrings: List<String>) =
            triggerValue(ConditionValue.ofListOfStrings(listOfStrings))

        /** Alias for calling [triggerValue] with `ConditionValue.ofTimestamp(timestamp)`. */
        fun triggerValue(timestamp: OffsetDateTime) =
            triggerValue(ConditionValue.ofTimestamp(timestamp))

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
         * Returns an immutable instance of [PlacementEventRecordedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .event()
         * .placementId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlacementEventRecordedWebhookEvent =
            PlacementEventRecordedWebhookEvent(
                checkRequired("event", event),
                checkRequired("placementId", placementId),
                checkRequired("type", type),
                triggerValue,
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
    fun validate(): PlacementEventRecordedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        event().validate()
        placementId()
        type().validate()
        triggerValue()?.validate()
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
        (event.asKnown()?.validity() ?: 0) +
            (if (placementId.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (triggerValue.asKnown()?.validity() ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PLACEMENT_EVENT_RECORDED = of("placement.event-recorded")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PLACEMENT_EVENT_RECORDED
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLACEMENT_EVENT_RECORDED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PLACEMENT_EVENT_RECORDED -> Value.PLACEMENT_EVENT_RECORDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HelloWorldTestinggggInvalidDataException if this class instance's value is a not
         *   a known member.
         */
        fun known(): Known =
            when (this) {
                PLACEMENT_EVENT_RECORDED -> Known.PLACEMENT_EVENT_RECORDED
                else -> throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HelloWorldTestinggggInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw HelloWorldTestinggggInvalidDataException("Value is not a String")

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

        return other is PlacementEventRecordedWebhookEvent &&
            event == other.event &&
            placementId == other.placementId &&
            type == other.type &&
            triggerValue == other.triggerValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(event, placementId, type, triggerValue, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlacementEventRecordedWebhookEvent{event=$event, placementId=$placementId, type=$type, triggerValue=$triggerValue, additionalProperties=$additionalProperties}"
}
