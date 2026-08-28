// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.store.reports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class DailyInventory
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val metrics: JsonValue,
    private val notes: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonValue = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<List<String>> = JsonMissing.of(),
    ) : this(date, metrics, notes, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = dailyInventory.metrics().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonValue = metrics

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun notes(): List<String>? = notes.getNullable("notes")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<List<String>> = notes

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
         * Returns a mutable builder for constructing an instance of [DailyInventory].
         *
         * The following fields are required:
         * ```kotlin
         * .date()
         * .metrics()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DailyInventory]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var metrics: JsonValue? = null
        private var notes: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dailyInventory: DailyInventory) = apply {
            date = dailyInventory.date
            metrics = dailyInventory.metrics
            notes = dailyInventory.notes.map { it.toMutableList() }
            additionalProperties = dailyInventory.additionalProperties.toMutableMap()
        }

        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        fun metrics(metrics: JsonValue) = apply { this.metrics = metrics }

        fun notes(notes: List<String>?) = notes(JsonField.ofNullable(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notes(notes: JsonField<List<String>>) = apply {
            this.notes = notes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [notes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNote(note: String) = apply {
            notes =
                (notes ?: JsonField.of(mutableListOf())).also { checkKnown("notes", it).add(note) }
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
         * Returns an immutable instance of [DailyInventory].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .date()
         * .metrics()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DailyInventory =
            DailyInventory(
                checkRequired("date", date),
                checkRequired("metrics", metrics),
                (notes ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): DailyInventory = apply {
        if (validated) {
            return@apply
        }

        date()
        notes()
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
        (if (date.asKnown() == null) 0 else 1) + (notes.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DailyInventory &&
            date == other.date &&
            metrics == other.metrics &&
            notes == other.notes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(date, metrics, notes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DailyInventory{date=$date, metrics=$metrics, notes=$notes, additionalProperties=$additionalProperties}"
}
