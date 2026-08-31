// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions

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
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import java.util.Collections
import java.util.Objects

/** Submits an adoption application for an individual or an organization applicant. */
class AdoptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdoptionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AdoptionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(adoptionCreateParams: AdoptionCreateParams) = apply {
            body = adoptionCreateParams.body
            additionalHeaders = adoptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = adoptionCreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofIndividual(individual)`. */
        fun body(individual: Body.Individual) = body(Body.ofIndividual(individual))

        /**
         * Alias for calling [body] with the following:
         * ```kotlin
         * Body.Individual.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun individualBody(name: String) = body(Body.Individual.builder().name(name).build())

        /** Alias for calling [body] with `Body.ofOrganization(organization)`. */
        fun body(organization: Body.Organization) = body(Body.ofOrganization(organization))

        /**
         * Alias for calling [body] with the following:
         * ```kotlin
         * Body.Organization.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun organizationBody(name: String) = body(Body.Organization.builder().name(name).build())

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
         * Returns an immutable instance of [AdoptionCreateParams].
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
        fun build(): AdoptionCreateParams =
            AdoptionCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val individual: Individual? = null,
        private val organization: Organization? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): Individual? = individual

        fun organization(): Organization? = organization

        fun isIndividual(): Boolean = individual != null

        fun isOrganization(): Boolean = organization != null

        fun asIndividual(): Individual = individual.getOrThrow("individual")

        fun asOrganization(): Organization = organization.getOrThrow("organization")

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
         * val result: String? = body.accept(object : Body.Visitor<String?> {
         *     override fun visitIndividual(individual: Individual): String? = individual.toString()
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
                individual != null -> visitor.visitIndividual(individual)
                organization != null -> visitor.visitOrganization(organization)
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIndividual(individual: Individual) {
                        individual.validate()
                    }

                    override fun visitOrganization(organization: Organization) {
                        organization.validate()
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
                    override fun visitIndividual(individual: Individual) = individual.validity()

                    override fun visitOrganization(organization: Organization) =
                        organization.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                individual == other.individual &&
                organization == other.organization
        }

        override fun hashCode(): Int = Objects.hash(individual, organization)

        override fun toString(): String =
            when {
                individual != null -> "Body{individual=$individual}"
                organization != null -> "Body{organization=$organization}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofIndividual(individual: Individual) = Body(individual = individual)

            fun ofOrganization(organization: Organization) = Body(organization = organization)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIndividual(individual: Individual): T

            fun visitOrganization(organization: Organization): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val applicantType = json.asObject()?.get("applicant_type")?.asString()

                when (applicantType) {
                    "individual" -> {
                        return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                            Body(individual = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "organization" -> {
                        return tryDeserialize(node, jacksonTypeRef<Organization>())?.let {
                            Body(organization = it, _json = json)
                        } ?: Body(_json = json)
                    }
                }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individual != null -> generator.writeObject(value.individual)
                    value.organization != null -> generator.writeObject(value.organization)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class Individual
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val applicantType: JsonValue,
            private val name: JsonField<String>,
            private val address: JsonField<Address>,
            private val age: JsonField<Int>,
            private val email: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applicant_type")
                @ExcludeMissing
                applicantType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("age") @ExcludeMissing age: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            ) : this(applicantType, name, address, age, email, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("individual")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("applicant_type")
            @ExcludeMissing
            fun _applicantType(): JsonValue = applicantType

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun address(): Address? = address.getNullable("address")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun age(): Int? = age.getNullable("age")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

            /**
             * Returns the raw JSON value of [age].
             *
             * Unlike [age], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("age") @ExcludeMissing fun _age(): JsonField<Int> = age

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns a mutable builder for constructing an instance of [Individual].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Individual]. */
            class Builder internal constructor() {

