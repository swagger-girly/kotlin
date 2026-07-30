// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

class Money
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val relatedAddress: JsonField<Address>,
    private val relatedCategory: JsonValue,
    private val relatedCustomer: JsonValue,
    private val relatedOrder: JsonValue,
    private val relatedPet: JsonField<Pet>,
    private val relatedShelter: JsonValue,
    private val relatedTag: JsonValue,
    private val relatedUser: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relatedAddress")
        @ExcludeMissing
        relatedAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        relatedCategory: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedCustomer")
        @ExcludeMissing
        relatedCustomer: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedOrder") @ExcludeMissing relatedOrder: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedPet") @ExcludeMissing relatedPet: JsonField<Pet> = JsonMissing.of(),
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        relatedShelter: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedTag") @ExcludeMissing relatedTag: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
    ) : this(
        amount,
        currency,
        relatedAddress,
        relatedCategory,
        relatedCustomer,
        relatedOrder,
        relatedPet,
        relatedShelter,
        relatedTag,
        relatedUser,
        mutableMapOf(),
    )

    /**
     * Amount in minor currency units (e.g. cents).
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * ISO 4217 currency code.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedCategory().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedCategory")
    @ExcludeMissing
    fun _relatedCategory(): JsonValue = relatedCategory

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedCustomer().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedCustomer")
    @ExcludeMissing
    fun _relatedCustomer(): JsonValue = relatedCustomer

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedOrder().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedOrder") @ExcludeMissing fun _relatedOrder(): JsonValue = relatedOrder

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedPet(): Pet? = relatedPet.getNullable("relatedPet")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedShelter().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedShelter")
    @ExcludeMissing
    fun _relatedShelter(): JsonValue = relatedShelter

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedTag().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedTag") @ExcludeMissing fun _relatedTag(): JsonValue = relatedTag

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = money.relatedUser().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [relatedAddress].
     *
     * Unlike [relatedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relatedAddress")
    @ExcludeMissing
    fun _relatedAddress(): JsonField<Address> = relatedAddress

    /**
     * Returns the raw JSON value of [relatedPet].
     *
     * Unlike [relatedPet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relatedPet") @ExcludeMissing fun _relatedPet(): JsonField<Pet> = relatedPet

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
         * Returns a mutable builder for constructing an instance of [Money].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Money]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var currency: JsonField<String>? = null
        private var relatedAddress: JsonField<Address> = JsonMissing.of()
        private var relatedCategory: JsonValue = JsonMissing.of()
        private var relatedCustomer: JsonValue = JsonMissing.of()
        private var relatedOrder: JsonValue = JsonMissing.of()
        private var relatedPet: JsonField<Pet> = JsonMissing.of()
        private var relatedShelter: JsonValue = JsonMissing.of()
        private var relatedTag: JsonValue = JsonMissing.of()
        private var relatedUser: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(money: Money) = apply {
            amount = money.amount
            currency = money.currency
            relatedAddress = money.relatedAddress
            relatedCategory = money.relatedCategory
            relatedCustomer = money.relatedCustomer
            relatedOrder = money.relatedOrder
            relatedPet = money.relatedPet
            relatedShelter = money.relatedShelter
            relatedTag = money.relatedTag
            relatedUser = money.relatedUser
            additionalProperties = money.additionalProperties.toMutableMap()
        }

        /** Amount in minor currency units (e.g. cents). */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** ISO 4217 currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun relatedAddress(relatedAddress: Address) = relatedAddress(JsonField.of(relatedAddress))

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

        fun relatedOrder(relatedOrder: JsonValue) = apply { this.relatedOrder = relatedOrder }

        fun relatedPet(relatedPet: Pet) = relatedPet(JsonField.of(relatedPet))

        /**
         * Sets [Builder.relatedPet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedPet] with a well-typed [Pet] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun relatedPet(relatedPet: JsonField<Pet>) = apply { this.relatedPet = relatedPet }

        fun relatedShelter(relatedShelter: JsonValue) = apply {
            this.relatedShelter = relatedShelter
        }

        fun relatedTag(relatedTag: JsonValue) = apply { this.relatedTag = relatedTag }

        fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

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
         * Returns an immutable instance of [Money].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Money =
            Money(
                checkRequired("amount", amount),
                checkRequired("currency", currency),
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedOrder,
                relatedPet,
                relatedShelter,
                relatedTag,
                relatedUser,
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
    fun validate(): Money = apply {
        if (validated) {
            return@apply
        }

        amount()
        currency()
        relatedAddress()?.validate()
        relatedPet()?.validate()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (relatedAddress.asKnown()?.validity() ?: 0) +
            (relatedPet.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Money &&
            amount == other.amount &&
            currency == other.currency &&
            relatedAddress == other.relatedAddress &&
            relatedCategory == other.relatedCategory &&
            relatedCustomer == other.relatedCustomer &&
            relatedOrder == other.relatedOrder &&
            relatedPet == other.relatedPet &&
            relatedShelter == other.relatedShelter &&
            relatedTag == other.relatedTag &&
            relatedUser == other.relatedUser &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            currency,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedOrder,
            relatedPet,
            relatedShelter,
            relatedTag,
            relatedUser,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Money{amount=$amount, currency=$currency, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedTag=$relatedTag, relatedUser=$relatedUser, additionalProperties=$additionalProperties}"
}
