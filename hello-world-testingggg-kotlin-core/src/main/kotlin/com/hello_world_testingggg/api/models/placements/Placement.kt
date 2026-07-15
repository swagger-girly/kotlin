// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.placements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.adoptions.Application
import com.hello_world_testingggg.api.models.veterinary.MedicalSummary
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
            events,
            followUpAfter,
            logistics,
            medicalClearance,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Placement{id=$id, application=$application, createdAt=$createdAt, status=$status, events=$events, followUpAfter=$followUpAfter, logistics=$logistics, medicalClearance=$medicalClearance, additionalProperties=$additionalProperties}"
}
