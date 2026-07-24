// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

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

class PetListLeaderboardResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val petId: JsonField<Long>,
    private val badge: JsonField<Badge>,
    private val rank: JsonField<Long>,
    private val roi: JsonField<Roi>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("petId") @ExcludeMissing petId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("badge") @ExcludeMissing badge: JsonField<Badge> = JsonMissing.of(),
        @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("roi") @ExcludeMissing roi: JsonField<Roi> = JsonMissing.of(),
    ) : this(petId, badge, rank, roi, mutableMapOf())

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
        private var rank: JsonField<Long> = JsonMissing.of()
        private var roi: JsonField<Roi> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(petListLeaderboardResponse: PetListLeaderboardResponse) = apply {
            petId = petListLeaderboardResponse.petId
            badge = petListLeaderboardResponse.badge
            rank = petListLeaderboardResponse.rank
            roi = petListLeaderboardResponse.roi
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
                rank,
                roi,
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
        rank()
        roi()?.validate()
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
            (if (rank.asKnown() == null) 0 else 1) +
            (roi.asKnown()?.validity() ?: 0)

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
            rank == other.rank &&
            roi == other.roi &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(petId, badge, rank, roi, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PetListLeaderboardResponse{petId=$petId, badge=$badge, rank=$rank, roi=$roi, additionalProperties=$additionalProperties}"
}
