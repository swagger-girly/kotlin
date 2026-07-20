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
import java.util.Collections
import java.util.Objects

class Pet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val photoUrls: JsonField<List<String>>,
    private val id: JsonField<Long>,
    private val acquisitionChannel: JsonField<AcquisitionChannel>,
    private val category: JsonField<Category>,
    private val microchipId: JsonField<MicrochipId>,
    private val status: JsonField<PetStatus>,
    private val tags: JsonField<List<Tag>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photoUrls")
        @ExcludeMissing
        photoUrls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("acquisitionChannel")
        @ExcludeMissing
        acquisitionChannel: JsonField<AcquisitionChannel> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("microchipId")
        @ExcludeMissing
        microchipId: JsonField<MicrochipId> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
    ) : this(
        name,
        photoUrls,
        id,
        acquisitionChannel,
        category,
        microchipId,
        status,
        tags,
        mutableMapOf(),
    )

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
     * How the pet entered the store. Open enum: known channels plus forward-compatible free-form
     * strings.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun acquisitionChannel(): AcquisitionChannel? =
        acquisitionChannel.getNullable("acquisitionChannel")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category? = category.getNullable("category")

    /**
     * Microchip identifier; legacy chips used numeric identifiers.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun microchipId(): MicrochipId? = microchipId.getNullable("microchipId")

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
    fun tags(): List<Tag>? = tags.getNullable("tags")

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
     * Returns the raw JSON value of [acquisitionChannel].
     *
     * Unlike [acquisitionChannel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acquisitionChannel")
    @ExcludeMissing
    fun _acquisitionChannel(): JsonField<AcquisitionChannel> = acquisitionChannel

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [microchipId].
     *
     * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("microchipId")
    @ExcludeMissing
    fun _microchipId(): JsonField<MicrochipId> = microchipId

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
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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
         * Returns a mutable builder for constructing an instance of [Pet].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Pet]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var photoUrls: JsonField<MutableList<String>>? = null
        private var id: JsonField<Long> = JsonMissing.of()
        private var acquisitionChannel: JsonField<AcquisitionChannel> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var microchipId: JsonField<MicrochipId> = JsonMissing.of()
        private var status: JsonField<PetStatus> = JsonMissing.of()
        private var tags: JsonField<MutableList<Tag>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pet: Pet) = apply {
            name = pet.name
            photoUrls = pet.photoUrls.map { it.toMutableList() }
            id = pet.id
            acquisitionChannel = pet.acquisitionChannel
            category = pet.category
            microchipId = pet.microchipId
            status = pet.status
            tags = pet.tags.map { it.toMutableList() }
            additionalProperties = pet.additionalProperties.toMutableMap()
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

        /**
         * How the pet entered the store. Open enum: known channels plus forward-compatible
         * free-form strings.
         */
        fun acquisitionChannel(acquisitionChannel: AcquisitionChannel) =
            acquisitionChannel(JsonField.of(acquisitionChannel))

        /**
         * Sets [Builder.acquisitionChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquisitionChannel] with a well-typed
         * [AcquisitionChannel] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun acquisitionChannel(acquisitionChannel: JsonField<AcquisitionChannel>) = apply {
            this.acquisitionChannel = acquisitionChannel
        }

        /**
         * Sets [acquisitionChannel] to an arbitrary [String].
         *
         * You should usually call [acquisitionChannel] with a well-typed [AcquisitionChannel]
         * constant instead. This method is primarily for setting the field to an undocumented or
         * not yet supported value.
         */
        fun acquisitionChannel(value: String) = acquisitionChannel(AcquisitionChannel.of(value))

        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Microchip identifier; legacy chips used numeric identifiers. */
        fun microchipId(microchipId: MicrochipId) = microchipId(JsonField.of(microchipId))

        /**
         * Sets [Builder.microchipId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.microchipId] with a well-typed [MicrochipId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun microchipId(microchipId: JsonField<MicrochipId>) = apply {
            this.microchipId = microchipId
        }

        /** Alias for calling [microchipId] with `MicrochipId.ofString(string)`. */
        fun microchipId(string: String) = microchipId(MicrochipId.ofString(string))

        /** Alias for calling [microchipId] with `MicrochipId.ofLong(long)`. */
        fun microchipId(long: Long) = microchipId(MicrochipId.ofLong(long))

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

        fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [Pet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Pet =
            Pet(
                checkRequired("name", name),
                checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                id,
                acquisitionChannel,
                category,
                microchipId,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): Pet = apply {
        if (validated) {
            return@apply
        }

        name()
        photoUrls()
        id()
        acquisitionChannel()
        category()?.validate()
        microchipId()?.validate()
        status()?.validate()
        tags()?.forEach { it.validate() }
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
            (if (acquisitionChannel.asKnown() == null) 0 else 1) +
            (category.asKnown()?.validity() ?: 0) +
            (microchipId.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * How the pet entered the store. Open enum: known channels plus forward-compatible free-form
     * strings.
     */
    class AcquisitionChannel
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val BREEDER = of("breeder")

            val SHELTER = of("shelter")

            val SURRENDER = of("surrender")

            val TRANSFER = of("transfer")

            fun of(value: String) = AcquisitionChannel(JsonField.of(value))
        }

        /** An enum containing [AcquisitionChannel]'s known values. */
        enum class Known {
            BREEDER,
            SHELTER,
            SURRENDER,
            TRANSFER,
        }

        /**
         * An enum containing [AcquisitionChannel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AcquisitionChannel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BREEDER,
            SHELTER,
            SURRENDER,
            TRANSFER,
            /**
             * An enum member indicating that [AcquisitionChannel] was instantiated with an unknown
             * value.
             */
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
                BREEDER -> Value.BREEDER
                SHELTER -> Value.SHELTER
                SURRENDER -> Value.SURRENDER
                TRANSFER -> Value.TRANSFER
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
                BREEDER -> Known.BREEDER
                SHELTER -> Known.SHELTER
                SURRENDER -> Known.SURRENDER
                TRANSFER -> Known.TRANSFER
                else ->
                    throw HelloWorldTestinggggInvalidDataException(
                        "Unknown AcquisitionChannel: $value"
                    )
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
        fun validate(): AcquisitionChannel = apply {
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

            return other is AcquisitionChannel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Category
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val name: JsonField<String>,
        private val subcategories: JsonField<List<JsonValue>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subcategories")
            @ExcludeMissing
            subcategories: JsonField<List<JsonValue>> = JsonMissing.of(),
        ) : this(id, name, subcategories, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Nested subcategories; the tree can recurse arbitrarily deep.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun subcategories(): List<JsonValue>? = subcategories.getNullable("subcategories")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [subcategories].
         *
         * Unlike [subcategories], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subcategories")
        @ExcludeMissing
        fun _subcategories(): JsonField<List<JsonValue>> = subcategories

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

            /** Returns a mutable builder for constructing an instance of [Category]. */
            fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var subcategories: JsonField<MutableList<JsonValue>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(category: Category) = apply {
                id = category.id
                name = category.name
                subcategories = category.subcategories.map { it.toMutableList() }
                additionalProperties = category.additionalProperties.toMutableMap()
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Nested subcategories; the tree can recurse arbitrarily deep. */
            fun subcategories(subcategories: List<JsonValue>) =
                subcategories(JsonField.of(subcategories))

            /**
             * Sets [Builder.subcategories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subcategories] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subcategories(subcategories: JsonField<List<JsonValue>>) = apply {
                this.subcategories = subcategories.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [subcategories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubcategory(subcategory: JsonValue) = apply {
                subcategories =
                    (subcategories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subcategories", it).add(subcategory)
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
             * Returns an immutable instance of [Category].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Category =
                Category(
                    id,
                    name,
                    (subcategories ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            subcategories()
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
                (if (name.asKnown() == null) 0 else 1) +
                (subcategories.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                id == other.id &&
                name == other.name &&
                subcategories == other.subcategories &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, name, subcategories, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Category{id=$id, name=$name, subcategories=$subcategories, additionalProperties=$additionalProperties}"
    }

    /** Microchip identifier; legacy chips used numeric identifiers. */
    @JsonDeserialize(using = MicrochipId.Deserializer::class)
    @JsonSerialize(using = MicrochipId.Serializer::class)
    class MicrochipId
    private constructor(
        private val string: String? = null,
        private val long: Long? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun long(): Long? = long

        fun isString(): Boolean = string != null

        fun isLong(): Boolean = long != null

        fun asString(): String = string.getOrThrow("string")

        fun asLong(): Long = long.getOrThrow("long")

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
         * val result: String? = microchipId.accept(object : MicrochipId.Visitor<String?> {
         *     override fun visitString(string: String): String? = string.toString()
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
                string != null -> visitor.visitString(string)
                long != null -> visitor.visitLong(long)
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
        fun validate(): MicrochipId = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitLong(long: Long) {}
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
                    override fun visitString(string: String) = 1

                    override fun visitLong(long: Long) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MicrochipId && string == other.string && long == other.long
        }

        override fun hashCode(): Int = Objects.hash(string, long)

        override fun toString(): String =
            when {
                string != null -> "MicrochipId{string=$string}"
                long != null -> "MicrochipId{long=$long}"
                _json != null -> "MicrochipId{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MicrochipId")
            }

        companion object {

            fun ofString(string: String) = MicrochipId(string = string)

            fun ofLong(long: Long) = MicrochipId(long = long)
        }

        /**
         * An interface that defines how to map each variant of [MicrochipId] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitLong(long: Long): T

            /**
             * Maps an unknown variant of [MicrochipId] to a value of type [T].
             *
             * An instance of [MicrochipId] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown MicrochipId: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<MicrochipId>(MicrochipId::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MicrochipId {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                MicrochipId(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                MicrochipId(long = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> MicrochipId(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<MicrochipId>(MicrochipId::class) {

            override fun serialize(
                value: MicrochipId,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.long != null -> generator.writeObject(value.long)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MicrochipId")
                }
            }
        }
    }

    class Tag
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

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

            /** Returns a mutable builder for constructing an instance of [Tag]. */
            fun builder() = Builder()
        }

        /** A builder for [Tag]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tag: Tag) = apply {
                id = tag.id
                name = tag.name
                additionalProperties = tag.additionalProperties.toMutableMap()
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Tag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tag = Tag(id, name, additionalProperties.toMutableMap())
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
        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            id()
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
            (if (id.asKnown() == null) 0 else 1) + (if (name.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag &&
                id == other.id &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tag{id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Pet &&
            name == other.name &&
            photoUrls == other.photoUrls &&
            id == other.id &&
            acquisitionChannel == other.acquisitionChannel &&
            category == other.category &&
            microchipId == other.microchipId &&
            status == other.status &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            photoUrls,
            id,
            acquisitionChannel,
            category,
            microchipId,
            status,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Pet{name=$name, photoUrls=$photoUrls, id=$id, acquisitionChannel=$acquisitionChannel, category=$category, microchipId=$microchipId, status=$status, tags=$tags, additionalProperties=$additionalProperties}"
}
