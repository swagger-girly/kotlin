// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.adoptions.policies

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
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import com.hello_world_testingggg.api.models.Money
import java.util.Collections
import java.util.Objects

/**
 * Creates an adoption policy from a set of eligibility rules, regional overrides, and an optional
 * escalation rule group.
 */
class PolicyCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): List<AdoptionRule> = body.rules()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun escalation(): Escalation? = body.escalation()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun feeCap(): Money? = body.feeCap()

    /**
     * Where policy decisions are delivered: a plain email address or a webhook sink.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun notificationTarget(): NotificationTarget? = body.notificationTarget()

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun regionalOverrides(): RegionalOverrides? = body.regionalOverrides()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rules(): JsonField<List<AdoptionRule>> = body._rules()

    /**
     * Returns the raw JSON value of [escalation].
     *
     * Unlike [escalation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _escalation(): JsonField<Escalation> = body._escalation()

    /**
     * Returns the raw JSON value of [feeCap].
     *
     * Unlike [feeCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feeCap(): JsonField<Money> = body._feeCap()

    /**
     * Returns the raw JSON value of [notificationTarget].
     *
     * Unlike [notificationTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _notificationTarget(): JsonField<NotificationTarget> = body._notificationTarget()

    /**
     * Returns the raw JSON value of [regionalOverrides].
     *
     * Unlike [regionalOverrides], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _regionalOverrides(): JsonField<RegionalOverrides> = body._regionalOverrides()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolicyCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .rules()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PolicyCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(policyCreateParams: PolicyCreateParams) = apply {
            body = policyCreateParams.body.toBuilder()
            additionalHeaders = policyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = policyCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [rules]
         * - [escalation]
         * - [feeCap]
         * - [notificationTarget]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun rules(rules: List<AdoptionRule>) = apply { body.rules(rules) }

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<AdoptionRule>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rules(rules: JsonField<List<AdoptionRule>>) = apply { body.rules(rules) }

        /**
         * Adds a single [AdoptionRule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: AdoptionRule) = apply { body.addRule(rule) }

        fun escalation(escalation: Escalation) = apply { body.escalation(escalation) }

        /**
         * Sets [Builder.escalation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.escalation] with a well-typed [Escalation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun escalation(escalation: JsonField<Escalation>) = apply { body.escalation(escalation) }

        fun feeCap(feeCap: Money) = apply { body.feeCap(feeCap) }

        /**
         * Sets [Builder.feeCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeCap] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feeCap(feeCap: JsonField<Money>) = apply { body.feeCap(feeCap) }

        /** Where policy decisions are delivered: a plain email address or a webhook sink. */
        fun notificationTarget(notificationTarget: NotificationTarget) = apply {
            body.notificationTarget(notificationTarget)
        }

        /**
         * Sets [Builder.notificationTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationTarget] with a well-typed
         * [NotificationTarget] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun notificationTarget(notificationTarget: JsonField<NotificationTarget>) = apply {
            body.notificationTarget(notificationTarget)
        }

        /** Alias for calling [notificationTarget] with `NotificationTarget.ofEmail(email)`. */
        fun notificationTarget(email: String) = apply { body.notificationTarget(email) }

        /**
         * Alias for calling [notificationTarget] with
         * `NotificationTarget.ofWebhookSink(webhookSink)`.
         */
        fun notificationTarget(webhookSink: NotificationTarget.WebhookSink) = apply {
            body.notificationTarget(webhookSink)
        }

        fun regionalOverrides(regionalOverrides: RegionalOverrides) = apply {
            body.regionalOverrides(regionalOverrides)
        }

        /**
         * Sets [Builder.regionalOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionalOverrides] with a well-typed [RegionalOverrides]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun regionalOverrides(regionalOverrides: JsonField<RegionalOverrides>) = apply {
            body.regionalOverrides(regionalOverrides)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PolicyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .rules()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PolicyCreateParams =
            PolicyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val rules: JsonField<List<AdoptionRule>>,
        private val escalation: JsonField<Escalation>,
        private val feeCap: JsonField<Money>,
        private val notificationTarget: JsonField<NotificationTarget>,
        private val regionalOverrides: JsonField<RegionalOverrides>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rules")
            @ExcludeMissing
            rules: JsonField<List<AdoptionRule>> = JsonMissing.of(),
            @JsonProperty("escalation")
            @ExcludeMissing
            escalation: JsonField<Escalation> = JsonMissing.of(),
            @JsonProperty("feeCap") @ExcludeMissing feeCap: JsonField<Money> = JsonMissing.of(),
            @JsonProperty("notificationTarget")
            @ExcludeMissing
            notificationTarget: JsonField<NotificationTarget> = JsonMissing.of(),
            @JsonProperty("regionalOverrides")
            @ExcludeMissing
            regionalOverrides: JsonField<RegionalOverrides> = JsonMissing.of(),
        ) : this(
            name,
            rules,
            escalation,
            feeCap,
            notificationTarget,
            regionalOverrides,
            mutableMapOf(),
        )

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
        fun rules(): List<AdoptionRule> = rules.getRequired("rules")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun escalation(): Escalation? = escalation.getNullable("escalation")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun feeCap(): Money? = feeCap.getNullable("feeCap")

        /**
         * Where policy decisions are delivered: a plain email address or a webhook sink.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notificationTarget(): NotificationTarget? =
            notificationTarget.getNullable("notificationTarget")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun regionalOverrides(): RegionalOverrides? =
            regionalOverrides.getNullable("regionalOverrides")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [rules].
         *
         * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<AdoptionRule>> = rules

        /**
         * Returns the raw JSON value of [escalation].
         *
         * Unlike [escalation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("escalation")
        @ExcludeMissing
        fun _escalation(): JsonField<Escalation> = escalation

        /**
         * Returns the raw JSON value of [feeCap].
         *
         * Unlike [feeCap], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feeCap") @ExcludeMissing fun _feeCap(): JsonField<Money> = feeCap

        /**
         * Returns the raw JSON value of [notificationTarget].
         *
         * Unlike [notificationTarget], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notificationTarget")
        @ExcludeMissing
        fun _notificationTarget(): JsonField<NotificationTarget> = notificationTarget

        /**
         * Returns the raw JSON value of [regionalOverrides].
         *
         * Unlike [regionalOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("regionalOverrides")
        @ExcludeMissing
        fun _regionalOverrides(): JsonField<RegionalOverrides> = regionalOverrides

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .rules()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var rules: JsonField<MutableList<AdoptionRule>>? = null
            private var escalation: JsonField<Escalation> = JsonMissing.of()
            private var feeCap: JsonField<Money> = JsonMissing.of()
            private var notificationTarget: JsonField<NotificationTarget> = JsonMissing.of()
            private var regionalOverrides: JsonField<RegionalOverrides> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                rules = body.rules.map { it.toMutableList() }
                escalation = body.escalation
                feeCap = body.feeCap
                notificationTarget = body.notificationTarget
                regionalOverrides = body.regionalOverrides
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun rules(rules: List<AdoptionRule>) = rules(JsonField.of(rules))

            /**
             * Sets [Builder.rules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rules] with a well-typed `List<AdoptionRule>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rules(rules: JsonField<List<AdoptionRule>>) = apply {
                this.rules = rules.map { it.toMutableList() }
            }

            /**
             * Adds a single [AdoptionRule] to [rules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRule(rule: AdoptionRule) = apply {
                rules =
                    (rules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rules", it).add(rule)
                    }
            }

            fun escalation(escalation: Escalation) = escalation(JsonField.of(escalation))

            /**
             * Sets [Builder.escalation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.escalation] with a well-typed [Escalation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun escalation(escalation: JsonField<Escalation>) = apply {
                this.escalation = escalation
            }

            fun feeCap(feeCap: Money) = feeCap(JsonField.of(feeCap))

            /**
             * Sets [Builder.feeCap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feeCap] with a well-typed [Money] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feeCap(feeCap: JsonField<Money>) = apply { this.feeCap = feeCap }

            /** Where policy decisions are delivered: a plain email address or a webhook sink. */
            fun notificationTarget(notificationTarget: NotificationTarget) =
                notificationTarget(JsonField.of(notificationTarget))

            /**
             * Sets [Builder.notificationTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notificationTarget] with a well-typed
             * [NotificationTarget] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun notificationTarget(notificationTarget: JsonField<NotificationTarget>) = apply {
                this.notificationTarget = notificationTarget
            }

            /** Alias for calling [notificationTarget] with `NotificationTarget.ofEmail(email)`. */
            fun notificationTarget(email: String) =
                notificationTarget(NotificationTarget.ofEmail(email))

            /**
             * Alias for calling [notificationTarget] with
             * `NotificationTarget.ofWebhookSink(webhookSink)`.
             */
            fun notificationTarget(webhookSink: NotificationTarget.WebhookSink) =
                notificationTarget(NotificationTarget.ofWebhookSink(webhookSink))

            fun regionalOverrides(regionalOverrides: RegionalOverrides) =
                regionalOverrides(JsonField.of(regionalOverrides))

            /**
             * Sets [Builder.regionalOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionalOverrides] with a well-typed
             * [RegionalOverrides] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun regionalOverrides(regionalOverrides: JsonField<RegionalOverrides>) = apply {
                this.regionalOverrides = regionalOverrides
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .rules()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("rules", rules).map { it.toImmutable() },
                    escalation,
                    feeCap,
                    notificationTarget,
                    regionalOverrides,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            rules().forEach { it.validate() }
            escalation()?.validate()
            feeCap()?.validate()
            notificationTarget()?.validate()
            regionalOverrides()?.validate()
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
                (rules.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (escalation.asKnown()?.validity() ?: 0) +
                (feeCap.asKnown()?.validity() ?: 0) +
                (notificationTarget.asKnown()?.validity() ?: 0) +
                (regionalOverrides.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                rules == other.rules &&
                escalation == other.escalation &&
                feeCap == other.feeCap &&
                notificationTarget == other.notificationTarget &&
                regionalOverrides == other.regionalOverrides &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                rules,
                escalation,
                feeCap,
                notificationTarget,
                regionalOverrides,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, rules=$rules, escalation=$escalation, feeCap=$feeCap, notificationTarget=$notificationTarget, regionalOverrides=$regionalOverrides, additionalProperties=$additionalProperties}"
    }

    class Escalation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val operator: JsonField<Operator>,
        private val groups: JsonField<List<JsonValue>>,
        private val rules: JsonField<List<AdoptionRule>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("groups")
            @ExcludeMissing
            groups: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("rules")
            @ExcludeMissing
            rules: JsonField<List<AdoptionRule>> = JsonMissing.of(),
        ) : this(operator, groups, rules, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun operator(): Operator = operator.getRequired("operator")

        /**
         * Nested rule groups; groups can recurse arbitrarily deep.
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groups(): List<JsonValue>? = groups.getNullable("groups")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rules(): List<AdoptionRule>? = rules.getNullable("rules")

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [groups].
         *
         * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<JsonValue>> = groups

        /**
         * Returns the raw JSON value of [rules].
         *
         * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<AdoptionRule>> = rules

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
             * Returns a mutable builder for constructing an instance of [Escalation].
             *
             * The following fields are required:
             * ```kotlin
             * .operator()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Escalation]. */
        class Builder internal constructor() {

            private var operator: JsonField<Operator>? = null
            private var groups: JsonField<MutableList<JsonValue>>? = null
            private var rules: JsonField<MutableList<AdoptionRule>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(escalation: Escalation) = apply {
                operator = escalation.operator
                groups = escalation.groups.map { it.toMutableList() }
                rules = escalation.rules.map { it.toMutableList() }
                additionalProperties = escalation.additionalProperties.toMutableMap()
            }

            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** Nested rule groups; groups can recurse arbitrarily deep. */
            fun groups(groups: List<JsonValue>) = groups(JsonField.of(groups))

            /**
             * Sets [Builder.groups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groups] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groups(groups: JsonField<List<JsonValue>>) = apply {
                this.groups = groups.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [groups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroup(group: JsonValue) = apply {
                groups =
                    (groups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groups", it).add(group)
                    }
            }

            fun rules(rules: List<AdoptionRule>) = rules(JsonField.of(rules))

            /**
             * Sets [Builder.rules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rules] with a well-typed `List<AdoptionRule>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rules(rules: JsonField<List<AdoptionRule>>) = apply {
                this.rules = rules.map { it.toMutableList() }
            }

            /**
             * Adds a single [AdoptionRule] to [rules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRule(rule: AdoptionRule) = apply {
                rules =
                    (rules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rules", it).add(rule)
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
             * Returns an immutable instance of [Escalation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .operator()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Escalation =
                Escalation(
                    checkRequired("operator", operator),
                    (groups ?: JsonMissing.of()).map { it.toImmutable() },
                    (rules ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Escalation = apply {
            if (validated) {
                return@apply
            }

            operator().validate()
            groups()
            rules()?.forEach { it.validate() }
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
            (operator.asKnown()?.validity() ?: 0) +
                (groups.asKnown()?.size ?: 0) +
                (rules.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ALL = of("ALL")

                val ANY = of("ANY")

                fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                ALL,
                ANY,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALL,
                ANY,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
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
                    ALL -> Value.ALL
                    ANY -> Value.ANY
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
                    ALL -> Known.ALL
                    ANY -> Known.ANY
                    else ->
                        throw HelloWorldTestinggggInvalidDataException("Unknown Operator: $value")
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
            fun validate(): Operator = apply {
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

                return other is Operator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Escalation &&
                operator == other.operator &&
                groups == other.groups &&
                rules == other.rules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(operator, groups, rules, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Escalation{operator=$operator, groups=$groups, rules=$rules, additionalProperties=$additionalProperties}"
    }

    /** Where policy decisions are delivered: a plain email address or a webhook sink. */
    @JsonDeserialize(using = NotificationTarget.Deserializer::class)
    @JsonSerialize(using = NotificationTarget.Serializer::class)
    class NotificationTarget
    private constructor(
        private val email: String? = null,
        private val webhookSink: WebhookSink? = null,
        private val _json: JsonValue? = null,
    ) {

        /** An email address to notify. */
        fun email(): String? = email

        fun webhookSink(): WebhookSink? = webhookSink

        fun isEmail(): Boolean = email != null

        fun isWebhookSink(): Boolean = webhookSink != null

        /** An email address to notify. */
        fun asEmail(): String = email.getOrThrow("email")

        fun asWebhookSink(): WebhookSink = webhookSink.getOrThrow("webhookSink")

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
         * val result: String? = notificationTarget.accept(object : NotificationTarget.Visitor<String?> {
         *     override fun visitEmail(email: String): String? = email.toString()
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
                email != null -> visitor.visitEmail(email)
                webhookSink != null -> visitor.visitWebhookSink(webhookSink)
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
        fun validate(): NotificationTarget = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitEmail(email: String) {}

                    override fun visitWebhookSink(webhookSink: WebhookSink) {
                        webhookSink.validate()
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
                    override fun visitEmail(email: String) = 1

                    override fun visitWebhookSink(webhookSink: WebhookSink) = webhookSink.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NotificationTarget &&
                email == other.email &&
                webhookSink == other.webhookSink
        }

        override fun hashCode(): Int = Objects.hash(email, webhookSink)

        override fun toString(): String =
            when {
                email != null -> "NotificationTarget{email=$email}"
                webhookSink != null -> "NotificationTarget{webhookSink=$webhookSink}"
                _json != null -> "NotificationTarget{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid NotificationTarget")
            }

        companion object {

            /** An email address to notify. */
            fun ofEmail(email: String) = NotificationTarget(email = email)

            fun ofWebhookSink(webhookSink: WebhookSink) =
                NotificationTarget(webhookSink = webhookSink)
        }

        /**
         * An interface that defines how to map each variant of [NotificationTarget] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            /** An email address to notify. */
            fun visitEmail(email: String): T

            fun visitWebhookSink(webhookSink: WebhookSink): T

            /**
             * Maps an unknown variant of [NotificationTarget] to a value of type [T].
             *
             * An instance of [NotificationTarget] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HelloWorldTestinggggInvalidDataException("Unknown NotificationTarget: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<NotificationTarget>(NotificationTarget::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): NotificationTarget {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<WebhookSink>())?.let {
                                NotificationTarget(webhookSink = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                NotificationTarget(email = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> NotificationTarget(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<NotificationTarget>(NotificationTarget::class) {

            override fun serialize(
                value: NotificationTarget,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.email != null -> generator.writeObject(value.email)
                    value.webhookSink != null -> generator.writeObject(value.webhookSink)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid NotificationTarget")
                }
            }
        }

        class WebhookSink
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val events: JsonField<List<Event>>,
            private val secret: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("events")
                @ExcludeMissing
                events: JsonField<List<Event>> = JsonMissing.of(),
                @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
            ) : this(url, events, secret, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun events(): List<Event>? = events.getNullable("events")

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun secret(): String? = secret.getNullable("secret")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [events].
             *
             * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

            /**
             * Returns the raw JSON value of [secret].
             *
             * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
                 * Returns a mutable builder for constructing an instance of [WebhookSink].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .url()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [WebhookSink]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var events: JsonField<MutableList<Event>>? = null
                private var secret: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(webhookSink: WebhookSink) = apply {
                    url = webhookSink.url
                    events = webhookSink.events.map { it.toMutableList() }
                    secret = webhookSink.secret
                    additionalProperties = webhookSink.additionalProperties.toMutableMap()
                }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun events(events: List<Event>) = events(JsonField.of(events))

                /**
                 * Sets [Builder.events] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.events] with a well-typed `List<Event>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun events(events: JsonField<List<Event>>) = apply {
                    this.events = events.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Event] to [events].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEvent(event: Event) = apply {
                    events =
                        (events ?: JsonField.of(mutableListOf())).also {
                            checkKnown("events", it).add(event)
                        }
                }

                fun secret(secret: String) = secret(JsonField.of(secret))

                /**
                 * Sets [Builder.secret] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secret] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
                 * Returns an immutable instance of [WebhookSink].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WebhookSink =
                    WebhookSink(
                        checkRequired("url", url),
                        (events ?: JsonMissing.of()).map { it.toImmutable() },
                        secret,
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
            fun validate(): WebhookSink = apply {
                if (validated) {
                    return@apply
                }

                url()
                events()?.forEach { it.validate() }
                secret()
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
                (if (url.asKnown() == null) 0 else 1) +
                    (events.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (secret.asKnown() == null) 0 else 1)

            class Event @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val APPROVED = of("approved")

                    val REJECTED = of("rejected")

                    val ESCALATED = of("escalated")

                    fun of(value: String) = Event(JsonField.of(value))
                }

                /** An enum containing [Event]'s known values. */
                enum class Known {
                    APPROVED,
                    REJECTED,
                    ESCALATED,
                }

                /**
                 * An enum containing [Event]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Event] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPROVED,
                    REJECTED,
                    ESCALATED,
                    /**
                     * An enum member indicating that [Event] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        APPROVED -> Value.APPROVED
                        REJECTED -> Value.REJECTED
                        ESCALATED -> Value.ESCALATED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   is a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        APPROVED -> Known.APPROVED
                        REJECTED -> Known.REJECTED
                        ESCALATED -> Known.ESCALATED
                        else ->
                            throw HelloWorldTestinggggInvalidDataException("Unknown Event: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HelloWorldTestinggggInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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
                fun validate(): Event = apply {
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

                    return other is Event && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WebhookSink &&
                    url == other.url &&
                    events == other.events &&
                    secret == other.secret &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(url, events, secret, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WebhookSink{url=$url, events=$events, secret=$secret, additionalProperties=$additionalProperties}"
        }
    }

    class RegionalOverrides
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RegionalOverrides]. */
            fun builder() = Builder()
        }

        /** A builder for [RegionalOverrides]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(regionalOverrides: RegionalOverrides) = apply {
                additionalProperties = regionalOverrides.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RegionalOverrides].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RegionalOverrides = RegionalOverrides(additionalProperties.toImmutable())
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
        fun validate(): RegionalOverrides = apply {
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
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RegionalOverrides && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RegionalOverrides{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolicyCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PolicyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
