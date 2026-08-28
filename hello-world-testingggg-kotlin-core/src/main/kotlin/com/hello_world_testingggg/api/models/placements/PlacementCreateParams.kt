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
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Creates a placement for an approved adoption application. */
class PlacementCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationId(): String = body.applicationId()

    /**
     * A placement history entry; the shape depends on the event kind and carries no discriminator
     * mapping.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun initialEvent(): PlacementEvent? = body.initialEvent()

    /**
     * Transport plan for a placement; pickup and delivery share the transfer-leg shape.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun logistics(): Logistics? = body.logistics()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun scheduledFor(): OffsetDateTime? = body.scheduledFor()

    /**
     * Returns the raw JSON value of [applicationId].
     *
     * Unlike [applicationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applicationId(): JsonField<String> = body._applicationId()

    /**
     * Returns the raw JSON value of [initialEvent].
     *
     * Unlike [initialEvent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _initialEvent(): JsonField<PlacementEvent> = body._initialEvent()

    /**
     * Returns the raw JSON value of [logistics].
     *
     * Unlike [logistics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logistics(): JsonField<Logistics> = body._logistics()

    /**
     * Returns the raw JSON value of [scheduledFor].
     *
     * Unlike [scheduledFor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scheduledFor(): JsonField<OffsetDateTime> = body._scheduledFor()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlacementCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlacementCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(placementCreateParams: PlacementCreateParams) = apply {
            body = placementCreateParams.body.toBuilder()
            additionalHeaders = placementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = placementCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [applicationId]
         * - [initialEvent]
         * - [logistics]
         * - [scheduledFor]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun applicationId(applicationId: String) = apply { body.applicationId(applicationId) }

        /**
         * Sets [Builder.applicationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applicationId(applicationId: JsonField<String>) = apply {
            body.applicationId(applicationId)
        }

        /**
         * A placement history entry; the shape depends on the event kind and carries no
         * discriminator mapping.
         */
        fun initialEvent(initialEvent: PlacementEvent) = apply { body.initialEvent(initialEvent) }

        /**
         * Sets [Builder.initialEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialEvent] with a well-typed [PlacementEvent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialEvent(initialEvent: JsonField<PlacementEvent>) = apply {
            body.initialEvent(initialEvent)
        }

        /** Alias for calling [initialEvent] with `PlacementEvent.ofTransfer(transfer)`. */
        fun initialEvent(transfer: PlacementEvent.PlacementTransferEvent) = apply {
            body.initialEvent(transfer)
        }

        /** Alias for calling [initialEvent] with `PlacementEvent.ofCheckup(checkup)`. */
        fun initialEvent(checkup: PlacementEvent.PlacementCheckupEvent) = apply {
            body.initialEvent(checkup)
        }

        /** Alias for calling [initialEvent] with `PlacementEvent.ofDisruption(disruption)`. */
        fun initialEvent(disruption: PlacementEvent.PlacementDisruptionEvent) = apply {
            body.initialEvent(disruption)
        }

        /** Transport plan for a placement; pickup and delivery share the transfer-leg shape. */
        fun logistics(logistics: Logistics) = apply { body.logistics(logistics) }

        /**
         * Sets [Builder.logistics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logistics] with a well-typed [Logistics] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logistics(logistics: JsonField<Logistics>) = apply { body.logistics(logistics) }

        fun scheduledFor(scheduledFor: OffsetDateTime) = apply { body.scheduledFor(scheduledFor) }

        /**
         * Sets [Builder.scheduledFor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledFor] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledFor(scheduledFor: JsonField<OffsetDateTime>) = apply {
            body.scheduledFor(scheduledFor)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PlacementCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlacementCreateParams =
            PlacementCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationId: JsonField<String>,
        private val initialEvent: JsonField<PlacementEvent>,
        private val logistics: JsonField<Logistics>,
        private val scheduledFor: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applicationId")
            @ExcludeMissing
            applicationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initialEvent")
            @ExcludeMissing
            initialEvent: JsonField<PlacementEvent> = JsonMissing.of(),
            @JsonProperty("logistics")
            @ExcludeMissing
            logistics: JsonField<Logistics> = JsonMissing.of(),
            @JsonProperty("scheduledFor")
            @ExcludeMissing
            scheduledFor: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(applicationId, initialEvent, logistics, scheduledFor, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun applicationId(): String = applicationId.getRequired("applicationId")

        /**
         * A placement history entry; the shape depends on the event kind and carries no
         * discriminator mapping.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun initialEvent(): PlacementEvent? = initialEvent.getNullable("initialEvent")

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
        fun scheduledFor(): OffsetDateTime? = scheduledFor.getNullable("scheduledFor")

        /**
         * Returns the raw JSON value of [applicationId].
         *
         * Unlike [applicationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationId")
        @ExcludeMissing
        fun _applicationId(): JsonField<String> = applicationId

        /**
         * Returns the raw JSON value of [initialEvent].
         *
         * Unlike [initialEvent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initialEvent")
        @ExcludeMissing
        fun _initialEvent(): JsonField<PlacementEvent> = initialEvent

        /**
         * Returns the raw JSON value of [logistics].
         *
         * Unlike [logistics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logistics")
        @ExcludeMissing
        fun _logistics(): JsonField<Logistics> = logistics

        /**
         * Returns the raw JSON value of [scheduledFor].
         *
         * Unlike [scheduledFor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduledFor")
        @ExcludeMissing
        fun _scheduledFor(): JsonField<OffsetDateTime> = scheduledFor

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .applicationId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var applicationId: JsonField<String>? = null
            private var initialEvent: JsonField<PlacementEvent> = JsonMissing.of()
            private var logistics: JsonField<Logistics> = JsonMissing.of()
            private var scheduledFor: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                applicationId = body.applicationId
                initialEvent = body.initialEvent
                logistics = body.logistics
                scheduledFor = body.scheduledFor
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun applicationId(applicationId: String) = applicationId(JsonField.of(applicationId))

            /**
             * Sets [Builder.applicationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationId(applicationId: JsonField<String>) = apply {
                this.applicationId = applicationId
            }

            /**
             * A placement history entry; the shape depends on the event kind and carries no
             * discriminator mapping.
             */
            fun initialEvent(initialEvent: PlacementEvent) =
                initialEvent(JsonField.of(initialEvent))

            /**
             * Sets [Builder.initialEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialEvent] with a well-typed [PlacementEvent]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun initialEvent(initialEvent: JsonField<PlacementEvent>) = apply {
                this.initialEvent = initialEvent
            }

            /** Alias for calling [initialEvent] with `PlacementEvent.ofTransfer(transfer)`. */
            fun initialEvent(transfer: PlacementEvent.PlacementTransferEvent) =
                initialEvent(PlacementEvent.ofTransfer(transfer))

            /** Alias for calling [initialEvent] with `PlacementEvent.ofCheckup(checkup)`. */
            fun initialEvent(checkup: PlacementEvent.PlacementCheckupEvent) =
                initialEvent(PlacementEvent.ofCheckup(checkup))

            /** Alias for calling [initialEvent] with `PlacementEvent.ofDisruption(disruption)`. */
            fun initialEvent(disruption: PlacementEvent.PlacementDisruptionEvent) =
                initialEvent(PlacementEvent.ofDisruption(disruption))

            /** Transport plan for a placement; pickup and delivery share the transfer-leg shape. */
            fun logistics(logistics: Logistics) = logistics(JsonField.of(logistics))

            /**
             * Sets [Builder.logistics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logistics] with a well-typed [Logistics] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logistics(logistics: JsonField<Logistics>) = apply { this.logistics = logistics }

            fun scheduledFor(scheduledFor: OffsetDateTime) =
                scheduledFor(JsonField.of(scheduledFor))

            /**
             * Sets [Builder.scheduledFor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledFor] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduledFor(scheduledFor: JsonField<OffsetDateTime>) = apply {
                this.scheduledFor = scheduledFor
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .applicationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("applicationId", applicationId),
                    initialEvent,
                    logistics,
                    scheduledFor,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            applicationId()
            initialEvent()?.validate()
            logistics()?.validate()
            scheduledFor()
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
            (if (applicationId.asKnown() == null) 0 else 1) +
                (initialEvent.asKnown()?.validity() ?: 0) +
                (logistics.asKnown()?.validity() ?: 0) +
                (if (scheduledFor.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                applicationId == other.applicationId &&
                initialEvent == other.initialEvent &&
                logistics == other.logistics &&
                scheduledFor == other.scheduledFor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(applicationId, initialEvent, logistics, scheduledFor, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{applicationId=$applicationId, initialEvent=$initialEvent, logistics=$logistics, scheduledFor=$scheduledFor, additionalProperties=$additionalProperties}"
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

        return other is PlacementCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlacementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
