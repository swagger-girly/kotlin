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
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ParsedWebhookEvent.Deserializer::class)
@JsonSerialize(using = ParsedWebhookEvent.Serializer::class)
class ParsedWebhookEvent
private constructor(
    private val petCreated: PetCreatedWebhookEvent? = null,
    private val petUpdated: PetUpdatedWebhookEvent? = null,
    private val petInventoryLow: PetInventoryLowWebhookEvent? = null,
    private val petModerationApproved: PetModerationApprovedEvent? = null,
    private val petModerationRejected: PetModerationRejectedEvent? = null,
    private val storeReportGenerated: StoreReportGeneratedWebhookEvent? = null,
    private val adoptionsPolicyChanged: AdoptionsPolicyChangedWebhookEvent? = null,
    private val placementEventRecorded: PlacementEventRecordedWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun petCreated(): PetCreatedWebhookEvent? = petCreated

    fun petUpdated(): PetUpdatedWebhookEvent? = petUpdated

    fun petInventoryLow(): PetInventoryLowWebhookEvent? = petInventoryLow

    fun petModerationApproved(): PetModerationApprovedEvent? = petModerationApproved

    fun petModerationRejected(): PetModerationRejectedEvent? = petModerationRejected

    fun storeReportGenerated(): StoreReportGeneratedWebhookEvent? = storeReportGenerated

    fun adoptionsPolicyChanged(): AdoptionsPolicyChangedWebhookEvent? = adoptionsPolicyChanged

    fun placementEventRecorded(): PlacementEventRecordedWebhookEvent? = placementEventRecorded

    fun isPetCreated(): Boolean = petCreated != null

    fun isPetUpdated(): Boolean = petUpdated != null

    fun isPetInventoryLow(): Boolean = petInventoryLow != null

    fun isPetModerationApproved(): Boolean = petModerationApproved != null

    fun isPetModerationRejected(): Boolean = petModerationRejected != null

    fun isStoreReportGenerated(): Boolean = storeReportGenerated != null

    fun isAdoptionsPolicyChanged(): Boolean = adoptionsPolicyChanged != null

    fun isPlacementEventRecorded(): Boolean = placementEventRecorded != null

    fun asPetCreated(): PetCreatedWebhookEvent = petCreated.getOrThrow("petCreated")

    fun asPetUpdated(): PetUpdatedWebhookEvent = petUpdated.getOrThrow("petUpdated")

    fun asPetInventoryLow(): PetInventoryLowWebhookEvent =
        petInventoryLow.getOrThrow("petInventoryLow")

    fun asPetModerationApproved(): PetModerationApprovedEvent =
        petModerationApproved.getOrThrow("petModerationApproved")

    fun asPetModerationRejected(): PetModerationRejectedEvent =
        petModerationRejected.getOrThrow("petModerationRejected")

    fun asStoreReportGenerated(): StoreReportGeneratedWebhookEvent =
        storeReportGenerated.getOrThrow("storeReportGenerated")

    fun asAdoptionsPolicyChanged(): AdoptionsPolicyChangedWebhookEvent =
        adoptionsPolicyChanged.getOrThrow("adoptionsPolicyChanged")

    fun asPlacementEventRecorded(): PlacementEventRecordedWebhookEvent =
        placementEventRecorded.getOrThrow("placementEventRecorded")

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
     * val result: String? = parsedWebhookEvent.accept(object : ParsedWebhookEvent.Visitor<String?> {
     *     override fun visitPetCreated(petCreated: PetCreatedWebhookEvent): String? = petCreated.toString()
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
            petCreated != null -> visitor.visitPetCreated(petCreated)
            petUpdated != null -> visitor.visitPetUpdated(petUpdated)
            petInventoryLow != null -> visitor.visitPetInventoryLow(petInventoryLow)
            petModerationApproved != null ->
                visitor.visitPetModerationApproved(petModerationApproved)
            petModerationRejected != null ->
                visitor.visitPetModerationRejected(petModerationRejected)
            storeReportGenerated != null -> visitor.visitStoreReportGenerated(storeReportGenerated)
            adoptionsPolicyChanged != null ->
                visitor.visitAdoptionsPolicyChanged(adoptionsPolicyChanged)
            placementEventRecorded != null ->
                visitor.visitPlacementEventRecorded(placementEventRecorded)
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
    fun validate(): ParsedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPetCreated(petCreated: PetCreatedWebhookEvent) {
                    petCreated.validate()
                }

                override fun visitPetUpdated(petUpdated: PetUpdatedWebhookEvent) {
                    petUpdated.validate()
                }

                override fun visitPetInventoryLow(petInventoryLow: PetInventoryLowWebhookEvent) {
                    petInventoryLow.validate()
                }

                override fun visitPetModerationApproved(
                    petModerationApproved: PetModerationApprovedEvent
                ) {
                    petModerationApproved.validate()
                }

                override fun visitPetModerationRejected(
                    petModerationRejected: PetModerationRejectedEvent
                ) {
                    petModerationRejected.validate()
                }

                override fun visitStoreReportGenerated(
                    storeReportGenerated: StoreReportGeneratedWebhookEvent
                ) {
                    storeReportGenerated.validate()
                }

                override fun visitAdoptionsPolicyChanged(
                    adoptionsPolicyChanged: AdoptionsPolicyChangedWebhookEvent
                ) {
                    adoptionsPolicyChanged.validate()
                }

                override fun visitPlacementEventRecorded(
                    placementEventRecorded: PlacementEventRecordedWebhookEvent
                ) {
                    placementEventRecorded.validate()
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
                override fun visitPetCreated(petCreated: PetCreatedWebhookEvent) =
                    petCreated.validity()

                override fun visitPetUpdated(petUpdated: PetUpdatedWebhookEvent) =
                    petUpdated.validity()

                override fun visitPetInventoryLow(petInventoryLow: PetInventoryLowWebhookEvent) =
                    petInventoryLow.validity()

                override fun visitPetModerationApproved(
                    petModerationApproved: PetModerationApprovedEvent
                ) = petModerationApproved.validity()

                override fun visitPetModerationRejected(
                    petModerationRejected: PetModerationRejectedEvent
                ) = petModerationRejected.validity()

                override fun visitStoreReportGenerated(
                    storeReportGenerated: StoreReportGeneratedWebhookEvent
                ) = storeReportGenerated.validity()

                override fun visitAdoptionsPolicyChanged(
                    adoptionsPolicyChanged: AdoptionsPolicyChangedWebhookEvent
                ) = adoptionsPolicyChanged.validity()

                override fun visitPlacementEventRecorded(
                    placementEventRecorded: PlacementEventRecordedWebhookEvent
                ) = placementEventRecorded.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsedWebhookEvent &&
            petCreated == other.petCreated &&
            petUpdated == other.petUpdated &&
            petInventoryLow == other.petInventoryLow &&
            petModerationApproved == other.petModerationApproved &&
            petModerationRejected == other.petModerationRejected &&
            storeReportGenerated == other.storeReportGenerated &&
            adoptionsPolicyChanged == other.adoptionsPolicyChanged &&
            placementEventRecorded == other.placementEventRecorded
    }

    override fun hashCode(): Int =
        Objects.hash(
            petCreated,
            petUpdated,
            petInventoryLow,
            petModerationApproved,
            petModerationRejected,
            storeReportGenerated,
            adoptionsPolicyChanged,
            placementEventRecorded,
        )

    override fun toString(): String =
        when {
            petCreated != null -> "ParsedWebhookEvent{petCreated=$petCreated}"
            petUpdated != null -> "ParsedWebhookEvent{petUpdated=$petUpdated}"
            petInventoryLow != null -> "ParsedWebhookEvent{petInventoryLow=$petInventoryLow}"
            petModerationApproved != null ->
                "ParsedWebhookEvent{petModerationApproved=$petModerationApproved}"
            petModerationRejected != null ->
                "ParsedWebhookEvent{petModerationRejected=$petModerationRejected}"
            storeReportGenerated != null ->
                "ParsedWebhookEvent{storeReportGenerated=$storeReportGenerated}"
            adoptionsPolicyChanged != null ->
                "ParsedWebhookEvent{adoptionsPolicyChanged=$adoptionsPolicyChanged}"
            placementEventRecorded != null ->
                "ParsedWebhookEvent{placementEventRecorded=$placementEventRecorded}"
            _json != null -> "ParsedWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParsedWebhookEvent")
        }

    companion object {

        fun ofPetCreated(petCreated: PetCreatedWebhookEvent) =
            ParsedWebhookEvent(petCreated = petCreated)

        fun ofPetUpdated(petUpdated: PetUpdatedWebhookEvent) =
            ParsedWebhookEvent(petUpdated = petUpdated)

        fun ofPetInventoryLow(petInventoryLow: PetInventoryLowWebhookEvent) =
            ParsedWebhookEvent(petInventoryLow = petInventoryLow)

        fun ofPetModerationApproved(petModerationApproved: PetModerationApprovedEvent) =
            ParsedWebhookEvent(petModerationApproved = petModerationApproved)

        fun ofPetModerationRejected(petModerationRejected: PetModerationRejectedEvent) =
            ParsedWebhookEvent(petModerationRejected = petModerationRejected)

        fun ofStoreReportGenerated(storeReportGenerated: StoreReportGeneratedWebhookEvent) =
            ParsedWebhookEvent(storeReportGenerated = storeReportGenerated)

        fun ofAdoptionsPolicyChanged(adoptionsPolicyChanged: AdoptionsPolicyChangedWebhookEvent) =
            ParsedWebhookEvent(adoptionsPolicyChanged = adoptionsPolicyChanged)

        fun ofPlacementEventRecorded(placementEventRecorded: PlacementEventRecordedWebhookEvent) =
            ParsedWebhookEvent(placementEventRecorded = placementEventRecorded)
    }

    /**
     * An interface that defines how to map each variant of [ParsedWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPetCreated(petCreated: PetCreatedWebhookEvent): T

        fun visitPetUpdated(petUpdated: PetUpdatedWebhookEvent): T

        fun visitPetInventoryLow(petInventoryLow: PetInventoryLowWebhookEvent): T

        fun visitPetModerationApproved(petModerationApproved: PetModerationApprovedEvent): T

        fun visitPetModerationRejected(petModerationRejected: PetModerationRejectedEvent): T

        fun visitStoreReportGenerated(storeReportGenerated: StoreReportGeneratedWebhookEvent): T

        fun visitAdoptionsPolicyChanged(
            adoptionsPolicyChanged: AdoptionsPolicyChangedWebhookEvent
        ): T

        fun visitPlacementEventRecorded(
            placementEventRecorded: PlacementEventRecordedWebhookEvent
        ): T

        /**
         * Maps an unknown variant of [ParsedWebhookEvent] to a value of type [T].
         *
         * An instance of [ParsedWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException("Unknown ParsedWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ParsedWebhookEvent>(ParsedWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParsedWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PetCreatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(petCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PetUpdatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(petUpdated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PetInventoryLowWebhookEvent>())?.let {
                            ParsedWebhookEvent(petInventoryLow = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PetModerationApprovedEvent>())?.let {
                            ParsedWebhookEvent(petModerationApproved = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PetModerationRejectedEvent>())?.let {
                            ParsedWebhookEvent(petModerationRejected = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StoreReportGeneratedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(storeReportGenerated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<AdoptionsPolicyChangedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(adoptionsPolicyChanged = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<PlacementEventRecordedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(placementEventRecorded = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ParsedWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ParsedWebhookEvent>(ParsedWebhookEvent::class) {

        override fun serialize(
            value: ParsedWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.petCreated != null -> generator.writeObject(value.petCreated)
                value.petUpdated != null -> generator.writeObject(value.petUpdated)
                value.petInventoryLow != null -> generator.writeObject(value.petInventoryLow)
                value.petModerationApproved != null ->
                    generator.writeObject(value.petModerationApproved)
                value.petModerationRejected != null ->
                    generator.writeObject(value.petModerationRejected)
                value.storeReportGenerated != null ->
                    generator.writeObject(value.storeReportGenerated)
                value.adoptionsPolicyChanged != null ->
                    generator.writeObject(value.adoptionsPolicyChanged)
                value.placementEventRecorded != null ->
                    generator.writeObject(value.placementEventRecorded)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParsedWebhookEvent")
            }
        }
    }

    class PetModerationApprovedEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val pet: JsonField<Pet>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
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
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

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

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * [PetModerationApprovedEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .pet()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PetModerationApprovedEvent]. */
        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var pet: JsonField<Pet>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(petModerationApprovedEvent: PetModerationApprovedEvent) = apply {
                approvedAt = petModerationApprovedEvent.approvedAt
                pet = petModerationApprovedEvent.pet
                type = petModerationApprovedEvent.type
                additionalProperties =
                    petModerationApprovedEvent.additionalProperties.toMutableMap()
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

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [PetModerationApprovedEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .pet()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PetModerationApprovedEvent =
                PetModerationApprovedEvent(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("pet", pet),
                    checkRequired("type", type),
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
        fun validate(): PetModerationApprovedEvent = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            pet().validate()
            type().validate()
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
                (type.asKnown()?.validity() ?: 0)

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

                val PET_MODERATION_APPROVED = of("pet.moderation.approved")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PET_MODERATION_APPROVED
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
                PET_MODERATION_APPROVED,
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
                    PET_MODERATION_APPROVED -> Value.PET_MODERATION_APPROVED
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
                    PET_MODERATION_APPROVED -> Known.PET_MODERATION_APPROVED
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

            return other is PetModerationApprovedEvent &&
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
            "PetModerationApprovedEvent{approvedAt=$approvedAt, pet=$pet, type=$type, additionalProperties=$additionalProperties}"
    }

    class PetModerationRejectedEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pet: JsonField<Pet>,
        private val reason: JsonField<Reason>,
        private val type: JsonField<Type>,
        private val reviewNotes: JsonField<List<ReviewNote>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
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
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of
             * [PetModerationRejectedEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * .reason()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PetModerationRejectedEvent]. */
        class Builder internal constructor() {

            private var pet: JsonField<Pet>? = null
            private var reason: JsonField<Reason>? = null
            private var type: JsonField<Type>? = null
            private var reviewNotes: JsonField<MutableList<ReviewNote>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(petModerationRejectedEvent: PetModerationRejectedEvent) = apply {
                pet = petModerationRejectedEvent.pet
                reason = petModerationRejectedEvent.reason
                type = petModerationRejectedEvent.type
                reviewNotes = petModerationRejectedEvent.reviewNotes.map { it.toMutableList() }
                additionalProperties =
                    petModerationRejectedEvent.additionalProperties.toMutableMap()
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

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [PetModerationRejectedEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .pet()
             * .reason()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PetModerationRejectedEvent =
                PetModerationRejectedEvent(
                    checkRequired("pet", pet),
                    checkRequired("reason", reason),
                    checkRequired("type", type),
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
        fun validate(): PetModerationRejectedEvent = apply {
            if (validated) {
                return@apply
            }

            pet().validate()
            reason().validate()
            type().validate()
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
                (type.asKnown()?.validity() ?: 0) +
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

                val PET_MODERATION_REJECTED = of("pet.moderation.rejected")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PET_MODERATION_REJECTED
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
                PET_MODERATION_REJECTED,
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
                    PET_MODERATION_REJECTED -> Value.PET_MODERATION_REJECTED
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
                    PET_MODERATION_REJECTED -> Known.PET_MODERATION_REJECTED
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

        class ReviewNote
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val message: JsonField<String>,
            private val reviewer: JsonField<User>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reviewer")
                @ExcludeMissing
                reviewer: JsonField<User> = JsonMissing.of(),
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
            fun reviewer(): User? = reviewer.getNullable("reviewer")

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
            @JsonProperty("reviewer") @ExcludeMissing fun _reviewer(): JsonField<User> = reviewer

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
                private var reviewer: JsonField<User> = JsonMissing.of()
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

                fun reviewer(reviewer: User) = reviewer(JsonField.of(reviewer))

                /**
                 * Sets [Builder.reviewer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reviewer] with a well-typed [User] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reviewer(reviewer: JsonField<User>) = apply { this.reviewer = reviewer }

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

            class User
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<Long>,
                private val email: JsonField<String>,
                private val firstName: JsonField<String>,
                private val lastName: JsonField<String>,
                private val password: JsonField<String>,
                private val phone: JsonField<String>,
                private val relatedAddress: JsonField<Address>,
                private val relatedCategory: JsonValue,
                private val relatedCustomer: JsonValue,
                private val relatedMoney: JsonField<Money>,
                private val relatedOrder: JsonValue,
                private val relatedPet: JsonField<Pet>,
                private val relatedShelter: JsonValue,
                private val relatedTag: JsonValue,
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
                    @JsonProperty("relatedAddress")
                    @ExcludeMissing
                    relatedAddress: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("relatedCategory")
                    @ExcludeMissing
                    relatedCategory: JsonValue = JsonMissing.of(),
                    @JsonProperty("relatedCustomer")
                    @ExcludeMissing
                    relatedCustomer: JsonValue = JsonMissing.of(),
                    @JsonProperty("relatedMoney")
                    @ExcludeMissing
                    relatedMoney: JsonField<Money> = JsonMissing.of(),
                    @JsonProperty("relatedOrder")
                    @ExcludeMissing
                    relatedOrder: JsonValue = JsonMissing.of(),
                    @JsonProperty("relatedPet")
                    @ExcludeMissing
                    relatedPet: JsonField<Pet> = JsonMissing.of(),
                    @JsonProperty("relatedShelter")
                    @ExcludeMissing
                    relatedShelter: JsonValue = JsonMissing.of(),
                    @JsonProperty("relatedTag")
                    @ExcludeMissing
                    relatedTag: JsonValue = JsonMissing.of(),
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
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedShelter,
                    relatedTag,
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
                fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = user.relatedCategory().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedCategory")
                @ExcludeMissing
                fun _relatedCategory(): JsonValue = relatedCategory

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = user.relatedCustomer().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedCustomer")
                @ExcludeMissing
                fun _relatedCustomer(): JsonValue = relatedCustomer

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun relatedMoney(): Money? = relatedMoney.getNullable("relatedMoney")

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = user.relatedOrder().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedOrder")
                @ExcludeMissing
                fun _relatedOrder(): JsonValue = relatedOrder

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun relatedPet(): Pet? = relatedPet.getNullable("relatedPet")

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = user.relatedShelter().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedShelter")
                @ExcludeMissing
                fun _relatedShelter(): JsonValue = relatedShelter

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = user.relatedTag().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedTag")
                @ExcludeMissing
                fun _relatedTag(): JsonValue = relatedTag

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
                 * Returns the raw JSON value of [relatedAddress].
                 *
                 * Unlike [relatedAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("relatedAddress")
                @ExcludeMissing
                fun _relatedAddress(): JsonField<Address> = relatedAddress

                /**
                 * Returns the raw JSON value of [relatedMoney].
                 *
                 * Unlike [relatedMoney], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("relatedMoney")
                @ExcludeMissing
                fun _relatedMoney(): JsonField<Money> = relatedMoney

                /**
                 * Returns the raw JSON value of [relatedPet].
                 *
                 * Unlike [relatedPet], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("relatedPet")
                @ExcludeMissing
                fun _relatedPet(): JsonField<Pet> = relatedPet

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

                    /** Returns a mutable builder for constructing an instance of [User]. */
                    fun builder() = Builder()
                }

                /** A builder for [User]. */
                class Builder internal constructor() {

                    private var id: JsonField<Long> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var password: JsonField<String> = JsonMissing.of()
                    private var phone: JsonField<String> = JsonMissing.of()
                    private var relatedAddress: JsonField<Address> = JsonMissing.of()
                    private var relatedCategory: JsonValue = JsonMissing.of()
                    private var relatedCustomer: JsonValue = JsonMissing.of()
                    private var relatedMoney: JsonField<Money> = JsonMissing.of()
                    private var relatedOrder: JsonValue = JsonMissing.of()
                    private var relatedPet: JsonField<Pet> = JsonMissing.of()
                    private var relatedShelter: JsonValue = JsonMissing.of()
                    private var relatedTag: JsonValue = JsonMissing.of()
                    private var username: JsonField<String> = JsonMissing.of()
                    private var userStatus: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(user: User) = apply {
                        id = user.id
                        email = user.email
                        firstName = user.firstName
                        lastName = user.lastName
                        password = user.password
                        phone = user.phone
                        relatedAddress = user.relatedAddress
                        relatedCategory = user.relatedCategory
                        relatedCustomer = user.relatedCustomer
                        relatedMoney = user.relatedMoney
                        relatedOrder = user.relatedOrder
                        relatedPet = user.relatedPet
                        relatedShelter = user.relatedShelter
                        relatedTag = user.relatedTag
                        username = user.username
                        userStatus = user.userStatus
                        additionalProperties = user.additionalProperties.toMutableMap()
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

                    fun relatedAddress(relatedAddress: Address) =
                        relatedAddress(JsonField.of(relatedAddress))

                    /**
                     * Sets [Builder.relatedAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.relatedAddress] with a well-typed [Address]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun relatedAddress(relatedAddress: JsonField<Address>) = apply {
                        this.relatedAddress = relatedAddress
                    }

                    fun relatedCategory(relatedCategory: JsonValue) = apply {
                        this.relatedCategory = relatedCategory
                    }

                    fun relatedCustomer(relatedCustomer: JsonValue) = apply {
                        this.relatedCustomer = relatedCustomer
                    }

                    fun relatedMoney(relatedMoney: Money) = relatedMoney(JsonField.of(relatedMoney))

                    /**
                     * Sets [Builder.relatedMoney] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.relatedMoney] with a well-typed [Money]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun relatedMoney(relatedMoney: JsonField<Money>) = apply {
                        this.relatedMoney = relatedMoney
                    }

                    fun relatedOrder(relatedOrder: JsonValue) = apply {
                        this.relatedOrder = relatedOrder
                    }

                    fun relatedPet(relatedPet: Pet) = relatedPet(JsonField.of(relatedPet))

                    /**
                     * Sets [Builder.relatedPet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.relatedPet] with a well-typed [Pet] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun relatedPet(relatedPet: JsonField<Pet>) = apply {
                        this.relatedPet = relatedPet
                    }

                    fun relatedShelter(relatedShelter: JsonValue) = apply {
                        this.relatedShelter = relatedShelter
                    }

                    fun relatedTag(relatedTag: JsonValue) = apply { this.relatedTag = relatedTag }

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
                     * Returns an immutable instance of [User].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): User =
                        User(
                            id,
                            email,
                            firstName,
                            lastName,
                            password,
                            phone,
                            relatedAddress,
                            relatedCategory,
                            relatedCustomer,
                            relatedMoney,
                            relatedOrder,
                            relatedPet,
                            relatedShelter,
                            relatedTag,
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
                fun validate(): User = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    email()
                    firstName()
                    lastName()
                    password()
                    phone()
                    relatedAddress()?.validate()
                    relatedMoney()?.validate()
                    relatedPet()?.validate()
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
                        (relatedAddress.asKnown()?.validity() ?: 0) +
                        (relatedMoney.asKnown()?.validity() ?: 0) +
                        (relatedPet.asKnown()?.validity() ?: 0) +
                        (if (username.asKnown() == null) 0 else 1) +
                        (if (userStatus.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is User &&
                        id == other.id &&
                        email == other.email &&
                        firstName == other.firstName &&
                        lastName == other.lastName &&
                        password == other.password &&
                        phone == other.phone &&
                        relatedAddress == other.relatedAddress &&
                        relatedCategory == other.relatedCategory &&
                        relatedCustomer == other.relatedCustomer &&
                        relatedMoney == other.relatedMoney &&
                        relatedOrder == other.relatedOrder &&
                        relatedPet == other.relatedPet &&
                        relatedShelter == other.relatedShelter &&
                        relatedTag == other.relatedTag &&
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
                        relatedAddress,
                        relatedCategory,
                        relatedCustomer,
                        relatedMoney,
                        relatedOrder,
                        relatedPet,
                        relatedShelter,
                        relatedTag,
                        username,
                        userStatus,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "User{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedTag=$relatedTag, username=$username, userStatus=$userStatus, additionalProperties=$additionalProperties}"
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

            return other is PetModerationRejectedEvent &&
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
            "PetModerationRejectedEvent{pet=$pet, reason=$reason, type=$type, reviewNotes=$reviewNotes, additionalProperties=$additionalProperties}"
    }
}
