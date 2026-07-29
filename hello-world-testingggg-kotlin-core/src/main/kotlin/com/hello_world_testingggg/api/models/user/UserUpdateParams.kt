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
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import java.util.Collections
import java.util.Objects

/** This can only be done by the logged in user. */
class UserUpdateParams
private constructor(
    private val pathUsername: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathUsername(): String? = pathUsername

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long? = body.id()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun email(): String? = body.email()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String? = body.firstName()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String? = body.lastName()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun password(): String? = body.password()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun phone(): String? = body.phone()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedAddress(): Address? = body.relatedAddress()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userUpdateParams.relatedCategory().convert(MyClass::class.java)
     * ```
     */
    fun _relatedCategory(): JsonValue = body._relatedCategory()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userUpdateParams.relatedCustomer().convert(MyClass::class.java)
     * ```
     */
    fun _relatedCustomer(): JsonValue = body._relatedCustomer()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedMoney(): Money? = body.relatedMoney()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userUpdateParams.relatedOrder().convert(MyClass::class.java)
     * ```
     */
    fun _relatedOrder(): JsonValue = body._relatedOrder()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun relatedPet(): Pet? = body.relatedPet()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userUpdateParams.relatedShelter().convert(MyClass::class.java)
     * ```
     */
    fun _relatedShelter(): JsonValue = body._relatedShelter()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userUpdateParams.relatedTag().convert(MyClass::class.java)
     * ```
     */
    fun _relatedTag(): JsonValue = body._relatedTag()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun bodyUsername(): String? = body.bodyUsername()

    /**
     * User Status
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun userStatus(): Int? = body.userStatus()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<Long> = body._id()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phone(): JsonField<String> = body._phone()

    /**
     * Returns the raw JSON value of [relatedAddress].
     *
     * Unlike [relatedAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _relatedAddress(): JsonField<Address> = body._relatedAddress()

    /**
     * Returns the raw JSON value of [relatedMoney].
     *
     * Unlike [relatedMoney], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _relatedMoney(): JsonField<Money> = body._relatedMoney()

    /**
     * Returns the raw JSON value of [relatedPet].
     *
     * Unlike [relatedPet], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _relatedPet(): JsonField<Pet> = body._relatedPet()

    /**
     * Returns the raw JSON value of [bodyUsername].
     *
     * Unlike [bodyUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyUsername(): JsonField<String> = body._bodyUsername()

    /**
     * Returns the raw JSON value of [userStatus].
     *
     * Unlike [userStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userStatus(): JsonField<Int> = body._userStatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): UserUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [UserUpdateParams]. */
    class Builder internal constructor() {

        private var pathUsername: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userUpdateParams: UserUpdateParams) = apply {
            pathUsername = userUpdateParams.pathUsername
            body = userUpdateParams.body.toBuilder()
            additionalHeaders = userUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathUsername(pathUsername: String?) = apply { this.pathUsername = pathUsername }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [email]
         * - [firstName]
         * - [lastName]
         * - [password]
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

        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        fun password(password: String) = apply { body.password(password) }

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

        fun phone(phone: String) = apply { body.phone(phone) }

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { body.phone(phone) }

        fun relatedAddress(relatedAddress: Address) = apply { body.relatedAddress(relatedAddress) }

        /**
         * Sets [Builder.relatedAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedAddress] with a well-typed [Address] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relatedAddress(relatedAddress: JsonField<Address>) = apply {
            body.relatedAddress(relatedAddress)
        }

        fun relatedCategory(relatedCategory: JsonValue) = apply {
            body.relatedCategory(relatedCategory)
        }

        fun relatedCustomer(relatedCustomer: JsonValue) = apply {
            body.relatedCustomer(relatedCustomer)
        }

        fun relatedMoney(relatedMoney: Money) = apply { body.relatedMoney(relatedMoney) }

        /**
         * Sets [Builder.relatedMoney] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedMoney] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun relatedMoney(relatedMoney: JsonField<Money>) = apply { body.relatedMoney(relatedMoney) }

        fun relatedOrder(relatedOrder: JsonValue) = apply { body.relatedOrder(relatedOrder) }

        fun relatedPet(relatedPet: Pet) = apply { body.relatedPet(relatedPet) }

        /**
         * Sets [Builder.relatedPet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedPet] with a well-typed [Pet] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun relatedPet(relatedPet: JsonField<Pet>) = apply { body.relatedPet(relatedPet) }

        fun relatedShelter(relatedShelter: JsonValue) = apply {
            body.relatedShelter(relatedShelter)
        }

        fun relatedTag(relatedTag: JsonValue) = apply { body.relatedTag(relatedTag) }

        fun bodyUsername(bodyUsername: String) = apply { body.bodyUsername(bodyUsername) }

        /**
         * Sets [Builder.bodyUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyUsername] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyUsername(bodyUsername: JsonField<String>) = apply {
            body.bodyUsername(bodyUsername)
        }

        /** User Status */
        fun userStatus(userStatus: Int) = apply { body.userStatus(userStatus) }

        /**
         * Sets [Builder.userStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userStatus] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userStatus(userStatus: JsonField<Int>) = apply { body.userStatus(userStatus) }

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
         * Returns an immutable instance of [UserUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserUpdateParams =
            UserUpdateParams(
                pathUsername,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathUsername ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
        private val bodyUsername: JsonField<String>,
        private val userStatus: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("relatedOrder")
            @ExcludeMissing
            relatedOrder: JsonValue = JsonMissing.of(),
            @JsonProperty("relatedPet")
            @ExcludeMissing
            relatedPet: JsonField<Pet> = JsonMissing.of(),
            @JsonProperty("relatedShelter")
            @ExcludeMissing
            relatedShelter: JsonValue = JsonMissing.of(),
            @JsonProperty("relatedTag") @ExcludeMissing relatedTag: JsonValue = JsonMissing.of(),
            @JsonProperty("username")
            @ExcludeMissing
            bodyUsername: JsonField<String> = JsonMissing.of(),
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
            bodyUsername,
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
         * val myObject: MyClass = body.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.relatedCustomer().convert(MyClass::class.java)
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
         * val myObject: MyClass = body.relatedOrder().convert(MyClass::class.java)
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
         * val myObject: MyClass = body.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.relatedTag().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedTag") @ExcludeMissing fun _relatedTag(): JsonValue = relatedTag

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bodyUsername(): String? = bodyUsername.getNullable("username")

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
         * Returns the raw JSON value of [bodyUsername].
         *
         * Unlike [bodyUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("username")
        @ExcludeMissing
        fun _bodyUsername(): JsonField<String> = bodyUsername

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            private var bodyUsername: JsonField<String> = JsonMissing.of()
            private var userStatus: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                id = body.id
                email = body.email
                firstName = body.firstName
                lastName = body.lastName
                password = body.password
                phone = body.phone
                relatedAddress = body.relatedAddress
                relatedCategory = body.relatedCategory
                relatedCustomer = body.relatedCustomer
                relatedMoney = body.relatedMoney
                relatedOrder = body.relatedOrder
                relatedPet = body.relatedPet
                relatedShelter = body.relatedShelter
                relatedTag = body.relatedTag
                bodyUsername = body.bodyUsername
                userStatus = body.userStatus
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

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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

            fun relatedOrder(relatedOrder: JsonValue) = apply { this.relatedOrder = relatedOrder }

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

            fun bodyUsername(bodyUsername: String) = bodyUsername(JsonField.of(bodyUsername))

            /**
             * Sets [Builder.bodyUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyUsername(bodyUsername: JsonField<String>) = apply {
                this.bodyUsername = bodyUsername
            }

            /** User Status */
            fun userStatus(userStatus: Int) = userStatus(JsonField.of(userStatus))

            /**
             * Sets [Builder.userStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userStatus] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
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
                    bodyUsername,
                    userStatus,
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
            email()
            firstName()
            lastName()
            password()
            phone()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            bodyUsername()
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
                (if (bodyUsername.asKnown() == null) 0 else 1) +
                (if (userStatus.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
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
                bodyUsername == other.bodyUsername &&
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
                bodyUsername,
                userStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedTag=$relatedTag, bodyUsername=$bodyUsername, userStatus=$userStatus, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserUpdateParams &&
            pathUsername == other.pathUsername &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathUsername, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserUpdateParams{pathUsername=$pathUsername, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
