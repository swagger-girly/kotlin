// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.order

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
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Place a new order in the store */
class OrderCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long? = body.id()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun complete(): Boolean? = body.complete()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun petId(): Long? = body.petId()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int? = body.quantity()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun shipDate(): OffsetDateTime? = body.shipDate()

    /**
     * Order Status
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status? = body.status()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<Long> = body._id()

    /**
     * Returns the raw JSON value of [complete].
     *
     * Unlike [complete], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _complete(): JsonField<Boolean> = body._complete()

    /**
     * Returns the raw JSON value of [petId].
     *
     * Unlike [petId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _petId(): JsonField<Long> = body._petId()

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantity(): JsonField<Int> = body._quantity()

    /**
     * Returns the raw JSON value of [shipDate].
     *
     * Unlike [shipDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipDate(): JsonField<OffsetDateTime> = body._shipDate()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): OrderCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OrderCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [OrderCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(orderCreateParams: OrderCreateParams) = apply {
            body = orderCreateParams.body.toBuilder()
            additionalHeaders = orderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [complete]
         * - [petId]
         * - [quantity]
         * - [shipDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun id(id: Long) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { body.id(id) }

        fun complete(complete: Boolean) = apply { body.complete(complete) }

        /**
         * Sets [Builder.complete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun complete(complete: JsonField<Boolean>) = apply { body.complete(complete) }

        fun petId(petId: Long) = apply { body.petId(petId) }

        /**
         * Sets [Builder.petId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.petId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun petId(petId: JsonField<Long>) = apply { body.petId(petId) }

        fun quantity(quantity: Int) = apply { body.quantity(quantity) }

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { body.quantity(quantity) }

        fun shipDate(shipDate: OffsetDateTime) = apply { body.shipDate(shipDate) }

        /**
         * Sets [Builder.shipDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipDate(shipDate: JsonField<OffsetDateTime>) = apply { body.shipDate(shipDate) }

        /** Order Status */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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
         * Returns an immutable instance of [OrderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrderCreateParams =
            OrderCreateParams(
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
        private val id: JsonField<Long>,
        private val complete: JsonField<Boolean>,
        private val petId: JsonField<Long>,
        private val quantity: JsonField<Int>,
        private val shipDate: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("complete")
            @ExcludeMissing
            complete: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("petId") @ExcludeMissing petId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("shipDate")
            @ExcludeMissing
            shipDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(id, complete, petId, quantity, shipDate, status, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun complete(): Boolean? = complete.getNullable("complete")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun petId(): Long? = petId.getNullable("petId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Int? = quantity.getNullable("quantity")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun shipDate(): OffsetDateTime? = shipDate.getNullable("shipDate")

        /**
         * Order Status
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status? = status.getNullable("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [complete].
         *
         * Unlike [complete], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("complete") @ExcludeMissing fun _complete(): JsonField<Boolean> = complete

        /**
         * Returns the raw JSON value of [petId].
         *
         * Unlike [petId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("petId") @ExcludeMissing fun _petId(): JsonField<Long> = petId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

        /**
         * Returns the raw JSON value of [shipDate].
         *
         * Unlike [shipDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipDate")
        @ExcludeMissing
        fun _shipDate(): JsonField<OffsetDateTime> = shipDate

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var complete: JsonField<Boolean> = JsonMissing.of()
            private var petId: JsonField<Long> = JsonMissing.of()
            private var quantity: JsonField<Int> = JsonMissing.of()
            private var shipDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                id = body.id
                complete = body.complete
                petId = body.petId
                quantity = body.quantity
                shipDate = body.shipDate
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            fun complete(complete: Boolean) = complete(JsonField.of(complete))

            /**
             * Sets [Builder.complete] to an arbitrary JSON value.
             *
             * You should usually call [Builder.complete] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun complete(complete: JsonField<Boolean>) = apply { this.complete = complete }

            fun petId(petId: Long) = petId(JsonField.of(petId))

            /**
             * Sets [Builder.petId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.petId] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun petId(petId: JsonField<Long>) = apply { this.petId = petId }

            fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

            fun shipDate(shipDate: OffsetDateTime) = shipDate(JsonField.of(shipDate))

            /**
             * Sets [Builder.shipDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shipDate(shipDate: JsonField<OffsetDateTime>) = apply { this.shipDate = shipDate }

            /** Order Status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             */
            fun build(): Body =
                Body(
                    id,
                    complete,
                    petId,
                    quantity,
                    shipDate,
                    status,
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

            id()
            complete()
            petId()
            quantity()
            shipDate()
            status()?.validate()
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
                (if (complete.asKnown() == null) 0 else 1) +
                (if (petId.asKnown() == null) 0 else 1) +
                (if (quantity.asKnown() == null) 0 else 1) +
                (if (shipDate.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                complete == other.complete &&
                petId == other.petId &&
                quantity == other.quantity &&
                shipDate == other.shipDate &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, complete, petId, quantity, shipDate, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, complete=$complete, petId=$petId, quantity=$quantity, shipDate=$shipDate, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Order Status */
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

            val PLACED = of("placed")

            val APPROVED = of("approved")

            val DELIVERED = of("delivered")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PLACED,
            APPROVED,
            DELIVERED,
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
            PLACED,
            APPROVED,
            DELIVERED,
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
                PLACED -> Value.PLACED
                APPROVED -> Value.APPROVED
                DELIVERED -> Value.DELIVERED
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
                PLACED -> Known.PLACED
                APPROVED -> Known.APPROVED
                DELIVERED -> Known.DELIVERED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OrderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
