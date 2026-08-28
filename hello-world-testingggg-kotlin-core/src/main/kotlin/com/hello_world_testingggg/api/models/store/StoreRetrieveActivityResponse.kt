// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store

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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Address
import com.hello_world_testingggg.api.models.Money
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A store activity feed entry. Every arm composes the public `Pet` model, so each one is minted
 * under the response's namespace and inherits from `Pet` instead of re-minting its inline type
 * tree.
 */
@JsonDeserialize(using = StoreRetrieveActivityResponse.Deserializer::class)
@JsonSerialize(using = StoreRetrieveActivityResponse.Serializer::class)
class StoreRetrieveActivityResponse
private constructor(
    private val listed: Listed? = null,
    private val sold: Sold? = null,
    private val archived: Archived? = null,
    private val transferred: Transferred? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Listing activity. Widens the base's `status` enum with a member `Pet` does not declare, so
     * the heritage clause has to omit the redeclared key instead of extending the base plainly.
     */
    fun listed(): Listed? = listed

    /**
     * Sale activity. Pins the base's `status` to a single member — a provable narrowing, so this
     * arm keeps a plain `extends` with no omitted keys.
     */
    fun sold(): Sold? = sold

    /**
     * Archival activity. Narrows the base's `status` by value but also makes it nullable, which
     * `Pet` does not accept — a value subset alone is not enough to keep a plain `extends` here.
     */
    fun archived(): Archived? = archived

    /**
     * Transfer activity. Reaches `Pet` only through the pass-through wrapper branch, so the base is
     * resolvable only transitively.
     */
    fun transferred(): Transferred? = transferred

    fun isListed(): Boolean = listed != null

    fun isSold(): Boolean = sold != null

    fun isArchived(): Boolean = archived != null

    fun isTransferred(): Boolean = transferred != null

    /**
     * Listing activity. Widens the base's `status` enum with a member `Pet` does not declare, so
     * the heritage clause has to omit the redeclared key instead of extending the base plainly.
     */
    fun asListed(): Listed = listed.getOrThrow("listed")

    /**
     * Sale activity. Pins the base's `status` to a single member — a provable narrowing, so this
     * arm keeps a plain `extends` with no omitted keys.
     */
    fun asSold(): Sold = sold.getOrThrow("sold")

    /**
     * Archival activity. Narrows the base's `status` by value but also makes it nullable, which
     * `Pet` does not accept — a value subset alone is not enough to keep a plain `extends` here.
     */
    fun asArchived(): Archived = archived.getOrThrow("archived")

    /**
     * Transfer activity. Reaches `Pet` only through the pass-through wrapper branch, so the base is
     * resolvable only transitively.
     */
    fun asTransferred(): Transferred = transferred.getOrThrow("transferred")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.hello_world_testingggg.api.core.JsonValue
     *
     * val result: String? = storeRetrieveActivityResponse.accept(object : StoreRetrieveActivityResponse.Visitor<String?> {
     *     override fun visitListed(listed: Listed): String? = listed.toString()
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
     * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            listed != null -> visitor.visitListed(listed)
            sold != null -> visitor.visitSold(sold)
            archived != null -> visitor.visitArchived(archived)
            transferred != null -> visitor.visitTransferred(transferred)
            else -> visitor.unknown(_json)
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
    fun validate(): StoreRetrieveActivityResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitListed(listed: Listed) {
                    listed.validate()
                }

                override fun visitSold(sold: Sold) {
                    sold.validate()
                }

                override fun visitArchived(archived: Archived) {
                    archived.validate()
                }

                override fun visitTransferred(transferred: Transferred) {
                    transferred.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitListed(listed: Listed) = listed.validity()

                override fun visitSold(sold: Sold) = sold.validity()

                override fun visitArchived(archived: Archived) = archived.validity()

                override fun visitTransferred(transferred: Transferred) = transferred.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StoreRetrieveActivityResponse &&
            listed == other.listed &&
            sold == other.sold &&
            archived == other.archived &&
            transferred == other.transferred
    }

    override fun hashCode(): Int = Objects.hash(listed, sold, archived, transferred)

    override fun toString(): String =
        when {
            listed != null -> "StoreRetrieveActivityResponse{listed=$listed}"
            sold != null -> "StoreRetrieveActivityResponse{sold=$sold}"
            archived != null -> "StoreRetrieveActivityResponse{archived=$archived}"
            transferred != null -> "StoreRetrieveActivityResponse{transferred=$transferred}"
            _json != null -> "StoreRetrieveActivityResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid StoreRetrieveActivityResponse")
        }

    companion object {

        /**
         * Listing activity. Widens the base's `status` enum with a member `Pet` does not declare,
         * so the heritage clause has to omit the redeclared key instead of extending the base
         * plainly.
         */
        fun ofListed(listed: Listed) = StoreRetrieveActivityResponse(listed = listed)

        /**
         * Sale activity. Pins the base's `status` to a single member — a provable narrowing, so
         * this arm keeps a plain `extends` with no omitted keys.
         */
        fun ofSold(sold: Sold) = StoreRetrieveActivityResponse(sold = sold)

        /**
         * Archival activity. Narrows the base's `status` by value but also makes it nullable, which
         * `Pet` does not accept — a value subset alone is not enough to keep a plain `extends`
         * here.
         */
        fun ofArchived(archived: Archived) = StoreRetrieveActivityResponse(archived = archived)

        /**
         * Transfer activity. Reaches `Pet` only through the pass-through wrapper branch, so the
         * base is resolvable only transitively.
         */
        fun ofTransferred(transferred: Transferred) =
            StoreRetrieveActivityResponse(transferred = transferred)
    }

    /**
     * An interface that defines how to map each variant of [StoreRetrieveActivityResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Listing activity. Widens the base's `status` enum with a member `Pet` does not declare,
         * so the heritage clause has to omit the redeclared key instead of extending the base
         * plainly.
         */
        fun visitListed(listed: Listed): T

        /**
         * Sale activity. Pins the base's `status` to a single member — a provable narrowing, so
         * this arm keeps a plain `extends` with no omitted keys.
         */
        fun visitSold(sold: Sold): T

        /**
         * Archival activity. Narrows the base's `status` by value but also makes it nullable, which
         * `Pet` does not accept — a value subset alone is not enough to keep a plain `extends`
         * here.
         */
        fun visitArchived(archived: Archived): T

        /**
         * Transfer activity. Reaches `Pet` only through the pass-through wrapper branch, so the
         * base is resolvable only transitively.
         */
        fun visitTransferred(transferred: Transferred): T

        /**
         * Maps an unknown variant of [StoreRetrieveActivityResponse] to a value of type [T].
         *
         * An instance of [StoreRetrieveActivityResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException(
                "Unknown StoreRetrieveActivityResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<StoreRetrieveActivityResponse>(StoreRetrieveActivityResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): StoreRetrieveActivityResponse {
            val json = JsonValue.fromJsonNode(node)
            val family = json.asObject()?.get("family")?.asString()

            when (family) {
                "listed" -> {
                    return tryDeserialize(node, jacksonTypeRef<Listed>())?.let {
                        StoreRetrieveActivityResponse(listed = it, _json = json)
                    } ?: StoreRetrieveActivityResponse(_json = json)
                }
                "sold" -> {
                    return tryDeserialize(node, jacksonTypeRef<Sold>())?.let {
                        StoreRetrieveActivityResponse(sold = it, _json = json)
                    } ?: StoreRetrieveActivityResponse(_json = json)
                }
                "archived" -> {
                    return tryDeserialize(node, jacksonTypeRef<Archived>())?.let {
                        StoreRetrieveActivityResponse(archived = it, _json = json)
                    } ?: StoreRetrieveActivityResponse(_json = json)
                }
                "transferred" -> {
                    return tryDeserialize(node, jacksonTypeRef<Transferred>())?.let {
                        StoreRetrieveActivityResponse(transferred = it, _json = json)
                    } ?: StoreRetrieveActivityResponse(_json = json)
                }
            }

            return StoreRetrieveActivityResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<StoreRetrieveActivityResponse>(StoreRetrieveActivityResponse::class) {

        override fun serialize(
            value: StoreRetrieveActivityResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.listed != null -> generator.writeObject(value.listed)
                value.sold != null -> generator.writeObject(value.sold)
                value.archived != null -> generator.writeObject(value.archived)
                value.transferred != null -> generator.writeObject(value.transferred)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid StoreRetrieveActivityResponse")
            }
        }
    }

    /**
     * Listing activity. Widens the base's `status` enum with a member `Pet` does not declare, so
     * the heritage clause has to omit the redeclared key instead of extending the base plainly.
     */
    class Listed
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val photoUrls: JsonField<List<String>>,
        private val id: JsonField<Long>,
        private val acquisitionChannel: JsonField<Pet.AcquisitionChannel>,
        private val category: JsonValue,
        private val microchipId: JsonField<Pet.MicrochipId>,
        private val relatedAddress: JsonField<Address>,
        private val relatedCategory: JsonValue,
        private val relatedCustomer: JsonValue,
        private val relatedMoney: JsonField<Money>,
        private val relatedOrder: JsonValue,
        private val relatedPet: JsonField<Pet>,
        private val relatedShelter: JsonValue,
        private val relatedUser: JsonValue,
        private val status: JsonField<PetStatus>,
        private val tags: JsonField<List<JsonValue>>,
        private val activityId: JsonField<String>,
        private val family: JsonField<Family>,
        private val recordedAt: JsonField<OffsetDateTime>,
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
            acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of(),
            @JsonProperty("category") @ExcludeMissing category: JsonValue = JsonMissing.of(),
            @JsonProperty("microchipId")
            @ExcludeMissing
            microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of(),
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
            @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("activityId")
            @ExcludeMissing
            activityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
            @JsonProperty("recordedAt")
            @ExcludeMissing
            recordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            name,
            photoUrls,
            id,
            acquisitionChannel,
            category,
            microchipId,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedMoney,
            relatedOrder,
            relatedPet,
            relatedShelter,
            relatedUser,
            status,
            tags,
            activityId,
            family,
            recordedAt,
            mutableMapOf(),
        )

        fun toPet(): Pet =
            Pet.builder()
                .name(name)
                .photoUrls(photoUrls)
                .id(id)
                .acquisitionChannel(acquisitionChannel)
                .category(category)
                .microchipId(microchipId)
                .relatedAddress(relatedAddress)
                .relatedCategory(relatedCategory)
                .relatedCustomer(relatedCustomer)
                .relatedMoney(relatedMoney)
                .relatedOrder(relatedOrder)
                .relatedPet(relatedPet)
                .relatedShelter(relatedShelter)
                .relatedUser(relatedUser)
                .status(status)
                .tags(tags)
                .build()

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * How the pet entered the store. Open enum: known channels plus forward-compatible
         * free-form strings.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acquisitionChannel(): Pet.AcquisitionChannel? =
            acquisitionChannel.getNullable("acquisitionChannel")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = listed.category().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonValue = category

        /**
         * Microchip identifier; legacy chips used numeric identifiers.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun microchipId(): Pet.MicrochipId? = microchipId.getNullable("microchipId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = listed.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = listed.relatedCustomer().convert(MyClass::class.java)
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
         * val myObject: MyClass = listed.relatedOrder().convert(MyClass::class.java)
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
         * val myObject: MyClass = listed.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = listed.relatedUser().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
        fun tags(): List<JsonValue>? = tags.getNullable("tags")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun activityId(): String = activityId.getRequired("activityId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun family(): Family = family.getRequired("family")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun recordedAt(): OffsetDateTime = recordedAt.getRequired("recordedAt")

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
        @JsonProperty("photoUrls")
        @ExcludeMissing
        fun _photoUrls(): JsonField<List<String>> = photoUrls

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [acquisitionChannel].
         *
         * Unlike [acquisitionChannel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acquisitionChannel")
        @ExcludeMissing
        fun _acquisitionChannel(): JsonField<Pet.AcquisitionChannel> = acquisitionChannel

        /**
         * Returns the raw JSON value of [microchipId].
         *
         * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("microchipId")
        @ExcludeMissing
        fun _microchipId(): JsonField<Pet.MicrochipId> = microchipId

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
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [activityId].
         *
         * Unlike [activityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("activityId")
        @ExcludeMissing
        fun _activityId(): JsonField<String> = activityId

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

        /**
         * Returns the raw JSON value of [recordedAt].
         *
         * Unlike [recordedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordedAt")
        @ExcludeMissing
        fun _recordedAt(): JsonField<OffsetDateTime> = recordedAt

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
             * Returns a mutable builder for constructing an instance of [Listed].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Listed]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var photoUrls: JsonField<MutableList<String>>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of()
            private var category: JsonValue = JsonMissing.of()
            private var microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of()
            private var relatedAddress: JsonField<Address> = JsonMissing.of()
            private var relatedCategory: JsonValue = JsonMissing.of()
            private var relatedCustomer: JsonValue = JsonMissing.of()
            private var relatedMoney: JsonField<Money> = JsonMissing.of()
            private var relatedOrder: JsonValue = JsonMissing.of()
            private var relatedPet: JsonField<Pet> = JsonMissing.of()
            private var relatedShelter: JsonValue = JsonMissing.of()
            private var relatedUser: JsonValue = JsonMissing.of()
            private var status: JsonField<PetStatus> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var activityId: JsonField<String>? = null
            private var family: JsonField<Family>? = null
            private var recordedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(listed: Listed) = apply {
                name = listed.name
                photoUrls = listed.photoUrls.map { it.toMutableList() }
                id = listed.id
                acquisitionChannel = listed.acquisitionChannel
                category = listed.category
                microchipId = listed.microchipId
                relatedAddress = listed.relatedAddress
                relatedCategory = listed.relatedCategory
                relatedCustomer = listed.relatedCustomer
                relatedMoney = listed.relatedMoney
                relatedOrder = listed.relatedOrder
                relatedPet = listed.relatedPet
                relatedShelter = listed.relatedShelter
                relatedUser = listed.relatedUser
                status = listed.status
                tags = listed.tags.map { it.toMutableList() }
                activityId = listed.activityId
                family = listed.family
                recordedAt = listed.recordedAt
                additionalProperties = listed.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * How the pet entered the store. Open enum: known channels plus forward-compatible
             * free-form strings.
             */
            fun acquisitionChannel(acquisitionChannel: Pet.AcquisitionChannel) =
                acquisitionChannel(JsonField.of(acquisitionChannel))

            /**
             * Sets [Builder.acquisitionChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(acquisitionChannel: JsonField<Pet.AcquisitionChannel>) = apply {
                this.acquisitionChannel = acquisitionChannel
            }

            /**
             * Sets [acquisitionChannel] to an arbitrary [String].
             *
             * You should usually call [acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] constant instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(value: String) =
                acquisitionChannel(Pet.AcquisitionChannel.of(value))

            fun category(category: JsonValue) = apply { this.category = category }

            /** Microchip identifier; legacy chips used numeric identifiers. */
            fun microchipId(microchipId: Pet.MicrochipId) = microchipId(JsonField.of(microchipId))

            /**
             * Sets [Builder.microchipId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.microchipId] with a well-typed [Pet.MicrochipId]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun microchipId(microchipId: JsonField<Pet.MicrochipId>) = apply {
                this.microchipId = microchipId
            }

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofString(string)`. */
            fun microchipId(string: String) = microchipId(Pet.MicrochipId.ofString(string))

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofLong(long)`. */
            fun microchipId(long: Long) = microchipId(Pet.MicrochipId.ofLong(long))

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

            fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

            /** pet status in the store */
            fun status(status: PetStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [PetStatus] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<PetStatus>) = apply { this.status = status }

            fun tags(tags: List<JsonValue>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun activityId(activityId: String) = activityId(JsonField.of(activityId))

            /**
             * Sets [Builder.activityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activityId(activityId: JsonField<String>) = apply { this.activityId = activityId }

            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

            fun recordedAt(recordedAt: OffsetDateTime) = recordedAt(JsonField.of(recordedAt))

            /**
             * Sets [Builder.recordedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordedAt(recordedAt: JsonField<OffsetDateTime>) = apply {
                this.recordedAt = recordedAt
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
             * Returns an immutable instance of [Listed].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Listed =
                Listed(
                    checkRequired("name", name),
                    checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                    id,
                    acquisitionChannel,
                    category,
                    microchipId,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedShelter,
                    relatedUser,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("activityId", activityId),
                    checkRequired("family", family),
                    checkRequired("recordedAt", recordedAt),
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
        fun validate(): Listed = apply {
            if (validated) {
                return@apply
            }

            name()
            photoUrls()
            id()
            acquisitionChannel()
            microchipId()?.validate()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            status()?.validate()
            tags()
            activityId()
            family().validate()
            recordedAt()
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
                (photoUrls.asKnown()?.size ?: 0) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (acquisitionChannel.asKnown() == null) 0 else 1) +
                (microchipId.asKnown()?.validity() ?: 0) +
                (relatedAddress.asKnown()?.validity() ?: 0) +
                (relatedMoney.asKnown()?.validity() ?: 0) +
                (relatedPet.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (if (activityId.asKnown() == null) 0 else 1) +
                (family.asKnown()?.validity() ?: 0) +
                (if (recordedAt.asKnown() == null) 0 else 1)

        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val LISTED = of("listed")

                fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                LISTED
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LISTED,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    LISTED -> Value.LISTED
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
                    LISTED -> Known.LISTED
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Family: $value")
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
            fun validate(): Family = apply {
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

                return other is Family && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                val AVAILABLE = of("available")

                val PENDING = of("pending")

                val SOLD = of("sold")

                val ARCHIVED = of("archived")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                AVAILABLE,
                PENDING,
                SOLD,
                ARCHIVED,
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
                AVAILABLE,
                PENDING,
                SOLD,
                ARCHIVED,
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
                    AVAILABLE -> Value.AVAILABLE
                    PENDING -> Value.PENDING
                    SOLD -> Value.SOLD
                    ARCHIVED -> Value.ARCHIVED
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
                    AVAILABLE -> Known.AVAILABLE
                    PENDING -> Known.PENDING
                    SOLD -> Known.SOLD
                    ARCHIVED -> Known.ARCHIVED
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

            return other is Listed &&
                name == other.name &&
                photoUrls == other.photoUrls &&
                id == other.id &&
                acquisitionChannel == other.acquisitionChannel &&
                category == other.category &&
                microchipId == other.microchipId &&
                relatedAddress == other.relatedAddress &&
                relatedCategory == other.relatedCategory &&
                relatedCustomer == other.relatedCustomer &&
                relatedMoney == other.relatedMoney &&
                relatedOrder == other.relatedOrder &&
                relatedPet == other.relatedPet &&
                relatedShelter == other.relatedShelter &&
                relatedUser == other.relatedUser &&
                status == other.status &&
                tags == other.tags &&
                activityId == other.activityId &&
                family == other.family &&
                recordedAt == other.recordedAt &&
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
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedMoney,
                relatedOrder,
                relatedPet,
                relatedShelter,
                relatedUser,
                status,
                tags,
                activityId,
                family,
                recordedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Listed{name=$name, photoUrls=$photoUrls, id=$id, acquisitionChannel=$acquisitionChannel, category=$category, microchipId=$microchipId, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedUser=$relatedUser, status=$status, tags=$tags, activityId=$activityId, family=$family, recordedAt=$recordedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Sale activity. Pins the base's `status` to a single member — a provable narrowing, so this
     * arm keeps a plain `extends` with no omitted keys.
     */
    class Sold
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val photoUrls: JsonField<List<String>>,
        private val id: JsonField<Long>,
        private val acquisitionChannel: JsonField<Pet.AcquisitionChannel>,
        private val category: JsonValue,
        private val microchipId: JsonField<Pet.MicrochipId>,
        private val relatedAddress: JsonField<Address>,
        private val relatedCategory: JsonValue,
        private val relatedCustomer: JsonValue,
        private val relatedMoney: JsonField<Money>,
        private val relatedOrder: JsonValue,
        private val relatedPet: JsonField<Pet>,
        private val relatedShelter: JsonValue,
        private val relatedUser: JsonValue,
        private val status: JsonField<PetStatus>,
        private val tags: JsonField<List<JsonValue>>,
        private val activityId: JsonField<String>,
        private val family: JsonField<Family>,
        private val recordedAt: JsonField<OffsetDateTime>,
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
            acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of(),
            @JsonProperty("category") @ExcludeMissing category: JsonValue = JsonMissing.of(),
            @JsonProperty("microchipId")
            @ExcludeMissing
            microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of(),
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
            @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("activityId")
            @ExcludeMissing
            activityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
            @JsonProperty("recordedAt")
            @ExcludeMissing
            recordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            name,
            photoUrls,
            id,
            acquisitionChannel,
            category,
            microchipId,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedMoney,
            relatedOrder,
            relatedPet,
            relatedShelter,
            relatedUser,
            status,
            tags,
            activityId,
            family,
            recordedAt,
            mutableMapOf(),
        )

        fun toPet(): Pet =
            Pet.builder()
                .name(name)
                .photoUrls(photoUrls)
                .id(id)
                .acquisitionChannel(acquisitionChannel)
                .category(category)
                .microchipId(microchipId)
                .relatedAddress(relatedAddress)
                .relatedCategory(relatedCategory)
                .relatedCustomer(relatedCustomer)
                .relatedMoney(relatedMoney)
                .relatedOrder(relatedOrder)
                .relatedPet(relatedPet)
                .relatedShelter(relatedShelter)
                .relatedUser(relatedUser)
                .status(status)
                .tags(tags)
                .build()

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * How the pet entered the store. Open enum: known channels plus forward-compatible
         * free-form strings.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acquisitionChannel(): Pet.AcquisitionChannel? =
            acquisitionChannel.getNullable("acquisitionChannel")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = sold.category().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonValue = category

        /**
         * Microchip identifier; legacy chips used numeric identifiers.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun microchipId(): Pet.MicrochipId? = microchipId.getNullable("microchipId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = sold.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = sold.relatedCustomer().convert(MyClass::class.java)
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
         * val myObject: MyClass = sold.relatedOrder().convert(MyClass::class.java)
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
         * val myObject: MyClass = sold.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = sold.relatedUser().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
        fun tags(): List<JsonValue>? = tags.getNullable("tags")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun activityId(): String = activityId.getRequired("activityId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun family(): Family = family.getRequired("family")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun recordedAt(): OffsetDateTime = recordedAt.getRequired("recordedAt")

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
        @JsonProperty("photoUrls")
        @ExcludeMissing
        fun _photoUrls(): JsonField<List<String>> = photoUrls

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [acquisitionChannel].
         *
         * Unlike [acquisitionChannel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acquisitionChannel")
        @ExcludeMissing
        fun _acquisitionChannel(): JsonField<Pet.AcquisitionChannel> = acquisitionChannel

        /**
         * Returns the raw JSON value of [microchipId].
         *
         * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("microchipId")
        @ExcludeMissing
        fun _microchipId(): JsonField<Pet.MicrochipId> = microchipId

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
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [activityId].
         *
         * Unlike [activityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("activityId")
        @ExcludeMissing
        fun _activityId(): JsonField<String> = activityId

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

        /**
         * Returns the raw JSON value of [recordedAt].
         *
         * Unlike [recordedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordedAt")
        @ExcludeMissing
        fun _recordedAt(): JsonField<OffsetDateTime> = recordedAt

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
             * Returns a mutable builder for constructing an instance of [Sold].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Sold]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var photoUrls: JsonField<MutableList<String>>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of()
            private var category: JsonValue = JsonMissing.of()
            private var microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of()
            private var relatedAddress: JsonField<Address> = JsonMissing.of()
            private var relatedCategory: JsonValue = JsonMissing.of()
            private var relatedCustomer: JsonValue = JsonMissing.of()
            private var relatedMoney: JsonField<Money> = JsonMissing.of()
            private var relatedOrder: JsonValue = JsonMissing.of()
            private var relatedPet: JsonField<Pet> = JsonMissing.of()
            private var relatedShelter: JsonValue = JsonMissing.of()
            private var relatedUser: JsonValue = JsonMissing.of()
            private var status: JsonField<PetStatus> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var activityId: JsonField<String>? = null
            private var family: JsonField<Family>? = null
            private var recordedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sold: Sold) = apply {
                name = sold.name
                photoUrls = sold.photoUrls.map { it.toMutableList() }
                id = sold.id
                acquisitionChannel = sold.acquisitionChannel
                category = sold.category
                microchipId = sold.microchipId
                relatedAddress = sold.relatedAddress
                relatedCategory = sold.relatedCategory
                relatedCustomer = sold.relatedCustomer
                relatedMoney = sold.relatedMoney
                relatedOrder = sold.relatedOrder
                relatedPet = sold.relatedPet
                relatedShelter = sold.relatedShelter
                relatedUser = sold.relatedUser
                status = sold.status
                tags = sold.tags.map { it.toMutableList() }
                activityId = sold.activityId
                family = sold.family
                recordedAt = sold.recordedAt
                additionalProperties = sold.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * How the pet entered the store. Open enum: known channels plus forward-compatible
             * free-form strings.
             */
            fun acquisitionChannel(acquisitionChannel: Pet.AcquisitionChannel) =
                acquisitionChannel(JsonField.of(acquisitionChannel))

            /**
             * Sets [Builder.acquisitionChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(acquisitionChannel: JsonField<Pet.AcquisitionChannel>) = apply {
                this.acquisitionChannel = acquisitionChannel
            }

            /**
             * Sets [acquisitionChannel] to an arbitrary [String].
             *
             * You should usually call [acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] constant instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(value: String) =
                acquisitionChannel(Pet.AcquisitionChannel.of(value))

            fun category(category: JsonValue) = apply { this.category = category }

            /** Microchip identifier; legacy chips used numeric identifiers. */
            fun microchipId(microchipId: Pet.MicrochipId) = microchipId(JsonField.of(microchipId))

            /**
             * Sets [Builder.microchipId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.microchipId] with a well-typed [Pet.MicrochipId]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun microchipId(microchipId: JsonField<Pet.MicrochipId>) = apply {
                this.microchipId = microchipId
            }

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofString(string)`. */
            fun microchipId(string: String) = microchipId(Pet.MicrochipId.ofString(string))

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofLong(long)`. */
            fun microchipId(long: Long) = microchipId(Pet.MicrochipId.ofLong(long))

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

            fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

            /** pet status in the store */
            fun status(status: PetStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [PetStatus] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<PetStatus>) = apply { this.status = status }

            fun tags(tags: List<JsonValue>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun activityId(activityId: String) = activityId(JsonField.of(activityId))

            /**
             * Sets [Builder.activityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activityId(activityId: JsonField<String>) = apply { this.activityId = activityId }

            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

            fun recordedAt(recordedAt: OffsetDateTime) = recordedAt(JsonField.of(recordedAt))

            /**
             * Sets [Builder.recordedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordedAt(recordedAt: JsonField<OffsetDateTime>) = apply {
                this.recordedAt = recordedAt
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
             * Returns an immutable instance of [Sold].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sold =
                Sold(
                    checkRequired("name", name),
                    checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                    id,
                    acquisitionChannel,
                    category,
                    microchipId,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedShelter,
                    relatedUser,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("activityId", activityId),
                    checkRequired("family", family),
                    checkRequired("recordedAt", recordedAt),
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
        fun validate(): Sold = apply {
            if (validated) {
                return@apply
            }

            name()
            photoUrls()
            id()
            acquisitionChannel()
            microchipId()?.validate()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            status()?.validate()
            tags()
            activityId()
            family().validate()
            recordedAt()
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
                (photoUrls.asKnown()?.size ?: 0) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (acquisitionChannel.asKnown() == null) 0 else 1) +
                (microchipId.asKnown()?.validity() ?: 0) +
                (relatedAddress.asKnown()?.validity() ?: 0) +
                (relatedMoney.asKnown()?.validity() ?: 0) +
                (relatedPet.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (if (activityId.asKnown() == null) 0 else 1) +
                (family.asKnown()?.validity() ?: 0) +
                (if (recordedAt.asKnown() == null) 0 else 1)

        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val SOLD = of("sold")

                fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                SOLD
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SOLD,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    SOLD -> Value.SOLD
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
                    SOLD -> Known.SOLD
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Family: $value")
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
            fun validate(): Family = apply {
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

                return other is Family && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                val SOLD = of("sold")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SOLD
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
                SOLD,
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
                    SOLD -> Value.SOLD
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
                    SOLD -> Known.SOLD
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

            return other is Sold &&
                name == other.name &&
                photoUrls == other.photoUrls &&
                id == other.id &&
                acquisitionChannel == other.acquisitionChannel &&
                category == other.category &&
                microchipId == other.microchipId &&
                relatedAddress == other.relatedAddress &&
                relatedCategory == other.relatedCategory &&
                relatedCustomer == other.relatedCustomer &&
                relatedMoney == other.relatedMoney &&
                relatedOrder == other.relatedOrder &&
                relatedPet == other.relatedPet &&
                relatedShelter == other.relatedShelter &&
                relatedUser == other.relatedUser &&
                status == other.status &&
                tags == other.tags &&
                activityId == other.activityId &&
                family == other.family &&
                recordedAt == other.recordedAt &&
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
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedMoney,
                relatedOrder,
                relatedPet,
                relatedShelter,
                relatedUser,
                status,
                tags,
                activityId,
                family,
                recordedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sold{name=$name, photoUrls=$photoUrls, id=$id, acquisitionChannel=$acquisitionChannel, category=$category, microchipId=$microchipId, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedUser=$relatedUser, status=$status, tags=$tags, activityId=$activityId, family=$family, recordedAt=$recordedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Archival activity. Narrows the base's `status` by value but also makes it nullable, which
     * `Pet` does not accept — a value subset alone is not enough to keep a plain `extends` here.
     */
    class Archived
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val photoUrls: JsonField<List<String>>,
        private val id: JsonField<Long>,
        private val acquisitionChannel: JsonField<Pet.AcquisitionChannel>,
        private val category: JsonValue,
        private val microchipId: JsonField<Pet.MicrochipId>,
        private val relatedAddress: JsonField<Address>,
        private val relatedCategory: JsonValue,
        private val relatedCustomer: JsonValue,
        private val relatedMoney: JsonField<Money>,
        private val relatedOrder: JsonValue,
        private val relatedPet: JsonField<Pet>,
        private val relatedShelter: JsonValue,
        private val relatedUser: JsonValue,
        private val status: JsonField<PetStatus>,
        private val tags: JsonField<List<JsonValue>>,
        private val activityId: JsonField<String>,
        private val family: JsonField<Family>,
        private val recordedAt: JsonField<OffsetDateTime>,
        private val archivedReason: JsonField<String>,
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
            acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of(),
            @JsonProperty("category") @ExcludeMissing category: JsonValue = JsonMissing.of(),
            @JsonProperty("microchipId")
            @ExcludeMissing
            microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of(),
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
            @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("activityId")
            @ExcludeMissing
            activityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
            @JsonProperty("recordedAt")
            @ExcludeMissing
            recordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("archivedReason")
            @ExcludeMissing
            archivedReason: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            photoUrls,
            id,
            acquisitionChannel,
            category,
            microchipId,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedMoney,
            relatedOrder,
            relatedPet,
            relatedShelter,
            relatedUser,
            status,
            tags,
            activityId,
            family,
            recordedAt,
            archivedReason,
            mutableMapOf(),
        )

        fun toPet(): Pet =
            Pet.builder()
                .name(name)
                .photoUrls(photoUrls)
                .id(id)
                .acquisitionChannel(acquisitionChannel)
                .category(category)
                .microchipId(microchipId)
                .relatedAddress(relatedAddress)
                .relatedCategory(relatedCategory)
                .relatedCustomer(relatedCustomer)
                .relatedMoney(relatedMoney)
                .relatedOrder(relatedOrder)
                .relatedPet(relatedPet)
                .relatedShelter(relatedShelter)
                .relatedUser(relatedUser)
                .status(status)
                .tags(tags)
                .build()

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * How the pet entered the store. Open enum: known channels plus forward-compatible
         * free-form strings.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acquisitionChannel(): Pet.AcquisitionChannel? =
            acquisitionChannel.getNullable("acquisitionChannel")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = archived.category().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonValue = category

        /**
         * Microchip identifier; legacy chips used numeric identifiers.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun microchipId(): Pet.MicrochipId? = microchipId.getNullable("microchipId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = archived.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = archived.relatedCustomer().convert(MyClass::class.java)
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
         * val myObject: MyClass = archived.relatedOrder().convert(MyClass::class.java)
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
         * val myObject: MyClass = archived.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = archived.relatedUser().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
        fun tags(): List<JsonValue>? = tags.getNullable("tags")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun activityId(): String = activityId.getRequired("activityId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun family(): Family = family.getRequired("family")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun recordedAt(): OffsetDateTime = recordedAt.getRequired("recordedAt")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun archivedReason(): String? = archivedReason.getNullable("archivedReason")

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
        @JsonProperty("photoUrls")
        @ExcludeMissing
        fun _photoUrls(): JsonField<List<String>> = photoUrls

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [acquisitionChannel].
         *
         * Unlike [acquisitionChannel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acquisitionChannel")
        @ExcludeMissing
        fun _acquisitionChannel(): JsonField<Pet.AcquisitionChannel> = acquisitionChannel

        /**
         * Returns the raw JSON value of [microchipId].
         *
         * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("microchipId")
        @ExcludeMissing
        fun _microchipId(): JsonField<Pet.MicrochipId> = microchipId

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
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [activityId].
         *
         * Unlike [activityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("activityId")
        @ExcludeMissing
        fun _activityId(): JsonField<String> = activityId

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

        /**
         * Returns the raw JSON value of [recordedAt].
         *
         * Unlike [recordedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordedAt")
        @ExcludeMissing
        fun _recordedAt(): JsonField<OffsetDateTime> = recordedAt

        /**
         * Returns the raw JSON value of [archivedReason].
         *
         * Unlike [archivedReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("archivedReason")
        @ExcludeMissing
        fun _archivedReason(): JsonField<String> = archivedReason

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
             * Returns a mutable builder for constructing an instance of [Archived].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Archived]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var photoUrls: JsonField<MutableList<String>>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of()
            private var category: JsonValue = JsonMissing.of()
            private var microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of()
            private var relatedAddress: JsonField<Address> = JsonMissing.of()
            private var relatedCategory: JsonValue = JsonMissing.of()
            private var relatedCustomer: JsonValue = JsonMissing.of()
            private var relatedMoney: JsonField<Money> = JsonMissing.of()
            private var relatedOrder: JsonValue = JsonMissing.of()
            private var relatedPet: JsonField<Pet> = JsonMissing.of()
            private var relatedShelter: JsonValue = JsonMissing.of()
            private var relatedUser: JsonValue = JsonMissing.of()
            private var status: JsonField<PetStatus> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var activityId: JsonField<String>? = null
            private var family: JsonField<Family>? = null
            private var recordedAt: JsonField<OffsetDateTime>? = null
            private var archivedReason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(archived: Archived) = apply {
                name = archived.name
                photoUrls = archived.photoUrls.map { it.toMutableList() }
                id = archived.id
                acquisitionChannel = archived.acquisitionChannel
                category = archived.category
                microchipId = archived.microchipId
                relatedAddress = archived.relatedAddress
                relatedCategory = archived.relatedCategory
                relatedCustomer = archived.relatedCustomer
                relatedMoney = archived.relatedMoney
                relatedOrder = archived.relatedOrder
                relatedPet = archived.relatedPet
                relatedShelter = archived.relatedShelter
                relatedUser = archived.relatedUser
                status = archived.status
                tags = archived.tags.map { it.toMutableList() }
                activityId = archived.activityId
                family = archived.family
                recordedAt = archived.recordedAt
                archivedReason = archived.archivedReason
                additionalProperties = archived.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * How the pet entered the store. Open enum: known channels plus forward-compatible
             * free-form strings.
             */
            fun acquisitionChannel(acquisitionChannel: Pet.AcquisitionChannel) =
                acquisitionChannel(JsonField.of(acquisitionChannel))

            /**
             * Sets [Builder.acquisitionChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(acquisitionChannel: JsonField<Pet.AcquisitionChannel>) = apply {
                this.acquisitionChannel = acquisitionChannel
            }

            /**
             * Sets [acquisitionChannel] to an arbitrary [String].
             *
             * You should usually call [acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] constant instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(value: String) =
                acquisitionChannel(Pet.AcquisitionChannel.of(value))

            fun category(category: JsonValue) = apply { this.category = category }

            /** Microchip identifier; legacy chips used numeric identifiers. */
            fun microchipId(microchipId: Pet.MicrochipId) = microchipId(JsonField.of(microchipId))

            /**
             * Sets [Builder.microchipId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.microchipId] with a well-typed [Pet.MicrochipId]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun microchipId(microchipId: JsonField<Pet.MicrochipId>) = apply {
                this.microchipId = microchipId
            }

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofString(string)`. */
            fun microchipId(string: String) = microchipId(Pet.MicrochipId.ofString(string))

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofLong(long)`. */
            fun microchipId(long: Long) = microchipId(Pet.MicrochipId.ofLong(long))

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

            fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

            /** pet status in the store */
            fun status(status: PetStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [PetStatus] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<PetStatus>) = apply { this.status = status }

            fun tags(tags: List<JsonValue>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun activityId(activityId: String) = activityId(JsonField.of(activityId))

            /**
             * Sets [Builder.activityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activityId(activityId: JsonField<String>) = apply { this.activityId = activityId }

            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

            fun recordedAt(recordedAt: OffsetDateTime) = recordedAt(JsonField.of(recordedAt))

            /**
             * Sets [Builder.recordedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordedAt(recordedAt: JsonField<OffsetDateTime>) = apply {
                this.recordedAt = recordedAt
            }

            fun archivedReason(archivedReason: String) =
                archivedReason(JsonField.of(archivedReason))

            /**
             * Sets [Builder.archivedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archivedReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archivedReason(archivedReason: JsonField<String>) = apply {
                this.archivedReason = archivedReason
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
             * Returns an immutable instance of [Archived].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .activityId()
             * .family()
             * .recordedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Archived =
                Archived(
                    checkRequired("name", name),
                    checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                    id,
                    acquisitionChannel,
                    category,
                    microchipId,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedShelter,
                    relatedUser,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("activityId", activityId),
                    checkRequired("family", family),
                    checkRequired("recordedAt", recordedAt),
                    archivedReason,
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
        fun validate(): Archived = apply {
            if (validated) {
                return@apply
            }

            name()
            photoUrls()
            id()
            acquisitionChannel()
            microchipId()?.validate()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            status()?.validate()
            tags()
            activityId()
            family().validate()
            recordedAt()
            archivedReason()
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
                (photoUrls.asKnown()?.size ?: 0) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (acquisitionChannel.asKnown() == null) 0 else 1) +
                (microchipId.asKnown()?.validity() ?: 0) +
                (relatedAddress.asKnown()?.validity() ?: 0) +
                (relatedMoney.asKnown()?.validity() ?: 0) +
                (relatedPet.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (if (activityId.asKnown() == null) 0 else 1) +
                (family.asKnown()?.validity() ?: 0) +
                (if (recordedAt.asKnown() == null) 0 else 1) +
                (if (archivedReason.asKnown() == null) 0 else 1)

        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val ARCHIVED = of("archived")

                fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                ARCHIVED
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARCHIVED,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    ARCHIVED -> Value.ARCHIVED
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
                    ARCHIVED -> Known.ARCHIVED
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Family: $value")
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
            fun validate(): Family = apply {
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

                return other is Family && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                val SOLD = of("sold")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SOLD
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
                SOLD,
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
                    SOLD -> Value.SOLD
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
                    SOLD -> Known.SOLD
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

            return other is Archived &&
                name == other.name &&
                photoUrls == other.photoUrls &&
                id == other.id &&
                acquisitionChannel == other.acquisitionChannel &&
                category == other.category &&
                microchipId == other.microchipId &&
                relatedAddress == other.relatedAddress &&
                relatedCategory == other.relatedCategory &&
                relatedCustomer == other.relatedCustomer &&
                relatedMoney == other.relatedMoney &&
                relatedOrder == other.relatedOrder &&
                relatedPet == other.relatedPet &&
                relatedShelter == other.relatedShelter &&
                relatedUser == other.relatedUser &&
                status == other.status &&
                tags == other.tags &&
                activityId == other.activityId &&
                family == other.family &&
                recordedAt == other.recordedAt &&
                archivedReason == other.archivedReason &&
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
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedMoney,
                relatedOrder,
                relatedPet,
                relatedShelter,
                relatedUser,
                status,
                tags,
                activityId,
                family,
                recordedAt,
                archivedReason,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Archived{name=$name, photoUrls=$photoUrls, id=$id, acquisitionChannel=$acquisitionChannel, category=$category, microchipId=$microchipId, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedUser=$relatedUser, status=$status, tags=$tags, activityId=$activityId, family=$family, recordedAt=$recordedAt, archivedReason=$archivedReason, additionalProperties=$additionalProperties}"
    }

    /**
     * Transfer activity. Reaches `Pet` only through the pass-through wrapper branch, so the base is
     * resolvable only transitively.
     */
    class Transferred
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val photoUrls: JsonField<List<String>>,
        private val id: JsonField<Long>,
        private val acquisitionChannel: JsonField<Pet.AcquisitionChannel>,
        private val category: JsonValue,
        private val microchipId: JsonField<Pet.MicrochipId>,
        private val relatedAddress: JsonField<Address>,
        private val relatedCategory: JsonValue,
        private val relatedCustomer: JsonValue,
        private val relatedMoney: JsonField<Money>,
        private val relatedOrder: JsonValue,
        private val relatedPet: JsonField<Pet>,
        private val relatedShelter: JsonValue,
        private val relatedUser: JsonValue,
        private val status: JsonField<PetStatus>,
        private val tags: JsonField<List<JsonValue>>,
        private val family: JsonField<Family>,
        private val transferredTo: JsonField<TransferredTo>,
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
            acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of(),
            @JsonProperty("category") @ExcludeMissing category: JsonValue = JsonMissing.of(),
            @JsonProperty("microchipId")
            @ExcludeMissing
            microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of(),
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
            @JsonProperty("relatedUser") @ExcludeMissing relatedUser: JsonValue = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<PetStatus> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("family") @ExcludeMissing family: JsonField<Family> = JsonMissing.of(),
            @JsonProperty("transferredTo")
            @ExcludeMissing
            transferredTo: JsonField<TransferredTo> = JsonMissing.of(),
        ) : this(
            name,
            photoUrls,
            id,
            acquisitionChannel,
            category,
            microchipId,
            relatedAddress,
            relatedCategory,
            relatedCustomer,
            relatedMoney,
            relatedOrder,
            relatedPet,
            relatedShelter,
            relatedUser,
            status,
            tags,
            family,
            transferredTo,
            mutableMapOf(),
        )

        fun toPet(): Pet =
            Pet.builder()
                .name(name)
                .photoUrls(photoUrls)
                .id(id)
                .acquisitionChannel(acquisitionChannel)
                .category(category)
                .microchipId(microchipId)
                .relatedAddress(relatedAddress)
                .relatedCategory(relatedCategory)
                .relatedCustomer(relatedCustomer)
                .relatedMoney(relatedMoney)
                .relatedOrder(relatedOrder)
                .relatedPet(relatedPet)
                .relatedShelter(relatedShelter)
                .relatedUser(relatedUser)
                .status(status)
                .tags(tags)
                .build()

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * How the pet entered the store. Open enum: known channels plus forward-compatible
         * free-form strings.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun acquisitionChannel(): Pet.AcquisitionChannel? =
            acquisitionChannel.getNullable("acquisitionChannel")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = transferred.category().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonValue = category

        /**
         * Microchip identifier; legacy chips used numeric identifiers.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun microchipId(): Pet.MicrochipId? = microchipId.getNullable("microchipId")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = transferred.relatedCategory().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedCategory")
        @ExcludeMissing
        fun _relatedCategory(): JsonValue = relatedCategory

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = transferred.relatedCustomer().convert(MyClass::class.java)
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
         * val myObject: MyClass = transferred.relatedOrder().convert(MyClass::class.java)
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
         * val myObject: MyClass = transferred.relatedShelter().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedShelter")
        @ExcludeMissing
        fun _relatedShelter(): JsonValue = relatedShelter

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = transferred.relatedUser().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
        fun tags(): List<JsonValue>? = tags.getNullable("tags")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun family(): Family = family.getRequired("family")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transferredTo(): TransferredTo? = transferredTo.getNullable("transferredTo")

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
        @JsonProperty("photoUrls")
        @ExcludeMissing
        fun _photoUrls(): JsonField<List<String>> = photoUrls

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [acquisitionChannel].
         *
         * Unlike [acquisitionChannel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acquisitionChannel")
        @ExcludeMissing
        fun _acquisitionChannel(): JsonField<Pet.AcquisitionChannel> = acquisitionChannel

        /**
         * Returns the raw JSON value of [microchipId].
         *
         * Unlike [microchipId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("microchipId")
        @ExcludeMissing
        fun _microchipId(): JsonField<Pet.MicrochipId> = microchipId

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
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [family].
         *
         * Unlike [family], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("family") @ExcludeMissing fun _family(): JsonField<Family> = family

        /**
         * Returns the raw JSON value of [transferredTo].
         *
         * Unlike [transferredTo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transferredTo")
        @ExcludeMissing
        fun _transferredTo(): JsonField<TransferredTo> = transferredTo

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
             * Returns a mutable builder for constructing an instance of [Transferred].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .family()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Transferred]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var photoUrls: JsonField<MutableList<String>>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var acquisitionChannel: JsonField<Pet.AcquisitionChannel> = JsonMissing.of()
            private var category: JsonValue = JsonMissing.of()
            private var microchipId: JsonField<Pet.MicrochipId> = JsonMissing.of()
            private var relatedAddress: JsonField<Address> = JsonMissing.of()
            private var relatedCategory: JsonValue = JsonMissing.of()
            private var relatedCustomer: JsonValue = JsonMissing.of()
            private var relatedMoney: JsonField<Money> = JsonMissing.of()
            private var relatedOrder: JsonValue = JsonMissing.of()
            private var relatedPet: JsonField<Pet> = JsonMissing.of()
            private var relatedShelter: JsonValue = JsonMissing.of()
            private var relatedUser: JsonValue = JsonMissing.of()
            private var status: JsonField<PetStatus> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var family: JsonField<Family>? = null
            private var transferredTo: JsonField<TransferredTo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transferred: Transferred) = apply {
                name = transferred.name
                photoUrls = transferred.photoUrls.map { it.toMutableList() }
                id = transferred.id
                acquisitionChannel = transferred.acquisitionChannel
                category = transferred.category
                microchipId = transferred.microchipId
                relatedAddress = transferred.relatedAddress
                relatedCategory = transferred.relatedCategory
                relatedCustomer = transferred.relatedCustomer
                relatedMoney = transferred.relatedMoney
                relatedOrder = transferred.relatedOrder
                relatedPet = transferred.relatedPet
                relatedShelter = transferred.relatedShelter
                relatedUser = transferred.relatedUser
                status = transferred.status
                tags = transferred.tags.map { it.toMutableList() }
                family = transferred.family
                transferredTo = transferred.transferredTo
                additionalProperties = transferred.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * How the pet entered the store. Open enum: known channels plus forward-compatible
             * free-form strings.
             */
            fun acquisitionChannel(acquisitionChannel: Pet.AcquisitionChannel) =
                acquisitionChannel(JsonField.of(acquisitionChannel))

            /**
             * Sets [Builder.acquisitionChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(acquisitionChannel: JsonField<Pet.AcquisitionChannel>) = apply {
                this.acquisitionChannel = acquisitionChannel
            }

            /**
             * Sets [acquisitionChannel] to an arbitrary [String].
             *
             * You should usually call [acquisitionChannel] with a well-typed
             * [Pet.AcquisitionChannel] constant instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acquisitionChannel(value: String) =
                acquisitionChannel(Pet.AcquisitionChannel.of(value))

            fun category(category: JsonValue) = apply { this.category = category }

            /** Microchip identifier; legacy chips used numeric identifiers. */
            fun microchipId(microchipId: Pet.MicrochipId) = microchipId(JsonField.of(microchipId))

            /**
             * Sets [Builder.microchipId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.microchipId] with a well-typed [Pet.MicrochipId]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun microchipId(microchipId: JsonField<Pet.MicrochipId>) = apply {
                this.microchipId = microchipId
            }

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofString(string)`. */
            fun microchipId(string: String) = microchipId(Pet.MicrochipId.ofString(string))

            /** Alias for calling [microchipId] with `Pet.MicrochipId.ofLong(long)`. */
            fun microchipId(long: Long) = microchipId(Pet.MicrochipId.ofLong(long))

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

            fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

            /** pet status in the store */
            fun status(status: PetStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [PetStatus] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<PetStatus>) = apply { this.status = status }

            fun tags(tags: List<JsonValue>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun family(family: Family) = family(JsonField.of(family))

            /**
             * Sets [Builder.family] to an arbitrary JSON value.
             *
             * You should usually call [Builder.family] with a well-typed [Family] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun family(family: JsonField<Family>) = apply { this.family = family }

            fun transferredTo(transferredTo: TransferredTo) =
                transferredTo(JsonField.of(transferredTo))

            /**
             * Sets [Builder.transferredTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferredTo] with a well-typed [TransferredTo]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferredTo(transferredTo: JsonField<TransferredTo>) = apply {
                this.transferredTo = transferredTo
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
             * Returns an immutable instance of [Transferred].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .photoUrls()
             * .family()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transferred =
                Transferred(
                    checkRequired("name", name),
                    checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                    id,
                    acquisitionChannel,
                    category,
                    microchipId,
                    relatedAddress,
                    relatedCategory,
                    relatedCustomer,
                    relatedMoney,
                    relatedOrder,
                    relatedPet,
                    relatedShelter,
                    relatedUser,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    checkRequired("family", family),
                    transferredTo,
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
        fun validate(): Transferred = apply {
            if (validated) {
                return@apply
            }

            name()
            photoUrls()
            id()
            acquisitionChannel()
            microchipId()?.validate()
            relatedAddress()?.validate()
            relatedMoney()?.validate()
            relatedPet()?.validate()
            status()?.validate()
            tags()
            family().validate()
            transferredTo()?.validate()
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
                (photoUrls.asKnown()?.size ?: 0) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (acquisitionChannel.asKnown() == null) 0 else 1) +
                (microchipId.asKnown()?.validity() ?: 0) +
                (relatedAddress.asKnown()?.validity() ?: 0) +
                (relatedMoney.asKnown()?.validity() ?: 0) +
                (relatedPet.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (family.asKnown()?.validity() ?: 0) +
                (transferredTo.asKnown()?.validity() ?: 0)

        class Family @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val TRANSFERRED = of("transferred")

                fun of(value: String) = Family(JsonField.of(value))
            }

            /** An enum containing [Family]'s known values. */
            enum class Known {
                TRANSFERRED
            }

            /**
             * An enum containing [Family]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Family] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRANSFERRED,
                /**
                 * An enum member indicating that [Family] was instantiated with an unknown value.
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
                    TRANSFERRED -> Value.TRANSFERRED
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
                    TRANSFERRED -> Known.TRANSFERRED
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Family: $value")
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
            fun validate(): Family = apply {
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

                return other is Family && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TransferredTo
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
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
            fun contact(): Contact? = contact.getNullable("contact")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun location(): Location? = location.getNullable("location")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun relatedAddress(): Address? = relatedAddress.getNullable("relatedAddress")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = transferredTo.relatedCategory().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("relatedCategory")
            @ExcludeMissing
            fun _relatedCategory(): JsonValue = relatedCategory

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = transferredTo.relatedCustomer().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("relatedCustomer")
            @ExcludeMissing
            fun _relatedCustomer(): JsonValue = relatedCustomer

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun relatedMoney(): Money? = relatedMoney.getNullable("relatedMoney")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = transferredTo.relatedOrder().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("relatedOrder")
            @ExcludeMissing
            fun _relatedOrder(): JsonValue = relatedOrder

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun relatedPet(): Pet? = relatedPet.getNullable("relatedPet")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = transferredTo.relatedTag().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("relatedTag") @ExcludeMissing fun _relatedTag(): JsonValue = relatedTag

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = transferredTo.relatedUser().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("relatedUser") @ExcludeMissing fun _relatedUser(): JsonValue = relatedUser

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
             * Returns the raw JSON value of [contact].
             *
             * Unlike [contact], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("contact") @ExcludeMissing fun _contact(): JsonField<Contact> = contact

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
             * Unlike [relatedMoney], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("relatedMoney")
            @ExcludeMissing
            fun _relatedMoney(): JsonField<Money> = relatedMoney

            /**
             * Returns the raw JSON value of [relatedPet].
             *
             * Unlike [relatedPet], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [TransferredTo].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TransferredTo]. */
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

                internal fun from(transferredTo: TransferredTo) = apply {
                    name = transferredTo.name
                    address = transferredTo.address
                    contact = transferredTo.contact
                    location = transferredTo.location
                    relatedAddress = transferredTo.relatedAddress
                    relatedCategory = transferredTo.relatedCategory
                    relatedCustomer = transferredTo.relatedCustomer
                    relatedMoney = transferredTo.relatedMoney
                    relatedOrder = transferredTo.relatedOrder
                    relatedPet = transferredTo.relatedPet
                    relatedTag = transferredTo.relatedTag
                    relatedUser = transferredTo.relatedUser
                    additionalProperties = transferredTo.additionalProperties.toMutableMap()
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

                fun contact(contact: Contact) = contact(JsonField.of(contact))

                /**
                 * Sets [Builder.contact] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contact] with a well-typed [Contact] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contact(contact: JsonField<Contact>) = apply { this.contact = contact }

                fun location(location: Location) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [Location] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<Location>) = apply { this.location = location }

                fun relatedAddress(relatedAddress: Address) =
                    relatedAddress(JsonField.of(relatedAddress))

                /**
                 * Sets [Builder.relatedAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.relatedAddress] with a well-typed [Address]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun relatedPet(relatedPet: JsonField<Pet>) = apply { this.relatedPet = relatedPet }

                fun relatedTag(relatedTag: JsonValue) = apply { this.relatedTag = relatedTag }

                fun relatedUser(relatedUser: JsonValue) = apply { this.relatedUser = relatedUser }

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
                 * Returns an immutable instance of [TransferredTo].
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
                fun build(): TransferredTo =
                    TransferredTo(
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
            fun validate(): TransferredTo = apply {
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
                 * Unlike [primary], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(contact: Contact) = apply {
                        primary = contact.primary
                        additionalProperties = contact.additionalProperties.toMutableMap()
                    }

                    fun primary(primary: Primary) = primary(JsonField.of(primary))

                    /**
                     * Sets [Builder.primary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primary] with a well-typed [Primary] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun primary(primary: JsonField<Primary>) = apply { this.primary = primary }

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
                     * Returns an immutable instance of [Contact].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Contact = Contact(primary, additionalProperties.toMutableMap())
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
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun availability(): Availability? = availability.getNullable("availability")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): String? = name.getNullable("name")

                    /**
                     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
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
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [phone].
                     *
                     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

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

                        /** Returns a mutable builder for constructing an instance of [Primary]. */
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
                         * [Availability] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun availability(availability: JsonField<Availability>) = apply {
                            this.availability = availability
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun phone(phone: String) = phone(JsonField.of(phone))

                        /**
                         * Sets [Builder.phone] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.phone] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
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
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Primary =
                            Primary(availability, name, phone, additionalProperties.toMutableMap())
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun weekday(): Weekday? = weekday.getNullable("weekday")

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
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
                             * You should usually call [Builder.weekday] with a well-typed [Weekday]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun weekday(weekday: JsonField<Weekday>) = apply {
                                this.weekday = weekday
                            }

                            fun weekend(weekend: Weekend?) = weekend(JsonField.ofNullable(weekend))

                            /**
                             * Sets [Builder.weekend] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.weekend] with a well-typed [Weekend]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun weekend(weekend: JsonField<Weekend>) = apply {
                                this.weekend = weekend
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
                             * Returns an immutable instance of [Availability].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Availability =
                                Availability(weekday, weekend, additionalProperties.toMutableMap())
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun close(): String? = close.getNullable("close")

                            /**
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun open(): String? = open.getNullable("open")

                            /**
                             * Returns the raw JSON value of [close].
                             *
                             * Unlike [close], this method doesn't throw if the JSON field has an
                             * unexpected type.
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
                                private var additionalProperties: MutableMap<String, JsonValue> =
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
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun close(close: JsonField<String>) = apply { this.close = close }

                                fun open(open: String) = open(JsonField.of(open))

                                /**
                                 * Sets [Builder.open] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.open] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun open(open: JsonField<String>) = apply { this.open = open }

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
                                 * Returns an immutable instance of [Weekday].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Weekday =
                                    Weekday(close, open, additionalProperties.toMutableMap())
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
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun close(): String? = close.getNullable("close")

                            /**
                             * @throws HelloWorldTestinggggInvalidDataException if the JSON field
                             *   has an unexpected type (e.g. if the server responded with an
                             *   unexpected value).
                             */
                            fun open(): String? = open.getNullable("open")

                            /**
                             * Returns the raw JSON value of [close].
                             *
                             * Unlike [close], this method doesn't throw if the JSON field has an
                             * unexpected type.
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
                                private var additionalProperties: MutableMap<String, JsonValue> =
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
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun close(close: JsonField<String>) = apply { this.close = close }

                                fun open(open: String) = open(JsonField.of(open))

                                /**
                                 * Sets [Builder.open] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.open] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun open(open: JsonField<String>) = apply { this.open = open }

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
                                 * Returns an immutable instance of [Weekend].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Weekend =
                                    Weekend(close, open, additionalProperties.toMutableMap())
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

                private val hashCode: Int by lazy { Objects.hash(primary, additionalProperties) }

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
                 * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("latitude")
                @ExcludeMissing
                fun _latitude(): JsonField<Double> = latitude

                /**
                 * Returns the raw JSON value of [longitude].
                 *
                 * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(location: Location) = apply {
                        latitude = location.latitude
                        longitude = location.longitude
                        additionalProperties = location.additionalProperties.toMutableMap()
                    }

                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                    /**
                     * Sets [Builder.longitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.longitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun longitude(longitude: JsonField<Double>) = apply {
                        this.longitude = longitude
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
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
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

                return other is TransferredTo &&
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
                "TransferredTo{name=$name, address=$address, contact=$contact, location=$location, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedTag=$relatedTag, relatedUser=$relatedUser, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transferred &&
                name == other.name &&
                photoUrls == other.photoUrls &&
                id == other.id &&
                acquisitionChannel == other.acquisitionChannel &&
                category == other.category &&
                microchipId == other.microchipId &&
                relatedAddress == other.relatedAddress &&
                relatedCategory == other.relatedCategory &&
                relatedCustomer == other.relatedCustomer &&
                relatedMoney == other.relatedMoney &&
                relatedOrder == other.relatedOrder &&
                relatedPet == other.relatedPet &&
                relatedShelter == other.relatedShelter &&
                relatedUser == other.relatedUser &&
                status == other.status &&
                tags == other.tags &&
                family == other.family &&
                transferredTo == other.transferredTo &&
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
                relatedAddress,
                relatedCategory,
                relatedCustomer,
                relatedMoney,
                relatedOrder,
                relatedPet,
                relatedShelter,
                relatedUser,
                status,
                tags,
                family,
                transferredTo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transferred{name=$name, photoUrls=$photoUrls, id=$id, acquisitionChannel=$acquisitionChannel, category=$category, microchipId=$microchipId, relatedAddress=$relatedAddress, relatedCategory=$relatedCategory, relatedCustomer=$relatedCustomer, relatedMoney=$relatedMoney, relatedOrder=$relatedOrder, relatedPet=$relatedPet, relatedShelter=$relatedShelter, relatedUser=$relatedUser, status=$status, tags=$tags, family=$family, transferredTo=$transferredTo, additionalProperties=$additionalProperties}"
    }
}
