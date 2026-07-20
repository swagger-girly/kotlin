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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.adoptions.Application
import com.hello_world_testingggg.api.models.veterinary.MedicalSummary
import com.hello_world_testingggg.api.models.veterinary.VaccinationRecord
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** A post-adoption placement tracking the pet's transition to its new home. */
class Placement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val application: JsonField<Application>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val activity: JsonField<List<Activity>>,
    private val events: JsonField<List<PlacementEvent>>,
    private val followUpAfter: JsonField<OffsetDateTime>,
    private val logistics: JsonField<Logistics>,
    private val medicalClearance: JsonField<MedicalSummary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("application")
        @ExcludeMissing
        application: JsonField<Application> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("activity")
        @ExcludeMissing
        activity: JsonField<List<Activity>> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<PlacementEvent>> = JsonMissing.of(),
        @JsonProperty("followUpAfter")
        @ExcludeMissing
        followUpAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("logistics")
        @ExcludeMissing
        logistics: JsonField<Logistics> = JsonMissing.of(),
        @JsonProperty("medicalClearance")
        @ExcludeMissing
        medicalClearance: JsonField<MedicalSummary> = JsonMissing.of(),
    ) : this(
        id,
        application,
        createdAt,
        status,
        activity,
        events,
        followUpAfter,
        logistics,
        medicalClearance,
        mutableMapOf(),
    )

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun application(): Application = application.getRequired("application")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Unified activity feed mixing event, milestone, and note entries.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun activity(): List<Activity>? = activity.getNullable("activity")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<PlacementEvent>? = events.getNullable("events")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun followUpAfter(): OffsetDateTime? = followUpAfter.getNullable("followUpAfter")

    /**
     * Transport plan for a placement; pickup and delivery share the transfer-leg shape.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun logistics(): Logistics? = logistics.getNullable("logistics")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun medicalClearance(): MedicalSummary? = medicalClearance.getNullable("medicalClearance")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [application].
     *
     * Unlike [application], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("application")
    @ExcludeMissing
    fun _application(): JsonField<Application> = application

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity") @ExcludeMissing fun _activity(): JsonField<List<Activity>> = activity

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<PlacementEvent>> = events

    /**
     * Returns the raw JSON value of [followUpAfter].
     *
     * Unlike [followUpAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("followUpAfter")
    @ExcludeMissing
    fun _followUpAfter(): JsonField<OffsetDateTime> = followUpAfter

    /**
     * Returns the raw JSON value of [logistics].
     *
     * Unlike [logistics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logistics") @ExcludeMissing fun _logistics(): JsonField<Logistics> = logistics

    /**
     * Returns the raw JSON value of [medicalClearance].
     *
     * Unlike [medicalClearance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("medicalClearance")
    @ExcludeMissing
    fun _medicalClearance(): JsonField<MedicalSummary> = medicalClearance

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
         * Returns a mutable builder for constructing an instance of [Placement].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .application()
         * .createdAt()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Placement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var application: JsonField<Application>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var activity: JsonField<MutableList<Activity>>? = null
        private var events: JsonField<MutableList<PlacementEvent>>? = null
        private var followUpAfter: JsonField<OffsetDateTime> = JsonMissing.of()
        private var logistics: JsonField<Logistics> = JsonMissing.of()
        private var medicalClearance: JsonField<MedicalSummary> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(placement: Placement) = apply {
            id = placement.id
            application = placement.application
            createdAt = placement.createdAt
            status = placement.status
            activity = placement.activity.map { it.toMutableList() }
            events = placement.events.map { it.toMutableList() }
            followUpAfter = placement.followUpAfter
            logistics = placement.logistics
            medicalClearance = placement.medicalClearance
            additionalProperties = placement.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun application(application: Application) = application(JsonField.of(application))

        /**
         * Sets [Builder.application] to an arbitrary JSON value.
         *
         * You should usually call [Builder.application] with a well-typed [Application] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun application(application: JsonField<Application>) = apply {
            this.application = application
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Unified activity feed mixing event, milestone, and note entries. */
        fun activity(activity: List<Activity>) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed `List<Activity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activity(activity: JsonField<List<Activity>>) = apply {
            this.activity = activity.map { it.toMutableList() }
        }

        /**
         * Adds a single [Activity] to [Builder.activity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivity(activity: Activity) = apply {
            this.activity =
                (this.activity ?: JsonField.of(mutableListOf())).also {
                    checkKnown("activity", it).add(activity)
                }
        }

        /**
         * Alias for calling [addActivity] with
         * `Activity.ofPlacementTransferEvent(placementTransferEvent)`.
         */
        fun addActivity(placementTransferEvent: Activity.PlacementTransferEvent) =
            addActivity(Activity.ofPlacementTransferEvent(placementTransferEvent))

        /**
         * Alias for calling [addActivity] with
         * `Activity.ofPlacementCheckupEvent(placementCheckupEvent)`.
         */
        fun addActivity(placementCheckupEvent: Activity.PlacementCheckupEvent) =
            addActivity(Activity.ofPlacementCheckupEvent(placementCheckupEvent))

        /**
         * Alias for calling [addActivity] with
         * `Activity.ofPlacementDisruptionEvent(placementDisruptionEvent)`.
         */
        fun addActivity(placementDisruptionEvent: Activity.PlacementDisruptionEvent) =
            addActivity(Activity.ofPlacementDisruptionEvent(placementDisruptionEvent))

        /** Alias for calling [addActivity] with `Activity.ofPlacementNote(placementNote)`. */
        fun addActivity(placementNote: Activity.PlacementNote) =
            addActivity(Activity.ofPlacementNote(placementNote))

        /**
         * Alias for calling [addActivity] with
         * `Activity.ofPlacementAdoptedMilestone(placementAdoptedMilestone)`.
         */
        fun addActivity(placementAdoptedMilestone: Activity.PlacementAdoptedMilestone) =
            addActivity(Activity.ofPlacementAdoptedMilestone(placementAdoptedMilestone))

        /**
         * Alias for calling [addActivity] with
         * `Activity.ofPlacementReturnedMilestone(placementReturnedMilestone)`.
         */
        fun addActivity(placementReturnedMilestone: Activity.PlacementReturnedMilestone) =
            addActivity(Activity.ofPlacementReturnedMilestone(placementReturnedMilestone))

        fun events(events: List<PlacementEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<PlacementEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<PlacementEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [PlacementEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: PlacementEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** Alias for calling [addEvent] with `PlacementEvent.ofTransfer(transfer)`. */
        fun addEvent(transfer: PlacementEvent.PlacementTransferEvent) =
            addEvent(PlacementEvent.ofTransfer(transfer))

        /** Alias for calling [addEvent] with `PlacementEvent.ofCheckup(checkup)`. */
        fun addEvent(checkup: PlacementEvent.PlacementCheckupEvent) =
            addEvent(PlacementEvent.ofCheckup(checkup))

        /** Alias for calling [addEvent] with `PlacementEvent.ofDisruption(disruption)`. */
        fun addEvent(disruption: PlacementEvent.PlacementDisruptionEvent) =
            addEvent(PlacementEvent.ofDisruption(disruption))

        fun followUpAfter(followUpAfter: OffsetDateTime?) =
            followUpAfter(JsonField.ofNullable(followUpAfter))

        /**
         * Sets [Builder.followUpAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followUpAfter] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun followUpAfter(followUpAfter: JsonField<OffsetDateTime>) = apply {
            this.followUpAfter = followUpAfter
        }

        /** Transport plan for a placement; pickup and delivery share the transfer-leg shape. */
        fun logistics(logistics: Logistics) = logistics(JsonField.of(logistics))

        /**
         * Sets [Builder.logistics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logistics] with a well-typed [Logistics] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logistics(logistics: JsonField<Logistics>) = apply { this.logistics = logistics }

        fun medicalClearance(medicalClearance: MedicalSummary) =
            medicalClearance(JsonField.of(medicalClearance))

        /**
         * Sets [Builder.medicalClearance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medicalClearance] with a well-typed [MedicalSummary]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun medicalClearance(medicalClearance: JsonField<MedicalSummary>) = apply {
            this.medicalClearance = medicalClearance
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
         * Returns an immutable instance of [Placement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .application()
         * .createdAt()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Placement =
            Placement(
                checkRequired("id", id),
                checkRequired("application", application),
                checkRequired("createdAt", createdAt),
                checkRequired("status", status),
                (activity ?: JsonMissing.of()).map { it.toImmutable() },
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                followUpAfter,
                logistics,
                medicalClearance,
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
    fun validate(): Placement = apply {
        if (validated) {
            return@apply
        }

        id()
        application().validate()
        createdAt()
        status().validate()
        activity()?.forEach { it.validate() }
        events()?.forEach { it.validate() }
        followUpAfter()
        logistics()?.validate()
        medicalClearance()?.validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (application.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (activity.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (events.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (followUpAfter.asKnown() == null) 0 else 1) +
            (logistics.asKnown()?.validity() ?: 0) +
            (medicalClearance.asKnown()?.validity() ?: 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PENDING = of("pending")

            val ACTIVE = of("active")

            val COMPLETED = of("completed")

            val DISRUPTED = of("disrupted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            COMPLETED,
            DISRUPTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVE,
            COMPLETED,
            DISRUPTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                ACTIVE -> Value.ACTIVE
                COMPLETED -> Value.COMPLETED
                DISRUPTED -> Value.DISRUPTED
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
                PENDING -> Known.PENDING
                ACTIVE -> Known.ACTIVE
                COMPLETED -> Known.COMPLETED
                DISRUPTED -> Known.DISRUPTED
                else -> throw HelloWorldTestinggggInvalidDataException("Unknown Status: $value")
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

    /**
     * A unified placement activity-feed entry. An undiscriminated union-of-unions: two branches are
     * themselves unions (event kinds and milestones) and one is a plain note.
     */
    @JsonDeserialize(using = Activity.Deserializer::class)
    @JsonSerialize(using = Activity.Serializer::class)
    class Activity
    private constructor(
        private val placementTransferEvent: PlacementTransferEvent? = null,
        private val placementCheckupEvent: PlacementCheckupEvent? = null,
        private val placementDisruptionEvent: PlacementDisruptionEvent? = null,
        private val placementNote: PlacementNote? = null,
        private val placementAdoptedMilestone: PlacementAdoptedMilestone? = null,
        private val placementReturnedMilestone: PlacementReturnedMilestone? = null,
        private val _json: JsonValue? = null,
    ) {

        fun placementTransferEvent(): PlacementTransferEvent? = placementTransferEvent

        fun placementCheckupEvent(): PlacementCheckupEvent? = placementCheckupEvent

        fun placementDisruptionEvent(): PlacementDisruptionEvent? = placementDisruptionEvent

        fun placementNote(): PlacementNote? = placementNote

        fun placementAdoptedMilestone(): PlacementAdoptedMilestone? = placementAdoptedMilestone

        fun placementReturnedMilestone(): PlacementReturnedMilestone? = placementReturnedMilestone

        fun isPlacementTransferEvent(): Boolean = placementTransferEvent != null

        fun isPlacementCheckupEvent(): Boolean = placementCheckupEvent != null

        fun isPlacementDisruptionEvent(): Boolean = placementDisruptionEvent != null

        fun isPlacementNote(): Boolean = placementNote != null

        fun isPlacementAdoptedMilestone(): Boolean = placementAdoptedMilestone != null

        fun isPlacementReturnedMilestone(): Boolean = placementReturnedMilestone != null

        fun asPlacementTransferEvent(): PlacementTransferEvent =
            placementTransferEvent.getOrThrow("placementTransferEvent")

        fun asPlacementCheckupEvent(): PlacementCheckupEvent =
            placementCheckupEvent.getOrThrow("placementCheckupEvent")

        fun asPlacementDisruptionEvent(): PlacementDisruptionEvent =
            placementDisruptionEvent.getOrThrow("placementDisruptionEvent")

        fun asPlacementNote(): PlacementNote = placementNote.getOrThrow("placementNote")

        fun asPlacementAdoptedMilestone(): PlacementAdoptedMilestone =
            placementAdoptedMilestone.getOrThrow("placementAdoptedMilestone")

        fun asPlacementReturnedMilestone(): PlacementReturnedMilestone =
            placementReturnedMilestone.getOrThrow("placementReturnedMilestone")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.hello_world_testingggg.api.core.JsonValue
         *
         * val result: String? = activity.accept(object : Activity.Visitor<String?> {
         *     override fun visitPlacementTransferEvent(placementTransferEvent: PlacementTransferEvent): String? = placementTransferEvent.toString()
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
         * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not overridden
         *   in [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                placementTransferEvent != null ->
                    visitor.visitPlacementTransferEvent(placementTransferEvent)
                placementCheckupEvent != null ->
                    visitor.visitPlacementCheckupEvent(placementCheckupEvent)
                placementDisruptionEvent != null ->
                    visitor.visitPlacementDisruptionEvent(placementDisruptionEvent)
                placementNote != null -> visitor.visitPlacementNote(placementNote)
                placementAdoptedMilestone != null ->
                    visitor.visitPlacementAdoptedMilestone(placementAdoptedMilestone)
                placementReturnedMilestone != null ->
                    visitor.visitPlacementReturnedMilestone(placementReturnedMilestone)
                else -> visitor.unknown(_json)
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
        fun validate(): Activity = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPlacementTransferEvent(
                        placementTransferEvent: PlacementTransferEvent
                    ) {
                        placementTransferEvent.validate()
                    }

                    override fun visitPlacementCheckupEvent(
                        placementCheckupEvent: PlacementCheckupEvent
                    ) {
                        placementCheckupEvent.validate()
                    }

                    override fun visitPlacementDisruptionEvent(
                        placementDisruptionEvent: PlacementDisruptionEvent
                    ) {
                        placementDisruptionEvent.validate()
                    }

                    override fun visitPlacementNote(placementNote: PlacementNote) {
                        placementNote.validate()
                    }

                    override fun visitPlacementAdoptedMilestone(
                        placementAdoptedMilestone: PlacementAdoptedMilestone
                    ) {
                        placementAdoptedMilestone.validate()
                    }

                    override fun visitPlacementReturnedMilestone(
                        placementReturnedMilestone: PlacementReturnedMilestone
                    ) {
                        placementReturnedMilestone.validate()
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
                    override fun visitPlacementTransferEvent(
                        placementTransferEvent: PlacementTransferEvent
                    ) = placementTransferEvent.validity()

                    override fun visitPlacementCheckupEvent(
                        placementCheckupEvent: PlacementCheckupEvent
                    ) = placementCheckupEvent.validity()

                    override fun visitPlacementDisruptionEvent(
                        placementDisruptionEvent: PlacementDisruptionEvent
                    ) = placementDisruptionEvent.validity()

                    override fun visitPlacementNote(placementNote: PlacementNote) =
                        placementNote.validity()

                    override fun visitPlacementAdoptedMilestone(
                        placementAdoptedMilestone: PlacementAdoptedMilestone
                    ) = placementAdoptedMilestone.validity()

                    override fun visitPlacementReturnedMilestone(
                        placementReturnedMilestone: PlacementReturnedMilestone
                    ) = placementReturnedMilestone.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Activity &&
                placementTransferEvent == other.placementTransferEvent &&
                placementCheckupEvent == other.placementCheckupEvent &&
                placementDisruptionEvent == other.placementDisruptionEvent &&
                placementNote == other.placementNote &&
                placementAdoptedMilestone == other.placementAdoptedMilestone &&
                placementReturnedMilestone == other.placementReturnedMilestone
        }

        override fun hashCode(): Int =
            Objects.hash(
                placementTransferEvent,
                placementCheckupEvent,
                placementDisruptionEvent,
                placementNote,
                placementAdoptedMilestone,
                placementReturnedMilestone,
            )

        override fun toString(): String =
            when {
                placementTransferEvent != null ->
                    "Activity{placementTransferEvent=$placementTransferEvent}"
                placementCheckupEvent != null ->
                    "Activity{placementCheckupEvent=$placementCheckupEvent}"
                placementDisruptionEvent != null ->
                    "Activity{placementDisruptionEvent=$placementDisruptionEvent}"
                placementNote != null -> "Activity{placementNote=$placementNote}"
                placementAdoptedMilestone != null ->
                    "Activity{placementAdoptedMilestone=$placementAdoptedMilestone}"
                placementReturnedMilestone != null ->
                    "Activity{placementReturnedMilestone=$placementReturnedMilestone}"
                _json != null -> "Activity{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Activity")
            }

        companion object {

            fun ofPlacementTransferEvent(placementTransferEvent: PlacementTransferEvent) =
                Activity(placementTransferEvent = placementTransferEvent)

            fun ofPlacementCheckupEvent(placementCheckupEvent: PlacementCheckupEvent) =
                Activity(placementCheckupEvent = placementCheckupEvent)

            fun ofPlacementDisruptionEvent(placementDisruptionEvent: PlacementDisruptionEvent) =
                Activity(placementDisruptionEvent = placementDisruptionEvent)

            fun ofPlacementNote(placementNote: PlacementNote) =
                Activity(placementNote = placementNote)

            fun ofPlacementAdoptedMilestone(placementAdoptedMilestone: PlacementAdoptedMilestone) =
                Activity(placementAdoptedMilestone = placementAdoptedMilestone)

            fun ofPlacementReturnedMilestone(
                placementReturnedMilestone: PlacementReturnedMilestone
            ) = Activity(placementReturnedMilestone = placementReturnedMilestone)
        }

        /**
         * An interface that defines how to map each variant of [Activity] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPlacementTransferEvent(placementTransferEvent: PlacementTransferEvent): T

            fun visitPlacementCheckupEvent(placementCheckupEvent: PlacementCheckupEvent): T

            fun visitPlacementDisruptionEvent(placementDisruptionEvent: PlacementDisruptionEvent): T

            fun visitPlacementNote(placementNote: PlacementNote): T

            fun visitPlacementAdoptedMilestone(
                placementAdoptedMilestone: PlacementAdoptedMilestone
            ): T

            fun visitPlacementReturnedMilestone(
                placementReturnedMilestone: PlacementReturnedMilestone
            ): T

            /**
             * Maps an unknown variant of [Activity] to a value of type [T].
             *
             * An instance of [Activity] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown Activity: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Activity>(Activity::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Activity {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PlacementTransferEvent>())?.let {
                                Activity(placementTransferEvent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PlacementCheckupEvent>())?.let {
                                Activity(placementCheckupEvent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PlacementDisruptionEvent>())?.let {
                                Activity(placementDisruptionEvent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PlacementNote>())?.let {
                                Activity(placementNote = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PlacementAdoptedMilestone>())?.let {
                                Activity(placementAdoptedMilestone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PlacementReturnedMilestone>())
                                ?.let { Activity(placementReturnedMilestone = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Activity(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Activity>(Activity::class) {

            override fun serialize(
                value: Activity,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.placementTransferEvent != null ->
                        generator.writeObject(value.placementTransferEvent)
                    value.placementCheckupEvent != null ->
                        generator.writeObject(value.placementCheckupEvent)
                    value.placementDisruptionEvent != null ->
                        generator.writeObject(value.placementDisruptionEvent)
                    value.placementNote != null -> generator.writeObject(value.placementNote)
                    value.placementAdoptedMilestone != null ->
                        generator.writeObject(value.placementAdoptedMilestone)
                    value.placementReturnedMilestone != null ->
                        generator.writeObject(value.placementReturnedMilestone)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Activity")
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
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun leg(): TransferLeg = leg.getRequired("leg")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
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
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [PlacementTransferEvent].
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
                    additionalProperties =
                        placementTransferEvent.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun leg(leg: TransferLeg) = leg(JsonField.of(leg))

                /**
                 * Sets [Builder.leg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.leg] with a well-typed [TransferLeg] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun leg(leg: JsonField<TransferLeg>) = apply { this.leg = leg }

                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                    this.occurredAt = occurredAt
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun note(note: String?) = note(JsonField.ofNullable(note))

                /**
                 * Sets [Builder.note] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.note] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun note(note: JsonField<String>) = apply { this.note = note }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
             *   doesn't match its expected type.
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRANSFER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   is a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRANSFER -> Known.TRANSFER
                        else ->
                            throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun followUp(): FollowUp? = followUp.getNullable("followUp")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun note(): String? = note.getNullable("note")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
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
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [followUp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("followUp")
            @ExcludeMissing
            fun _followUp(): JsonField<FollowUp> = followUp

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
            @JsonProperty("record")
            @ExcludeMissing
            fun _record(): JsonField<VaccinationRecord> = record

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
                 * [PlacementCheckupEvent].
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                    this.occurredAt = occurredAt
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun followUp(followUp: FollowUp) = followUp(JsonField.of(followUp))

                /**
                 * Sets [Builder.followUp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.followUp] with a well-typed [FollowUp] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun followUp(followUp: JsonField<FollowUp>) = apply { this.followUp = followUp }

                fun note(note: String?) = note(JsonField.ofNullable(note))

                /**
                 * Sets [Builder.note] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.note] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun note(note: JsonField<String>) = apply { this.note = note }

                fun record(record: VaccinationRecord) = record(JsonField.of(record))

                /**
                 * Sets [Builder.record] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.record] with a well-typed [VaccinationRecord]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun record(record: JsonField<VaccinationRecord>) = apply { this.record = record }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
             *   doesn't match its expected type.
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECKUP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   is a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHECKUP -> Known.CHECKUP
                        else ->
                            throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(due, reason, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun due(): OffsetDateTime? = due.getNullable("due")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
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
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.due] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun due(due: JsonField<OffsetDateTime>) = apply { this.due = due }

                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                    fun build(): FollowUp =
                        FollowUp(due, reason, additionalProperties.toMutableMap())
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

                private val hashCode: Int by lazy {
                    Objects.hash(due, reason, additionalProperties)
                }

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
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

            /**
             * A numeric severity score or a structured assessment.
             *
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun severity(): Severity = severity.getRequired("severity")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
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
             * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occurredAt")
            @ExcludeMissing
            fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

            /**
             * Returns the raw JSON value of [severity].
             *
             * Unlike [severity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("severity")
            @ExcludeMissing
            fun _severity(): JsonField<Severity> = severity

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
                 * Returns a mutable builder for constructing an instance of
                 * [PlacementDisruptionEvent].
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
                    additionalProperties =
                        placementDisruptionEvent.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

                /**
                 * Sets [Builder.occurredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun note(note: String?) = note(JsonField.ofNullable(note))

                /**
                 * Sets [Builder.note] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.note] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun note(note: JsonField<String>) = apply { this.note = note }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
             *   doesn't match its expected type.
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
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
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

                            override fun visitAssessment(assessment: Assessment) =
                                assessment.validity()

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
                 * An interface that defines how to map each variant of [Severity] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitInt(int: Int): T

                    fun visitAssessment(assessment: Assessment): T

                    /**
                     * Maps an unknown variant of [Severity] to a value of type [T].
                     *
                     * An instance of [Severity] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HelloWorldTestinggggInvalidDataException in the default
                     *   implementation.
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
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Severity(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                     * Unlike [reviewer], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun level(level: JsonField<Level>) = apply { this.level = level }

                        fun reviewer(reviewer: String) = reviewer(JsonField.of(reviewer))

                        /**
                         * Sets [Builder.reviewer] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.reviewer] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun reviewer(reviewer: JsonField<String>) = apply {
                            this.reviewer = reviewer
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HelloWorldTestinggggInvalidDataException if any value type in this
                     *   object doesn't match its expected type.
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
                        (level.asKnown()?.validity() ?: 0) +
                            (if (reviewer.asKnown() == null) 0 else 1)

                    class Level
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
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
                         * An enum containing [Level]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Level] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            LOW,
                            HIGH,
                            CRITICAL,
                            /**
                             * An enum member indicating that [Level] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws HelloWorldTestinggggInvalidDataException if any value type in
                         *   this object doesn't match its expected type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DISRUPTION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   is a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        DISRUPTION -> Known.DISRUPTION
                        else ->
                            throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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

        class PlacementNote
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val body: JsonField<String>,
            private val kind: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
            ) : this(body, kind, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun body(): String = body.getRequired("body")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("note")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * Returns the raw JSON value of [body].
             *
             * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

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
                 * Returns a mutable builder for constructing an instance of [PlacementNote].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .body()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlacementNote]. */
            class Builder internal constructor() {

                private var body: JsonField<String>? = null
                private var kind: JsonValue = JsonValue.from("note")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(placementNote: PlacementNote) = apply {
                    body = placementNote.body
                    kind = placementNote.kind
                    additionalProperties = placementNote.additionalProperties.toMutableMap()
                }

                fun body(body: String) = body(JsonField.of(body))

                /**
                 * Sets [Builder.body] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.body] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun body(body: JsonField<String>) = apply { this.body = body }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("note")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

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
                 * Returns an immutable instance of [PlacementNote].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .body()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlacementNote =
                    PlacementNote(
                        checkRequired("body", body),
                        kind,
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
            fun validate(): PlacementNote = apply {
                if (validated) {
                    return@apply
                }

                body()
                _kind().let {
                    if (it != JsonValue.from("note")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'kind' is invalid, received $it"
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
                (if (body.asKnown() == null) 0 else 1) +
                    kind.let { if (it == JsonValue.from("note")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlacementNote &&
                    body == other.body &&
                    kind == other.kind &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(body, kind, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlacementNote{body=$body, kind=$kind, additionalProperties=$additionalProperties}"
        }

        class PlacementAdoptedMilestone
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val adoptedAt: JsonField<OffsetDateTime>,
            private val kind: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("adoptedAt")
                @ExcludeMissing
                adoptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
            ) : this(adoptedAt, kind, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun adoptedAt(): OffsetDateTime = adoptedAt.getRequired("adoptedAt")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("adopted")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * Returns the raw JSON value of [adoptedAt].
             *
             * Unlike [adoptedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("adoptedAt")
            @ExcludeMissing
            fun _adoptedAt(): JsonField<OffsetDateTime> = adoptedAt

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
                 * [PlacementAdoptedMilestone].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adoptedAt()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlacementAdoptedMilestone]. */
            class Builder internal constructor() {

                private var adoptedAt: JsonField<OffsetDateTime>? = null
                private var kind: JsonValue = JsonValue.from("adopted")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(placementAdoptedMilestone: PlacementAdoptedMilestone) = apply {
                    adoptedAt = placementAdoptedMilestone.adoptedAt
                    kind = placementAdoptedMilestone.kind
                    additionalProperties =
                        placementAdoptedMilestone.additionalProperties.toMutableMap()
                }

                fun adoptedAt(adoptedAt: OffsetDateTime) = adoptedAt(JsonField.of(adoptedAt))

                /**
                 * Sets [Builder.adoptedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adoptedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun adoptedAt(adoptedAt: JsonField<OffsetDateTime>) = apply {
                    this.adoptedAt = adoptedAt
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("adopted")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

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
                 * Returns an immutable instance of [PlacementAdoptedMilestone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .adoptedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlacementAdoptedMilestone =
                    PlacementAdoptedMilestone(
                        checkRequired("adoptedAt", adoptedAt),
                        kind,
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
            fun validate(): PlacementAdoptedMilestone = apply {
                if (validated) {
                    return@apply
                }

                adoptedAt()
                _kind().let {
                    if (it != JsonValue.from("adopted")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'kind' is invalid, received $it"
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
                (if (adoptedAt.asKnown() == null) 0 else 1) +
                    kind.let { if (it == JsonValue.from("adopted")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlacementAdoptedMilestone &&
                    adoptedAt == other.adoptedAt &&
                    kind == other.kind &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(adoptedAt, kind, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlacementAdoptedMilestone{adoptedAt=$adoptedAt, kind=$kind, additionalProperties=$additionalProperties}"
        }

        class PlacementReturnedMilestone
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(kind, reason, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("returned")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun reason(): String = reason.getRequired("reason")

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PlacementReturnedMilestone].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlacementReturnedMilestone]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("returned")
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(placementReturnedMilestone: PlacementReturnedMilestone) = apply {
                    kind = placementReturnedMilestone.kind
                    reason = placementReturnedMilestone.reason
                    additionalProperties =
                        placementReturnedMilestone.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("returned")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

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
                 * Returns an immutable instance of [PlacementReturnedMilestone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlacementReturnedMilestone =
                    PlacementReturnedMilestone(
                        kind,
                        checkRequired("reason", reason),
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
            fun validate(): PlacementReturnedMilestone = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("returned")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'kind' is invalid, received $it"
                        )
                    }
                }
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
                kind.let { if (it == JsonValue.from("returned")) 1 else 0 } +
                    (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlacementReturnedMilestone &&
                    kind == other.kind &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(kind, reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlacementReturnedMilestone{kind=$kind, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    /** Transport plan for a placement; pickup and delivery share the transfer-leg shape. */
    class Logistics
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val delivery: JsonField<TransferLeg>,
        private val handler: JsonField<Handler>,
        private val pickup: JsonField<TransferLeg>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delivery")
            @ExcludeMissing
            delivery: JsonField<TransferLeg> = JsonMissing.of(),
            @JsonProperty("handler") @ExcludeMissing handler: JsonField<Handler> = JsonMissing.of(),
            @JsonProperty("pickup")
            @ExcludeMissing
            pickup: JsonField<TransferLeg> = JsonMissing.of(),
        ) : this(delivery, handler, pickup, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun delivery(): TransferLeg? = delivery.getNullable("delivery")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun handler(): Handler? = handler.getNullable("handler")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pickup(): TransferLeg? = pickup.getNullable("pickup")

        /**
         * Returns the raw JSON value of [delivery].
         *
         * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonField<TransferLeg> = delivery

        /**
         * Returns the raw JSON value of [handler].
         *
         * Unlike [handler], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("handler") @ExcludeMissing fun _handler(): JsonField<Handler> = handler

        /**
         * Returns the raw JSON value of [pickup].
         *
         * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<TransferLeg> = pickup

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

            /** Returns a mutable builder for constructing an instance of [Logistics]. */
            fun builder() = Builder()
        }

        /** A builder for [Logistics]. */
        class Builder internal constructor() {

            private var delivery: JsonField<TransferLeg> = JsonMissing.of()
            private var handler: JsonField<Handler> = JsonMissing.of()
            private var pickup: JsonField<TransferLeg> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logistics: Logistics) = apply {
                delivery = logistics.delivery
                handler = logistics.handler
                pickup = logistics.pickup
                additionalProperties = logistics.additionalProperties.toMutableMap()
            }

            fun delivery(delivery: TransferLeg) = delivery(JsonField.of(delivery))

            /**
             * Sets [Builder.delivery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delivery] with a well-typed [TransferLeg] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delivery(delivery: JsonField<TransferLeg>) = apply { this.delivery = delivery }

            fun handler(handler: Handler) = handler(JsonField.of(handler))

            /**
             * Sets [Builder.handler] to an arbitrary JSON value.
             *
             * You should usually call [Builder.handler] with a well-typed [Handler] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun handler(handler: JsonField<Handler>) = apply { this.handler = handler }

            fun pickup(pickup: TransferLeg) = pickup(JsonField.of(pickup))

            /**
             * Sets [Builder.pickup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickup] with a well-typed [TransferLeg] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickup(pickup: JsonField<TransferLeg>) = apply { this.pickup = pickup }

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
             * Returns an immutable instance of [Logistics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Logistics =
                Logistics(delivery, handler, pickup, additionalProperties.toMutableMap())
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
        fun validate(): Logistics = apply {
            if (validated) {
                return@apply
            }

            delivery()?.validate()
            handler()?.validate()
            pickup()?.validate()
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
            (delivery.asKnown()?.validity() ?: 0) +
                (handler.asKnown()?.validity() ?: 0) +
                (pickup.asKnown()?.validity() ?: 0)

        class Handler
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val certification: JsonField<Certification>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("certification")
                @ExcludeMissing
                certification: JsonField<Certification> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(certification, name, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun certification(): Certification? = certification.getNullable("certification")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [certification].
             *
             * Unlike [certification], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("certification")
            @ExcludeMissing
            fun _certification(): JsonField<Certification> = certification

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Handler]. */
                fun builder() = Builder()
            }

            /** A builder for [Handler]. */
            class Builder internal constructor() {

                private var certification: JsonField<Certification> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(handler: Handler) = apply {
                    certification = handler.certification
                    name = handler.name
                    additionalProperties = handler.additionalProperties.toMutableMap()
                }

                fun certification(certification: Certification) =
                    certification(JsonField.of(certification))

                /**
                 * Sets [Builder.certification] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.certification] with a well-typed [Certification]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun certification(certification: JsonField<Certification>) = apply {
                    this.certification = certification
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Handler].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Handler =
                    Handler(certification, name, additionalProperties.toMutableMap())
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
            fun validate(): Handler = apply {
                if (validated) {
                    return@apply
                }

                certification()?.validate()
                name()
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
                (certification.asKnown()?.validity() ?: 0) + (if (name.asKnown() == null) 0 else 1)

            class Certification
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val level: JsonField<Level>,
                private val audit: JsonField<Audit>,
                private val issuedBy: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("level")
                    @ExcludeMissing
                    level: JsonField<Level> = JsonMissing.of(),
                    @JsonProperty("audit")
                    @ExcludeMissing
                    audit: JsonField<Audit> = JsonMissing.of(),
                    @JsonProperty("issuedBy")
                    @ExcludeMissing
                    issuedBy: JsonField<String> = JsonMissing.of(),
                ) : this(level, audit, issuedBy, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun level(): Level = level.getRequired("level")

                /**
                 * Provenance stamp attached to records across unrelated resources.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun audit(): Audit? = audit.getNullable("audit")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun issuedBy(): String? = issuedBy.getNullable("issuedBy")

                /**
                 * Returns the raw JSON value of [level].
                 *
                 * Unlike [level], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

                /**
                 * Returns the raw JSON value of [audit].
                 *
                 * Unlike [audit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("audit") @ExcludeMissing fun _audit(): JsonField<Audit> = audit

                /**
                 * Returns the raw JSON value of [issuedBy].
                 *
                 * Unlike [issuedBy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("issuedBy")
                @ExcludeMissing
                fun _issuedBy(): JsonField<String> = issuedBy

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
                     * Returns a mutable builder for constructing an instance of [Certification].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .level()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Certification]. */
                class Builder internal constructor() {

                    private var level: JsonField<Level>? = null
                    private var audit: JsonField<Audit> = JsonMissing.of()
                    private var issuedBy: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(certification: Certification) = apply {
                        level = certification.level
                        audit = certification.audit
                        issuedBy = certification.issuedBy
                        additionalProperties = certification.additionalProperties.toMutableMap()
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

                    /** Provenance stamp attached to records across unrelated resources. */
                    fun audit(audit: Audit) = audit(JsonField.of(audit))

                    /**
                     * Sets [Builder.audit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.audit] with a well-typed [Audit] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun audit(audit: JsonField<Audit>) = apply { this.audit = audit }

                    fun issuedBy(issuedBy: String) = issuedBy(JsonField.of(issuedBy))

                    /**
                     * Sets [Builder.issuedBy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.issuedBy] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun issuedBy(issuedBy: JsonField<String>) = apply { this.issuedBy = issuedBy }

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
                     * Returns an immutable instance of [Certification].
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
                    fun build(): Certification =
                        Certification(
                            checkRequired("level", level),
                            audit,
                            issuedBy,
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
                fun validate(): Certification = apply {
                    if (validated) {
                        return@apply
                    }

                    level().validate()
                    audit()?.validate()
                    issuedBy()
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
                    (level.asKnown()?.validity() ?: 0) +
                        (audit.asKnown()?.validity() ?: 0) +
                        (if (issuedBy.asKnown() == null) 0 else 1)

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

                        val STANDARD = of("standard")

                        val ADVANCED = of("advanced")

                        val SPECIALIST = of("specialist")

                        fun of(value: String) = Level(JsonField.of(value))
                    }

                    /** An enum containing [Level]'s known values. */
                    enum class Known {
                        STANDARD,
                        ADVANCED,
                        SPECIALIST,
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
                        STANDARD,
                        ADVANCED,
                        SPECIALIST,
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
                            STANDARD -> Value.STANDARD
                            ADVANCED -> Value.ADVANCED
                            SPECIALIST -> Value.SPECIALIST
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
                            STANDARD -> Known.STANDARD
                            ADVANCED -> Known.ADVANCED
                            SPECIALIST -> Known.SPECIALIST
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

                /** Provenance stamp attached to records across unrelated resources. */
                class Audit
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val recordedAt: JsonField<OffsetDateTime>,
                    private val recordedBy: JsonField<String>,
                    private val source: JsonField<Source>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("recordedAt")
                        @ExcludeMissing
                        recordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("recordedBy")
                        @ExcludeMissing
                        recordedBy: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("source")
                        @ExcludeMissing
                        source: JsonField<Source> = JsonMissing.of(),
                    ) : this(recordedAt, recordedBy, source, mutableMapOf())

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun recordedAt(): OffsetDateTime = recordedAt.getRequired("recordedAt")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun recordedBy(): String? = recordedBy.getNullable("recordedBy")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun source(): Source? = source.getNullable("source")

                    /**
                     * Returns the raw JSON value of [recordedAt].
                     *
                     * Unlike [recordedAt], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("recordedAt")
                    @ExcludeMissing
                    fun _recordedAt(): JsonField<OffsetDateTime> = recordedAt

                    /**
                     * Returns the raw JSON value of [recordedBy].
                     *
                     * Unlike [recordedBy], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("recordedBy")
                    @ExcludeMissing
                    fun _recordedBy(): JsonField<String> = recordedBy

                    /**
                     * Returns the raw JSON value of [source].
                     *
                     * Unlike [source], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("source")
                    @ExcludeMissing
                    fun _source(): JsonField<Source> = source

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
                         * Returns a mutable builder for constructing an instance of [Audit].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .recordedAt()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Audit]. */
                    class Builder internal constructor() {

                        private var recordedAt: JsonField<OffsetDateTime>? = null
                        private var recordedBy: JsonField<String> = JsonMissing.of()
                        private var source: JsonField<Source> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(audit: Audit) = apply {
                            recordedAt = audit.recordedAt
                            recordedBy = audit.recordedBy
                            source = audit.source
                            additionalProperties = audit.additionalProperties.toMutableMap()
                        }

                        fun recordedAt(recordedAt: OffsetDateTime) =
                            recordedAt(JsonField.of(recordedAt))

                        /**
                         * Sets [Builder.recordedAt] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.recordedAt] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun recordedAt(recordedAt: JsonField<OffsetDateTime>) = apply {
                            this.recordedAt = recordedAt
                        }

                        fun recordedBy(recordedBy: String) = recordedBy(JsonField.of(recordedBy))

                        /**
                         * Sets [Builder.recordedBy] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.recordedBy] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun recordedBy(recordedBy: JsonField<String>) = apply {
                            this.recordedBy = recordedBy
                        }

                        fun source(source: Source) = source(JsonField.of(source))

                        /**
                         * Sets [Builder.source] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.source] with a well-typed [Source] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun source(source: JsonField<Source>) = apply { this.source = source }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Audit].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .recordedAt()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Audit =
                            Audit(
                                checkRequired("recordedAt", recordedAt),
                                recordedBy,
                                source,
                                additionalProperties.toMutableMap(),
                            )
                    }

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
                    fun validate(): Audit = apply {
                        if (validated) {
                            return@apply
                        }

                        recordedAt()
                        recordedBy()
                        source()?.validate()
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
                        (if (recordedAt.asKnown() == null) 0 else 1) +
                            (if (recordedBy.asKnown() == null) 0 else 1) +
                            (source.asKnown()?.validity() ?: 0)

                    class Source
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MANUAL = of("manual")

                            val IMPORT = of("import")

                            val SYSTEM = of("system")

                            fun of(value: String) = Source(JsonField.of(value))
                        }

                        /** An enum containing [Source]'s known values. */
                        enum class Known {
                            MANUAL,
                            IMPORT,
                            SYSTEM,
                        }

                        /**
                         * An enum containing [Source]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Source] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MANUAL,
                            IMPORT,
                            SYSTEM,
                            /**
                             * An enum member indicating that [Source] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                MANUAL -> Value.MANUAL
                                IMPORT -> Value.IMPORT
                                SYSTEM -> Value.SYSTEM
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws HelloWorldTestinggggInvalidDataException if this class instance's
                         *   value is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                MANUAL -> Known.MANUAL
                                IMPORT -> Known.IMPORT
                                SYSTEM -> Known.SYSTEM
                                else ->
                                    throw HelloWorldTestinggggInvalidDataException(
                                        "Unknown Source: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws HelloWorldTestinggggInvalidDataException if any value type in
                         *   this object doesn't match its expected type.
                         */
                        fun validate(): Source = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Source && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Audit &&
                            recordedAt == other.recordedAt &&
                            recordedBy == other.recordedBy &&
                            source == other.source &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(recordedAt, recordedBy, source, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Audit{recordedAt=$recordedAt, recordedBy=$recordedBy, source=$source, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Certification &&
                        level == other.level &&
                        audit == other.audit &&
                        issuedBy == other.issuedBy &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(level, audit, issuedBy, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Certification{level=$level, audit=$audit, issuedBy=$issuedBy, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Handler &&
                    certification == other.certification &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(certification, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Handler{certification=$certification, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logistics &&
                delivery == other.delivery &&
                handler == other.handler &&
                pickup == other.pickup &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(delivery, handler, pickup, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Logistics{delivery=$delivery, handler=$handler, pickup=$pickup, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Placement &&
            id == other.id &&
            application == other.application &&
            createdAt == other.createdAt &&
            status == other.status &&
            activity == other.activity &&
            events == other.events &&
            followUpAfter == other.followUpAfter &&
            logistics == other.logistics &&
            medicalClearance == other.medicalClearance &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            application,
            createdAt,
            status,
            activity,
            events,
            followUpAfter,
            logistics,
            medicalClearance,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Placement{id=$id, application=$application, createdAt=$createdAt, status=$status, activity=$activity, events=$events, followUpAfter=$followUpAfter, logistics=$logistics, medicalClearance=$medicalClearance, additionalProperties=$additionalProperties}"
}
