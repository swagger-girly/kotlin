// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.Enum
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Casing probe replicating context.dev: glued AIAI prefix (resource ai + method ai_query) over
 * plural and non-plural synthesized element mints
 */
class AiAiQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Non-plural array property: singularization is a no-op (decisive probe)
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataToExtract(): List<DataToExtract> = body.dataToExtract()

    /**
     * The domain name to analyze
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = body.domain()

    /**
     * Digit-seam acronym parent for nested element mints
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun authentication3ds(): Authentication3ds? = body.authentication3ds()

    /**
     * Non-plural map property with enum values (map-mint probe)
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun datapointObjectSchema(): DatapointObjectSchema? = body.datapointObjectSchema()

    /**
     * Plural array property: singularized element mint (control probe)
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun extractionRules(): List<ExtractionRule>? = body.extractionRules()

    /**
     * Returns the raw JSON value of [dataToExtract].
     *
     * Unlike [dataToExtract], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataToExtract(): JsonField<List<DataToExtract>> = body._dataToExtract()

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _domain(): JsonField<String> = body._domain()

    /**
     * Returns the raw JSON value of [authentication3ds].
     *
     * Unlike [authentication3ds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _authentication3ds(): JsonField<Authentication3ds> = body._authentication3ds()

    /**
     * Returns the raw JSON value of [datapointObjectSchema].
     *
     * Unlike [datapointObjectSchema], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _datapointObjectSchema(): JsonField<DatapointObjectSchema> = body._datapointObjectSchema()

    /**
     * Returns the raw JSON value of [extractionRules].
     *
     * Unlike [extractionRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extractionRules(): JsonField<List<ExtractionRule>> = body._extractionRules()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiAiQueryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .dataToExtract()
         * .domain()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AiAiQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(aiAiQueryParams: AiAiQueryParams) = apply {
            body = aiAiQueryParams.body.toBuilder()
            additionalHeaders = aiAiQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiAiQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dataToExtract]
         * - [domain]
         * - [authentication3ds]
         * - [datapointObjectSchema]
         * - [extractionRules]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Non-plural array property: singularization is a no-op (decisive probe) */
        fun dataToExtract(dataToExtract: List<DataToExtract>) = apply {
            body.dataToExtract(dataToExtract)
        }

        /**
         * Sets [Builder.dataToExtract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataToExtract] with a well-typed `List<DataToExtract>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataToExtract(dataToExtract: JsonField<List<DataToExtract>>) = apply {
            body.dataToExtract(dataToExtract)
        }

        /**
         * Adds a single [DataToExtract] to [Builder.dataToExtract].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataToExtract(dataToExtract: DataToExtract) = apply {
            body.addDataToExtract(dataToExtract)
        }

        /** The domain name to analyze */
        fun domain(domain: String) = apply { body.domain(domain) }

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { body.domain(domain) }

        /** Digit-seam acronym parent for nested element mints */
        fun authentication3ds(authentication3ds: Authentication3ds) = apply {
            body.authentication3ds(authentication3ds)
        }

        /**
         * Sets [Builder.authentication3ds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authentication3ds] with a well-typed [Authentication3ds]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authentication3ds(authentication3ds: JsonField<Authentication3ds>) = apply {
            body.authentication3ds(authentication3ds)
        }

        /** Non-plural map property with enum values (map-mint probe) */
        fun datapointObjectSchema(datapointObjectSchema: DatapointObjectSchema) = apply {
            body.datapointObjectSchema(datapointObjectSchema)
        }

        /**
         * Sets [Builder.datapointObjectSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datapointObjectSchema] with a well-typed
         * [DatapointObjectSchema] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun datapointObjectSchema(datapointObjectSchema: JsonField<DatapointObjectSchema>) = apply {
            body.datapointObjectSchema(datapointObjectSchema)
        }

        /** Plural array property: singularized element mint (control probe) */
        fun extractionRules(extractionRules: List<ExtractionRule>) = apply {
            body.extractionRules(extractionRules)
        }

        /**
         * Sets [Builder.extractionRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extractionRules] with a well-typed
         * `List<ExtractionRule>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun extractionRules(extractionRules: JsonField<List<ExtractionRule>>) = apply {
            body.extractionRules(extractionRules)
        }

        /**
         * Adds a single [ExtractionRule] to [extractionRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExtractionRule(extractionRule: ExtractionRule) = apply {
            body.addExtractionRule(extractionRule)
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
         * Returns an immutable instance of [AiAiQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .dataToExtract()
         * .domain()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiAiQueryParams =
            AiAiQueryParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataToExtract: JsonField<List<DataToExtract>>,
        private val domain: JsonField<String>,
        private val authentication3ds: JsonField<Authentication3ds>,
        private val datapointObjectSchema: JsonField<DatapointObjectSchema>,
        private val extractionRules: JsonField<List<ExtractionRule>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_to_extract")
            @ExcludeMissing
            dataToExtract: JsonField<List<DataToExtract>> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authentication_3ds")
            @ExcludeMissing
            authentication3ds: JsonField<Authentication3ds> = JsonMissing.of(),
            @JsonProperty("datapoint_object_schema")
            @ExcludeMissing
            datapointObjectSchema: JsonField<DatapointObjectSchema> = JsonMissing.of(),
            @JsonProperty("extraction_rules")
            @ExcludeMissing
            extractionRules: JsonField<List<ExtractionRule>> = JsonMissing.of(),
        ) : this(
            dataToExtract,
            domain,
            authentication3ds,
            datapointObjectSchema,
            extractionRules,
            mutableMapOf(),
        )

        /**
         * Non-plural array property: singularization is a no-op (decisive probe)
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataToExtract(): List<DataToExtract> = dataToExtract.getRequired("data_to_extract")

        /**
         * The domain name to analyze
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun domain(): String = domain.getRequired("domain")

        /**
         * Digit-seam acronym parent for nested element mints
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun authentication3ds(): Authentication3ds? =
            authentication3ds.getNullable("authentication_3ds")

        /**
         * Non-plural map property with enum values (map-mint probe)
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun datapointObjectSchema(): DatapointObjectSchema? =
            datapointObjectSchema.getNullable("datapoint_object_schema")

        /**
         * Plural array property: singularized element mint (control probe)
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extractionRules(): List<ExtractionRule>? =
            extractionRules.getNullable("extraction_rules")

        /**
         * Returns the raw JSON value of [dataToExtract].
         *
         * Unlike [dataToExtract], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("data_to_extract")
        @ExcludeMissing
        fun _dataToExtract(): JsonField<List<DataToExtract>> = dataToExtract

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [authentication3ds].
         *
         * Unlike [authentication3ds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authentication_3ds")
        @ExcludeMissing
        fun _authentication3ds(): JsonField<Authentication3ds> = authentication3ds

        /**
         * Returns the raw JSON value of [datapointObjectSchema].
         *
         * Unlike [datapointObjectSchema], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("datapoint_object_schema")
        @ExcludeMissing
        fun _datapointObjectSchema(): JsonField<DatapointObjectSchema> = datapointObjectSchema

        /**
         * Returns the raw JSON value of [extractionRules].
         *
         * Unlike [extractionRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extraction_rules")
        @ExcludeMissing
        fun _extractionRules(): JsonField<List<ExtractionRule>> = extractionRules

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
             * .dataToExtract()
             * .domain()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dataToExtract: JsonField<MutableList<DataToExtract>>? = null
            private var domain: JsonField<String>? = null
            private var authentication3ds: JsonField<Authentication3ds> = JsonMissing.of()
            private var datapointObjectSchema: JsonField<DatapointObjectSchema> = JsonMissing.of()
            private var extractionRules: JsonField<MutableList<ExtractionRule>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                dataToExtract = body.dataToExtract.map { it.toMutableList() }
                domain = body.domain
                authentication3ds = body.authentication3ds
                datapointObjectSchema = body.datapointObjectSchema
                extractionRules = body.extractionRules.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Non-plural array property: singularization is a no-op (decisive probe) */
            fun dataToExtract(dataToExtract: List<DataToExtract>) =
                dataToExtract(JsonField.of(dataToExtract))

            /**
             * Sets [Builder.dataToExtract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataToExtract] with a well-typed
             * `List<DataToExtract>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dataToExtract(dataToExtract: JsonField<List<DataToExtract>>) = apply {
                this.dataToExtract = dataToExtract.map { it.toMutableList() }
            }

            /**
             * Adds a single [DataToExtract] to [Builder.dataToExtract].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDataToExtract(dataToExtract: DataToExtract) = apply {
                this.dataToExtract =
                    (this.dataToExtract ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dataToExtract", it).add(dataToExtract)
                    }
            }

            /** The domain name to analyze */
            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** Digit-seam acronym parent for nested element mints */
            fun authentication3ds(authentication3ds: Authentication3ds) =
                authentication3ds(JsonField.of(authentication3ds))

            /**
             * Sets [Builder.authentication3ds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authentication3ds] with a well-typed
             * [Authentication3ds] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun authentication3ds(authentication3ds: JsonField<Authentication3ds>) = apply {
                this.authentication3ds = authentication3ds
            }

            /** Non-plural map property with enum values (map-mint probe) */
            fun datapointObjectSchema(datapointObjectSchema: DatapointObjectSchema) =
                datapointObjectSchema(JsonField.of(datapointObjectSchema))

            /**
             * Sets [Builder.datapointObjectSchema] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointObjectSchema] with a well-typed
             * [DatapointObjectSchema] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun datapointObjectSchema(datapointObjectSchema: JsonField<DatapointObjectSchema>) =
                apply {
                    this.datapointObjectSchema = datapointObjectSchema
                }

            /** Plural array property: singularized element mint (control probe) */
            fun extractionRules(extractionRules: List<ExtractionRule>) =
                extractionRules(JsonField.of(extractionRules))

            /**
             * Sets [Builder.extractionRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extractionRules] with a well-typed
             * `List<ExtractionRule>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun extractionRules(extractionRules: JsonField<List<ExtractionRule>>) = apply {
                this.extractionRules = extractionRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [ExtractionRule] to [extractionRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExtractionRule(extractionRule: ExtractionRule) = apply {
                extractionRules =
                    (extractionRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("extractionRules", it).add(extractionRule)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .dataToExtract()
             * .domain()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("dataToExtract", dataToExtract).map { it.toImmutable() },
                    checkRequired("domain", domain),
                    authentication3ds,
                    datapointObjectSchema,
                    (extractionRules ?: JsonMissing.of()).map { it.toImmutable() },
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

            dataToExtract().forEach { it.validate() }
            domain()
            authentication3ds()?.validate()
            datapointObjectSchema()?.validate()
            extractionRules()?.forEach { it.validate() }
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
            (dataToExtract.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (domain.asKnown() == null) 0 else 1) +
                (authentication3ds.asKnown()?.validity() ?: 0) +
                (datapointObjectSchema.asKnown()?.validity() ?: 0) +
                (extractionRules.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dataToExtract == other.dataToExtract &&
                domain == other.domain &&
                authentication3ds == other.authentication3ds &&
                datapointObjectSchema == other.datapointObjectSchema &&
                extractionRules == other.extractionRules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dataToExtract,
                domain,
                authentication3ds,
                datapointObjectSchema,
                extractionRules,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dataToExtract=$dataToExtract, domain=$domain, authentication3ds=$authentication3ds, datapointObjectSchema=$datapointObjectSchema, extractionRules=$extractionRules, additionalProperties=$additionalProperties}"
    }

    class DataToExtract
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val datapointName: JsonField<String>,
        private val datapointType: JsonField<DatapointType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("datapoint_name")
            @ExcludeMissing
            datapointName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("datapoint_type")
            @ExcludeMissing
            datapointType: JsonField<DatapointType> = JsonMissing.of(),
        ) : this(datapointName, datapointType, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun datapointName(): String = datapointName.getRequired("datapoint_name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun datapointType(): DatapointType? = datapointType.getNullable("datapoint_type")

        /**
         * Returns the raw JSON value of [datapointName].
         *
         * Unlike [datapointName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_name")
        @ExcludeMissing
        fun _datapointName(): JsonField<String> = datapointName

        /**
         * Returns the raw JSON value of [datapointType].
         *
         * Unlike [datapointType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("datapoint_type")
        @ExcludeMissing
        fun _datapointType(): JsonField<DatapointType> = datapointType

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
             * Returns a mutable builder for constructing an instance of [DataToExtract].
             *
             * The following fields are required:
             * ```kotlin
             * .datapointName()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DataToExtract]. */
        class Builder internal constructor() {

            private var datapointName: JsonField<String>? = null
            private var datapointType: JsonField<DatapointType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(dataToExtract: DataToExtract) = apply {
                datapointName = dataToExtract.datapointName
                datapointType = dataToExtract.datapointType
                additionalProperties = dataToExtract.additionalProperties.toMutableMap()
            }

            fun datapointName(datapointName: String) = datapointName(JsonField.of(datapointName))

            /**
             * Sets [Builder.datapointName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datapointName(datapointName: JsonField<String>) = apply {
                this.datapointName = datapointName
            }

            fun datapointType(datapointType: DatapointType) =
                datapointType(JsonField.of(datapointType))

            /**
             * Sets [Builder.datapointType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datapointType] with a well-typed [DatapointType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun datapointType(datapointType: JsonField<DatapointType>) = apply {
                this.datapointType = datapointType
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
             * Returns an immutable instance of [DataToExtract].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .datapointName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DataToExtract =
                DataToExtract(
                    checkRequired("datapointName", datapointName),
                    datapointType,
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
        fun validate(): DataToExtract = apply {
            if (validated) {
                return@apply
            }

            datapointName()
            datapointType()?.validate()
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
            (if (datapointName.asKnown() == null) 0 else 1) +
                (datapointType.asKnown()?.validity() ?: 0)

        class DatapointType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val TEXT = of("text")

                val NUMBER = of("number")

                fun of(value: String) = DatapointType(JsonField.of(value))
            }

            /** An enum containing [DatapointType]'s known values. */
            enum class Known {
                TEXT,
                NUMBER,
            }

            /**
             * An enum containing [DatapointType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DatapointType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                NUMBER,
                /**
                 * An enum member indicating that [DatapointType] was instantiated with an unknown
                 * value.
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
                    TEXT -> Value.TEXT
                    NUMBER -> Value.NUMBER
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
                    TEXT -> Known.TEXT
                    NUMBER -> Known.NUMBER
                    else ->
                        throw HelloWorldTestinggggInvalidDataException(
                            "Unknown DatapointType: $value"
                        )
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
            fun validate(): DatapointType = apply {
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

                return other is DatapointType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataToExtract &&
                datapointName == other.datapointName &&
                datapointType == other.datapointType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(datapointName, datapointType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataToExtract{datapointName=$datapointName, datapointType=$datapointType, additionalProperties=$additionalProperties}"
    }

    /** Digit-seam acronym parent for nested element mints */
    class Authentication3ds
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val challengeRules: JsonField<List<ChallengeRule>>,
        private val fallbackCheck: JsonField<List<FallbackCheck>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("challenge_rules")
            @ExcludeMissing
            challengeRules: JsonField<List<ChallengeRule>> = JsonMissing.of(),
            @JsonProperty("fallback_check")
            @ExcludeMissing
            fallbackCheck: JsonField<List<FallbackCheck>> = JsonMissing.of(),
        ) : this(challengeRules, fallbackCheck, mutableMapOf())

        /**
         * Plural array under the 3DS seam
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun challengeRules(): List<ChallengeRule>? = challengeRules.getNullable("challenge_rules")

        /**
         * Non-plural array under the 3DS seam
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fallbackCheck(): List<FallbackCheck>? = fallbackCheck.getNullable("fallback_check")

        /**
         * Returns the raw JSON value of [challengeRules].
         *
         * Unlike [challengeRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("challenge_rules")
        @ExcludeMissing
        fun _challengeRules(): JsonField<List<ChallengeRule>> = challengeRules

        /**
         * Returns the raw JSON value of [fallbackCheck].
         *
         * Unlike [fallbackCheck], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fallback_check")
        @ExcludeMissing
        fun _fallbackCheck(): JsonField<List<FallbackCheck>> = fallbackCheck

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

            /** Returns a mutable builder for constructing an instance of [Authentication3ds]. */
            fun builder() = Builder()
        }

        /** A builder for [Authentication3ds]. */
        class Builder internal constructor() {

            private var challengeRules: JsonField<MutableList<ChallengeRule>>? = null
            private var fallbackCheck: JsonField<MutableList<FallbackCheck>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(authentication3ds: Authentication3ds) = apply {
                challengeRules = authentication3ds.challengeRules.map { it.toMutableList() }
                fallbackCheck = authentication3ds.fallbackCheck.map { it.toMutableList() }
                additionalProperties = authentication3ds.additionalProperties.toMutableMap()
            }

            /** Plural array under the 3DS seam */
            fun challengeRules(challengeRules: List<ChallengeRule>) =
                challengeRules(JsonField.of(challengeRules))

            /**
             * Sets [Builder.challengeRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.challengeRules] with a well-typed
             * `List<ChallengeRule>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun challengeRules(challengeRules: JsonField<List<ChallengeRule>>) = apply {
                this.challengeRules = challengeRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [ChallengeRule] to [challengeRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChallengeRule(challengeRule: ChallengeRule) = apply {
                challengeRules =
                    (challengeRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("challengeRules", it).add(challengeRule)
                    }
            }

            /** Non-plural array under the 3DS seam */
            fun fallbackCheck(fallbackCheck: List<FallbackCheck>) =
                fallbackCheck(JsonField.of(fallbackCheck))

            /**
             * Sets [Builder.fallbackCheck] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackCheck] with a well-typed
             * `List<FallbackCheck>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun fallbackCheck(fallbackCheck: JsonField<List<FallbackCheck>>) = apply {
                this.fallbackCheck = fallbackCheck.map { it.toMutableList() }
            }

            /**
             * Adds a single [FallbackCheck] to [Builder.fallbackCheck].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFallbackCheck(fallbackCheck: FallbackCheck) = apply {
                this.fallbackCheck =
                    (this.fallbackCheck ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fallbackCheck", it).add(fallbackCheck)
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
             * Returns an immutable instance of [Authentication3ds].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Authentication3ds =
                Authentication3ds(
                    (challengeRules ?: JsonMissing.of()).map { it.toImmutable() },
                    (fallbackCheck ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Authentication3ds = apply {
            if (validated) {
                return@apply
            }

            challengeRules()?.forEach { it.validate() }
            fallbackCheck()?.forEach { it.validate() }
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
            (challengeRules.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (fallbackCheck.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class ChallengeRule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val challengeKind: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("challenge_kind")
                @ExcludeMissing
                challengeKind: JsonField<String> = JsonMissing.of()
            ) : this(challengeKind, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun challengeKind(): String? = challengeKind.getNullable("challenge_kind")

            /**
             * Returns the raw JSON value of [challengeKind].
             *
             * Unlike [challengeKind], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("challenge_kind")
            @ExcludeMissing
            fun _challengeKind(): JsonField<String> = challengeKind

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

                /** Returns a mutable builder for constructing an instance of [ChallengeRule]. */
                fun builder() = Builder()
            }

            /** A builder for [ChallengeRule]. */
            class Builder internal constructor() {

                private var challengeKind: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(challengeRule: ChallengeRule) = apply {
                    challengeKind = challengeRule.challengeKind
                    additionalProperties = challengeRule.additionalProperties.toMutableMap()
                }

                fun challengeKind(challengeKind: String) =
                    challengeKind(JsonField.of(challengeKind))

                /**
                 * Sets [Builder.challengeKind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.challengeKind] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun challengeKind(challengeKind: JsonField<String>) = apply {
                    this.challengeKind = challengeKind
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
                 * Returns an immutable instance of [ChallengeRule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChallengeRule =
                    ChallengeRule(challengeKind, additionalProperties.toMutableMap())
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
            fun validate(): ChallengeRule = apply {
                if (validated) {
                    return@apply
                }

                challengeKind()
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
            internal fun validity(): Int = (if (challengeKind.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChallengeRule &&
                    challengeKind == other.challengeKind &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(challengeKind, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChallengeRule{challengeKind=$challengeKind, additionalProperties=$additionalProperties}"
        }

        class FallbackCheck
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val checkName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("check_name")
                @ExcludeMissing
                checkName: JsonField<String> = JsonMissing.of()
            ) : this(checkName, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun checkName(): String? = checkName.getNullable("check_name")

            /**
             * Returns the raw JSON value of [checkName].
             *
             * Unlike [checkName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("check_name")
            @ExcludeMissing
            fun _checkName(): JsonField<String> = checkName

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

                /** Returns a mutable builder for constructing an instance of [FallbackCheck]. */
                fun builder() = Builder()
            }

            /** A builder for [FallbackCheck]. */
            class Builder internal constructor() {

                private var checkName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fallbackCheck: FallbackCheck) = apply {
                    checkName = fallbackCheck.checkName
                    additionalProperties = fallbackCheck.additionalProperties.toMutableMap()
                }

                fun checkName(checkName: String) = checkName(JsonField.of(checkName))

                /**
                 * Sets [Builder.checkName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.checkName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun checkName(checkName: JsonField<String>) = apply { this.checkName = checkName }

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
                 * Returns an immutable instance of [FallbackCheck].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FallbackCheck =
                    FallbackCheck(checkName, additionalProperties.toMutableMap())
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
            fun validate(): FallbackCheck = apply {
                if (validated) {
                    return@apply
                }

                checkName()
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
            internal fun validity(): Int = (if (checkName.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FallbackCheck &&
                    checkName == other.checkName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(checkName, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FallbackCheck{checkName=$checkName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Authentication3ds &&
                challengeRules == other.challengeRules &&
                fallbackCheck == other.fallbackCheck &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(challengeRules, fallbackCheck, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Authentication3ds{challengeRules=$challengeRules, fallbackCheck=$fallbackCheck, additionalProperties=$additionalProperties}"
    }

    /** Non-plural map property with enum values (map-mint probe) */
    class DatapointObjectSchema
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

            /**
             * Returns a mutable builder for constructing an instance of [DatapointObjectSchema].
             */
            fun builder() = Builder()
        }

        /** A builder for [DatapointObjectSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(datapointObjectSchema: DatapointObjectSchema) = apply {
                additionalProperties = datapointObjectSchema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DatapointObjectSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DatapointObjectSchema =
                DatapointObjectSchema(additionalProperties.toImmutable())
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
        fun validate(): DatapointObjectSchema = apply {
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

            return other is DatapointObjectSchema &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DatapointObjectSchema{additionalProperties=$additionalProperties}"
    }

    class ExtractionRule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ruleName: JsonField<String>,
        private val ruleSeverity: JsonField<RuleSeverity>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rule_name")
            @ExcludeMissing
            ruleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rule_severity")
            @ExcludeMissing
            ruleSeverity: JsonField<RuleSeverity> = JsonMissing.of(),
        ) : this(ruleName, ruleSeverity, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ruleName(): String? = ruleName.getNullable("rule_name")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ruleSeverity(): RuleSeverity? = ruleSeverity.getNullable("rule_severity")

        /**
         * Returns the raw JSON value of [ruleName].
         *
         * Unlike [ruleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_name") @ExcludeMissing fun _ruleName(): JsonField<String> = ruleName

        /**
         * Returns the raw JSON value of [ruleSeverity].
         *
         * Unlike [ruleSeverity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rule_severity")
        @ExcludeMissing
        fun _ruleSeverity(): JsonField<RuleSeverity> = ruleSeverity

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

            /** Returns a mutable builder for constructing an instance of [ExtractionRule]. */
            fun builder() = Builder()
        }

        /** A builder for [ExtractionRule]. */
        class Builder internal constructor() {

            private var ruleName: JsonField<String> = JsonMissing.of()
            private var ruleSeverity: JsonField<RuleSeverity> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extractionRule: ExtractionRule) = apply {
                ruleName = extractionRule.ruleName
                ruleSeverity = extractionRule.ruleSeverity
                additionalProperties = extractionRule.additionalProperties.toMutableMap()
            }

            fun ruleName(ruleName: String) = ruleName(JsonField.of(ruleName))

            /**
             * Sets [Builder.ruleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleName(ruleName: JsonField<String>) = apply { this.ruleName = ruleName }

            fun ruleSeverity(ruleSeverity: RuleSeverity) = ruleSeverity(JsonField.of(ruleSeverity))

            /**
             * Sets [Builder.ruleSeverity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleSeverity] with a well-typed [RuleSeverity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleSeverity(ruleSeverity: JsonField<RuleSeverity>) = apply {
                this.ruleSeverity = ruleSeverity
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
             * Returns an immutable instance of [ExtractionRule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtractionRule =
                ExtractionRule(ruleName, ruleSeverity, additionalProperties.toMutableMap())
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
        fun validate(): ExtractionRule = apply {
            if (validated) {
                return@apply
            }

            ruleName()
            ruleSeverity()?.validate()
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
            (if (ruleName.asKnown() == null) 0 else 1) + (ruleSeverity.asKnown()?.validity() ?: 0)

        class RuleSeverity @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val LOW = of("low")

                val HIGH = of("high")

                fun of(value: String) = RuleSeverity(JsonField.of(value))
            }

            /** An enum containing [RuleSeverity]'s known values. */
            enum class Known {
                LOW,
                HIGH,
            }

            /**
             * An enum containing [RuleSeverity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RuleSeverity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW,
                HIGH,
                /**
                 * An enum member indicating that [RuleSeverity] was instantiated with an unknown
                 * value.
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
                    LOW -> Value.LOW
                    HIGH -> Value.HIGH
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
                    LOW -> Known.LOW
                    HIGH -> Known.HIGH
                    else ->
                        throw HelloWorldTestinggggInvalidDataException(
                            "Unknown RuleSeverity: $value"
                        )
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
            fun validate(): RuleSeverity = apply {
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

                return other is RuleSeverity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtractionRule &&
                ruleName == other.ruleName &&
                ruleSeverity == other.ruleSeverity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ruleName, ruleSeverity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExtractionRule{ruleName=$ruleName, ruleSeverity=$ruleSeverity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiAiQueryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AiAiQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
