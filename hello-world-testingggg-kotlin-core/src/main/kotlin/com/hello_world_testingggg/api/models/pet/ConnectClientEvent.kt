// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

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
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ConnectClientEvent.Deserializer::class)
@JsonSerialize(using = ConnectClientEvent.Serializer::class)
class ConnectClientEvent
private constructor(
    private val ping: JsonValue? = null,
    private val subscribe: Subscribe? = null,
    private val _json: JsonValue? = null,
) {

    fun ping(): JsonValue? = ping

    fun subscribe(): Subscribe? = subscribe

    fun isPing(): Boolean = ping != null

    fun isSubscribe(): Boolean = subscribe != null

    fun asPing(): JsonValue = ping.getOrThrow("ping")

    fun asSubscribe(): Subscribe = subscribe.getOrThrow("subscribe")

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
     * val result: String? = connectClientEvent.accept(object : ConnectClientEvent.Visitor<String?> {
     *     override fun visitPing(ping: JsonValue): String? = ping.toString()
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
            ping != null -> visitor.visitPing(ping)
            subscribe != null -> visitor.visitSubscribe(subscribe)
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
    fun validate(): ConnectClientEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPing(ping: JsonValue) {
                    ping.let {
                        if (it != JsonValue.from(mapOf("type" to "ping"))) {
                            throw HelloWorldTestinggggInvalidDataException(
                                "'ping' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitSubscribe(subscribe: Subscribe) {
                    subscribe.validate()
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
                override fun visitPing(ping: JsonValue) =
                    ping.let { if (it == JsonValue.from(mapOf("type" to "ping"))) 1 else 0 }

                override fun visitSubscribe(subscribe: Subscribe) = subscribe.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectClientEvent && ping == other.ping && subscribe == other.subscribe
    }

    override fun hashCode(): Int = Objects.hash(ping, subscribe)

    override fun toString(): String =
        when {
            ping != null -> "ConnectClientEvent{ping=$ping}"
            subscribe != null -> "ConnectClientEvent{subscribe=$subscribe}"
            _json != null -> "ConnectClientEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConnectClientEvent")
        }

    companion object {

        fun ofPing() = ConnectClientEvent(ping = JsonValue.from(mapOf("type" to "ping")))

        fun ofSubscribe(subscribe: Subscribe) = ConnectClientEvent(subscribe = subscribe)
    }

    /**
     * An interface that defines how to map each variant of [ConnectClientEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPing(ping: JsonValue): T

        fun visitSubscribe(subscribe: Subscribe): T

        /**
         * Maps an unknown variant of [ConnectClientEvent] to a value of type [T].
         *
         * An instance of [ConnectClientEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException("Unknown ConnectClientEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ConnectClientEvent>(ConnectClientEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConnectClientEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "ping" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ConnectClientEvent(ping = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ConnectClientEvent(_json = json)
                }
                "subscribe" -> {
                    return tryDeserialize(node, jacksonTypeRef<Subscribe>())?.let {
                        ConnectClientEvent(subscribe = it, _json = json)
                    } ?: ConnectClientEvent(_json = json)
                }
            }

            return ConnectClientEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ConnectClientEvent>(ConnectClientEvent::class) {

        override fun serialize(
            value: ConnectClientEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.ping != null -> generator.writeObject(value.ping)
                value.subscribe != null -> generator.writeObject(value.subscribe)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConnectClientEvent")
            }
        }
    }

    class Subscribe
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<Status>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(status, type, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("subscribe")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [Subscribe].
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Subscribe]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var type: JsonValue = JsonValue.from("subscribe")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscribe: Subscribe) = apply {
                status = subscribe.status
                type = subscribe.type
                additionalProperties = subscribe.additionalProperties.toMutableMap()
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("subscribe")
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
             * Returns an immutable instance of [Subscribe].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Subscribe =
                Subscribe(
                    checkRequired("status", status),
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
        fun validate(): Subscribe = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            _type().let {
                if (it != JsonValue.from("subscribe")) {
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
            (status.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("subscribe")) 1 else 0 }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val AVAILABLE = of("available")

                val PENDING = of("pending")

                val SOLD = of("sold")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                AVAILABLE,
                PENDING,
                SOLD,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVAILABLE,
                PENDING,
                SOLD,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    AVAILABLE -> Value.AVAILABLE
                    PENDING -> Value.PENDING
                    SOLD -> Value.SOLD
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
                    AVAILABLE -> Known.AVAILABLE
                    PENDING -> Known.PENDING
                    SOLD -> Known.SOLD
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Subscribe &&
                status == other.status &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(status, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Subscribe{status=$status, type=$type, additionalProperties=$additionalProperties}"
    }
}
