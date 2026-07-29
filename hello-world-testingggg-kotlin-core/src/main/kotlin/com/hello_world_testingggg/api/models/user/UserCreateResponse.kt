// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import java.util.Collections
import java.util.Objects

class UserCreateResponse
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
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("relatedOrder") @ExcludeMissing relatedOrder: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedPet") @ExcludeMissing relatedPet: JsonField<Pet> = JsonMissing.of(),
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        relatedShelter: JsonValue = JsonMissing.of(),
        @JsonProperty("relatedTag") @ExcludeMissing relatedTag: JsonValue = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userStatus") @ExcludeMissing userStatus: JsonField<Int> = JsonMissing.of(),
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
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String? = firstName.getNullable("firstName")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String? = lastName.getNullable("lastName")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun password(): String? = password.getNullable("password")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun phone(): String? = phone.getNullable("phone")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userCreateResponse.relatedCategory().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedCategory")
    @ExcludeMissing
    fun _relatedCategory(): JsonValue = relatedCategory

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userCreateResponse.relatedCustomer().convert(MyClass::class.java)
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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userCreateResponse.relatedOrder().convert(MyClass::class.java)
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
     * val myObject: MyClass = userCreateResponse.relatedShelter().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedShelter")
    @ExcludeMissing
    fun _relatedShelter(): JsonValue = relatedShelter

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userCreateResponse.relatedTag().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("relatedTag") @ExcludeMissing fun _relatedTag(): JsonValue = relatedTag

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun username(): String? = username.getNullable("username")

    /**
     * User Status
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
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
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [relatedAddress].
     *
     * Unlike [relatedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relatedAddress")
    @ExcludeMissing
    fun _relatedAddress(): JsonField<Address> = relatedAddress

    /**
     * Returns the raw JSON value of [relatedMoney].
     *
     * Unlike [relatedMoney], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    /**
     * Returns the raw JSON value of [userStatus].
     *
     * Unlike [userStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userStatus") @ExcludeMissing fun _userStatus(): JsonField<Int> = userStatus

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

        /** Returns a mutable builder for constructing an instance of [UserCreateResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [UserCreateResponse]. */
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

        internal fun from(userCreateResponse: UserCreateResponse) = apply {
            id = userCreateResponse.id
            email = userCreateResponse.email
            firstName = userCreateResponse.firstName
            lastName = userCreateResponse.lastName
            password = userCreateResponse.password
            phone = userCreateResponse.phone
            relatedAddress = userCreateResponse.relatedAddress
            relatedCategory = userCreateResponse.relatedCategory
            relatedCustomer = userCreateResponse.relatedCustomer
            relatedMoney = userCreateResponse.relatedMoney
            relatedOrder = userCreateResponse.relatedOrder
            relatedPet = userCreateResponse.relatedPet
            relatedShelter = userCreateResponse.relatedShelter
            relatedTag = userCreateResponse.relatedTag
            username = userCreateResponse.username
            userStatus = userCreateResponse.userStatus
            additionalProperties = userCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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

        fun relatedMoney(relatedMoney: Money) = relatedMoney(JsonField.of(relatedMoney))

        /**
         * Sets [Builder.relatedMoney] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedMoney] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun relatedMoney(relatedMoney: JsonField<Money>) = apply {
            this.relatedMoney = relatedMoney
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

        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

        /** User Status */
        fun userStatus(userStatus: Int) = userStatus(JsonField.of(userStatus))

        /**
         * Sets [Builder.userStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userStatus] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userStatus(userStatus: JsonField<Int>) = apply { this.userStatus = userStatus }

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
         * Returns an immutable instance of [UserCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserCreateResponse =
            UserCreateResponse(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HelloWorldTestinggggInvalidDataException if any value type in this object doesn't
     *   match its expected type.
     */
    fun validate(): UserCreateResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is UserCreateResponse &&
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
        "UserCreateResponse{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedTag=$relatedTag, username=$username, userStatus=$userStatus, additionalProperties=$additionalProperties}"
}
