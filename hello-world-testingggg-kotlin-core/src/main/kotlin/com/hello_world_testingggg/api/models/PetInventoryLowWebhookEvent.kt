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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PetInventoryLowWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pet: JsonField<Pet>,
    private val quantity: JsonField<Int>,
    private val threshold: JsonField<Int>,
    private val type: JsonField<Type>,
    private val lastOrder: JsonField<Order>,
    private val locations: JsonField<List<Address>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("threshold") @ExcludeMissing threshold: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("last_order") @ExcludeMissing lastOrder: JsonField<Order> = JsonMissing.of(),
        @JsonProperty("locations")
        @ExcludeMissing
        locations: JsonField<List<Address>> = JsonMissing.of(),
    ) : this(pet, quantity, threshold, type, lastOrder, locations, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pet(): Pet = pet.getRequired("pet")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threshold(): Int = threshold.getRequired("threshold")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun lastOrder(): Order? = lastOrder.getNullable("last_order")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun locations(): List<Address>? = locations.getNullable("locations")

    /**
     * Returns the raw JSON value of [pet].
     *
     * Unlike [pet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pet") @ExcludeMissing fun _pet(): JsonField<Pet> = pet

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [threshold].
     *
     * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Int> = threshold

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [lastOrder].
     *
     * Unlike [lastOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_order") @ExcludeMissing fun _lastOrder(): JsonField<Order> = lastOrder

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Address>> = locations

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
         * Returns a mutable builder for constructing an instance of [PetInventoryLowWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .pet()
         * .quantity()
         * .threshold()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PetInventoryLowWebhookEvent]. */
    class Builder internal constructor() {

        private var pet: JsonField<Pet>? = null
        private var quantity: JsonField<Int>? = null
        private var threshold: JsonField<Int>? = null
        private var type: JsonField<Type>? = null
        private var lastOrder: JsonField<Order> = JsonMissing.of()
        private var locations: JsonField<MutableList<Address>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(petInventoryLowWebhookEvent: PetInventoryLowWebhookEvent) = apply {
            pet = petInventoryLowWebhookEvent.pet
            quantity = petInventoryLowWebhookEvent.quantity
            threshold = petInventoryLowWebhookEvent.threshold
            type = petInventoryLowWebhookEvent.type
            lastOrder = petInventoryLowWebhookEvent.lastOrder
            locations = petInventoryLowWebhookEvent.locations.map { it.toMutableList() }
            additionalProperties = petInventoryLowWebhookEvent.additionalProperties.toMutableMap()
        }

        fun pet(pet: Pet) = pet(JsonField.of(pet))

        /**
         * Sets [Builder.pet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pet] with a well-typed [Pet] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pet(pet: JsonField<Pet>) = apply { this.pet = pet }

        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        fun threshold(threshold: Int) = threshold(JsonField.of(threshold))

        /**
         * Sets [Builder.threshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threshold] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threshold(threshold: JsonField<Int>) = apply { this.threshold = threshold }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun lastOrder(lastOrder: Order) = lastOrder(JsonField.of(lastOrder))

        /**
         * Sets [Builder.lastOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastOrder] with a well-typed [Order] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastOrder(lastOrder: JsonField<Order>) = apply { this.lastOrder = lastOrder }

        fun locations(locations: List<Address>) = locations(JsonField.of(locations))

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed `List<Address>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locations(locations: JsonField<List<Address>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Address] to [locations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Address) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("locations", it).add(location)
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
         * Returns an immutable instance of [PetInventoryLowWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .pet()
         * .quantity()
         * .threshold()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PetInventoryLowWebhookEvent =
            PetInventoryLowWebhookEvent(
                checkRequired("pet", pet),
                checkRequired("quantity", quantity),
                checkRequired("threshold", threshold),
                checkRequired("type", type),
                lastOrder,
                (locations ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PetInventoryLowWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        pet().validate()
        quantity()
        threshold()
        type().validate()
        lastOrder()?.validate()
        locations()?.forEach { it.validate() }
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
        (pet.asKnown()?.validity() ?: 0) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (threshold.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (lastOrder.asKnown()?.validity() ?: 0) +
            (locations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PET_INVENTORY_LOW = of("pet.inventory-low")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PET_INVENTORY_LOW
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PET_INVENTORY_LOW,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PET_INVENTORY_LOW -> Value.PET_INVENTORY_LOW
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
                PET_INVENTORY_LOW -> Known.PET_INVENTORY_LOW
                else -> throw HelloWorldTestinggggInvalidDataException("Unknown Type: $value")
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

    class Order
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val complete: JsonField<Boolean>,
        private val petId: JsonField<Long>,
        private val quantity: JsonField<Int>,
        private val relatedAddress: JsonField<Address>,
        private val relatedCategory: JsonValue,
        private val relatedCustomer: JsonValue,
        private val relatedMoney: JsonField<Money>,
        private val relatedPet: JsonField<Pet>,
        private val relatedShelter: JsonValue,
        private val relatedTag: JsonValue,
        private val relatedUser: JsonValue,
        private val shipDate: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val total: JsonField<Money>,
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
            @JsonProperty("relatedPet")
            @ExcludeMissing
            relatedPet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("relatedShelter")
            @ExcludeMissing
            relatedShelter: JsonValue = JsonMissing.of(),
            @JsonProperty("relatedTag") @ExcludeMissing relatedTag: JsonValue = JsonMissing.of(),
            @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
            @JsonProperty("shipDate")
            @ExcludeMissing
            shipDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Money> = JsonMissing.of(),
        ) : this(
            id,
            complete,
            petId,
            quantity,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedMoney,
            relatedPet,
            relatedShelter,
            relatedTag,
            relatedUser,
            shipDate,
            status,
            total,
            mutableMapOf(),
        )

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
        fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = order.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = order.relatedCustomer().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCustomer")
        @ExcludeMissing
        fun _relatedCustomer(): JsonValue = relatedCustomer

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedMoney(): Money? = relatedMoney.getNullable("relatedMoney")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedPet(): Pet? = relatedPet.getNullable("relatedPet")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = order.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = order.relatedTag().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedTag") @ExcludeMissing fun _relatedTag(): JsonValue = relatedTag

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = order.relatedUser().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun total(): Money? = total.getNullable("total")

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
         * Returns the raw JSON value of [relatedAddress].
         *
         * Unlike [relatedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relatedAddress")
        @ExcludeMissing
        fun _relatedAddress(): JsonField<Address> = relatedAddress

        /**
         * Returns the raw JSON value of [relatedMoney].
         *
         * Unlike [relatedMoney], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relatedMoney")
        @ExcludeMissing
        fun _relatedMoney(): JsonField<Money> = relatedMoney

        /**
         * Returns the raw JSON value of [relatedPet].
         *
         * Unlike [relatedPet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("relatedPet") @ExcludeMissing fun _relatedPet(): JsonField<Pet> = relatedPet

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

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Money> = total

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

            /** Returns a mutable builder for constructing an instance of [Order]. */
            fun builder() = Builder()
        }

        /** A builder for [Order]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var complete: JsonField<Boolean> = JsonMissing.of()
            private var petId: JsonField<Long> = JsonMissing.of()
            private var quantity: JsonField<Int> = JsonMissing.of()
            private var relatedAddress: JsonField<Address> = JsonMissing.of()
            private var relatedCategory: JsonValue = JsonMissing.of()
            private var relatedCustomer: JsonValue = JsonMissing.of()
            private var relatedMoney: JsonField<Money> = JsonMissing.of()
            private var relatedPet: JsonField<Pet> = JsonMissing.of()
            private var relatedShelter: JsonValue = JsonMissing.of()
            private var relatedTag: JsonValue = JsonMissing.of()
            private var relatedUser: JsonValue = JsonMissing.of()
            private var shipDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var total: JsonField<Money> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(order: Order) = apply {
                id = order.id
                complete = order.complete
                petId = order.petId
                quantity = order.quantity
                relatedAddress = order.relatedAddress
                relatedCategory = order.relatedCategory
                relatedCustomer = order.relatedCustomer
                relatedMoney = order.relatedMoney
                relatedPet = order.relatedPet
                relatedShelter = order.relatedShelter
                relatedTag = order.relatedTag
                relatedUser = order.relatedUser
                shipDate = order.shipDate
                status = order.status
                total = order.total
                additionalProperties = order.additionalProperties.toMutableMap()
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

            fun relatedAddress(relatedAddress: Address) =
                relatedAddress(JsonField.of(relatedAddress))

            /**
             * Sets [Builder.relatedAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relatedAddress] with a well-typed [Address] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.relatedMoney] with a well-typed [Money] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relatedMoney(relatedMoney: JsonField<Money>) = apply {
                this.relatedMoney = relatedMoney
            }

            fun relatedPet(relatedPet: Pet) = relatedPet(JsonField.of(relatedPet))

            /**
             * Sets [Builder.relatedPet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relatedPet] with a well-typed [Pet] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relatedPet(relatedPet: JsonField<Pet>) = apply { this.relatedPet = relatedPet }

            fun relatedShelter(relatedShelter: JsonValue) = apply {
                this.relatedShelter = relatedShelter
            }

            fun relatedTag(relatedTag: JsonValue) = apply { this.relatedTag = relatedTag }

            fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

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

            fun total(total: Money) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Money] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Money>) = apply { this.total = total }

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
             * Returns an immutable instance of [Order].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Order =
                Order(
                    id,
                    complete,
                    petId,
                    quantity,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedPet,
                    relatedShelter,
                    relatedTag,
                    relatedUser,
                    shipDate,
                    status,
                    total,
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
        fun validate(): Order = apply {
            if (validated) {
                return@apply
            }

            id()
            complete()
            petId()
            quantity()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            shipDate()
            status()?.validate()
            total()?.validate()
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
                (relatedAddress.asKnown()?.validity() ?: 0) +
                (relatedMoney.asKnown()?.validity() ?: 0) +
                (relatedPet.asKnown()?.validity() ?: 0) +
                (if (shipDate.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (total.asKnown()?.validity() ?: 0)

        /** Order Status */
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PLACED,
                APPROVED,
                DELIVERED,
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
                    PLACED -> Value.PLACED
                    APPROVED -> Value.APPROVED
                    DELIVERED -> Value.DELIVERED
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
                    PLACED -> Known.PLACED
                    APPROVED -> Known.APPROVED
                    DELIVERED -> Known.DELIVERED
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

            return other is Order &&
                id == other.id &&
                complete == other.complete &&
                petId == other.petId &&
                quantity == other.quantity &&
                relatedAddress == other.relatedAddress &&
                relatedCategory == other.relatedCategory &&
                relatedCustomer == other.relatedCustomer &&
                relatedMoney == other.relatedMoney &&
                relatedPet == other.relatedPet &&
                relatedShelter == other.relatedShelter &&
                relatedTag == other.relatedTag &&
                relatedUser == other.relatedUser &&
                shipDate == other.shipDate &&
                status == other.status &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                complete,
                petId,
                quantity,
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedMoney,
                relatedPet,
                relatedShelter,
                relatedTag,
                relatedUser,
                shipDate,
                status,
                total,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Order{id=$id, complete=$complete, petId=$petId, quantity=$quantity, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedTag=$relatedTag, relatedUser=$relatedUser, shipDate=$shipDate, status=$status, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetInventoryLowWebhookEvent &&
            pet == other.pet &&
            quantity == other.quantity &&
            threshold == other.threshold &&
            type == other.type &&
            lastOrder == other.lastOrder &&
            locations == other.locations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(pet, quantity, threshold, type, lastOrder, locations, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PetInventoryLowWebhookEvent{pet=$pet, quantity=$quantity, threshold=$threshold, type=$type, lastOrder=$lastOrder, locations=$locations, additionalProperties=$additionalProperties}"
}
