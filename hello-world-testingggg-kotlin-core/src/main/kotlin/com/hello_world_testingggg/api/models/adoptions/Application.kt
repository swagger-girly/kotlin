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
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Application
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val applicant: JsonField<Applicant>,
    private val status: JsonField<Status>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val decision: JsonField<Decision>,
    private val fee: JsonField<Money>,
    private val history: JsonField<List<History>>,
    private val latestRejection: JsonField<LatestRejection>,
    private val pet: JsonField<Pet>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applicant")
        @ExcludeMissing
        applicant: JsonField<Applicant> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submittedAt")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("decision") @ExcludeMissing decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("fee") @ExcludeMissing fee: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("history")
        @ExcludeMissing
        history: JsonField<List<History>> = JsonMissing.of(),
        @JsonProperty("latestRejection")
        @ExcludeMissing
        latestRejection: JsonField<LatestRejection> = JsonMissing.of(),
        @JsonProperty("pet") @ExcludeMissing pet: JsonField<Pet> = JsonMissing.of(),
    ) : this(
        id,
        applicant,
        status,
        submittedAt,
        decision,
        fee,
        history,
        latestRejection,
        pet,
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
    fun applicant(): Applicant = applicant.getRequired("applicant")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submittedAt")

    /**
     * The decision for an application; the shape depends on the outcome.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun decision(): Decision? = decision.getNullable("decision")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun fee(): Money? = fee.getNullable("fee")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun history(): List<History>? = history.getNullable("history")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun latestRejection(): LatestRejection? = latestRejection.getNullable("latestRejection")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun pet(): Pet? = pet.getNullable("pet")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [applicant].
     *
     * Unlike [applicant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applicant") @ExcludeMissing fun _applicant(): JsonField<Applicant> = applicant

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submittedAt")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [decision].
     *
     * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

    /**
     * Returns the raw JSON value of [fee].
     *
     * Unlike [fee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee") @ExcludeMissing fun _fee(): JsonField<Money> = fee

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

    /**
     * Returns the raw JSON value of [latestRejection].
     *
     * Unlike [latestRejection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latestRejection")
    @ExcludeMissing
    fun _latestRejection(): JsonField<LatestRejection> = latestRejection

    /**
     * Returns the raw JSON value of [pet].
     *
     * Unlike [pet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pet") @ExcludeMissing fun _pet(): JsonField<Pet> = pet

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
         * Returns a mutable builder for constructing an instance of [Application].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .applicant()
         * .status()
         * .submittedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Application]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var applicant: JsonField<Applicant>? = null
        private var status: JsonField<Status>? = null
        private var submittedAt: JsonField<OffsetDateTime>? = null
        private var decision: JsonField<Decision> = JsonMissing.of()
        private var fee: JsonField<Money> = JsonMissing.of()
        private var history: JsonField<MutableList<History>>? = null
        private var latestRejection: JsonField<LatestRejection> = JsonMissing.of()
        private var pet: JsonField<Pet> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(application: Application) = apply {
            id = application.id
            applicant = application.applicant
            status = application.status
            submittedAt = application.submittedAt
            decision = application.decision
            fee = application.fee
            history = application.history.map { it.toMutableList() }
            latestRejection = application.latestRejection
            pet = application.pet
            additionalProperties = application.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun applicant(applicant: Applicant) = applicant(JsonField.of(applicant))

        /**
         * Sets [Builder.applicant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicant] with a well-typed [Applicant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applicant(applicant: JsonField<Applicant>) = apply { this.applicant = applicant }

        /** Alias for calling [applicant] with `Applicant.ofIndividual(individual)`. */
        fun applicant(individual: Applicant.Individual) =
            applicant(Applicant.ofIndividual(individual))

        /**
         * Alias for calling [applicant] with the following:
         * ```kotlin
         * Applicant.Individual.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun individualApplicant(name: String) =
            applicant(Applicant.Individual.builder().name(name).build())

        /** Alias for calling [applicant] with `Applicant.ofOrganization(organization)`. */
        fun applicant(organization: Applicant.Organization) =
            applicant(Applicant.ofOrganization(organization))

        /**
         * Alias for calling [applicant] with the following:
         * ```kotlin
         * Applicant.Organization.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun organizationApplicant(name: String) =
            applicant(Applicant.Organization.builder().name(name).build())

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /** The decision for an application; the shape depends on the outcome. */
        fun decision(decision: Decision) = decision(JsonField.of(decision))

        /**
         * Sets [Builder.decision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decision] with a well-typed [Decision] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

        /** Alias for calling [decision] with `Decision.ofApproved(approved)`. */
        fun decision(approved: Decision.DecisionApproved) = decision(Decision.ofApproved(approved))

        /** Alias for calling [decision] with `Decision.ofRejected(rejected)`. */
        fun decision(rejected: Decision.DecisionRejected) = decision(Decision.ofRejected(rejected))

        /** Alias for calling [decision] with `Decision.ofEscalated(escalated)`. */
        fun decision(escalated: Decision.DecisionEscalated) =
            decision(Decision.ofEscalated(escalated))

        /** Alias for calling [decision] with `Decision.ofWithdrawn(withdrawn)`. */
        fun decision(withdrawn: Decision.DecisionWithdrawn) =
            decision(Decision.ofWithdrawn(withdrawn))

        fun fee(fee: Money) = fee(JsonField.of(fee))

        /**
         * Sets [Builder.fee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fee] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fee(fee: JsonField<Money>) = apply { this.fee = fee }

        fun history(history: List<History>) = history(JsonField.of(history))

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed `List<History>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun history(history: JsonField<List<History>>) = apply {
            this.history = history.map { it.toMutableList() }
        }

        /**
         * Adds a single [History] to [Builder.history].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHistory(history: History) = apply {
            this.history =
                (this.history ?: JsonField.of(mutableListOf())).also {
                    checkKnown("history", it).add(history)
                }
        }

        fun latestRejection(latestRejection: LatestRejection) =
            latestRejection(JsonField.of(latestRejection))

        /**
         * Sets [Builder.latestRejection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestRejection] with a well-typed [LatestRejection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun latestRejection(latestRejection: JsonField<LatestRejection>) = apply {
            this.latestRejection = latestRejection
        }

        fun pet(pet: Pet) = pet(JsonField.of(pet))

        /**
         * Sets [Builder.pet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pet] with a well-typed [Pet] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pet(pet: JsonField<Pet>) = apply { this.pet = pet }

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
         * Returns an immutable instance of [Application].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .applicant()
         * .status()
         * .submittedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Application =
            Application(
                checkRequired("id", id),
                checkRequired("applicant", applicant),
                checkRequired("status", status),
                checkRequired("submittedAt", submittedAt),
                decision,
                fee,
                (history ?: JsonMissing.of()).map { it.toImmutable() },
                latestRejection,
                pet,
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
    fun validate(): Application = apply {
        if (validated) {
            return@apply
        }

        id()
        applicant().validate()
        status().validate()
        submittedAt()
        decision()?.validate()
        fee()?.validate()
        history()?.forEach { it.validate() }
        latestRejection()?.validate()
        pet()?.validate()
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
            (applicant.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (submittedAt.asKnown() == null) 0 else 1) +
            (decision.asKnown()?.validity() ?: 0) +
            (fee.asKnown()?.validity() ?: 0) +
            (history.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (latestRejection.asKnown()?.validity() ?: 0) +
            (pet.asKnown()?.validity() ?: 0)

    @JsonDeserialize(using = Applicant.Deserializer::class)
    @JsonSerialize(using = Applicant.Serializer::class)
    class Applicant
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
         * val result: String? = applicant.accept(object : Applicant.Visitor<String?> {
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
        fun validate(): Applicant = apply {
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

            return other is Applicant &&
                individual == other.individual &&
                organization == other.organization
        }

        override fun hashCode(): Int = Objects.hash(individual, organization)

        override fun toString(): String =
            when {
                individual != null -> "Applicant{individual=$individual}"
                organization != null -> "Applicant{organization=$organization}"
                _json != null -> "Applicant{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Applicant")
            }

        companion object {

            fun ofIndividual(individual: Individual) = Applicant(individual = individual)

            fun ofOrganization(organization: Organization) = Applicant(organization = organization)
        }

        /**
         * An interface that defines how to map each variant of [Applicant] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: Individual): T

            fun visitOrganization(organization: Organization): T

            /**
             * Maps an unknown variant of [Applicant] to a value of type [T].
             *
             * An instance of [Applicant] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown Applicant: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Applicant>(Applicant::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Applicant {
                val json = JsonValue.fromJsonNode(node)
                val applicantType = json.asObject()?.get("applicant_type")?.asString()

                when (applicantType) {
                    "individual" -> {
                        return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                            Applicant(individual = it, _json = json)
                        } ?: Applicant(_json = json)
                    }
                    "organization" -> {
                        return tryDeserialize(node, jacksonTypeRef<Organization>())?.let {
                            Applicant(organization = it, _json = json)
                        } ?: Applicant(_json = json)
                    }
                }

                return Applicant(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Applicant>(Applicant::class) {

            override fun serialize(
                value: Applicant,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individual != null -> generator.writeObject(value.individual)
                    value.organization != null -> generator.writeObject(value.organization)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Applicant")
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
                ) : this(name, address, contact, location, mutableMapOf())

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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(shelter: Shelter) = apply {
                        name = shelter.name
                        address = shelter.address
                        contact = shelter.contact
                        location = shelter.location
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
                        (location.asKnown()?.validity() ?: 0)

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
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, address, contact, location, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Shelter{name=$name, address=$address, contact=$contact, location=$location, additionalProperties=$additionalProperties}"
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

            val RECEIVED = of("received")

            val UNDER_REVIEW = of("under_review")

            val APPROVED = of("approved")

            val REJECTED = of("rejected")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RECEIVED,
            UNDER_REVIEW,
            APPROVED,
            REJECTED,
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
            RECEIVED,
            UNDER_REVIEW,
            APPROVED,
            REJECTED,
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
                RECEIVED -> Value.RECEIVED
                UNDER_REVIEW -> Value.UNDER_REVIEW
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                RECEIVED -> Known.RECEIVED
                UNDER_REVIEW -> Known.UNDER_REVIEW
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
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

    /** The decision for an application; the shape depends on the outcome. */
    @JsonDeserialize(using = Decision.Deserializer::class)
    @JsonSerialize(using = Decision.Serializer::class)
    class Decision
    private constructor(
        private val approved: DecisionApproved? = null,
        private val rejected: DecisionRejected? = null,
        private val escalated: DecisionEscalated? = null,
        private val withdrawn: DecisionWithdrawn? = null,
        private val _json: JsonValue? = null,
    ) {

        fun approved(): DecisionApproved? = approved

        fun rejected(): DecisionRejected? = rejected

        fun escalated(): DecisionEscalated? = escalated

        /** The applicant or shelter withdrew before a decision was finalized. */
        fun withdrawn(): DecisionWithdrawn? = withdrawn

        fun isApproved(): Boolean = approved != null

        fun isRejected(): Boolean = rejected != null

        fun isEscalated(): Boolean = escalated != null

        fun isWithdrawn(): Boolean = withdrawn != null

        fun asApproved(): DecisionApproved = approved.getOrThrow("approved")

        fun asRejected(): DecisionRejected = rejected.getOrThrow("rejected")

        fun asEscalated(): DecisionEscalated = escalated.getOrThrow("escalated")

        /** The applicant or shelter withdrew before a decision was finalized. */
        fun asWithdrawn(): DecisionWithdrawn = withdrawn.getOrThrow("withdrawn")

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
         * val result: String? = decision.accept(object : Decision.Visitor<String?> {
         *     override fun visitApproved(approved: DecisionApproved): String? = approved.toString()
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
                approved != null -> visitor.visitApproved(approved)
                rejected != null -> visitor.visitRejected(rejected)
                escalated != null -> visitor.visitEscalated(escalated)
                withdrawn != null -> visitor.visitWithdrawn(withdrawn)
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
        fun validate(): Decision = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApproved(approved: DecisionApproved) {
                        approved.validate()
                    }

                    override fun visitRejected(rejected: DecisionRejected) {
                        rejected.validate()
                    }

                    override fun visitEscalated(escalated: DecisionEscalated) {
                        escalated.validate()
                    }

                    override fun visitWithdrawn(withdrawn: DecisionWithdrawn) {
                        withdrawn.validate()
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
                    override fun visitApproved(approved: DecisionApproved) = approved.validity()

                    override fun visitRejected(rejected: DecisionRejected) = rejected.validity()

                    override fun visitEscalated(escalated: DecisionEscalated) = escalated.validity()

                    override fun visitWithdrawn(withdrawn: DecisionWithdrawn) = withdrawn.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Decision &&
                approved == other.approved &&
                rejected == other.rejected &&
                escalated == other.escalated &&
                withdrawn == other.withdrawn
        }

        override fun hashCode(): Int = Objects.hash(approved, rejected, escalated, withdrawn)

        override fun toString(): String =
            when {
                approved != null -> "Decision{approved=$approved}"
                rejected != null -> "Decision{rejected=$rejected}"
                escalated != null -> "Decision{escalated=$escalated}"
                withdrawn != null -> "Decision{withdrawn=$withdrawn}"
                _json != null -> "Decision{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Decision")
            }

        companion object {

            fun ofApproved(approved: DecisionApproved) = Decision(approved = approved)

            fun ofRejected(rejected: DecisionRejected) = Decision(rejected = rejected)

            fun ofEscalated(escalated: DecisionEscalated) = Decision(escalated = escalated)

            /** The applicant or shelter withdrew before a decision was finalized. */
            fun ofWithdrawn(withdrawn: DecisionWithdrawn) = Decision(withdrawn = withdrawn)
        }

        /**
         * An interface that defines how to map each variant of [Decision] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitApproved(approved: DecisionApproved): T

            fun visitRejected(rejected: DecisionRejected): T

            fun visitEscalated(escalated: DecisionEscalated): T

            /** The applicant or shelter withdrew before a decision was finalized. */
            fun visitWithdrawn(withdrawn: DecisionWithdrawn): T

            /**
             * Maps an unknown variant of [Decision] to a value of type [T].
             *
             * An instance of [Decision] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown Decision: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Decision>(Decision::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Decision {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DecisionApproved>())?.let {
                                Decision(approved = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DecisionRejected>())?.let {
                                Decision(rejected = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DecisionEscalated>())?.let {
                                Decision(escalated = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DecisionWithdrawn>())?.let {
                                Decision(withdrawn = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Decision(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Decision>(Decision::class) {

            override fun serialize(
                value: Decision,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.approved != null -> generator.writeObject(value.approved)
                    value.rejected != null -> generator.writeObject(value.rejected)
                    value.escalated != null -> generator.writeObject(value.escalated)
                    value.withdrawn != null -> generator.writeObject(value.withdrawn)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Decision")
                }
            }
        }

        class DecisionApproved
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val approvedAt: JsonField<OffsetDateTime>,
            private val outcome: JsonValue,
            private val conditions: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("approvedAt")
                @ExcludeMissing
                approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("outcome") @ExcludeMissing outcome: JsonValue = JsonMissing.of(),
                @JsonProperty("conditions")
                @ExcludeMissing
                conditions: JsonField<List<String>> = JsonMissing.of(),
            ) : this(approvedAt, outcome, conditions, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approvedAt")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("approved")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonValue = outcome

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun conditions(): List<String>? = conditions.getNullable("conditions")

            /**
             * Returns the raw JSON value of [approvedAt].
             *
             * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approvedAt")
            @ExcludeMissing
            fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

            /**
             * Returns the raw JSON value of [conditions].
             *
             * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("conditions")
            @ExcludeMissing
            fun _conditions(): JsonField<List<String>> = conditions

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
                 * Returns a mutable builder for constructing an instance of [DecisionApproved].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .approvedAt()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DecisionApproved]. */
            class Builder internal constructor() {

                private var approvedAt: JsonField<OffsetDateTime>? = null
                private var outcome: JsonValue = JsonValue.from("approved")
                private var conditions: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decisionApproved: DecisionApproved) = apply {
                    approvedAt = decisionApproved.approvedAt
                    outcome = decisionApproved.outcome
                    conditions = decisionApproved.conditions.map { it.toMutableList() }
                    additionalProperties = decisionApproved.additionalProperties.toMutableMap()
                }

                fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

                /**
                 * Sets [Builder.approvedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                    this.approvedAt = approvedAt
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("approved")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun outcome(outcome: JsonValue) = apply { this.outcome = outcome }

                fun conditions(conditions: List<String>) = conditions(JsonField.of(conditions))

                /**
                 * Sets [Builder.conditions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conditions] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun conditions(conditions: JsonField<List<String>>) = apply {
                    this.conditions = conditions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [conditions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCondition(condition: String) = apply {
                    conditions =
                        (conditions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("conditions", it).add(condition)
                        }
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
                 * Returns an immutable instance of [DecisionApproved].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .approvedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DecisionApproved =
                    DecisionApproved(
                        checkRequired("approvedAt", approvedAt),
                        outcome,
                        (conditions ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): DecisionApproved = apply {
                if (validated) {
                    return@apply
                }

                approvedAt()
                _outcome().let {
                    if (it != JsonValue.from("approved")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'outcome' is invalid, received $it"
                        )
                    }
                }
                conditions()
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
                    outcome.let { if (it == JsonValue.from("approved")) 1 else 0 } +
                    (conditions.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DecisionApproved &&
                    approvedAt == other.approvedAt &&
                    outcome == other.outcome &&
                    conditions == other.conditions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(approvedAt, outcome, conditions, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DecisionApproved{approvedAt=$approvedAt, outcome=$outcome, conditions=$conditions, additionalProperties=$additionalProperties}"
        }

        class DecisionRejected
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val outcome: JsonValue,
            private val reason: JsonField<Reason>,
            private val appealDeadline: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("outcome") @ExcludeMissing outcome: JsonValue = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("appealDeadline")
                @ExcludeMissing
                appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(outcome, reason, appealDeadline, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("rejected")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonValue = outcome

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun appealDeadline(): OffsetDateTime? = appealDeadline.getNullable("appealDeadline")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * Returns the raw JSON value of [appealDeadline].
             *
             * Unlike [appealDeadline], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("appealDeadline")
            @ExcludeMissing
            fun _appealDeadline(): JsonField<OffsetDateTime> = appealDeadline

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
                 * Returns a mutable builder for constructing an instance of [DecisionRejected].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DecisionRejected]. */
            class Builder internal constructor() {

                private var outcome: JsonValue = JsonValue.from("rejected")
                private var reason: JsonField<Reason>? = null
                private var appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decisionRejected: DecisionRejected) = apply {
                    outcome = decisionRejected.outcome
                    reason = decisionRejected.reason
                    appealDeadline = decisionRejected.appealDeadline
                    additionalProperties = decisionRejected.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("rejected")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun outcome(outcome: JsonValue) = apply { this.outcome = outcome }

                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun appealDeadline(appealDeadline: OffsetDateTime?) =
                    appealDeadline(JsonField.ofNullable(appealDeadline))

                /**
                 * Sets [Builder.appealDeadline] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appealDeadline] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appealDeadline(appealDeadline: JsonField<OffsetDateTime>) = apply {
                    this.appealDeadline = appealDeadline
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
                 * Returns an immutable instance of [DecisionRejected].
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
                fun build(): DecisionRejected =
                    DecisionRejected(
                        outcome,
                        checkRequired("reason", reason),
                        appealDeadline,
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
            fun validate(): DecisionRejected = apply {
                if (validated) {
                    return@apply
                }

                _outcome().let {
                    if (it != JsonValue.from("rejected")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'outcome' is invalid, received $it"
                        )
                    }
                }
                reason().validate()
                appealDeadline()
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
                outcome.let { if (it == JsonValue.from("rejected")) 1 else 0 } +
                    (reason.asKnown()?.validity() ?: 0) +
                    (if (appealDeadline.asKnown() == null) 0 else 1)

            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val POLICY = of("policy")

                    val CAPACITY = of("capacity")

                    val INCOMPLETE = of("incomplete")

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    POLICY,
                    CAPACITY,
                    INCOMPLETE,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POLICY,
                    CAPACITY,
                    INCOMPLETE,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
                     * value.
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
                        POLICY -> Value.POLICY
                        CAPACITY -> Value.CAPACITY
                        INCOMPLETE -> Value.INCOMPLETE
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
                        POLICY -> Known.POLICY
                        CAPACITY -> Known.CAPACITY
                        INCOMPLETE -> Known.INCOMPLETE
                        else ->
                            throw HelloWorldTestinggggInvalidDataException("Unknown Reason: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DecisionRejected &&
                    outcome == other.outcome &&
                    reason == other.reason &&
                    appealDeadline == other.appealDeadline &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(outcome, reason, appealDeadline, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DecisionRejected{outcome=$outcome, reason=$reason, appealDeadline=$appealDeadline, additionalProperties=$additionalProperties}"
        }

        class DecisionEscalated
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val escalatedTo: JsonField<EscalatedTo>,
            private val outcome: JsonValue,
            private val reviewAfter: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("escalatedTo")
                @ExcludeMissing
                escalatedTo: JsonField<EscalatedTo> = JsonMissing.of(),
                @JsonProperty("outcome") @ExcludeMissing outcome: JsonValue = JsonMissing.of(),
                @JsonProperty("reviewAfter")
                @ExcludeMissing
                reviewAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(escalatedTo, outcome, reviewAfter, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun escalatedTo(): EscalatedTo = escalatedTo.getRequired("escalatedTo")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("escalated")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonValue = outcome

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reviewAfter(): OffsetDateTime? = reviewAfter.getNullable("reviewAfter")

            /**
             * Returns the raw JSON value of [escalatedTo].
             *
             * Unlike [escalatedTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("escalatedTo")
            @ExcludeMissing
            fun _escalatedTo(): JsonField<EscalatedTo> = escalatedTo

            /**
             * Returns the raw JSON value of [reviewAfter].
             *
             * Unlike [reviewAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reviewAfter")
            @ExcludeMissing
            fun _reviewAfter(): JsonField<OffsetDateTime> = reviewAfter

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
                 * Returns a mutable builder for constructing an instance of [DecisionEscalated].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .escalatedTo()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DecisionEscalated]. */
            class Builder internal constructor() {

                private var escalatedTo: JsonField<EscalatedTo>? = null
                private var outcome: JsonValue = JsonValue.from("escalated")
                private var reviewAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decisionEscalated: DecisionEscalated) = apply {
                    escalatedTo = decisionEscalated.escalatedTo
                    outcome = decisionEscalated.outcome
                    reviewAfter = decisionEscalated.reviewAfter
                    additionalProperties = decisionEscalated.additionalProperties.toMutableMap()
                }

                fun escalatedTo(escalatedTo: EscalatedTo) = escalatedTo(JsonField.of(escalatedTo))

                /**
                 * Sets [Builder.escalatedTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.escalatedTo] with a well-typed [EscalatedTo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun escalatedTo(escalatedTo: JsonField<EscalatedTo>) = apply {
                    this.escalatedTo = escalatedTo
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("escalated")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun outcome(outcome: JsonValue) = apply { this.outcome = outcome }

                fun reviewAfter(reviewAfter: OffsetDateTime) =
                    reviewAfter(JsonField.of(reviewAfter))

                /**
                 * Sets [Builder.reviewAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reviewAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reviewAfter(reviewAfter: JsonField<OffsetDateTime>) = apply {
                    this.reviewAfter = reviewAfter
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
                 * Returns an immutable instance of [DecisionEscalated].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .escalatedTo()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DecisionEscalated =
                    DecisionEscalated(
                        checkRequired("escalatedTo", escalatedTo),
                        outcome,
                        reviewAfter,
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
            fun validate(): DecisionEscalated = apply {
                if (validated) {
                    return@apply
                }

                escalatedTo().validate()
                _outcome().let {
                    if (it != JsonValue.from("escalated")) {
                        throw HelloWorldTestinggggInvalidDataException(
                            "'outcome' is invalid, received $it"
                        )
                    }
                }
                reviewAfter()
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
                (escalatedTo.asKnown()?.validity() ?: 0) +
                    outcome.let { if (it == JsonValue.from("escalated")) 1 else 0 } +
                    (if (reviewAfter.asKnown() == null) 0 else 1)

            class EscalatedTo
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val team: JsonField<String>,
                private val contact: JsonField<Contact>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("team")
                    @ExcludeMissing
                    team: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("contact")
                    @ExcludeMissing
                    contact: JsonField<Contact> = JsonMissing.of(),
                ) : this(team, contact, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun team(): String = team.getRequired("team")

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun contact(): Contact? = contact.getNullable("contact")

                /**
                 * Returns the raw JSON value of [team].
                 *
                 * Unlike [team], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("team") @ExcludeMissing fun _team(): JsonField<String> = team

                /**
                 * Returns the raw JSON value of [contact].
                 *
                 * Unlike [contact], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contact")
                @ExcludeMissing
                fun _contact(): JsonField<Contact> = contact

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
                     * Returns a mutable builder for constructing an instance of [EscalatedTo].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .team()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [EscalatedTo]. */
                class Builder internal constructor() {

                    private var team: JsonField<String>? = null
                    private var contact: JsonField<Contact> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(escalatedTo: EscalatedTo) = apply {
                        team = escalatedTo.team
                        contact = escalatedTo.contact
                        additionalProperties = escalatedTo.additionalProperties.toMutableMap()
                    }

                    fun team(team: String) = team(JsonField.of(team))

                    /**
                     * Sets [Builder.team] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.team] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun team(team: JsonField<String>) = apply { this.team = team }

                    fun contact(contact: Contact) = contact(JsonField.of(contact))

                    /**
                     * Sets [Builder.contact] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contact] with a well-typed [Contact] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

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
                     * Returns an immutable instance of [EscalatedTo].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .team()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EscalatedTo =
                        EscalatedTo(
                            checkRequired("team", team),
                            contact,
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
                fun validate(): EscalatedTo = apply {
                    if (validated) {
                        return@apply
                    }

                    team()
                    contact()?.validate()
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
                    (if (team.asKnown() == null) 0 else 1) + (contact.asKnown()?.validity() ?: 0)

                class Contact
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val email: JsonField<String>,
                    private val hours: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("email")
                        @ExcludeMissing
                        email: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("hours")
                        @ExcludeMissing
                        hours: JsonField<String> = JsonMissing.of(),
                    ) : this(email, hours, mutableMapOf())

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun email(): String? = email.getNullable("email")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun hours(): String? = hours.getNullable("hours")

                    /**
                     * Returns the raw JSON value of [email].
                     *
                     * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                    /**
                     * Returns the raw JSON value of [hours].
                     *
                     * Unlike [hours], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<String> = hours

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

                        private var email: JsonField<String> = JsonMissing.of()
                        private var hours: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(contact: Contact) = apply {
                            email = contact.email
                            hours = contact.hours
                            additionalProperties = contact.additionalProperties.toMutableMap()
                        }

                        fun email(email: String) = email(JsonField.of(email))

                        /**
                         * Sets [Builder.email] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.email] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun email(email: JsonField<String>) = apply { this.email = email }

                        fun hours(hours: String) = hours(JsonField.of(hours))

                        /**
                         * Sets [Builder.hours] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.hours] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun hours(hours: JsonField<String>) = apply { this.hours = hours }

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
                        fun build(): Contact =
                            Contact(email, hours, additionalProperties.toMutableMap())
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

                        email()
                        hours()
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
                        (if (email.asKnown() == null) 0 else 1) +
                            (if (hours.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contact &&
                            email == other.email &&
                            hours == other.hours &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(email, hours, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contact{email=$email, hours=$hours, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EscalatedTo &&
                        team == other.team &&
                        contact == other.contact &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(team, contact, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EscalatedTo{team=$team, contact=$contact, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DecisionEscalated &&
                    escalatedTo == other.escalatedTo &&
                    outcome == other.outcome &&
                    reviewAfter == other.reviewAfter &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(escalatedTo, outcome, reviewAfter, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DecisionEscalated{escalatedTo=$escalatedTo, outcome=$outcome, reviewAfter=$reviewAfter, additionalProperties=$additionalProperties}"
        }

        /** The applicant or shelter withdrew before a decision was finalized. */
        class DecisionWithdrawn
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val outcome: JsonField<Outcome>,
            private val withdrawnBy: JsonField<WithdrawnBy>,
            private val withdrawnAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("outcome")
                @ExcludeMissing
                outcome: JsonField<Outcome> = JsonMissing.of(),
                @JsonProperty("withdrawnBy")
                @ExcludeMissing
                withdrawnBy: JsonField<WithdrawnBy> = JsonMissing.of(),
                @JsonProperty("withdrawnAt")
                @ExcludeMissing
                withdrawnAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(outcome, withdrawnBy, withdrawnAt, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun outcome(): Outcome = outcome.getRequired("outcome")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun withdrawnBy(): WithdrawnBy = withdrawnBy.getRequired("withdrawnBy")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun withdrawnAt(): OffsetDateTime? = withdrawnAt.getNullable("withdrawnAt")

            /**
             * Returns the raw JSON value of [outcome].
             *
             * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

            /**
             * Returns the raw JSON value of [withdrawnBy].
             *
             * Unlike [withdrawnBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("withdrawnBy")
            @ExcludeMissing
            fun _withdrawnBy(): JsonField<WithdrawnBy> = withdrawnBy

            /**
             * Returns the raw JSON value of [withdrawnAt].
             *
             * Unlike [withdrawnAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("withdrawnAt")
            @ExcludeMissing
            fun _withdrawnAt(): JsonField<OffsetDateTime> = withdrawnAt

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
                 * Returns a mutable builder for constructing an instance of [DecisionWithdrawn].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .outcome()
                 * .withdrawnBy()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DecisionWithdrawn]. */
            class Builder internal constructor() {

                private var outcome: JsonField<Outcome>? = null
                private var withdrawnBy: JsonField<WithdrawnBy>? = null
                private var withdrawnAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(decisionWithdrawn: DecisionWithdrawn) = apply {
                    outcome = decisionWithdrawn.outcome
                    withdrawnBy = decisionWithdrawn.withdrawnBy
                    withdrawnAt = decisionWithdrawn.withdrawnAt
                    additionalProperties = decisionWithdrawn.additionalProperties.toMutableMap()
                }

                fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

                /**
                 * Sets [Builder.outcome] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outcome] with a well-typed [Outcome] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

                fun withdrawnBy(withdrawnBy: WithdrawnBy) = withdrawnBy(JsonField.of(withdrawnBy))

                /**
                 * Sets [Builder.withdrawnBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withdrawnBy] with a well-typed [WithdrawnBy]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun withdrawnBy(withdrawnBy: JsonField<WithdrawnBy>) = apply {
                    this.withdrawnBy = withdrawnBy
                }

                fun withdrawnAt(withdrawnAt: OffsetDateTime) =
                    withdrawnAt(JsonField.of(withdrawnAt))

                /**
                 * Sets [Builder.withdrawnAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withdrawnAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun withdrawnAt(withdrawnAt: JsonField<OffsetDateTime>) = apply {
                    this.withdrawnAt = withdrawnAt
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
                 * Returns an immutable instance of [DecisionWithdrawn].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .outcome()
                 * .withdrawnBy()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DecisionWithdrawn =
                    DecisionWithdrawn(
                        checkRequired("outcome", outcome),
                        checkRequired("withdrawnBy", withdrawnBy),
                        withdrawnAt,
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
            fun validate(): DecisionWithdrawn = apply {
                if (validated) {
                    return@apply
                }

                outcome().validate()
                withdrawnBy().validate()
                withdrawnAt()
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
                (outcome.asKnown()?.validity() ?: 0) +
                    (withdrawnBy.asKnown()?.validity() ?: 0) +
                    (if (withdrawnAt.asKnown() == null) 0 else 1)

            class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val WITHDRAWN = of("withdrawn")

                    val EXPIRED = of("expired")

                    fun of(value: String) = Outcome(JsonField.of(value))
                }

                /** An enum containing [Outcome]'s known values. */
                enum class Known {
                    WITHDRAWN,
                    EXPIRED,
                }

                /**
                 * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Outcome] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WITHDRAWN,
                    EXPIRED,
                    /**
                     * An enum member indicating that [Outcome] was instantiated with an unknown
                     * value.
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
                        WITHDRAWN -> Value.WITHDRAWN
                        EXPIRED -> Value.EXPIRED
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
                        WITHDRAWN -> Known.WITHDRAWN
                        EXPIRED -> Known.EXPIRED
                        else ->
                            throw HelloWorldTestinggggInvalidDataException(
                                "Unknown Outcome: $value"
                            )
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
                fun validate(): Outcome = apply {
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

                    return other is Outcome && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class WithdrawnBy
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val APPLICANT = of("applicant")

                    val SHELTER = of("shelter")

                    val SYSTEM = of("system")

                    fun of(value: String) = WithdrawnBy(JsonField.of(value))
                }

                /** An enum containing [WithdrawnBy]'s known values. */
                enum class Known {
                    APPLICANT,
                    SHELTER,
                    SYSTEM,
                }

                /**
                 * An enum containing [WithdrawnBy]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [WithdrawnBy] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICANT,
                    SHELTER,
                    SYSTEM,
                    /**
                     * An enum member indicating that [WithdrawnBy] was instantiated with an unknown
                     * value.
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
                        APPLICANT -> Value.APPLICANT
                        SHELTER -> Value.SHELTER
                        SYSTEM -> Value.SYSTEM
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
                        APPLICANT -> Known.APPLICANT
                        SHELTER -> Known.SHELTER
                        SYSTEM -> Known.SYSTEM
                        else ->
                            throw HelloWorldTestinggggInvalidDataException(
                                "Unknown WithdrawnBy: $value"
                            )
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
                fun validate(): WithdrawnBy = apply {
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

                    return other is WithdrawnBy && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DecisionWithdrawn &&
                    outcome == other.outcome &&
                    withdrawnBy == other.withdrawnBy &&
                    withdrawnAt == other.withdrawnAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(outcome, withdrawnBy, withdrawnAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DecisionWithdrawn{outcome=$outcome, withdrawnBy=$withdrawnBy, withdrawnAt=$withdrawnAt, additionalProperties=$additionalProperties}"
        }
    }

    class History
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val changedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val note: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("changedAt")
            @ExcludeMissing
            changedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        ) : this(changedAt, status, note, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun changedAt(): OffsetDateTime = changedAt.getRequired("changedAt")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun note(): String? = note.getNullable("note")

        /**
         * Returns the raw JSON value of [changedAt].
         *
         * Unlike [changedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("changedAt")
        @ExcludeMissing
        fun _changedAt(): JsonField<OffsetDateTime> = changedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [History].
             *
             * The following fields are required:
             * ```kotlin
             * .changedAt()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [History]. */
        class Builder internal constructor() {

            private var changedAt: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var note: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(history: History) = apply {
                changedAt = history.changedAt
                status = history.status
                note = history.note
                additionalProperties = history.additionalProperties.toMutableMap()
            }

            fun changedAt(changedAt: OffsetDateTime) = changedAt(JsonField.of(changedAt))

            /**
             * Sets [Builder.changedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changedAt(changedAt: JsonField<OffsetDateTime>) = apply {
                this.changedAt = changedAt
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun note(note: String?) = note(JsonField.ofNullable(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

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
             * Returns an immutable instance of [History].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .changedAt()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): History =
                History(
                    checkRequired("changedAt", changedAt),
                    checkRequired("status", status),
                    note,
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
        fun validate(): History = apply {
            if (validated) {
                return@apply
            }

            changedAt()
            status().validate()
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
            (if (changedAt.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (if (note.asKnown() == null) 0 else 1)

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

                val RECEIVED = of("received")

                val UNDER_REVIEW = of("under_review")

                val APPROVED = of("approved")

                val REJECTED = of("rejected")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RECEIVED,
                UNDER_REVIEW,
                APPROVED,
                REJECTED,
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
                RECEIVED,
                UNDER_REVIEW,
                APPROVED,
                REJECTED,
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
                    RECEIVED -> Value.RECEIVED
                    UNDER_REVIEW -> Value.UNDER_REVIEW
                    APPROVED -> Value.APPROVED
                    REJECTED -> Value.REJECTED
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
                    RECEIVED -> Known.RECEIVED
                    UNDER_REVIEW -> Known.UNDER_REVIEW
                    APPROVED -> Known.APPROVED
                    REJECTED -> Known.REJECTED
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

            return other is History &&
                changedAt == other.changedAt &&
                status == other.status &&
                note == other.note &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(changedAt, status, note, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "History{changedAt=$changedAt, status=$status, note=$note, additionalProperties=$additionalProperties}"
    }

    class LatestRejection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val outcome: JsonValue,
        private val reason: JsonField<Reason>,
        private val appealDeadline: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonValue = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("appealDeadline")
            @ExcludeMissing
            appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(outcome, reason, appealDeadline, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("rejected")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonValue = outcome

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun appealDeadline(): OffsetDateTime? = appealDeadline.getNullable("appealDeadline")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [appealDeadline].
         *
         * Unlike [appealDeadline], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("appealDeadline")
        @ExcludeMissing
        fun _appealDeadline(): JsonField<OffsetDateTime> = appealDeadline

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
             * Returns a mutable builder for constructing an instance of [LatestRejection].
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LatestRejection]. */
        class Builder internal constructor() {

            private var outcome: JsonValue = JsonValue.from("rejected")
            private var reason: JsonField<Reason>? = null
            private var appealDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(latestRejection: LatestRejection) = apply {
                outcome = latestRejection.outcome
                reason = latestRejection.reason
                appealDeadline = latestRejection.appealDeadline
                additionalProperties = latestRejection.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("rejected")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonValue) = apply { this.outcome = outcome }

            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun appealDeadline(appealDeadline: OffsetDateTime?) =
                appealDeadline(JsonField.ofNullable(appealDeadline))

            /**
             * Sets [Builder.appealDeadline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appealDeadline] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appealDeadline(appealDeadline: JsonField<OffsetDateTime>) = apply {
                this.appealDeadline = appealDeadline
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
             * Returns an immutable instance of [LatestRejection].
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
            fun build(): LatestRejection =
                LatestRejection(
                    outcome,
                    checkRequired("reason", reason),
                    appealDeadline,
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
        fun validate(): LatestRejection = apply {
            if (validated) {
                return@apply
            }

            _outcome().let {
                if (it != JsonValue.from("rejected")) {
                    throw HelloWorldTestinggggInvalidDataException(
                        "'outcome' is invalid, received $it"
                    )
                }
            }
            reason().validate()
            appealDeadline()
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
            outcome.let { if (it == JsonValue.from("rejected")) 1 else 0 } +
                (reason.asKnown()?.validity() ?: 0) +
                (if (appealDeadline.asKnown() == null) 0 else 1)

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

                val POLICY = of("policy")

                val CAPACITY = of("capacity")

                val INCOMPLETE = of("incomplete")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                POLICY,
                CAPACITY,
                INCOMPLETE,
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
                POLICY,
                CAPACITY,
                INCOMPLETE,
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
                    POLICY -> Value.POLICY
                    CAPACITY -> Value.CAPACITY
                    INCOMPLETE -> Value.INCOMPLETE
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
                    POLICY -> Known.POLICY
                    CAPACITY -> Known.CAPACITY
                    INCOMPLETE -> Known.INCOMPLETE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LatestRejection &&
                outcome == other.outcome &&
                reason == other.reason &&
                appealDeadline == other.appealDeadline &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(outcome, reason, appealDeadline, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LatestRejection{outcome=$outcome, reason=$reason, appealDeadline=$appealDeadline, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Application &&
            id == other.id &&
            applicant == other.applicant &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            decision == other.decision &&
            fee == other.fee &&
            history == other.history &&
            latestRejection == other.latestRejection &&
            pet == other.pet &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            applicant,
            status,
            submittedAt,
            decision,
            fee,
            history,
            latestRejection,
            pet,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Application{id=$id, applicant=$applicant, status=$status, submittedAt=$submittedAt, decision=$decision, fee=$fee, history=$history, latestRejection=$latestRejection, pet=$pet, additionalProperties=$additionalProperties}"
}
