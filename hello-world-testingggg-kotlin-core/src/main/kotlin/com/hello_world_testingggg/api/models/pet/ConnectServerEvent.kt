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
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ConnectServerEvent.Deserializer::class)
@JsonSerialize(using = ConnectServerEvent.Serializer::class)
class ConnectServerEvent
private constructor(
    private val pong: JsonValue? = null,
    private val status: Status? = null,
    private val _json: JsonValue? = null,
) {

    fun pong(): JsonValue? = pong

    fun status(): Status? = status

    fun isPong(): Boolean = pong != null

    fun isStatus(): Boolean = status != null

    fun asPong(): JsonValue = pong.getOrThrow("pong")

    fun asStatus(): Status = status.getOrThrow("status")

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
     * val result: String? = connectServerEvent.accept(object : ConnectServerEvent.Visitor<String?> {
     *     override fun visitPong(pong: JsonValue): String? = pong.toString()
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
            pong != null -> visitor.visitPong(pong)
            status != null -> visitor.visitStatus(status)
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
    fun validate(): ConnectServerEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPong(pong: JsonValue) {
                    pong.let {
                        if (it != JsonValue.from(mapOf("type" to "pong"))) {
                            throw HelloWorldTestinggggInvalidDataException(
                                "'pong' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitStatus(status: Status) {
                    status.validate()
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
                override fun visitPong(pong: JsonValue) =
                    pong.let { if (it == JsonValue.from(mapOf("type" to "pong"))) 1 else 0 }

                override fun visitStatus(status: Status) = status.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectServerEvent && pong == other.pong && status == other.status
    }

    override fun hashCode(): Int = Objects.hash(pong, status)

    override fun toString(): String =
        when {
            pong != null -> "ConnectServerEvent{pong=$pong}"
            status != null -> "ConnectServerEvent{status=$status}"
            _json != null -> "ConnectServerEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConnectServerEvent")
        }

    companion object {

        fun ofPong() = ConnectServerEvent(pong = JsonValue.from(mapOf("type" to "pong")))

        fun ofStatus(status: Status) = ConnectServerEvent(status = status)
    }

    /**
     * An interface that defines how to map each variant of [ConnectServerEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPong(pong: JsonValue): T

        fun visitStatus(status: Status): T

        /**
         * Maps an unknown variant of [ConnectServerEvent] to a value of type [T].
         *
         * An instance of [ConnectServerEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException("Unknown ConnectServerEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ConnectServerEvent>(ConnectServerEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConnectServerEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "pong" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ConnectServerEvent(pong = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ConnectServerEvent(_json = json)
                }
                "status" -> {
                    return tryDeserialize(node, jacksonTypeRef<Status>())?.let {
                        ConnectServerEvent(status = it, _json = json)
                    } ?: ConnectServerEvent(_json = json)
                }
            }

            return ConnectServerEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ConnectServerEvent>(ConnectServerEvent::class) {

        override fun serialize(
            value: ConnectServerEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.pong != null -> generator.writeObject(value.pong)
                value.status != null -> generator.writeObject(value.status)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConnectServerEvent")
            }
        }
    }

    class Status
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pet: JsonField<Pet>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(pet, type, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun pet(): Pet = pet.getRequired("pet")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("status")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
             * Returns a mutable builder for constructing an instance of [Status].
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Status]. */
        class Builder internal constructor() {

            private var pet: JsonField<Pet>? = null
            private var type: JsonValue = JsonValue.from("status")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(status: Status) = apply {
                pet = status.pet
                type = status.type
                additionalProperties = status.additionalProperties.toMutableMap()
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
             * JsonValue.from("status")
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
             * Returns an immutable instance of [Status].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Status =
                Status(checkRequired("pet", pet), type, additionalProperties.toMutableMap())
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
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            pet().validate()
            _type().let {
                if (it != JsonValue.from("status")) {
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
            (pet.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("status")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                pet == other.pet &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pet, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Status{pet=$pet, type=$type, additionalProperties=$additionalProperties}"
    }
}
