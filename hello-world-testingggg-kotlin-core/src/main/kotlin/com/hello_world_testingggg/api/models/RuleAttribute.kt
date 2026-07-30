// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException

/** The applicant or pet attribute the rule targets. */
class RuleAttribute @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PET_STATUS = of("PET_STATUS")

        val SPECIES = of("SPECIES")

        val ADOPTER_AGE = of("ADOPTER_AGE")

        val REGION = of("REGION")

        val PRIOR_ADOPTIONS = of("PRIOR_ADOPTIONS")

        val APPLICATION_DATE = of("APPLICATION_DATE")

        fun of(value: String) = RuleAttribute(JsonField.of(value))
    }

    /** An enum containing [RuleAttribute]'s known values. */
    enum class Known {
        PET_STATUS,
        SPECIES,
        ADOPTER_AGE,
        REGION,
        PRIOR_ADOPTIONS,
        APPLICATION_DATE,
    }

    /**
     * An enum containing [RuleAttribute]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RuleAttribute] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PET_STATUS,
        SPECIES,
        ADOPTER_AGE,
        REGION,
        PRIOR_ADOPTIONS,
        APPLICATION_DATE,
        /**
         * An enum member indicating that [RuleAttribute] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            PET_STATUS -> Value.PET_STATUS
            SPECIES -> Value.SPECIES
            ADOPTER_AGE -> Value.ADOPTER_AGE
            REGION -> Value.REGION
            PRIOR_ADOPTIONS -> Value.PRIOR_ADOPTIONS
            APPLICATION_DATE -> Value.APPLICATION_DATE
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws HelloWorldTestinggggInvalidDataException if this class instance's value is a not a
     *   known member.
     */
    fun known(): Known =
        when (this) {
            PET_STATUS -> Known.PET_STATUS
            SPECIES -> Known.SPECIES
            ADOPTER_AGE -> Known.ADOPTER_AGE
            REGION -> Known.REGION
            PRIOR_ADOPTIONS -> Known.PRIOR_ADOPTIONS
            APPLICATION_DATE -> Known.APPLICATION_DATE
            else -> throw HelloWorldTestinggggInvalidDataException("Unknown RuleAttribute: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws HelloWorldTestinggggInvalidDataException if this class instance's value does not have
     *   the expected primitive type.
     */
    fun asString(): String =
        _value().asString()
            ?: throw HelloWorldTestinggggInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HelloWorldTestinggggInvalidDataException if any value type in this object doesn't
     *   match its expected type.
     */
    fun validate(): RuleAttribute = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleAttribute && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