                private var applicantType: JsonValue = JsonValue.from("individual")
                private var name: JsonField<String>? = null
                private var address: JsonField<Address> = JsonMissing.of()
                private var age: JsonField<Int> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(individual: Individual) = apply {
                    applicantType = individual.applicantType
                    name = individual.name
                    address = individual.address
                    age = individual.age
                    email = individual.email
                    additionalProperties = individual.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("individual")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun applicantType(applicantType: JsonValue) = apply {
                    this.applicantType = applicantType
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

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                fun age(age: Int) = age(JsonField.of(age))

                /**
                 * Sets [Builder.age] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.age] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun age(age: JsonField<Int>) = apply { this.age = age }

                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

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
                 * Returns an immutable instance of [Individual].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Individual =
                    Individual(
                        applicantType,
                        checkRequired("name", name),
                        address,
                        age,
                        email,
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
            fun validate(): Individual = apply {
                if (validated) {
                    return@apply
                }

                _applicantType().let {
                    if (it != JsonValue.from("individual")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'applicantType' is invalid, received $it"
                        )
                    }
                }
                name()
                address()?.validate()
                age()
                email()
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
                applicantType.let { if (it == JsonValue.from("individual")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (address.asKnown()?.validity() ?: 0) +
                    (if (age.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Individual &&
                    applicantType == other.applicantType &&
                    name == other.name &&
                    address == other.address &&
                    age == other.age &&
                    email == other.email &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(applicantType, name, address, age, email, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{applicantType=$applicantType, name=$name, address=$address, age=$age, email=$email, additionalProperties=$additionalProperties}"
        }

        class Organization
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val applicantType: JsonValue,
            private val name: JsonField<String>,
            private val shelter: JsonField<Shelter>,
            private val taxId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applicant_type")
                @ExcludeMissing
                applicantType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("shelter")
                @ExcludeMissing
                shelter: JsonField<Shelter> = JsonMissing.of(),
                @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            ) : this(applicantType, name, shelter, taxId, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("organization")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("applicant_type")
            @ExcludeMissing
            fun _applicantType(): JsonValue = applicantType

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun shelter(): Shelter? = shelter.getNullable("shelter")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taxId(): String? = taxId.getNullable("taxId")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [shelter].
             *
             * Unlike [shelter], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shelter") @ExcludeMissing fun _shelter(): JsonField<Shelter> = shelter

            /**
             * Returns the raw JSON value of [taxId].
             *
             * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
                 * Returns a mutable builder for constructing an instance of [Organization].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Organization]. */
            class Builder internal constructor() {

                private var applicantType: JsonValue = JsonValue.from("organization")
                private var name: JsonField<String>? = null
                private var shelter: JsonField<Shelter> = JsonMissing.of()
                private var taxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(organization: Organization) = apply {
                    applicantType = organization.applicantType
                    name = organization.name
                    shelter = organization.shelter
                    taxId = organization.taxId
                    additionalProperties = organization.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("organization")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun applicantType(applicantType: JsonValue) = apply {
                    this.applicantType = applicantType
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

                fun shelter(shelter: Shelter) = shelter(JsonField.of(shelter))

                /**
                 * Sets [Builder.shelter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shelter] with a well-typed [Shelter] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shelter(shelter: JsonField<Shelter>) = apply { this.shelter = shelter }

                fun taxId(taxId: String) = taxId(JsonField.of(taxId))

                /**
                 * Sets [Builder.taxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
                 * Returns an immutable instance of [Organization].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Organization =
                    Organization(
                        applicantType,
                        checkRequired("name", name),
                        shelter,
                        taxId,
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
            fun validate(): Organization = apply {
                if (validated) {
                    return@apply
                }

                _applicantType().let {
                    if (it != JsonValue.from("organization")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'applicantType' is invalid, received $it"
                        )
                    }
                }
                name()
                shelter()?.validate()
                taxId()
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
                applicantType.let { if (it == JsonValue.from("organization")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (shelter.asKnown()?.validity() ?: 0) +
                    (if (taxId.asKnown() == null) 0 else 1)

            class Shelter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val address: JsonField<Address>,
                private val contact: JsonField<Contact>,
                private val location: JsonField<Location>,
                private val relatedAddress: JsonField<Address>,
                private val relatedCategory: JsonValue,
                private val relatedCustomer: JsonValue,
                private val relatedMoney: JsonField<Money>,
                private val relatedOrder: JsonValue,
                private val relatedPet: JsonField<Pet>,
                private val relatedTag: JsonValue,
                private val relatedUser: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("contact")
                    @ExcludeMissing
                    contact: JsonField<Contact> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    location: JsonField<Location> = JsonMissing.of(),
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
                    @JsonProperty("relatedTag")
                    @ExcludeMissing
                    relatedTag: JsonValue = JsonMissing.of(),
                    @JsonProperty("relatedUser")
                    @ExcludeMissing
                    relatedUser: JsonValue = JsonMissing.of(),
                ) : this(
                    name,
                    address,
                    contact,
                    location,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedTag,
                    relatedUser,
                    mutableMapOf(),
                )

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun contact(): Contact? = contact.getNullable("contact")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun location(): Location? = location.getNullable("location")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = shelter.relatedCategory().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedCategory")
                @ExcludeMissing
                fun _relatedCategory(): JsonValue = relatedCategory

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = shelter.relatedCustomer().convert(MyClass::class.java)
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
                 * val myObject: MyClass = shelter.relatedOrder().convert(MyClass::class.java)
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
                 * val myObject: MyClass = shelter.relatedTag().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedTag")
                @ExcludeMissing
                fun _relatedTag(): JsonValue = relatedTag

                /**
                 * This arbitrary value can be deserialized into a custom type using the `convert`
                 * method:
                 * ```kotlin
                 * val myObject: MyClass = shelter.relatedUser().convert(MyClass::class.java)
                 * ```
                 */
                @JsonProperty("relatedUser")
                @ExcludeMissing
                fun _relatedUser(): JsonValue = relatedUser

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [contact].
                 *
                 * Unlike [contact], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contact")
                @ExcludeMissing
                fun _contact(): JsonField<Contact> = contact

                /**
                 * Returns the raw JSON value of [location].
                 *
                 * Unlike [location], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("location")
                @ExcludeMissing
                fun _location(): JsonField<Location> = location

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
                     * Returns a mutable builder for constructing an instance of [Shelter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Shelter]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var contact: JsonField<Contact> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var relatedAddress: JsonField<Address> = JsonMissing.of()
                    private var relatedCategory: JsonValue = JsonMissing.of()
                    private var relatedCustomer: JsonValue = JsonMissing.of()
                    private var relatedMoney: JsonField<Money> = JsonMissing.of()
                    private var relatedOrder: JsonValue = JsonMissing.of()
                    private var relatedPet: JsonField<Pet> = JsonMissing.of()
                    private var relatedTag: JsonValue = JsonMissing.of()
                    private var relatedUser: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(shelter: Shelter) = apply {
                        name = shelter.name
                        address = shelter.address
                        contact = shelter.contact
                        location = shelter.location
                        relatedAddress = shelter.relatedAddress
                        relatedCategory = shelter.relatedCategory
                        relatedCustomer = shelter.relatedCustomer
                        relatedMoney = shelter.relatedMoney
                        relatedOrder = shelter.relatedOrder
                        relatedPet = shelter.relatedPet
                        relatedTag = shelter.relatedTag
                        relatedUser = shelter.relatedUser
                        additionalProperties = shelter.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    fun contact(contact: Contact) = contact(JsonField.of(contact))

                    /**
                     * Sets [Builder.contact] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contact] with a well-typed [Contact] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

                    fun location(location: Location) = location(JsonField.of(location))

                    /**
                     * Sets [Builder.location] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.location] with a well-typed [Location] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun location(location: JsonField<Location>) = apply { this.location = location }

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

                    fun relatedTag(relatedTag: JsonValue) = apply { this.relatedTag = relatedTag }

                    fun relatedUser(relatedUser: JsonValue) = apply {
                        this.relatedUser = relatedUser
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
                     * Returns an immutable instance of [Shelter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Shelter =
                        Shelter(
                            checkRequired("name", name),
                            address,
                            contact,
                            location,
                            relatedAddress,
                            relatedCategory,
                            relatedCustomer,
                            relatedMoney,
                            relatedOrder,
                            relatedPet,
                            relatedTag,
                            relatedUser,
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
                fun validate(): Shelter = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    address()?.validate()
                    contact()?.validate()
                    location()?.validate()
                    relatedAddress()?.validate()
                    relatedMoney()?.validate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (name.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (contact.asKnown()?.validity() ?: 0) +
                        (location.asKnown()?.validity() ?: 0) +
                        (relatedAddress.asKnown()?.validity() ?: 0) +
                        (relatedMoney.asKnown()?.validity() ?: 0) +
                        (relatedPet.asKnown()?.validity() ?: 0)

                class Contact
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val primary: JsonField<Primary>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("primary")
                        @ExcludeMissing
                        primary: JsonField<Primary> = JsonMissing.of()
                    ) : this(primary, mutableMapOf())

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun primary(): Primary? = primary.getNullable("primary")

                    /**
                     * Returns the raw JSON value of [primary].
                     *
                     * Unlike [primary], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("primary")
                    @ExcludeMissing
                    fun _primary(): JsonField<Primary> = primary

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

                        /** Returns a mutable builder for constructing an instance of [Contact]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Contact]. */
                    class Builder internal constructor() {

                        private var primary: JsonField<Primary> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contact: Contact) = apply {
                            primary = contact.primary
                            additionalProperties = contact.additionalProperties.toMutableMap()
                        }

                        fun primary(primary: Primary) = primary(JsonField.of(primary))

                        /**
                         * Sets [Builder.primary] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.primary] with a well-typed [Primary]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun primary(primary: JsonField<Primary>) = apply { this.primary = primary }

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
                         * Returns an immutable instance of [Contact].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Contact = Contact(primary, additionalProperties.toMutableMap())
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
                    fun validate(): Contact = apply {
                        if (validated) {
                            return@apply
                        }

                        primary()?.validate()
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
                    internal fun validity(): Int = (primary.asKnown()?.validity() ?: 0)

                    class Primary
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val availability: JsonField<Availability>,
                        private val name: JsonField<String>,
                        private val phone: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("availability")
                            @ExcludeMissing
                            availability: JsonField<Availability> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("phone")
                            @ExcludeMissing
                            phone: JsonField<String> = JsonMissing.of(),
                        ) : this(availability, name, phone, mutableMapOf())

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun availability(): Availability? = availability.getNullable("availability")

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun name(): String? = name.getNullable("name")

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun phone(): String? = phone.getNullable("phone")

                        /**
                         * Returns the raw JSON value of [availability].
                         *
                         * Unlike [availability], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("availability")
                        @ExcludeMissing
                        fun _availability(): JsonField<Availability> = availability

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [phone].
                         *
                         * Unlike [phone], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("phone")
                        @ExcludeMissing
                        fun _phone(): JsonField<String> = phone

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
                             * Returns a mutable builder for constructing an instance of [Primary].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Primary]. */
                        class Builder internal constructor() {

                            private var availability: JsonField<Availability> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var phone: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(primary: Primary) = apply {
                                availability = primary.availability
                                name = primary.name
                                phone = primary.phone
                                additionalProperties = primary.additionalProperties.toMutableMap()
                            }

                            fun availability(availability: Availability) =
                                availability(JsonField.of(availability))

                            /**
                             * Sets [Builder.availability] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.availability] with a well-typed
                             * [Availability] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun availability(availability: JsonField<Availability>) = apply {
                                this.availability = availability
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun phone(phone: String) = phone(JsonField.of(phone))

                            /**
                             * Sets [Builder.phone] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.phone] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
                             * Returns an immutable instance of [Primary].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Primary =
                                Primary(
                                    availability,
                                    name,
                                    phone,
                                    additionalProperties.toMutableMap(),
                                )
                        }

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
                        fun validate(): Primary = apply {
                            if (validated) {
                                return@apply
                            }

                            availability()?.validate()
                            name()
                            phone()
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
                        internal fun validity(): Int =
                            (availability.asKnown()?.validity() ?: 0) +
                                (if (name.asKnown() == null) 0 else 1) +
                                (if (phone.asKnown() == null) 0 else 1)

                        class Availability
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val weekday: JsonField<Weekday>,
                            private val weekend: JsonField<Weekend>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("weekday")
                                @ExcludeMissing
                                weekday: JsonField<Weekday> = JsonMissing.of(),
                                @JsonProperty("weekend")
                                @ExcludeMissing
                                weekend: JsonField<Weekend> = JsonMissing.of(),
                            ) : this(weekday, weekend, mutableMapOf())

                            /**
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun weekday(): Weekday? = weekday.getNullable("weekday")

                            /**
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun weekend(): Weekend? = weekend.getNullable("weekend")

                            /**
                             * Returns the raw JSON value of [weekday].
                             *
                             * Unlike [weekday], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("weekday")
                            @ExcludeMissing
                            fun _weekday(): JsonField<Weekday> = weekday

                            /**
                             * Returns the raw JSON value of [weekend].
                             *
                             * Unlike [weekend], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("weekend")
                            @ExcludeMissing
                            fun _weekend(): JsonField<Weekend> = weekend

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
                                 * [Availability].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Availability]. */
                            class Builder internal constructor() {

                                private var weekday: JsonField<Weekday> = JsonMissing.of()
                                private var weekend: JsonField<Weekend> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(availability: Availability) = apply {
                                    weekday = availability.weekday
                                    weekend = availability.weekend
                                    additionalProperties =
                                        availability.additionalProperties.toMutableMap()
                                }

                                fun weekday(weekday: Weekday) = weekday(JsonField.of(weekday))

                                /**
                                 * Sets [Builder.weekday] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.weekday] with a well-typed
                                 * [Weekday] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun weekday(weekday: JsonField<Weekday>) = apply {
                                    this.weekday = weekday
                                }

                                fun weekend(weekend: Weekend?) =
                                    weekend(JsonField.ofNullable(weekend))

                                /**
                                 * Sets [Builder.weekend] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.weekend] with a well-typed
                                 * [Weekend] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun weekend(weekend: JsonField<Weekend>) = apply {
                                    this.weekend = weekend
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                                 * Returns an immutable instance of [Availability].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Availability =
                                    Availability(
                                        weekday,
                                        weekend,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws HelloWorldTestinggggInvalidDataException if any value type in
                             *   this object doesn't match its expected type.
                             */
                            fun validate(): Availability = apply {
                                if (validated) {
                                    return@apply
                                }

                                weekday()?.validate()
                                weekend()?.validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (weekday.asKnown()?.validity() ?: 0) +
                                    (weekend.asKnown()?.validity() ?: 0)

                            class Weekday
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val close: JsonField<String>,
                                private val open: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("close")
                                    @ExcludeMissing
                                    close: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("open")
                                    @ExcludeMissing
                                    open: JsonField<String> = JsonMissing.of(),
                                ) : this(close, open, mutableMapOf())

                                /**
                                 * @throws HelloWorldTestinggggInvalidDataException if the JSON
                                 *   field has an unexpected type (e.g. if the server responded with
                                 *   an unexpected value).
                                 */
                                fun close(): String? = close.getNullable("close")

                                /**
                                 * @throws HelloWorldTestinggggInvalidDataException if the JSON
                                 *   field has an unexpected type (e.g. if the server responded with
                                 *   an unexpected value).
                                 */
                                fun open(): String? = open.getNullable("open")

                                /**
                                 * Returns the raw JSON value of [close].
                                 *
                                 * Unlike [close], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("close")
                                @ExcludeMissing
                                fun _close(): JsonField<String> = close

                                /**
                                 * Returns the raw JSON value of [open].
                                 *
                                 * Unlike [open], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("open")
                                @ExcludeMissing
                                fun _open(): JsonField<String> = open

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
                                     * [Weekday].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Weekday]. */
                                class Builder internal constructor() {

                                    private var close: JsonField<String> = JsonMissing.of()
                                    private var open: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(weekday: Weekday) = apply {
                                        close = weekday.close
                                        open = weekday.open
                                        additionalProperties =
                                            weekday.additionalProperties.toMutableMap()
                                    }

                                    fun close(close: String) = close(JsonField.of(close))

                                    /**
                                     * Sets [Builder.close] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.close] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun close(close: JsonField<String>) = apply {
                                        this.close = close
                                    }

                                    fun open(open: String) = open(JsonField.of(open))

                                    /**
                                     * Sets [Builder.open] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.open] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun open(open: JsonField<String>) = apply { this.open = open }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Weekday].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): Weekday =
                                        Weekday(close, open, additionalProperties.toMutableMap())
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws HelloWorldTestinggggInvalidDataException if any value
                                 *   type in this object doesn't match its expected type.
                                 */
                                fun validate(): Weekday = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    close()
                                    open()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (close.asKnown() == null) 0 else 1) +
                                        (if (open.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Weekday &&
                                        close == other.close &&
                                        open == other.open &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(close, open, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Weekday{close=$close, open=$open, additionalProperties=$additionalProperties}"
                            }

                            class Weekend
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val close: JsonField<String>,
                                private val open: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("close")
                                    @ExcludeMissing
                                    close: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("open")
                                    @ExcludeMissing
                                    open: JsonField<String> = JsonMissing.of(),
                                ) : this(close, open, mutableMapOf())

                                /**
                                 * @throws HelloWorldTestinggggInvalidDataException if the JSON
                                 *   field has an unexpected type (e.g. if the server responded with
                                 *   an unexpected value).
                                 */
                                fun close(): String? = close.getNullable("close")

                                /**
                                 * @throws HelloWorldTestinggggInvalidDataException if the JSON
                                 *   field has an unexpected type (e.g. if the server responded with
                                 *   an unexpected value).
                                 */
                                fun open(): String? = open.getNullable("open")

                                /**
                                 * Returns the raw JSON value of [close].
                                 *
                                 * Unlike [close], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("close")
                                @ExcludeMissing
                                fun _close(): JsonField<String> = close

                                /**
                                 * Returns the raw JSON value of [open].
                                 *
                                 * Unlike [open], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("open")
                                @ExcludeMissing
                                fun _open(): JsonField<String> = open

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
                                     * [Weekend].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Weekend]. */
                                class Builder internal constructor() {

                                    private var close: JsonField<String> = JsonMissing.of()
                                    private var open: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(weekend: Weekend) = apply {
                                        close = weekend.close
                                        open = weekend.open
                                        additionalProperties =
                                            weekend.additionalProperties.toMutableMap()
                                    }

                                    fun close(close: String) = close(JsonField.of(close))

                                    /**
                                     * Sets [Builder.close] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.close] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun close(close: JsonField<String>) = apply {
                                        this.close = close
                                    }

                                    fun open(open: String) = open(JsonField.of(open))

                                    /**
                                     * Sets [Builder.open] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.open] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun open(open: JsonField<String>) = apply { this.open = open }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Weekend].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): Weekend =
                                        Weekend(close, open, additionalProperties.toMutableMap())
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws HelloWorldTestinggggInvalidDataException if any value
                                 *   type in this object doesn't match its expected type.
                                 */
                                fun validate(): Weekend = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    close()
                                    open()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (close.asKnown() == null) 0 else 1) +
                                        (if (open.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Weekend &&
                                        close == other.close &&
                                        open == other.open &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(close, open, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Weekend{close=$close, open=$open, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Availability &&
                                    weekday == other.weekday &&
                                    weekend == other.weekend &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(weekday, weekend, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Availability{weekday=$weekday, weekend=$weekend, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Primary &&
                                availability == other.availability &&
                                name == other.name &&
                                phone == other.phone &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(availability, name, phone, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Primary{availability=$availability, name=$name, phone=$phone, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contact &&
                            primary == other.primary &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(primary, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contact{primary=$primary, additionalProperties=$additionalProperties}"
                }

                class Location
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val latitude: JsonField<Double>,
                    private val longitude: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("latitude")
                        @ExcludeMissing
                        latitude: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("longitude")
                        @ExcludeMissing
                        longitude: JsonField<Double> = JsonMissing.of(),
                    ) : this(latitude, longitude, mutableMapOf())

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun latitude(): Double = latitude.getRequired("latitude")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun longitude(): Double = longitude.getRequired("longitude")

                    /**
                     * Returns the raw JSON value of [latitude].
                     *
                     * Unlike [latitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("latitude")
                    @ExcludeMissing
                    fun _latitude(): JsonField<Double> = latitude

                    /**
                     * Returns the raw JSON value of [longitude].
                     *
                     * Unlike [longitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("longitude")
                    @ExcludeMissing
                    fun _longitude(): JsonField<Double> = longitude

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
                         * Returns a mutable builder for constructing an instance of [Location].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .latitude()
                         * .longitude()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Location]. */
                    class Builder internal constructor() {

                        private var latitude: JsonField<Double>? = null
                        private var longitude: JsonField<Double>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(location: Location) = apply {
                            latitude = location.latitude
                            longitude = location.longitude
                            additionalProperties = location.additionalProperties.toMutableMap()
                        }

                        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                        /**
                         * Sets [Builder.latitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.latitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun latitude(latitude: JsonField<Double>) = apply {
                            this.latitude = latitude
                        }

                        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                        /**
                         * Sets [Builder.longitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.longitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun longitude(longitude: JsonField<Double>) = apply {
                            this.longitude = longitude
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
                         * Returns an immutable instance of [Location].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .latitude()
                         * .longitude()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Location =
                            Location(
                                checkRequired("latitude", latitude),
                                checkRequired("longitude", longitude),
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
                    fun validate(): Location = apply {
                        if (validated) {
                            return@apply
                        }

                        latitude()
                        longitude()
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
                        (if (latitude.asKnown() == null) 0 else 1) +
                            (if (longitude.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Location &&
                            latitude == other.latitude &&
                            longitude == other.longitude &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(latitude, longitude, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Location{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Shelter &&
                        name == other.name &&
                        address == other.address &&
                        contact == other.contact &&
                        location == other.location &&
                        relatedAddress == other.relatedAddress &&
                        relatedCategory == other.relatedCategory &&
                        relatedCustomer == other.relatedCustomer &&
                        relatedMoney == other.relatedMoney &&
                        relatedOrder == other.relatedOrder &&
                        relatedPet == other.relatedPet &&
                        relatedTag == other.relatedTag &&
                        relatedUser == other.relatedUser &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        name,
                        address,
                        contact,
                        location,
                        relatedAddress,
                        relatedCategory,
                        relatedCustomer,
                        relatedMoney,
                        relatedOrder,
                        relatedPet,
                        relatedTag,
                        relatedUser,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Shelter{name=$name, address=$address, contact=$contact, location=$location, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedTag=$relatedTag, relatedUser=$relatedUser, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Organization &&
                    applicantType == other.applicantType &&
                    name == other.name &&
                    shelter == other.shelter &&
                    taxId == other.taxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(applicantType, name, shelter, taxId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Organization{applicantType=$applicantType, name=$name, shelter=$shelter, taxId=$taxId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdoptionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AdoptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
