// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

class PetListLeaderboardResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val petId: JsonField<Long>,
    private val badge: JsonField<Badge>,
    private val docsRef: JsonField<DocsRef>,
    private val rank: JsonField<Long>,
    private val roi: JsonField<Roi>,
    private val sevenDayStreak: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("petId") @ExcludeMissing petId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("badge") @ExcludeMissing badge: JsonField<Badge> = JsonMissing.of(),
        @JsonProperty("docsRef") @ExcludeMissing docsRef: JsonField<DocsRef> = JsonMissing.of(),
        @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("roi") @ExcludeMissing roi: JsonField<Roi> = JsonMissing.of(),
        @JsonProperty("streak7d") @ExcludeMissing sevenDayStreak: JsonField<Long> = JsonMissing.of(),
    ) : this(petId, badge, docsRef, rank, roi, sevenDayStreak, mutableMapOf())

    /**
     * Ranked pet ID
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun petId(): Long = petId.getRequired("petId")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun badge(): Badge? = badge.getNullable("badge")

    /**
     * Docs anchor for the badge a leaderboard entry was awarded.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun docsRef(): DocsRef? = docsRef.getNullable("docsRef")

    /**
     * Leaderboard position
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun rank(): Long? = rank.getNullable("rank")

    /**
     * Adoption return on investment
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun roi(): Roi? = roi.getNullable("roi")

    /**
     * Consecutive days on the leaderboard.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun sevenDayStreak(): Long? = sevenDayStreak.getNullable("streak7d")

    /**
     * Returns the raw JSON value of [petId].
     *
     * Unlike [petId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("petId") @ExcludeMissing fun _petId(): JsonField<Long> = petId

    /**
     * Returns the raw JSON value of [badge].
     *
     * Unlike [badge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("badge") @ExcludeMissing fun _badge(): JsonField<Badge> = badge

    /**
     * Returns the raw JSON value of [docsRef].
     *
     * Unlike [docsRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docsRef") @ExcludeMissing fun _docsRef(): JsonField<DocsRef> = docsRef

    /**
     * Returns the raw JSON value of [rank].
     *
     * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

    /**
     * Returns the raw JSON value of [roi].
     *
     * Unlike [roi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roi") @ExcludeMissing fun _roi(): JsonField<Roi> = roi

    /**
     * Returns the raw JSON value of [sevenDayStreak].
     *
     * Unlike [sevenDayStreak], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streak7d")
    @ExcludeMissing
    fun _sevenDayStreak(): JsonField<Long> = sevenDayStreak

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
         * Returns a mutable builder for constructing an instance of [PetListLeaderboardResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .petId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PetListLeaderboardResponse]. */
    class Builder internal constructor() {

        private var petId: JsonField<Long>? = null
        private var badge: JsonField<Badge> = JsonMissing.of()
        private var docsRef: JsonField<DocsRef> = JsonMissing.of()
        private var rank: JsonField<Long> = JsonMissing.of()
        private var roi: JsonField<Roi> = JsonMissing.of()
        private var sevenDayStreak: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(petListLeaderboardResponse: PetListLeaderboardResponse) = apply {
            petId = petListLeaderboardResponse.petId
            badge = petListLeaderboardResponse.badge
            docsRef = petListLeaderboardResponse.docsRef
            rank = petListLeaderboardResponse.rank
            roi = petListLeaderboardResponse.roi
            sevenDayStreak = petListLeaderboardResponse.sevenDayStreak
            additionalProperties = petListLeaderboardResponse.additionalProperties.toMutableMap()
        }

        /** Ranked pet ID */
        fun petId(petId: Long) = petId(JsonField.of(petId))

        /**
         * Sets [Builder.petId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.petId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun petId(petId: JsonField<Long>) = apply { this.petId = petId }

        fun badge(badge: Badge) = badge(JsonField.of(badge))

        /**
         * Sets [Builder.badge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.badge] with a well-typed [Badge] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun badge(badge: JsonField<Badge>) = apply { this.badge = badge }

        /** Docs anchor for the badge a leaderboard entry was awarded. */
        fun docsRef(docsRef: DocsRef) = docsRef(JsonField.of(docsRef))

        /**
         * Sets [Builder.docsRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docsRef] with a well-typed [DocsRef] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docsRef(docsRef: JsonField<DocsRef>) = apply { this.docsRef = docsRef }

        /** Leaderboard position */
        fun rank(rank: Long) = rank(JsonField.of(rank))

        /**
         * Sets [Builder.rank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rank] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

        /** Adoption return on investment */
        fun roi(roi: Roi) = roi(JsonField.of(roi))

        /**
         * Sets [Builder.roi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roi] with a well-typed [Roi] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roi(roi: JsonField<Roi>) = apply { this.roi = roi }

        /** Consecutive days on the leaderboard. */
        fun sevenDayStreak(sevenDayStreak: Long) = sevenDayStreak(JsonField.of(sevenDayStreak))

        /**
         * Sets [Builder.sevenDayStreak] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sevenDayStreak] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sevenDayStreak(sevenDayStreak: JsonField<Long>) = apply {
            this.sevenDayStreak = sevenDayStreak
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
         * Returns an immutable instance of [PetListLeaderboardResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .petId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PetListLeaderboardResponse =
            PetListLeaderboardResponse(
                checkRequired("petId", petId),
                badge,
                docsRef,
                rank,
                roi,
                sevenDayStreak,
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
    fun validate(): PetListLeaderboardResponse = apply {
        if (validated) {
            return@apply
        }

        petId()
        badge()?.validate()
        docsRef()?.validate()
        rank()
        roi()?.validate()
        sevenDayStreak()
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
        (if (petId.asKnown() == null) 0 else 1) +
            (badge.asKnown()?.validity() ?: 0) +
            (docsRef.asKnown()?.validity() ?: 0) +
            (if (rank.asKnown() == null) 0 else 1) +
            (roi.asKnown()?.validity() ?: 0) +
            (if (sevenDayStreak.asKnown() == null) 0 else 1)

    class Badge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

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

            /** Returns a mutable builder for constructing an instance of [Badge]. */
            fun builder() = Builder()
        }

        /** A builder for [Badge]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(badge: Badge) = apply {
                additionalProperties = badge.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Badge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Badge = Badge(additionalProperties.toMutableMap())
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
        fun validate(): Badge = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int = 0

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Badge && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Badge{additionalProperties=$additionalProperties}"
    }

    /** Docs anchor for the badge a leaderboard entry was awarded. */
    class DocsRef @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val TOP_ADOPTER = of("https://docs.petstore.example/leaderboard#top-adopter")

            val RISING_STAR = of("https://docs.petstore.example/leaderboard#rising-star")

            fun of(value: String) = DocsRef(JsonField.of(value))
        }

        /** An enum containing [DocsRef]'s known values. */
        enum class Known {
            TOP_ADOPTER,
            RISING_STAR,
        }

        /**
         * An enum containing [DocsRef]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocsRef] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOP_ADOPTER,
            RISING_STAR,
            /** An enum member indicating that [DocsRef] was instantiated with an unknown value. */
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
                TOP_ADOPTER -> Value.TOP_ADOPTER
                RISING_STAR -> Value.RISING_STAR
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
                TOP_ADOPTER -> Known.TOP_ADOPTER
                RISING_STAR -> Known.RISING_STAR
                else -> throw HelloWorldTestinggggInvalidDataException("Unknown DocsRef: $value")
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
        fun validate(): DocsRef = apply {
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

            return other is DocsRef && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Adoption return on investment */
    class Roi
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val times: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("times") @ExcludeMissing times: JsonField<Double> = JsonMissing.of(),
        ) : this(currency, times, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun times(): Double? = times.getNullable("times")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [times].
         *
         * Unlike [times], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("times") @ExcludeMissing fun _times(): JsonField<Double> = times

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

            /** Returns a mutable builder for constructing an instance of [Roi]. */
            fun builder() = Builder()
        }

        /** A builder for [Roi]. */
        class Builder internal constructor() {

            private var currency: JsonField<String> = JsonMissing.of()
            private var times: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(roi: Roi) = apply {
                currency = roi.currency
                times = roi.times
                additionalProperties = roi.additionalProperties.toMutableMap()
            }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun times(times: Double) = times(JsonField.of(times))

            /**
             * Sets [Builder.times] to an arbitrary JSON value.
             *
             * You should usually call [Builder.times] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun times(times: JsonField<Double>) = apply { this.times = times }

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
             * Returns an immutable instance of [Roi].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Roi = Roi(currency, times, additionalProperties.toMutableMap())
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
        fun validate(): Roi = apply {
            if (validated) {
                return@apply
            }

            currency()
            times()
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
            (if (currency.asKnown() == null) 0 else 1) + (if (times.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Roi &&
                currency == other.currency &&
                times == other.times &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(currency, times, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Roi{currency=$currency, times=$times, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListLeaderboardResponse &&
            petId == other.petId &&
            badge == other.badge &&
            docsRef == other.docsRef &&
            rank == other.rank &&
            roi == other.roi &&
            sevenDayStreak == other.sevenDayStreak &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(petId, badge, docsRef, rank, roi, sevenDayStreak, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PetListLeaderboardResponse{petId=$petId, badge=$badge, docsRef=$docsRef, rank=$rank, roi=$roi, sevenDayStreak=$sevenDayStreak, additionalProperties=$additionalProperties}"
}
