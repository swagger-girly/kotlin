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
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

class AiAiQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataExtracted: JsonField<List<DataExtracted>>,
    private val matchedRules: JsonField<List<MatchedRule>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_extracted")
        @ExcludeMissing
        dataExtracted: JsonField<List<DataExtracted>> = JsonMissing.of(),
        @JsonProperty("matched_rules")
        @ExcludeMissing
        matchedRules: JsonField<List<MatchedRule>> = JsonMissing.of(),
    ) : this(dataExtracted, matchedRules, mutableMapOf())

    /**
     * Non-plural array on the response side
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun dataExtracted(): List<DataExtracted>? = dataExtracted.getNullable("data_extracted")

    /**
     * Plural array on the response side
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun matchedRules(): List<MatchedRule>? = matchedRules.getNullable("matched_rules")

    /**
     * Returns the raw JSON value of [dataExtracted].
     *
     * Unlike [dataExtracted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_extracted")
    @ExcludeMissing
    fun _dataExtracted(): JsonField<List<DataExtracted>> = dataExtracted

    /**
     * Returns the raw JSON value of [matchedRules].
     *
     * Unlike [matchedRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matched_rules")
    @ExcludeMissing
    fun _matchedRules(): JsonField<List<MatchedRule>> = matchedRules

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

        /** Returns a mutable builder for constructing an instance of [AiAiQueryResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [AiAiQueryResponse]. */
    class Builder internal constructor() {

        private var dataExtracted: JsonField<MutableList<DataExtracted>>? = null
        private var matchedRules: JsonField<MutableList<MatchedRule>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aiAiQueryResponse: AiAiQueryResponse) = apply {
            dataExtracted = aiAiQueryResponse.dataExtracted.map { it.toMutableList() }
            matchedRules = aiAiQueryResponse.matchedRules.map { it.toMutableList() }
            additionalProperties = aiAiQueryResponse.additionalProperties.toMutableMap()
        }

        /** Non-plural array on the response side */
        fun dataExtracted(dataExtracted: List<DataExtracted>) =
            dataExtracted(JsonField.of(dataExtracted))

        /**
         * Sets [Builder.dataExtracted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataExtracted] with a well-typed `List<DataExtracted>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataExtracted(dataExtracted: JsonField<List<DataExtracted>>) = apply {
            this.dataExtracted = dataExtracted.map { it.toMutableList() }
        }

        /**
         * Adds a single [DataExtracted] to [Builder.dataExtracted].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataExtracted(dataExtracted: DataExtracted) = apply {
            this.dataExtracted =
                (this.dataExtracted ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dataExtracted", it).add(dataExtracted)
                }
        }

        /** Plural array on the response side */
        fun matchedRules(matchedRules: List<MatchedRule>) = matchedRules(JsonField.of(matchedRules))

        /**
         * Sets [Builder.matchedRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchedRules] with a well-typed `List<MatchedRule>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun matchedRules(matchedRules: JsonField<List<MatchedRule>>) = apply {
            this.matchedRules = matchedRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [MatchedRule] to [matchedRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatchedRule(matchedRule: MatchedRule) = apply {
            matchedRules =
                (matchedRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("matchedRules", it).add(matchedRule)
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
         * Returns an immutable instance of [AiAiQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AiAiQueryResponse =
            AiAiQueryResponse(
                (dataExtracted ?: JsonMissing.of()).map { it.toImmutable() },
                (matchedRules ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AiAiQueryResponse = apply {
        if (validated) {
            return@apply
        }

        dataExtracted()?.forEach { it.validate() }
        matchedRules()?.forEach { it.validate() }
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
        (dataExtracted.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (matchedRules.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class DataExtracted
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val datapointValue: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("datapoint_value")
            @ExcludeMissing
            datapointValue: JsonField<String> = JsonMissing.of()
        ) : this(datapointValue, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun datapointValue(): String? = datapointValue.getNullable("datapoint_value")

        /**
         * Returns the raw JSON value of [datapointValue].
         *
         * Unlike [datapointValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_value")
        @ExcludeMissing
        fun _datapointValue(): JsonField<String> = datapointValue

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

            /** Returns a mutable builder for constructing an instance of [DataExtracted]. */
            fun builder() = Builder()
        }

        /** A builder for [DataExtracted]. */
        class Builder internal constructor() {

            private var datapointValue: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(dataExtracted: DataExtracted) = apply {
                datapointValue = dataExtracted.datapointValue
                additionalProperties = dataExtracted.additionalProperties.toMutableMap()
            }

            fun datapointValue(datapointValue: String) =
                datapointValue(JsonField.of(datapointValue))

            /**
             * Sets [Builder.datapointValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datapointValue(datapointValue: JsonField<String>) = apply {
                this.datapointValue = datapointValue
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
             * Returns an immutable instance of [DataExtracted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataExtracted =
                DataExtracted(datapointValue, additionalProperties.toMutableMap())
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
        fun validate(): DataExtracted = apply {
            if (validated) {
                return@apply
            }

            datapointValue()
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
        internal fun validity(): Int = (if (datapointValue.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataExtracted &&
                datapointValue == other.datapointValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(datapointValue, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataExtracted{datapointValue=$datapointValue, additionalProperties=$additionalProperties}"
    }

    class MatchedRule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val matchScore: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("match_score")
            @ExcludeMissing
            matchScore: JsonField<Double> = JsonMissing.of()
        ) : this(matchScore, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun matchScore(): Double? = matchScore.getNullable("match_score")

        /**
         * Returns the raw JSON value of [matchScore].
         *
         * Unlike [matchScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_score")
        @ExcludeMissing
        fun _matchScore(): JsonField<Double> = matchScore

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

            /** Returns a mutable builder for constructing an instance of [MatchedRule]. */
            fun builder() = Builder()
        }

        /** A builder for [MatchedRule]. */
        class Builder internal constructor() {

            private var matchScore: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(matchedRule: MatchedRule) = apply {
                matchScore = matchedRule.matchScore
                additionalProperties = matchedRule.additionalProperties.toMutableMap()
            }

            fun matchScore(matchScore: Double) = matchScore(JsonField.of(matchScore))

            /**
             * Sets [Builder.matchScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchScore(matchScore: JsonField<Double>) = apply { this.matchScore = matchScore }

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
             * Returns an immutable instance of [MatchedRule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MatchedRule = MatchedRule(matchScore, additionalProperties.toMutableMap())
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
        fun validate(): MatchedRule = apply {
            if (validated) {
                return@apply
            }

            matchScore()
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
        internal fun validity(): Int = (if (matchScore.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MatchedRule &&
                matchScore == other.matchScore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(matchScore, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MatchedRule{matchScore=$matchScore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiAiQueryResponse &&
            dataExtracted == other.dataExtracted &&
            matchedRules == other.matchedRules &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataExtracted, matchedRules, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AiAiQueryResponse{dataExtracted=$dataExtracted, matchedRules=$matchedRules, additionalProperties=$additionalProperties}"
}
