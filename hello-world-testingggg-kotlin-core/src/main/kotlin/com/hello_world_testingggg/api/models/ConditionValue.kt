// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.BaseDeserializer
import com.hello_world_testingggg.api.core.BaseSerializer
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A regex string, to be used with `MATCHES` */
@JsonDeserialize(using = ConditionValue.Deserializer::class)
@JsonSerialize(using = ConditionValue.Serializer::class)
class ConditionValue
private constructor(
    private val regex: String? = null,
    private val long: Long? = null,
    private val double: Double? = null,
    private val listOfStrings: List<String>? = null,
    private val timestamp: OffsetDateTime? = null,
    private val _json: JsonValue? = null,
) {

    /** A regex string, to be used with `MATCHES` */
    fun regex(): String? = regex

    fun long(): Long? = long

    fun double(): Double? = double

    /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
    fun listOfStrings(): List<String>? = listOfStrings

    /** A timestamp, to be used with `IS_BEFORE` or `IS_AFTER` */
    fun timestamp(): OffsetDateTime? = timestamp

    fun isRegex(): Boolean = regex != null

    fun isLong(): Boolean = long != null

    fun isDouble(): Boolean = double != null

    fun isListOfStrings(): Boolean = listOfStrings != null

    fun isTimestamp(): Boolean = timestamp != null

    /** A regex string, to be used with `MATCHES` */
    fun asRegex(): String = regex.getOrThrow("regex")

    fun asLong(): Long = long.getOrThrow("long")

    fun asDouble(): Double = double.getOrThrow("double")

    /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
    fun asListOfStrings(): List<String> = listOfStrings.getOrThrow("listOfStrings")

    /** A timestamp, to be used with `IS_BEFORE` or `IS_AFTER` */
    fun asTimestamp(): OffsetDateTime = timestamp.getOrThrow("timestamp")

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
     * val result: String? = conditionValue.accept(object : ConditionValue.Visitor<String?> {
     *     override fun visitRegex(regex: String): String? = regex.toString()
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
            regex != null -> visitor.visitRegex(regex)
            long != null -> visitor.visitLong(long)
            double != null -> visitor.visitDouble(double)
            listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
            timestamp != null -> visitor.visitTimestamp(timestamp)
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
    fun validate(): ConditionValue = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRegex(regex: String) {}

                override fun visitLong(long: Long) {}

                override fun visitDouble(double: Double) {}

                override fun visitListOfStrings(listOfStrings: List<String>) {}

                override fun visitTimestamp(timestamp: OffsetDateTime) {}
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
                override fun visitRegex(regex: String) = 1

                override fun visitLong(long: Long) = 1

                override fun visitDouble(double: Double) = 1

                override fun visitListOfStrings(listOfStrings: List<String>) = listOfStrings.size

                override fun visitTimestamp(timestamp: OffsetDateTime) = 1

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionValue &&
            regex == other.regex &&
            long == other.long &&
            double == other.double &&
            listOfStrings == other.listOfStrings &&
            timestamp == other.timestamp
    }

    override fun hashCode(): Int = Objects.hash(regex, long, double, listOfStrings, timestamp)

    override fun toString(): String =
        when {
            regex != null -> "ConditionValue{regex=$regex}"
            long != null -> "ConditionValue{long=$long}"
            double != null -> "ConditionValue{double=$double}"
            listOfStrings != null -> "ConditionValue{listOfStrings=$listOfStrings}"
            timestamp != null -> "ConditionValue{timestamp=$timestamp}"
            _json != null -> "ConditionValue{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConditionValue")
        }

    companion object {

        /** A regex string, to be used with `MATCHES` */
        fun ofRegex(regex: String) = ConditionValue(regex = regex)

        fun ofLong(long: Long) = ConditionValue(long = long)

        fun ofDouble(double: Double) = ConditionValue(double = double)

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun ofListOfStrings(listOfStrings: List<String>) =
            ConditionValue(listOfStrings = listOfStrings.toImmutable())

        /** A timestamp, to be used with `IS_BEFORE` or `IS_AFTER` */
        fun ofTimestamp(timestamp: OffsetDateTime) = ConditionValue(timestamp = timestamp)
    }

    /**
     * An interface that defines how to map each variant of [ConditionValue] to a value of type [T].
     */
    interface Visitor<out T> {

        /** A regex string, to be used with `MATCHES` */
        fun visitRegex(regex: String): T

        fun visitLong(long: Long): T

        fun visitDouble(double: Double): T

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun visitListOfStrings(listOfStrings: List<String>): T

        /** A timestamp, to be used with `IS_BEFORE` or `IS_AFTER` */
        fun visitTimestamp(timestamp: OffsetDateTime): T

        /**
         * Maps an unknown variant of [ConditionValue] to a value of type [T].
         *
         * An instance of [ConditionValue] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException("Unknown ConditionValue: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ConditionValue>(ConditionValue::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConditionValue {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                            ConditionValue(timestamp = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            ConditionValue(regex = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                            ConditionValue(long = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                            ConditionValue(double = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            ConditionValue(listOfStrings = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ConditionValue(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ConditionValue>(ConditionValue::class) {

        override fun serialize(
            value: ConditionValue,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.regex != null -> generator.writeObject(value.regex)
                value.long != null -> generator.writeObject(value.long)
                value.double != null -> generator.writeObject(value.double)
                value.listOfStrings != null -> generator.writeObject(value.listOfStrings)
                value.timestamp != null -> generator.writeObject(value.timestamp)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConditionValue")
            }
        }
    }
}
