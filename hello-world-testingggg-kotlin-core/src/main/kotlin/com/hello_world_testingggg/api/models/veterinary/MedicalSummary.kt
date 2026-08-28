// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.veterinary

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class MedicalSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val petId: JsonField<Long>,
    private val audit: JsonField<Audit>,
    private val conditions: JsonField<List<Condition>>,
    private val vaccinations: JsonField<List<VaccinationRecord>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("petId") @ExcludeMissing petId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("audit") @ExcludeMissing audit: JsonField<Audit> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<Condition>> = JsonMissing.of(),
        @JsonProperty("vaccinations")
        @ExcludeMissing
        vaccinations: JsonField<List<VaccinationRecord>> = JsonMissing.of(),
    ) : this(petId, audit, conditions, vaccinations, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun petId(): Long = petId.getRequired("petId")

    /**
     * Provenance stamp attached to records across unrelated resources.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun audit(): Audit? = audit.getNullable("audit")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun conditions(): List<Condition>? = conditions.getNullable("conditions")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun vaccinations(): List<VaccinationRecord>? = vaccinations.getNullable("vaccinations")

    /**
     * Returns the raw JSON value of [petId].
     *
     * Unlike [petId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("petId") @ExcludeMissing fun _petId(): JsonField<Long> = petId

    /**
     * Returns the raw JSON value of [audit].
     *
     * Unlike [audit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audit") @ExcludeMissing fun _audit(): JsonField<Audit> = audit

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<List<Condition>> = conditions

    /**
     * Returns the raw JSON value of [vaccinations].
     *
     * Unlike [vaccinations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaccinations")
    @ExcludeMissing
    fun _vaccinations(): JsonField<List<VaccinationRecord>> = vaccinations

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
         * Returns a mutable builder for constructing an instance of [MedicalSummary].
         *
         * The following fields are required:
         * ```kotlin
         * .petId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MedicalSummary]. */
    class Builder internal constructor() {

        private var petId: JsonField<Long>? = null
        private var audit: JsonField<Audit> = JsonMissing.of()
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var vaccinations: JsonField<MutableList<VaccinationRecord>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(medicalSummary: MedicalSummary) = apply {
            petId = medicalSummary.petId
            audit = medicalSummary.audit
            conditions = medicalSummary.conditions.map { it.toMutableList() }
            vaccinations = medicalSummary.vaccinations.map { it.toMutableList() }
            additionalProperties = medicalSummary.additionalProperties.toMutableMap()
        }

        fun petId(petId: Long) = petId(JsonField.of(petId))

        /**
         * Sets [Builder.petId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.petId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun petId(petId: JsonField<Long>) = apply { this.petId = petId }

        /** Provenance stamp attached to records across unrelated resources. */
        fun audit(audit: Audit) = audit(JsonField.of(audit))

        /**
         * Sets [Builder.audit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audit] with a well-typed [Audit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audit(audit: JsonField<Audit>) = apply { this.audit = audit }

        fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<Condition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditions(conditions: JsonField<List<Condition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Condition] to [conditions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCondition(condition: Condition) = apply {
            conditions =
                (conditions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conditions", it).add(condition)
                }
        }

        fun vaccinations(vaccinations: List<VaccinationRecord>) =
            vaccinations(JsonField.of(vaccinations))

        /**
         * Sets [Builder.vaccinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaccinations] with a well-typed
         * `List<VaccinationRecord>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun vaccinations(vaccinations: JsonField<List<VaccinationRecord>>) = apply {
            this.vaccinations = vaccinations.map { it.toMutableList() }
        }

        /**
         * Adds a single [VaccinationRecord] to [vaccinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVaccination(vaccination: VaccinationRecord) = apply {
            vaccinations =
                (vaccinations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("vaccinations", it).add(vaccination)
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
         * Returns an immutable instance of [MedicalSummary].
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
        fun build(): MedicalSummary =
            MedicalSummary(
                checkRequired("petId", petId),
                audit,
                (conditions ?: JsonMissing.of()).map { it.toImmutable() },
                (vaccinations ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): MedicalSummary = apply {
        if (validated) {
            return@apply
        }

        petId()
        audit()?.validate()
        conditions()?.forEach { it.validate() }
        vaccinations()?.forEach { it.validate() }
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
            (audit.asKnown()?.validity() ?: 0) +
            (conditions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (vaccinations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** Provenance stamp attached to records across unrelated resources. */
    class Audit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recordedAt: JsonField<OffsetDateTime>,
        private val recordedBy: JsonField<String>,
        private val source: JsonField<Source>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("recordedAt")
            @ExcludeMissing
            recordedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("recordedBy")
            @ExcludeMissing
            recordedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        ) : this(recordedAt, recordedBy, source, mutableMapOf())

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
        fun recordedBy(): String? = recordedBy.getNullable("recordedBy")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun source(): Source? = source.getNullable("source")

        /**
         * Returns the raw JSON value of [recordedAt].
         *
         * Unlike [recordedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordedAt")
        @ExcludeMissing
        fun _recordedAt(): JsonField<OffsetDateTime> = recordedAt

        /**
         * Returns the raw JSON value of [recordedBy].
         *
         * Unlike [recordedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordedBy")
        @ExcludeMissing
        fun _recordedBy(): JsonField<String> = recordedBy

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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
             * Returns a mutable builder for constructing an instance of [Audit].
             *
             * The following fields are required:
             * ```kotlin
             * .recordedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Audit]. */
        class Builder internal constructor() {

            private var recordedAt: JsonField<OffsetDateTime>? = null
            private var recordedBy: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(audit: Audit) = apply {
                recordedAt = audit.recordedAt
                recordedBy = audit.recordedBy
                source = audit.source
                additionalProperties = audit.additionalProperties.toMutableMap()
            }

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

            fun recordedBy(recordedBy: String) = recordedBy(JsonField.of(recordedBy))

            /**
             * Sets [Builder.recordedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordedBy(recordedBy: JsonField<String>) = apply { this.recordedBy = recordedBy }

            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

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
             * Returns an immutable instance of [Audit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .recordedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Audit =
                Audit(
                    checkRequired("recordedAt", recordedAt),
                    recordedBy,
                    source,
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
        fun validate(): Audit = apply {
            if (validated) {
                return@apply
            }

            recordedAt()
            recordedBy()
            source()?.validate()
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
            (if (recordedAt.asKnown() == null) 0 else 1) +
                (if (recordedBy.asKnown() == null) 0 else 1) +
                (source.asKnown()?.validity() ?: 0)

        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val MANUAL = of("manual")

                val IMPORT = of("import")

                val SYSTEM = of("system")

                fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                MANUAL,
                IMPORT,
                SYSTEM,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MANUAL,
                IMPORT,
                SYSTEM,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    MANUAL -> Value.MANUAL
                    IMPORT -> Value.IMPORT
                    SYSTEM -> Value.SYSTEM
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
                    MANUAL -> Known.MANUAL
                    IMPORT -> Known.IMPORT
                    SYSTEM -> Known.SYSTEM
                    else -> throw HelloWorldTestinggggInvalidDataException("Unknown Source: $value")
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
            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Audit &&
                recordedAt == other.recordedAt &&
                recordedBy == other.recordedBy &&
                source == other.source &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(recordedAt, recordedBy, source, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Audit{recordedAt=$recordedAt, recordedBy=$recordedBy, source=$source, additionalProperties=$additionalProperties}"
    }

    class Condition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val severity: JsonField<Severity>,
        private val treatment: JsonField<Treatment>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("treatment")
            @ExcludeMissing
            treatment: JsonField<Treatment> = JsonMissing.of(),
        ) : this(code, severity, treatment, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun severity(): Severity? = severity.getNullable("severity")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun treatment(): Treatment? = treatment.getNullable("treatment")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [treatment].
         *
         * Unlike [treatment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("treatment")
        @ExcludeMissing
        fun _treatment(): JsonField<Treatment> = treatment

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
             * Returns a mutable builder for constructing an instance of [Condition].
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var treatment: JsonField<Treatment> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(condition: Condition) = apply {
                code = condition.code
                severity = condition.severity
                treatment = condition.treatment
                additionalProperties = condition.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            fun treatment(treatment: Treatment) = treatment(JsonField.of(treatment))

            /**
             * Sets [Builder.treatment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treatment] with a well-typed [Treatment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treatment(treatment: JsonField<Treatment>) = apply { this.treatment = treatment }

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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Condition =
                Condition(
                    checkRequired("code", code),
                    severity,
                    treatment,
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
        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            code()
            severity()?.validate()
            treatment()?.validate()
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
            (if (code.asKnown() == null) 0 else 1) +
                (severity.asKnown()?.validity() ?: 0) +
                (treatment.asKnown()?.validity() ?: 0)

        class Severity @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val MILD = of("mild")

                val MODERATE = of("moderate")

                val SEVERE = of("severe")

                fun of(value: String) = Severity(JsonField.of(value))
            }

            /** An enum containing [Severity]'s known values. */
            enum class Known {
                MILD,
                MODERATE,
                SEVERE,
            }

            /**
             * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Severity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MILD,
                MODERATE,
                SEVERE,
                /**
                 * An enum member indicating that [Severity] was instantiated with an unknown value.
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
                    MILD -> Value.MILD
                    MODERATE -> Value.MODERATE
                    SEVERE -> Value.SEVERE
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
                    MILD -> Known.MILD
                    MODERATE -> Known.MODERATE
                    SEVERE -> Known.SEVERE
                    else ->
                        throw HelloWorldTestinggggInvalidDataException("Unknown Severity: $value")
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
            fun validate(): Severity = apply {
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

                return other is Severity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Treatment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val medications: JsonField<List<Medication>>,
            private val plan: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("medications")
                @ExcludeMissing
                medications: JsonField<List<Medication>> = JsonMissing.of(),
                @JsonProperty("plan") @ExcludeMissing plan: JsonField<String> = JsonMissing.of(),
            ) : this(medications, plan, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun medications(): List<Medication>? = medications.getNullable("medications")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun plan(): String? = plan.getNullable("plan")

            /**
             * Returns the raw JSON value of [medications].
             *
             * Unlike [medications], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("medications")
            @ExcludeMissing
            fun _medications(): JsonField<List<Medication>> = medications

            /**
             * Returns the raw JSON value of [plan].
             *
             * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<String> = plan

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

                /** Returns a mutable builder for constructing an instance of [Treatment]. */
                fun builder() = Builder()
            }

            /** A builder for [Treatment]. */
            class Builder internal constructor() {

                private var medications: JsonField<MutableList<Medication>>? = null
                private var plan: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(treatment: Treatment) = apply {
                    medications = treatment.medications.map { it.toMutableList() }
                    plan = treatment.plan
                    additionalProperties = treatment.additionalProperties.toMutableMap()
                }

                fun medications(medications: List<Medication>) =
                    medications(JsonField.of(medications))

                /**
                 * Sets [Builder.medications] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.medications] with a well-typed
                 * `List<Medication>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun medications(medications: JsonField<List<Medication>>) = apply {
                    this.medications = medications.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Medication] to [medications].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMedication(medication: Medication) = apply {
                    medications =
                        (medications ?: JsonField.of(mutableListOf())).also {
                            checkKnown("medications", it).add(medication)
                        }
                }

                fun plan(plan: String) = plan(JsonField.of(plan))

                /**
                 * Sets [Builder.plan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plan] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun plan(plan: JsonField<String>) = apply { this.plan = plan }

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
                 * Returns an immutable instance of [Treatment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Treatment =
                    Treatment(
                        (medications ?: JsonMissing.of()).map { it.toImmutable() },
                        plan,
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
            fun validate(): Treatment = apply {
                if (validated) {
                    return@apply
                }

                medications()?.forEach { it.validate() }
                plan()
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
                (medications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (plan.asKnown() == null) 0 else 1)

            class Medication
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val dosage: JsonField<Dosage>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dosage")
                    @ExcludeMissing
                    dosage: JsonField<Dosage> = JsonMissing.of(),
                ) : this(name, dosage, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Free-form dosage text or a structured dosage.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun dosage(): Dosage? = dosage.getNullable("dosage")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [dosage].
                 *
                 * Unlike [dosage], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("dosage") @ExcludeMissing fun _dosage(): JsonField<Dosage> = dosage

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
                     * Returns a mutable builder for constructing an instance of [Medication].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Medication]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var dosage: JsonField<Dosage> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(medication: Medication) = apply {
                        name = medication.name
                        dosage = medication.dosage
                        additionalProperties = medication.additionalProperties.toMutableMap()
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

                    /** Free-form dosage text or a structured dosage. */
                    fun dosage(dosage: Dosage) = dosage(JsonField.of(dosage))

                    /**
                     * Sets [Builder.dosage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dosage] with a well-typed [Dosage] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dosage(dosage: JsonField<Dosage>) = apply { this.dosage = dosage }

                    /** Alias for calling [dosage] with `Dosage.ofString(string)`. */
                    fun dosage(string: String) = dosage(Dosage.ofString(string))

                    /** Alias for calling [dosage] with `Dosage.ofStructured(structured)`. */
                    fun dosage(structured: Dosage.StructuredDosage) =
                        dosage(Dosage.ofStructured(structured))

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
                     * Returns an immutable instance of [Medication].
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
                    fun build(): Medication =
                        Medication(
                            checkRequired("name", name),
                            dosage,
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
                fun validate(): Medication = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    dosage()?.validate()
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
                    (if (name.asKnown() == null) 0 else 1) + (dosage.asKnown()?.validity() ?: 0)

                /** Free-form dosage text or a structured dosage. */
                @JsonDeserialize(using = Dosage.Deserializer::class)
                @JsonSerialize(using = Dosage.Serializer::class)
                class Dosage
                private constructor(
                    private val string: String? = null,
                    private val structured: StructuredDosage? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): String? = string

                    fun structured(): StructuredDosage? = structured

                    fun isString(): Boolean = string != null

                    fun isStructured(): Boolean = structured != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asStructured(): StructuredDosage = structured.getOrThrow("structured")

                    fun _json(): JsonValue? = _json

                    /**
                     * Maps this instance's current variant to a value of type [T] using the given
                     * [visitor].
                     *
                     * Note that this method is _not_ forwards compatible with new variants from the
                     * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not
                     * known to this version of the SDK gracefully, consider overriding
                     * [Visitor.unknown]:
                     * ```kotlin
                     * import com.hello_world_testingggg.api.core.JsonValue
                     *
                     * val result: String? = dosage.accept(object : Dosage.Visitor<String?> {
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
                     * @throws HelloWorldTestinggggInvalidDataException if [Visitor.unknown] is not
                     *   overridden in [visitor] and the current variant is unknown.
                     */
                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            structured != null -> visitor.visitStructured(structured)
                            else -> visitor.unknown(_json)
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
                    fun validate(): Dosage = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitStructured(structured: StructuredDosage) {
                                    structured.validate()
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
                                override fun visitString(string: String) = 1

                                override fun visitStructured(structured: StructuredDosage) =
                                    structured.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Dosage &&
                            string == other.string &&
                            structured == other.structured
                    }

                    override fun hashCode(): Int = Objects.hash(string, structured)

                    override fun toString(): String =
                        when {
                            string != null -> "Dosage{string=$string}"
                            structured != null -> "Dosage{structured=$structured}"
                            _json != null -> "Dosage{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Dosage")
                        }

                    companion object {

                        fun ofString(string: String) = Dosage(string = string)

                        fun ofStructured(structured: StructuredDosage) =
                            Dosage(structured = structured)
                    }

                    /**
                     * An interface that defines how to map each variant of [Dosage] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitStructured(structured: StructuredDosage): T

                        /**
                         * Maps an unknown variant of [Dosage] to a value of type [T].
                         *
                         * An instance of [Dosage] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws HelloWorldTestinggggInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw HelloWorldTestinggggInvalidDataException("Unknown Dosage: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Dosage>(Dosage::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Dosage {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<StructuredDosage>())
                                            ?.let { Dosage(structured = it, _json = json) },
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Dosage(string = it, _json = json)
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from boolean).
                                0 -> Dosage(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Dosage>(Dosage::class) {

                        override fun serialize(
                            value: Dosage,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.structured != null -> generator.writeObject(value.structured)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Dosage")
                            }
                        }
                    }

                    class StructuredDosage
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val amount: JsonField<Double>,
                        private val unit: JsonField<String>,
                        private val frequency: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            amount: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("unit")
                            @ExcludeMissing
                            unit: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("frequency")
                            @ExcludeMissing
                            frequency: JsonField<String> = JsonMissing.of(),
                        ) : this(amount, unit, frequency, mutableMapOf())

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun amount(): Double = amount.getRequired("amount")

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun unit(): String = unit.getRequired("unit")

                        /**
                         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun frequency(): String? = frequency.getNullable("frequency")

                        /**
                         * Returns the raw JSON value of [amount].
                         *
                         * Unlike [amount], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun _amount(): JsonField<Double> = amount

                        /**
                         * Returns the raw JSON value of [unit].
                         *
                         * Unlike [unit], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

                        /**
                         * Returns the raw JSON value of [frequency].
                         *
                         * Unlike [frequency], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("frequency")
                        @ExcludeMissing
                        fun _frequency(): JsonField<String> = frequency

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
                             * [StructuredDosage].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .amount()
                             * .unit()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [StructuredDosage]. */
                        class Builder internal constructor() {

                            private var amount: JsonField<Double>? = null
                            private var unit: JsonField<String>? = null
                            private var frequency: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(structuredDosage: StructuredDosage) = apply {
                                amount = structuredDosage.amount
                                unit = structuredDosage.unit
                                frequency = structuredDosage.frequency
                                additionalProperties =
                                    structuredDosage.additionalProperties.toMutableMap()
                            }

                            fun amount(amount: Double) = amount(JsonField.of(amount))

                            /**
                             * Sets [Builder.amount] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.amount] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                            fun unit(unit: String) = unit(JsonField.of(unit))

                            /**
                             * Sets [Builder.unit] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.unit] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

                            fun frequency(frequency: String) = frequency(JsonField.of(frequency))

                            /**
                             * Sets [Builder.frequency] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.frequency] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun frequency(frequency: JsonField<String>) = apply {
                                this.frequency = frequency
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
                             * Returns an immutable instance of [StructuredDosage].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .amount()
                             * .unit()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): StructuredDosage =
                                StructuredDosage(
                                    checkRequired("amount", amount),
                                    checkRequired("unit", unit),
                                    frequency,
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
                        fun validate(): StructuredDosage = apply {
                            if (validated) {
                                return@apply
                            }

                            amount()
                            unit()
                            frequency()
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
                            (if (amount.asKnown() == null) 0 else 1) +
                                (if (unit.asKnown() == null) 0 else 1) +
                                (if (frequency.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is StructuredDosage &&
                                amount == other.amount &&
                                unit == other.unit &&
                                frequency == other.frequency &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(amount, unit, frequency, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "StructuredDosage{amount=$amount, unit=$unit, frequency=$frequency, additionalProperties=$additionalProperties}"
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Medication &&
                        name == other.name &&
                        dosage == other.dosage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, dosage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Medication{name=$name, dosage=$dosage, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Treatment &&
                    medications == other.medications &&
                    plan == other.plan &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(medications, plan, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Treatment{medications=$medications, plan=$plan, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                code == other.code &&
                severity == other.severity &&
                treatment == other.treatment &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, severity, treatment, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Condition{code=$code, severity=$severity, treatment=$treatment, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MedicalSummary &&
            petId == other.petId &&
            audit == other.audit &&
            conditions == other.conditions &&
            vaccinations == other.vaccinations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(petId, audit, conditions, vaccinations, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MedicalSummary{petId=$petId, audit=$audit, conditions=$conditions, vaccinations=$vaccinations, additionalProperties=$additionalProperties}"
}
