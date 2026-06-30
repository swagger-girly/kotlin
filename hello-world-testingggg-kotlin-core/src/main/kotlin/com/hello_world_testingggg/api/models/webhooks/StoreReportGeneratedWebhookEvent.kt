// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.webhooks

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
import com.hello_world_testingggg.api.models.store.reports.Report
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class StoreReportGeneratedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val metrics: JsonValue,
    private val report: JsonField<Report>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonValue = JsonMissing.of(),
        @JsonProperty("report") @ExcludeMissing report: JsonField<Report> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(id, createdAt, metrics, report, type, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = storeReportGeneratedWebhookEvent.metrics().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonValue = metrics

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun report(): Report = report.getRequired("report")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("store.report.generated")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [report].
     *
     * Unlike [report], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report") @ExcludeMissing fun _report(): JsonField<Report> = report

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
         * [StoreReportGeneratedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .metrics()
         * .report()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [StoreReportGeneratedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var metrics: JsonValue? = null
        private var report: JsonField<Report>? = null
        private var type: JsonValue = JsonValue.from("store.report.generated")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(storeReportGeneratedWebhookEvent: StoreReportGeneratedWebhookEvent) =
            apply {
                id = storeReportGeneratedWebhookEvent.id
                createdAt = storeReportGeneratedWebhookEvent.createdAt
                metrics = storeReportGeneratedWebhookEvent.metrics
                report = storeReportGeneratedWebhookEvent.report
                type = storeReportGeneratedWebhookEvent.type
                additionalProperties =
                    storeReportGeneratedWebhookEvent.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun metrics(metrics: JsonValue) = apply { this.metrics = metrics }

        fun report(report: Report) = report(JsonField.of(report))

        /**
         * Sets [Builder.report] to an arbitrary JSON value.
         *
         * You should usually call [Builder.report] with a well-typed [Report] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun report(report: JsonField<Report>) = apply { this.report = report }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("store.report.generated")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [StoreReportGeneratedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .metrics()
         * .report()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StoreReportGeneratedWebhookEvent =
            StoreReportGeneratedWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("metrics", metrics),
                checkRequired("report", report),
                type,
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
    fun validate(): StoreReportGeneratedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        report().validate()
        _type().let {
            if (it != JsonValue.from("store.report.generated")) {
                throw HelloWorldTestinggggInvalidDataException("'type' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (report.asKnown()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("store.report.generated")) 1 else 0 }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StoreReportGeneratedWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            metrics == other.metrics &&
            report == other.report &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, metrics, report, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StoreReportGeneratedWebhookEvent{id=$id, createdAt=$createdAt, metrics=$metrics, report=$report, type=$type, additionalProperties=$additionalProperties}"
}
