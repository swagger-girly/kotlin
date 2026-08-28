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

class VaccinationRecord
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val administeredAt: JsonField<OffsetDateTime>,
    private val vaccine: JsonField<String>,
    private val audit: JsonField<Audit>,
    private val boosterSchedule: JsonField<List<BoosterSchedule>>,
    private val veterinarian: JsonField<Veterinarian>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("administeredAt")
        @ExcludeMissing
        administeredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vaccine") @ExcludeMissing vaccine: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audit") @ExcludeMissing audit: JsonField<Audit> = JsonMissing.of(),
        @JsonProperty("boosterSchedule")
        @ExcludeMissing
        boosterSchedule: JsonField<List<BoosterSchedule>> = JsonMissing.of(),
        @JsonProperty("veterinarian")
        @ExcludeMissing
        veterinarian: JsonField<Veterinarian> = JsonMissing.of(),
    ) : this(id, administeredAt, vaccine, audit, boosterSchedule, veterinarian, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun administeredAt(): OffsetDateTime = administeredAt.getRequired("administeredAt")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vaccine(): String = vaccine.getRequired("vaccine")

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
    fun boosterSchedule(): List<BoosterSchedule>? = boosterSchedule.getNullable("boosterSchedule")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun veterinarian(): Veterinarian? = veterinarian.getNullable("veterinarian")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [administeredAt].
     *
     * Unlike [administeredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("administeredAt")
    @ExcludeMissing
    fun _administeredAt(): JsonField<OffsetDateTime> = administeredAt

    /**
     * Returns the raw JSON value of [vaccine].
     *
     * Unlike [vaccine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaccine") @ExcludeMissing fun _vaccine(): JsonField<String> = vaccine

    /**
     * Returns the raw JSON value of [audit].
     *
     * Unlike [audit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audit") @ExcludeMissing fun _audit(): JsonField<Audit> = audit

    /**
     * Returns the raw JSON value of [boosterSchedule].
     *
     * Unlike [boosterSchedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boosterSchedule")
    @ExcludeMissing
    fun _boosterSchedule(): JsonField<List<BoosterSchedule>> = boosterSchedule

    /**
     * Returns the raw JSON value of [veterinarian].
     *
     * Unlike [veterinarian], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("veterinarian")
    @ExcludeMissing
    fun _veterinarian(): JsonField<Veterinarian> = veterinarian

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
         * Returns a mutable builder for constructing an instance of [VaccinationRecord].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .administeredAt()
         * .vaccine()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VaccinationRecord]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var administeredAt: JsonField<OffsetDateTime>? = null
        private var vaccine: JsonField<String>? = null
        private var audit: JsonField<Audit> = JsonMissing.of()
        private var boosterSchedule: JsonField<MutableList<BoosterSchedule>>? = null
        private var veterinarian: JsonField<Veterinarian> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vaccinationRecord: VaccinationRecord) = apply {
            id = vaccinationRecord.id
            administeredAt = vaccinationRecord.administeredAt
            vaccine = vaccinationRecord.vaccine
            audit = vaccinationRecord.audit
            boosterSchedule = vaccinationRecord.boosterSchedule.map { it.toMutableList() }
            veterinarian = vaccinationRecord.veterinarian
            additionalProperties = vaccinationRecord.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun administeredAt(administeredAt: OffsetDateTime) =
            administeredAt(JsonField.of(administeredAt))

        /**
         * Sets [Builder.administeredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.administeredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun administeredAt(administeredAt: JsonField<OffsetDateTime>) = apply {
            this.administeredAt = administeredAt
        }

        fun vaccine(vaccine: String) = vaccine(JsonField.of(vaccine))

        /**
         * Sets [Builder.vaccine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaccine] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vaccine(vaccine: JsonField<String>) = apply { this.vaccine = vaccine }

        /** Provenance stamp attached to records across unrelated resources. */
        fun audit(audit: Audit) = audit(JsonField.of(audit))

        /**
         * Sets [Builder.audit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audit] with a well-typed [Audit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audit(audit: JsonField<Audit>) = apply { this.audit = audit }

        fun boosterSchedule(boosterSchedule: List<BoosterSchedule>) =
            boosterSchedule(JsonField.of(boosterSchedule))

        /**
         * Sets [Builder.boosterSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boosterSchedule] with a well-typed
         * `List<BoosterSchedule>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun boosterSchedule(boosterSchedule: JsonField<List<BoosterSchedule>>) = apply {
            this.boosterSchedule = boosterSchedule.map { it.toMutableList() }
        }

        /**
         * Adds a single [BoosterSchedule] to [Builder.boosterSchedule].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBoosterSchedule(boosterSchedule: BoosterSchedule) = apply {
            this.boosterSchedule =
                (this.boosterSchedule ?: JsonField.of(mutableListOf())).also {
                    checkKnown("boosterSchedule", it).add(boosterSchedule)
                }
        }

        fun veterinarian(veterinarian: Veterinarian) = veterinarian(JsonField.of(veterinarian))

        /**
         * Sets [Builder.veterinarian] to an arbitrary JSON value.
         *
         * You should usually call [Builder.veterinarian] with a well-typed [Veterinarian] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun veterinarian(veterinarian: JsonField<Veterinarian>) = apply {
            this.veterinarian = veterinarian
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
         * Returns an immutable instance of [VaccinationRecord].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .administeredAt()
         * .vaccine()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VaccinationRecord =
            VaccinationRecord(
                checkRequired("id", id),
                checkRequired("administeredAt", administeredAt),
                checkRequired("vaccine", vaccine),
                audit,
                (boosterSchedule ?: JsonMissing.of()).map { it.toImmutable() },
                veterinarian,
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
    fun validate(): VaccinationRecord = apply {
        if (validated) {
            return@apply
        }

        id()
        administeredAt()
        vaccine()
        audit()?.validate()
        boosterSchedule()?.forEach { it.validate() }
        veterinarian()?.validate()
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
            (if (administeredAt.asKnown() == null) 0 else 1) +
            (if (vaccine.asKnown() == null) 0 else 1) +
            (audit.asKnown()?.validity() ?: 0) +
            (boosterSchedule.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (veterinarian.asKnown()?.validity() ?: 0)

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

    class BoosterSchedule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val due: JsonField<OffsetDateTime>,
        private val completed: JsonField<Boolean>,
        private val dose: JsonField<Dose>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("due") @ExcludeMissing due: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("completed")
            @ExcludeMissing
            completed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("dose") @ExcludeMissing dose: JsonField<Dose> = JsonMissing.of(),
        ) : this(due, completed, dose, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun due(): OffsetDateTime = due.getRequired("due")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun completed(): Boolean? = completed.getNullable("completed")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dose(): Dose? = dose.getNullable("dose")

        /**
         * Returns the raw JSON value of [due].
         *
         * Unlike [due], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due") @ExcludeMissing fun _due(): JsonField<OffsetDateTime> = due

        /**
         * Returns the raw JSON value of [completed].
         *
         * Unlike [completed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed") @ExcludeMissing fun _completed(): JsonField<Boolean> = completed

        /**
         * Returns the raw JSON value of [dose].
         *
         * Unlike [dose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dose") @ExcludeMissing fun _dose(): JsonField<Dose> = dose

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
             * Returns a mutable builder for constructing an instance of [BoosterSchedule].
             *
             * The following fields are required:
             * ```kotlin
             * .due()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BoosterSchedule]. */
        class Builder internal constructor() {

            private var due: JsonField<OffsetDateTime>? = null
            private var completed: JsonField<Boolean> = JsonMissing.of()
            private var dose: JsonField<Dose> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(boosterSchedule: BoosterSchedule) = apply {
                due = boosterSchedule.due
                completed = boosterSchedule.completed
                dose = boosterSchedule.dose
                additionalProperties = boosterSchedule.additionalProperties.toMutableMap()
            }

            fun due(due: OffsetDateTime) = due(JsonField.of(due))

            /**
             * Sets [Builder.due] to an arbitrary JSON value.
             *
             * You should usually call [Builder.due] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun due(due: JsonField<OffsetDateTime>) = apply { this.due = due }

            fun completed(completed: Boolean) = completed(JsonField.of(completed))

            /**
             * Sets [Builder.completed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completed(completed: JsonField<Boolean>) = apply { this.completed = completed }

            fun dose(dose: Dose) = dose(JsonField.of(dose))

            /**
             * Sets [Builder.dose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dose] with a well-typed [Dose] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dose(dose: JsonField<Dose>) = apply { this.dose = dose }

            /** Alias for calling [dose] with `Dose.ofDouble(double)`. */
            fun dose(double: Double) = dose(Dose.ofDouble(double))

            /** Alias for calling [dose] with `Dose.ofString(string)`. */
            fun dose(string: String) = dose(Dose.ofString(string))

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
             * Returns an immutable instance of [BoosterSchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .due()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BoosterSchedule =
                BoosterSchedule(
                    checkRequired("due", due),
                    completed,
                    dose,
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
        fun validate(): BoosterSchedule = apply {
            if (validated) {
                return@apply
            }

            due()
            completed()
            dose()?.validate()
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
            (if (due.asKnown() == null) 0 else 1) +
                (if (completed.asKnown() == null) 0 else 1) +
                (dose.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = Dose.Deserializer::class)
        @JsonSerialize(using = Dose.Serializer::class)
        class Dose
        private constructor(
            private val double: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun double(): Double? = double

            fun string(): String? = string

            fun isDouble(): Boolean = double != null

            fun isString(): Boolean = string != null

            fun asDouble(): Double = double.getOrThrow("double")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.hello_world_testingggg.api.core.JsonValue
             *
             * val result: String? = dose.accept(object : Dose.Visitor<String?> {
             *     override fun visitDouble(double: Double): String? = double.toString()
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
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): Dose = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDouble(double: Double) {}

                        override fun visitString(string: String) {}
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
                        override fun visitDouble(double: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dose && double == other.double && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(double, string)

            override fun toString(): String =
                when {
                    double != null -> "Dose{double=$double}"
                    string != null -> "Dose{string=$string}"
                    _json != null -> "Dose{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Dose")
                }

            companion object {

                fun ofDouble(double: Double) = Dose(double = double)

                fun ofString(string: String) = Dose(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Dose] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitDouble(double: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Dose] to a value of type [T].
                 *
                 * An instance of [Dose] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HelloWorldTestinggggInvalidDataException("Unknown Dose: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Dose>(Dose::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Dose {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Dose(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Dose(double = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Dose(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Dose>(Dose::class) {

                override fun serialize(
                    value: Dose,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.double != null -> generator.writeObject(value.double)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Dose")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BoosterSchedule &&
                due == other.due &&
                completed == other.completed &&
                dose == other.dose &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(due, completed, dose, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BoosterSchedule{due=$due, completed=$completed, dose=$dose, additionalProperties=$additionalProperties}"
    }

    class Veterinarian
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val license: JsonField<License>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("license") @ExcludeMissing license: JsonField<License> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(license, name, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun license(): License? = license.getNullable("license")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [license].
         *
         * Unlike [license], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("license") @ExcludeMissing fun _license(): JsonField<License> = license

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

            /** Returns a mutable builder for constructing an instance of [Veterinarian]. */
            fun builder() = Builder()
        }

        /** A builder for [Veterinarian]. */
        class Builder internal constructor() {

            private var license: JsonField<License> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(veterinarian: Veterinarian) = apply {
                license = veterinarian.license
                name = veterinarian.name
                additionalProperties = veterinarian.additionalProperties.toMutableMap()
            }

            fun license(license: License) = license(JsonField.of(license))

            /**
             * Sets [Builder.license] to an arbitrary JSON value.
             *
             * You should usually call [Builder.license] with a well-typed [License] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun license(license: JsonField<License>) = apply { this.license = license }

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
             * Returns an immutable instance of [Veterinarian].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Veterinarian =
                Veterinarian(license, name, additionalProperties.toMutableMap())
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
        fun validate(): Veterinarian = apply {
            if (validated) {
                return@apply
            }

            license()?.validate()
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
            (license.asKnown()?.validity() ?: 0) + (if (name.asKnown() == null) 0 else 1)

        class License
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val number: JsonField<String>,
            private val region: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("number")
                @ExcludeMissing
                number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            ) : this(number, region, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun number(): String? = number.getNullable("number")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun region(): String? = region.getNullable("region")

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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

                /** Returns a mutable builder for constructing an instance of [License]. */
                fun builder() = Builder()
            }

            /** A builder for [License]. */
            class Builder internal constructor() {

                private var number: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(license: License) = apply {
                    number = license.number
                    region = license.region
                    additionalProperties = license.additionalProperties.toMutableMap()
                }

                fun number(number: String) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

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
                 * Returns an immutable instance of [License].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): License = License(number, region, additionalProperties.toMutableMap())
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
            fun validate(): License = apply {
                if (validated) {
                    return@apply
                }

                number()
                region()
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
                (if (number.asKnown() == null) 0 else 1) + (if (region.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is License &&
                    number == other.number &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(number, region, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "License{number=$number, region=$region, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Veterinarian &&
                license == other.license &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(license, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Veterinarian{license=$license, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaccinationRecord &&
            id == other.id &&
            administeredAt == other.administeredAt &&
            vaccine == other.vaccine &&
            audit == other.audit &&
            boosterSchedule == other.boosterSchedule &&
            veterinarian == other.veterinarian &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            administeredAt,
            vaccine,
            audit,
            boosterSchedule,
            veterinarian,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaccinationRecord{id=$id, administeredAt=$administeredAt, vaccine=$vaccine, audit=$audit, boosterSchedule=$boosterSchedule, veterinarian=$veterinarian, additionalProperties=$additionalProperties}"
}
