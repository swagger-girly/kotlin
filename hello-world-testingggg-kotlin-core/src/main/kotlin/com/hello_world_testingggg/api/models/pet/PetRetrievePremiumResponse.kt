// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

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
import com.hello_world_testingggg.api.models.Money
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** A pet extended with premium-tier pedigree and insurance details. */
class PetRetrievePremiumResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val photoUrls: JsonField<List<String>>,
    private val id: JsonField<Long>,
    private val category: JsonField<Pet.Category>,
    private val microchipId: JsonField<Pet.MicrochipId>,
    private val status: JsonField<PetStatus>,
    private val tags: JsonField<List<Pet.Tag>>,
    private val premiumSince: JsonField<OffsetDateTime>,
    private val coverageLimit: JsonField<CoverageLimit>,
    private val insurance: JsonField<Insurance>,
    private val pedigree: JsonField<Pedigree>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photoUrls")
        @ExcludeMissing
        photoUrls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<Pet.Category> = JsonMissing.of(),
        @JsonProperty("microchipId")
        @ExcludeMissing
        microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Pet.Tag>> = JsonMissing.of(),
        @JsonProperty("premiumSince")
        @ExcludeMissing
        premiumSince: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("coverageLimit")
        @ExcludeMissing
        coverageLimit: JsonField<CoverageLimit> = JsonMissing.of(),
        @JsonProperty("insurance")
        @ExcludeMissing
        insurance: JsonField<Insurance> = JsonMissing.of(),
        @JsonProperty("pedigree") @ExcludeMissing pedigree: JsonField<Pedigree> = JsonMissing.of(),
    ) : this(
        name,
        photoUrls,
        id,
        category,
        microchipId,
        status,
        tags,
        premiumSince,
        coverageLimit,
        insurance,
        pedigree,
        mutableMapOf(),
    )

    fun toPet(): Pet =
        Pet.builder()
            .name(name)
            .photoUrls(photoUrls)
            .id(id)
            .category(category)
            .microchipId(microchipId)
            .status(status)
            .tags(tags)
            .build()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun category(): Pet.Category? = category.getNullable("category")

    /**
     * Microchip identifier; legacy chips used numeric identifiers.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun microchipId(): Pet.MicrochipId? = microchipId.getNullable("microchipId")

    /**
     * pet status in the store
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun status(): PetStatus? = status.getNullable("status")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<Pet.Tag>? = tags.getNullable("tags")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun premiumSince(): OffsetDateTime = premiumSince.getRequired("premiumSince")

    /**
     * Coverage limit in minor units, or a negotiated custom limit.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun coverageLimit(): CoverageLimit? = coverageLimit.getNullable("coverageLimit")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun insurance(): Insurance? = insurance.getNullable("insurance")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun pedigree(): Pedigree? = pedigree.getNullable("pedigree")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [photoUrls].
     *
     * Unlike [photoUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photoUrls") @ExcludeMissing fun _photoUrls(): JsonField<List<String>> = photoUrls

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Pet.Category> = category

    /**
     * Returns the raw JSON value of [microchipId].
     *
     * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("microchipId")
    @ExcludeMissing
    fun _microchipId(): JsonField<Pet.MicrochipId> = microchipId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PetStatus> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Pet.Tag>> = tags

    /**
     * Returns the raw JSON value of [premiumSince].
     *
     * Unlike [premiumSince], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("premiumSince")
    @ExcludeMissing
    fun _premiumSince(): JsonField<OffsetDateTime> = premiumSince

    /**
     * Returns the raw JSON value of [coverageLimit].
     *
     * Unlike [coverageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coverageLimit")
    @ExcludeMissing
    fun _coverageLimit(): JsonField<CoverageLimit> = coverageLimit

    /**
     * Returns the raw JSON value of [insurance].
     *
     * Unlike [insurance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("insurance") @ExcludeMissing fun _insurance(): JsonField<Insurance> = insurance

    /**
     * Returns the raw JSON value of [pedigree].
     *
     * Unlike [pedigree], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pedigree") @ExcludeMissing fun _pedigree(): JsonField<Pedigree> = pedigree

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
         * Returns a mutable builder for constructing an instance of [PetRetrievePremiumResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * .premiumSince()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PetRetrievePremiumResponse]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var photoUrls: JsonField<MutableList<String>>? = null
        private var id: JsonField<Long> = JsonMissing.of()
        private var category: JsonField<Pet.Category> = JsonMissing.of()
        private var microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of()
        private var status: JsonField<PetStatus> = JsonMissing.of()
        private var tags: JsonField<MutableList<Pet.Tag>>? = null
        private var premiumSince: JsonField<OffsetDateTime>? = null
        private var coverageLimit: JsonField<CoverageLimit> = JsonMissing.of()
        private var insurance: JsonField<Insurance> = JsonMissing.of()
        private var pedigree: JsonField<Pedigree> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(petRetrievePremiumResponse: PetRetrievePremiumResponse) = apply {
            name = petRetrievePremiumResponse.name
            photoUrls = petRetrievePremiumResponse.photoUrls.map { it.toMutableList() }
            id = petRetrievePremiumResponse.id
            category = petRetrievePremiumResponse.category
            microchipId = petRetrievePremiumResponse.microchipId
            status = petRetrievePremiumResponse.status
            tags = petRetrievePremiumResponse.tags.map { it.toMutableList() }
            premiumSince = petRetrievePremiumResponse.premiumSince
            coverageLimit = petRetrievePremiumResponse.coverageLimit
            insurance = petRetrievePremiumResponse.insurance
            pedigree = petRetrievePremiumResponse.pedigree
            additionalProperties = petRetrievePremiumResponse.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun photoUrls(photoUrls: List<String>) = photoUrls(JsonField.of(photoUrls))

        /**
         * Sets [Builder.photoUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photoUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun photoUrls(photoUrls: JsonField<List<String>>) = apply {
            this.photoUrls = photoUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [photoUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhotoUrl(photoUrl: String) = apply {
            photoUrls =
                (photoUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("photoUrls", it).add(photoUrl)
                }
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun category(category: Pet.Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Pet.Category] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<Pet.Category>) = apply { this.category = category }

        /** Microchip identifier; legacy chips used numeric identifiers. */
        fun microchipId(microchipId: Pet.MicrochipId) = microchipId(JsonField.of(microchipId))

        /**
         * Sets [Builder.microchipId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.microchipId] with a well-typed [Pet.MicrochipId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun microchipId(microchipId: JsonField<Pet.MicrochipId>) = apply {
            this.microchipId = microchipId
        }

        /** Alias for calling [microchipId] with `Pet.MicrochipId.ofString(string)`. */
        fun microchipId(string: String) = microchipId(Pet.MicrochipId.ofString(string))

        /** Alias for calling [microchipId] with `Pet.MicrochipId.ofLong(long)`. */
        fun microchipId(long: Long) = microchipId(Pet.MicrochipId.ofLong(long))

        /** pet status in the store */
        fun status(status: PetStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PetStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<PetStatus>) = apply { this.status = status }

        fun tags(tags: List<Pet.Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Pet.Tag>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<Pet.Tag>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [Pet.Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Pet.Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun premiumSince(premiumSince: OffsetDateTime) = premiumSince(JsonField.of(premiumSince))

        /**
         * Sets [Builder.premiumSince] to an arbitrary JSON value.
         *
         * You should usually call [Builder.premiumSince] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun premiumSince(premiumSince: JsonField<OffsetDateTime>) = apply {
            this.premiumSince = premiumSince
        }

        /** Coverage limit in minor units, or a negotiated custom limit. */
        fun coverageLimit(coverageLimit: CoverageLimit) = coverageLimit(JsonField.of(coverageLimit))

        /**
         * Sets [Builder.coverageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coverageLimit] with a well-typed [CoverageLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coverageLimit(coverageLimit: JsonField<CoverageLimit>) = apply {
            this.coverageLimit = coverageLimit
        }

        /** Alias for calling [coverageLimit] with `CoverageLimit.ofLong(long)`. */
        fun coverageLimit(long: Long) = coverageLimit(CoverageLimit.ofLong(long))

        /** Alias for calling [coverageLimit] with `CoverageLimit.ofCustom(custom)`. */
        fun coverageLimit(custom: CoverageLimit.CustomLimit) =
            coverageLimit(CoverageLimit.ofCustom(custom))

        fun insurance(insurance: Insurance) = insurance(JsonField.of(insurance))

        /**
         * Sets [Builder.insurance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insurance] with a well-typed [Insurance] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun insurance(insurance: JsonField<Insurance>) = apply { this.insurance = insurance }

        fun pedigree(pedigree: Pedigree) = pedigree(JsonField.of(pedigree))

        /**
         * Sets [Builder.pedigree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pedigree] with a well-typed [Pedigree] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pedigree(pedigree: JsonField<Pedigree>) = apply { this.pedigree = pedigree }

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
         * Returns an immutable instance of [PetRetrievePremiumResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * .premiumSince()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PetRetrievePremiumResponse =
            PetRetrievePremiumResponse(
                checkRequired("name", name),
                checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                id,
                category,
                microchipId,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                checkRequired("premiumSince", premiumSince),
                coverageLimit,
                insurance,
                pedigree,
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
    fun validate(): PetRetrievePremiumResponse = apply {
        if (validated) {
            return@apply
        }

        name()
        photoUrls()
        id()
        category()?.validate()
        microchipId()?.validate()
        status()?.validate()
        tags()?.forEach { it.validate() }
        premiumSince()
        coverageLimit()?.validate()
        insurance()?.validate()
        pedigree()?.validate()
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
        (if (name.asKnown() == null) 0 else 1) +
            (photoUrls.asKnown()?.size ?: 0) +
            (if (id.asKnown() == null) 0 else 1) +
            (category.asKnown()?.validity() ?: 0) +
            (microchipId.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (premiumSince.asKnown() == null) 0 else 1) +
            (coverageLimit.asKnown()?.validity() ?: 0) +
            (insurance.asKnown()?.validity() ?: 0) +
            (pedigree.asKnown()?.validity() ?: 0)

    /** Coverage limit in minor units, or a negotiated custom limit. */
    @JsonDeserialize(using = CoverageLimit.Deserializer::class)
    @JsonSerialize(using = CoverageLimit.Serializer::class)
    class CoverageLimit
    private constructor(
        private val long: Long? = null,
        private val custom: CustomLimit? = null,
        private val _json: JsonValue? = null,
    ) {

        fun long(): Long? = long

        fun custom(): CustomLimit? = custom

        fun isLong(): Boolean = long != null

        fun isCustom(): Boolean = custom != null

        fun asLong(): Long = long.getOrThrow("long")

        fun asCustom(): CustomLimit = custom.getOrThrow("custom")

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
         * val result: String? = coverageLimit.accept(object : CoverageLimit.Visitor<String?> {
         *     override fun visitLong(long: Long): String? = long.toString()
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
                long != null -> visitor.visitLong(long)
                custom != null -> visitor.visitCustom(custom)
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
        fun validate(): CoverageLimit = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLong(long: Long) {}

                    override fun visitCustom(custom: CustomLimit) {
                        custom.validate()
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
                    override fun visitLong(long: Long) = 1

                    override fun visitCustom(custom: CustomLimit) = custom.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CoverageLimit && long == other.long && custom == other.custom
        }

        override fun hashCode(): Int = Objects.hash(long, custom)

        override fun toString(): String =
            when {
                long != null -> "CoverageLimit{long=$long}"
                custom != null -> "CoverageLimit{custom=$custom}"
                _json != null -> "CoverageLimit{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CoverageLimit")
            }

        companion object {

            fun ofLong(long: Long) = CoverageLimit(long = long)

            fun ofCustom(custom: CustomLimit) = CoverageLimit(custom = custom)
        }

        /**
         * An interface that defines how to map each variant of [CoverageLimit] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitLong(long: Long): T

            fun visitCustom(custom: CustomLimit): T

            /**
             * Maps an unknown variant of [CoverageLimit] to a value of type [T].
             *
             * An instance of [CoverageLimit] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown CoverageLimit: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CoverageLimit>(CoverageLimit::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CoverageLimit {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CustomLimit>())?.let {
                                CoverageLimit(custom = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                CoverageLimit(long = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CoverageLimit(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CoverageLimit>(CoverageLimit::class) {

            override fun serialize(
                value: CoverageLimit,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.long != null -> generator.writeObject(value.long)
                    value.custom != null -> generator.writeObject(value.custom)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CoverageLimit")
                }
            }
        }

        class CustomLimit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val negotiated: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("negotiated")
                @ExcludeMissing
                negotiated: JsonField<Boolean> = JsonMissing.of(),
            ) : this(amount, currency, negotiated, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun negotiated(): Boolean? = negotiated.getNullable("negotiated")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [negotiated].
             *
             * Unlike [negotiated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("negotiated")
            @ExcludeMissing
            fun _negotiated(): JsonField<Boolean> = negotiated

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
                 * Returns a mutable builder for constructing an instance of [CustomLimit].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CustomLimit]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String> = JsonMissing.of()
                private var negotiated: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customLimit: CustomLimit) = apply {
                    amount = customLimit.amount
                    currency = customLimit.currency
                    negotiated = customLimit.negotiated
                    additionalProperties = customLimit.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun negotiated(negotiated: Boolean) = negotiated(JsonField.of(negotiated))

                /**
                 * Sets [Builder.negotiated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.negotiated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun negotiated(negotiated: JsonField<Boolean>) = apply {
                    this.negotiated = negotiated
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
                 * Returns an immutable instance of [CustomLimit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CustomLimit =
                    CustomLimit(
                        checkRequired("amount", amount),
                        currency,
                        negotiated,
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
            fun validate(): CustomLimit = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                negotiated()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (negotiated.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomLimit &&
                    amount == other.amount &&
                    currency == other.currency &&
                    negotiated == other.negotiated &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, negotiated, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomLimit{amount=$amount, currency=$currency, negotiated=$negotiated, additionalProperties=$additionalProperties}"
        }
    }

    class Insurance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val planId: JsonField<String>,
        private val provider: JsonField<String>,
        private val deductible: JsonField<Long>,
        private val premium: JsonField<Money>,
        private val tier: JsonField<Tier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deductible")
            @ExcludeMissing
            deductible: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("premium") @ExcludeMissing premium: JsonField<Money> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
        ) : this(planId, provider, deductible, premium, tier, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun planId(): String = planId.getRequired("planId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deductible(): Long? = deductible.getNullable("deductible")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun premium(): Money? = premium.getNullable("premium")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tier(): Tier? = tier.getNullable("tier")

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [deductible].
         *
         * Unlike [deductible], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deductible") @ExcludeMissing fun _deductible(): JsonField<Long> = deductible

        /**
         * Returns the raw JSON value of [premium].
         *
         * Unlike [premium], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("premium") @ExcludeMissing fun _premium(): JsonField<Money> = premium

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

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
             * Returns a mutable builder for constructing an instance of [Insurance].
             *
             * The following fields are required:
             * ```kotlin
             * .planId()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Insurance]. */
        class Builder internal constructor() {

            private var planId: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var deductible: JsonField<Long> = JsonMissing.of()
            private var premium: JsonField<Money> = JsonMissing.of()
            private var tier: JsonField<Tier> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(insurance: Insurance) = apply {
                planId = insurance.planId
                provider = insurance.provider
                deductible = insurance.deductible
                premium = insurance.premium
                tier = insurance.tier
                additionalProperties = insurance.additionalProperties.toMutableMap()
            }

            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            fun deductible(deductible: Long) = deductible(JsonField.of(deductible))

            /**
             * Sets [Builder.deductible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deductible] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deductible(deductible: JsonField<Long>) = apply { this.deductible = deductible }

            fun premium(premium: Money) = premium(JsonField.of(premium))

            /**
             * Sets [Builder.premium] to an arbitrary JSON value.
             *
             * You should usually call [Builder.premium] with a well-typed [Money] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun premium(premium: JsonField<Money>) = apply { this.premium = premium }

            fun tier(tier: Tier) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

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
             * Returns an immutable instance of [Insurance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .planId()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Insurance =
                Insurance(
                    checkRequired("planId", planId),
                    checkRequired("provider", provider),
                    deductible,
                    premium,
                    tier,
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
        fun validate(): Insurance = apply {
            if (validated) {
                return@apply
            }

            planId()
            provider()
            deductible()
            premium()?.validate()
            tier()?.validate()
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
            (if (planId.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1) +
                (if (deductible.asKnown() == null) 0 else 1) +
                (premium.asKnown()?.validity() ?: 0) +
                (tier.asKnown()?.validity() ?: 0)

        class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val BASIC = of("basic")

                val PLUS = of("plus")

                val PLATINUM = of("platinum")

                fun of(value: String) = Tier(JsonField.of(value))
            }

            /** An enum containing [Tier]'s known values. */
            enum class Known {
                BASIC,
                PLUS,
                PLATINUM,
            }

            /**
             * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Tier] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BASIC,
                PLUS,
                PLATINUM,
                /** An enum member indicating that [Tier] was instantiated with an unknown value. */
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
                    BASIC -> Value.BASIC
                    PLUS -> Value.PLUS
                    PLATINUM -> Value.PLATINUM
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
                    BASIC -> Known.BASIC
                    PLUS -> Known.PLUS
                    PLATINUM -> Known.PLATINUM
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Tier: $value")
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
            fun validate(): Tier = apply {
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

                return other is Tier && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Insurance &&
                planId == other.planId &&
                provider == other.provider &&
                deductible == other.deductible &&
                premium == other.premium &&
                tier == other.tier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(planId, provider, deductible, premium, tier, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Insurance{planId=$planId, provider=$provider, deductible=$deductible, premium=$premium, tier=$tier, additionalProperties=$additionalProperties}"
    }

    class Pedigree
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val certified: JsonField<Boolean>,
        private val lineage: JsonField<List<String>>,
        private val registry: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("certified")
            @ExcludeMissing
            certified: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lineage")
            @ExcludeMissing
            lineage: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("registry") @ExcludeMissing registry: JsonField<String> = JsonMissing.of(),
        ) : this(certified, lineage, registry, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun certified(): Boolean? = certified.getNullable("certified")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineage(): List<String>? = lineage.getNullable("lineage")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun registry(): String? = registry.getNullable("registry")

        /**
         * Returns the raw JSON value of [certified].
         *
         * Unlike [certified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("certified") @ExcludeMissing fun _certified(): JsonField<Boolean> = certified

        /**
         * Returns the raw JSON value of [lineage].
         *
         * Unlike [lineage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineage") @ExcludeMissing fun _lineage(): JsonField<List<String>> = lineage

        /**
         * Returns the raw JSON value of [registry].
         *
         * Unlike [registry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("registry") @ExcludeMissing fun _registry(): JsonField<String> = registry

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

            /** Returns a mutable builder for constructing an instance of [Pedigree]. */
            fun builder() = Builder()
        }

        /** A builder for [Pedigree]. */
        class Builder internal constructor() {

            private var certified: JsonField<Boolean> = JsonMissing.of()
            private var lineage: JsonField<MutableList<String>>? = null
            private var registry: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pedigree: Pedigree) = apply {
                certified = pedigree.certified
                lineage = pedigree.lineage.map { it.toMutableList() }
                registry = pedigree.registry
                additionalProperties = pedigree.additionalProperties.toMutableMap()
            }

            fun certified(certified: Boolean) = certified(JsonField.of(certified))

            /**
             * Sets [Builder.certified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certified] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun certified(certified: JsonField<Boolean>) = apply { this.certified = certified }

            fun lineage(lineage: List<String>) = lineage(JsonField.of(lineage))

            /**
             * Sets [Builder.lineage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineage] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineage(lineage: JsonField<List<String>>) = apply {
                this.lineage = lineage.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.lineage].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineage(lineage: String) = apply {
                this.lineage =
                    (this.lineage ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineage", it).add(lineage)
                    }
            }

            fun registry(registry: String) = registry(JsonField.of(registry))

            /**
             * Sets [Builder.registry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registry] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registry(registry: JsonField<String>) = apply { this.registry = registry }

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
             * Returns an immutable instance of [Pedigree].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pedigree =
                Pedigree(
                    certified,
                    (lineage ?: JsonMissing.of()).map { it.toImmutable() },
                    registry,
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
        fun validate(): Pedigree = apply {
            if (validated) {
                return@apply
            }

            certified()
            lineage()
            registry()
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
            (if (certified.asKnown() == null) 0 else 1) +
                (lineage.asKnown()?.size ?: 0) +
                (if (registry.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pedigree &&
                certified == other.certified &&
                lineage == other.lineage &&
                registry == other.registry &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(certified, lineage, registry, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pedigree{certified=$certified, lineage=$lineage, registry=$registry, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetRetrievePremiumResponse &&
            name == other.name &&
            photoUrls == other.photoUrls &&
            id == other.id &&
            category == other.category &&
            microchipId == other.microchipId &&
            status == other.status &&
            tags == other.tags &&
            premiumSince == other.premiumSince &&
            coverageLimit == other.coverageLimit &&
            insurance == other.insurance &&
            pedigree == other.pedigree &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            photoUrls,
            id,
            category,
            microchipId,
            status,
            tags,
            premiumSince,
            coverageLimit,
            insurance,
            pedigree,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PetRetrievePremiumResponse{name=$name, photoUrls=$photoUrls, id=$id, category=$category, microchipId=$microchipId, status=$status, tags=$tags, premiumSince=$premiumSince, coverageLimit=$coverageLimit, insurance=$insurance, pedigree=$pedigree, additionalProperties=$additionalProperties}"
}
