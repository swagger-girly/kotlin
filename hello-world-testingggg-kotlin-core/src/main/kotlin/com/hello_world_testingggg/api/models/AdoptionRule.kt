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

class AdoptionRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attribute: JsonField<RuleAttribute>,
    private val operation: JsonField<Operation>,
    private val value: JsonField<ConditionValue>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attribute")
        @ExcludeMissing
        attribute: JsonField<RuleAttribute> = JsonMissing.of(),
        @JsonProperty("operation")
        @ExcludeMissing
        operation: JsonField<Operation> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<ConditionValue> = JsonMissing.of(),
    ) : this(attribute, operation, value, mutableMapOf())

    /**
     * The applicant or pet attribute the rule targets.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attribute(): RuleAttribute = attribute.getRequired("attribute")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): Operation = operation.getRequired("operation")

    /**
     * A regex string, to be used with `MATCHES`
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun value(): ConditionValue? = value.getNullable("value")

    /**
     * Returns the raw JSON value of [attribute].
     *
     * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attribute")
    @ExcludeMissing
    fun _attribute(): JsonField<RuleAttribute> = attribute

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<ConditionValue> = value

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
         * Returns a mutable builder for constructing an instance of [AdoptionRule].
         *
         * The following fields are required:
         * ```kotlin
         * .attribute()
         * .operation()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AdoptionRule]. */
    class Builder internal constructor() {

        private var attribute: JsonField<RuleAttribute>? = null
        private var operation: JsonField<Operation>? = null
        private var value: JsonField<ConditionValue> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(adoptionRule: AdoptionRule) = apply {
            attribute = adoptionRule.attribute
            operation = adoptionRule.operation
            value = adoptionRule.value
            additionalProperties = adoptionRule.additionalProperties.toMutableMap()
        }

        /** The applicant or pet attribute the rule targets. */
        fun attribute(attribute: RuleAttribute) = attribute(JsonField.of(attribute))

        /**
         * Sets [Builder.attribute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attribute] with a well-typed [RuleAttribute] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attribute(attribute: JsonField<RuleAttribute>) = apply { this.attribute = attribute }

        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [Operation] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /** A regex string, to be used with `MATCHES` */
        fun value(value: ConditionValue) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [ConditionValue] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun value(value: JsonField<ConditionValue>) = apply { this.value = value }

        /** Alias for calling [value] with `ConditionValue.ofRegex(regex)`. */
        fun value(regex: String) = value(ConditionValue.ofRegex(regex))

        /** Alias for calling [value] with `ConditionValue.ofLong(long)`. */
        fun value(long: Long) = value(ConditionValue.ofLong(long))

        /** Alias for calling [value] with `ConditionValue.ofDouble(double)`. */
        fun value(double: Double) = value(ConditionValue.ofDouble(double))

        /** Alias for calling [value] with `ConditionValue.ofListOfStrings(listOfStrings)`. */
        fun valueOfListOfStrings(listOfStrings: List<String>) =
            value(ConditionValue.ofListOfStrings(listOfStrings))

        /** Alias for calling [value] with `ConditionValue.ofTimestamp(timestamp)`. */
        fun value(timestamp: OffsetDateTime) = value(ConditionValue.ofTimestamp(timestamp))

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
         * Returns an immutable instance of [AdoptionRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .attribute()
         * .operation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdoptionRule =
            AdoptionRule(
                checkRequired("attribute", attribute),
                checkRequired("operation", operation),
                value,
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
    fun validate(): AdoptionRule = apply {
        if (validated) {
            return@apply
        }

        attribute().validate()
        operation().validate()
        value()?.validate()
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
        (attribute.asKnown()?.validity() ?: 0) +
            (operation.asKnown()?.validity() ?: 0) +
            (value.asKnown()?.validity() ?: 0)

    class Operation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val IS_ONE_OF = of("IS_ONE_OF")

            val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

            val MATCHES = of("MATCHES")

            val IS_GREATER_THAN = of("IS_GREATER_THAN")

            val IS_LESS_THAN = of("IS_LESS_THAN")

            val IS_BEFORE = of("IS_BEFORE")

            val IS_AFTER = of("IS_AFTER")

            fun of(value: String) = Operation(JsonField.of(value))
        }

        /** An enum containing [Operation]'s known values. */
        enum class Known {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            IS_GREATER_THAN,
            IS_LESS_THAN,
            IS_BEFORE,
            IS_AFTER,
        }

        /**
         * An enum containing [Operation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            IS_GREATER_THAN,
            IS_LESS_THAN,
            IS_BEFORE,
            IS_AFTER,
            /**
             * An enum member indicating that [Operation] was instantiated with an unknown value.
             */
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
                IS_ONE_OF -> Value.IS_ONE_OF
                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                MATCHES -> Value.MATCHES
                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                IS_LESS_THAN -> Value.IS_LESS_THAN
                IS_BEFORE -> Value.IS_BEFORE
                IS_AFTER -> Value.IS_AFTER
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
                IS_ONE_OF -> Known.IS_ONE_OF
                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                MATCHES -> Known.MATCHES
                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                IS_LESS_THAN -> Known.IS_LESS_THAN
                IS_BEFORE -> Known.IS_BEFORE
                IS_AFTER -> Known.IS_AFTER
                else -> throw HelloWorldTestinggggInvalidDataException("Unknown Operation: $value")
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
        fun validate(): Operation = apply {
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

            return other is Operation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdoptionRule &&
            attribute == other.attribute &&
            operation == other.operation &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(attribute, operation, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdoptionRule{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
}
