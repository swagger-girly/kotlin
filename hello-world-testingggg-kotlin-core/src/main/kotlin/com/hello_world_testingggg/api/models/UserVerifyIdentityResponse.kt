// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models

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
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.allMaxBy
import com.hello_world_testingggg.api.core.checkKnown
import com.hello_world_testingggg.api.core.getOrThrow
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = UserVerifyIdentityResponse.Deserializer::class)
@JsonSerialize(using = UserVerifyIdentityResponse.Serializer::class)
class UserVerifyIdentityResponse
private constructor(
    private val kybKycVerification: KybKycVerification? = null,
    private val basicVerification: BasicVerification? = null,
    private val _json: JsonValue? = null,
) {

    fun kybKycVerification(): KybKycVerification? = kybKycVerification

    fun basicVerification(): BasicVerification? = basicVerification

    fun isKybKycVerification(): Boolean = kybKycVerification != null

    fun isBasicVerification(): Boolean = basicVerification != null

    fun asKybKycVerification(): KybKycVerification =
        kybKycVerification.getOrThrow("kybKycVerification")

    fun asBasicVerification(): BasicVerification = basicVerification.getOrThrow("basicVerification")

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
     * val result: String? = userVerifyIdentityResponse.accept(object : UserVerifyIdentityResponse.Visitor<String?> {
     *     override fun visitKybKycVerification(kybKycVerification: KybKycVerification): String? = kybKycVerification.toString()
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
            kybKycVerification != null -> visitor.visitKybKycVerification(kybKycVerification)
            basicVerification != null -> visitor.visitBasicVerification(basicVerification)
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
    fun validate(): UserVerifyIdentityResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitKybKycVerification(kybKycVerification: KybKycVerification) {
                    kybKycVerification.validate()
                }

                override fun visitBasicVerification(basicVerification: BasicVerification) {
                    basicVerification.validate()
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
                override fun visitKybKycVerification(kybKycVerification: KybKycVerification) =
                    kybKycVerification.validity()

                override fun visitBasicVerification(basicVerification: BasicVerification) =
                    basicVerification.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserVerifyIdentityResponse &&
            kybKycVerification == other.kybKycVerification &&
            basicVerification == other.basicVerification
    }

    override fun hashCode(): Int = Objects.hash(kybKycVerification, basicVerification)

    override fun toString(): String =
        when {
            kybKycVerification != null ->
                "UserVerifyIdentityResponse{kybKycVerification=$kybKycVerification}"
            basicVerification != null ->
                "UserVerifyIdentityResponse{basicVerification=$basicVerification}"
            _json != null -> "UserVerifyIdentityResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UserVerifyIdentityResponse")
        }

    companion object {

        fun ofKybKycVerification(kybKycVerification: KybKycVerification) =
            UserVerifyIdentityResponse(kybKycVerification = kybKycVerification)

        fun ofBasicVerification(basicVerification: BasicVerification) =
            UserVerifyIdentityResponse(basicVerification = basicVerification)
    }

    /**
     * An interface that defines how to map each variant of [UserVerifyIdentityResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitKybKycVerification(kybKycVerification: KybKycVerification): T

        fun visitBasicVerification(basicVerification: BasicVerification): T

        /**
         * Maps an unknown variant of [UserVerifyIdentityResponse] to a value of type [T].
         *
         * An instance of [UserVerifyIdentityResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HelloWorldTestinggggInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HelloWorldTestinggggInvalidDataException(
                "Unknown UserVerifyIdentityResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<UserVerifyIdentityResponse>(UserVerifyIdentityResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UserVerifyIdentityResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<KybKycVerification>())?.let {
                            UserVerifyIdentityResponse(kybKycVerification = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BasicVerification>())?.let {
                            UserVerifyIdentityResponse(basicVerification = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UserVerifyIdentityResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UserVerifyIdentityResponse>(UserVerifyIdentityResponse::class) {

        override fun serialize(
            value: UserVerifyIdentityResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.kybKycVerification != null -> generator.writeObject(value.kybKycVerification)
                value.basicVerification != null -> generator.writeObject(value.basicVerification)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UserVerifyIdentityResponse")
            }
        }
    }

    class KybKycVerification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val beneficialOwnerIndividuals: JsonField<List<BeneficialOwnerIndividual>>,
        private val statusReasons: JsonField<List<StatusReason>>,
        private val verificationApplication: JsonField<VerificationApplication>,
        private val verificationDocument: JsonField<List<VerificationDocument>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            beneficialOwnerIndividuals: JsonField<List<BeneficialOwnerIndividual>> =
                JsonMissing.of(),
            @JsonProperty("status_reasons")
            @ExcludeMissing
            statusReasons: JsonField<List<StatusReason>> = JsonMissing.of(),
            @JsonProperty("verification_application")
            @ExcludeMissing
            verificationApplication: JsonField<VerificationApplication> = JsonMissing.of(),
            @JsonProperty("verification_document")
            @ExcludeMissing
            verificationDocument: JsonField<List<VerificationDocument>> = JsonMissing.of(),
        ) : this(
            token,
            beneficialOwnerIndividuals,
            statusReasons,
            verificationApplication,
            verificationDocument,
            mutableMapOf(),
        )

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun token(): String? = token.getNullable("token")

        /**
         * Plural array: replicates lithic's re-cased Kybkyc element mint (control probe)
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun beneficialOwnerIndividuals(): List<BeneficialOwnerIndividual>? =
            beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals")

        /**
         * Plural array: second lithic-exact control probe
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun statusReasons(): List<StatusReason>? = statusReasons.getNullable("status_reasons")

        /**
         * Nested object mirroring lithic's deeper plural mint
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun verificationApplication(): VerificationApplication? =
            verificationApplication.getNullable("verification_application")

        /**
         * Non-plural array: the case lithic never exercises (decisive probe)
         *
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun verificationDocument(): List<VerificationDocument>? =
            verificationDocument.getNullable("verification_document")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [beneficialOwnerIndividuals].
         *
         * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficial_owner_individuals")
        @ExcludeMissing
        fun _beneficialOwnerIndividuals(): JsonField<List<BeneficialOwnerIndividual>> =
            beneficialOwnerIndividuals

        /**
         * Returns the raw JSON value of [statusReasons].
         *
         * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<StatusReason>> = statusReasons

        /**
         * Returns the raw JSON value of [verificationApplication].
         *
         * Unlike [verificationApplication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verification_application")
        @ExcludeMissing
        fun _verificationApplication(): JsonField<VerificationApplication> = verificationApplication

        /**
         * Returns the raw JSON value of [verificationDocument].
         *
         * Unlike [verificationDocument], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verification_document")
        @ExcludeMissing
        fun _verificationDocument(): JsonField<List<VerificationDocument>> = verificationDocument

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

            /** Returns a mutable builder for constructing an instance of [KybKycVerification]. */
            fun builder() = Builder()
        }

        /** A builder for [KybKycVerification]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var beneficialOwnerIndividuals:
                JsonField<MutableList<BeneficialOwnerIndividual>>? =
                null
            private var statusReasons: JsonField<MutableList<StatusReason>>? = null
            private var verificationApplication: JsonField<VerificationApplication> =
                JsonMissing.of()
            private var verificationDocument: JsonField<MutableList<VerificationDocument>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(kybKycVerification: KybKycVerification) = apply {
                token = kybKycVerification.token
                beneficialOwnerIndividuals =
                    kybKycVerification.beneficialOwnerIndividuals.map { it.toMutableList() }
                statusReasons = kybKycVerification.statusReasons.map { it.toMutableList() }
                verificationApplication = kybKycVerification.verificationApplication
                verificationDocument =
                    kybKycVerification.verificationDocument.map { it.toMutableList() }
                additionalProperties = kybKycVerification.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Plural array: replicates lithic's re-cased Kybkyc element mint (control probe) */
            fun beneficialOwnerIndividuals(
                beneficialOwnerIndividuals: List<BeneficialOwnerIndividual>
            ) = beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

            /**
             * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
             * `List<BeneficialOwnerIndividual>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun beneficialOwnerIndividuals(
                beneficialOwnerIndividuals: JsonField<List<BeneficialOwnerIndividual>>
            ) = apply {
                this.beneficialOwnerIndividuals =
                    beneficialOwnerIndividuals.map { it.toMutableList() }
            }

            /**
             * Adds a single [BeneficialOwnerIndividual] to [beneficialOwnerIndividuals].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: BeneficialOwnerIndividual) =
                apply {
                    beneficialOwnerIndividuals =
                        (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).also {
                            checkKnown("beneficialOwnerIndividuals", it)
                                .add(beneficialOwnerIndividual)
                        }
                }

            /** Plural array: second lithic-exact control probe */
            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

            /**
             * Sets [Builder.statusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusReasons] with a well-typed
             * `List<StatusReason>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [StatusReason] to [statusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusReason(statusReason: StatusReason) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusReasons", it).add(statusReason)
                    }
            }

            /** Nested object mirroring lithic's deeper plural mint */
            fun verificationApplication(verificationApplication: VerificationApplication) =
                verificationApplication(JsonField.of(verificationApplication))

            /**
             * Sets [Builder.verificationApplication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationApplication] with a well-typed
             * [VerificationApplication] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun verificationApplication(
                verificationApplication: JsonField<VerificationApplication>
            ) = apply { this.verificationApplication = verificationApplication }

            /** Non-plural array: the case lithic never exercises (decisive probe) */
            fun verificationDocument(verificationDocument: List<VerificationDocument>) =
                verificationDocument(JsonField.of(verificationDocument))

            /**
             * Sets [Builder.verificationDocument] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationDocument] with a well-typed
             * `List<VerificationDocument>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun verificationDocument(verificationDocument: JsonField<List<VerificationDocument>>) =
                apply {
                    this.verificationDocument = verificationDocument.map { it.toMutableList() }
                }

            /**
             * Adds a single [VerificationDocument] to [Builder.verificationDocument].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVerificationDocument(verificationDocument: VerificationDocument) = apply {
                this.verificationDocument =
                    (this.verificationDocument ?: JsonField.of(mutableListOf())).also {
                        checkKnown("verificationDocument", it).add(verificationDocument)
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
             * Returns an immutable instance of [KybKycVerification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): KybKycVerification =
                KybKycVerification(
                    token,
                    (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                    (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    verificationApplication,
                    (verificationDocument ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): KybKycVerification = apply {
            if (validated) {
                return@apply
            }

            token()
            beneficialOwnerIndividuals()?.forEach { it.validate() }
            statusReasons()?.forEach { it.validate() }
            verificationApplication()?.validate()
            verificationDocument()?.forEach { it.validate() }
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
            (if (token.asKnown() == null) 0 else 1) +
                (beneficialOwnerIndividuals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (statusReasons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (verificationApplication.asKnown()?.validity() ?: 0) +
                (verificationDocument.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class BeneficialOwnerIndividual
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ownerName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("owner_name")
                @ExcludeMissing
                ownerName: JsonField<String> = JsonMissing.of()
            ) : this(ownerName, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ownerName(): String? = ownerName.getNullable("owner_name")

            /**
             * Returns the raw JSON value of [ownerName].
             *
             * Unlike [ownerName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("owner_name")
            @ExcludeMissing
            fun _ownerName(): JsonField<String> = ownerName

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
                 * [BeneficialOwnerIndividual].
                 */
                fun builder() = Builder()
            }

            /** A builder for [BeneficialOwnerIndividual]. */
            class Builder internal constructor() {

                private var ownerName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(beneficialOwnerIndividual: BeneficialOwnerIndividual) = apply {
                    ownerName = beneficialOwnerIndividual.ownerName
                    additionalProperties =
                        beneficialOwnerIndividual.additionalProperties.toMutableMap()
                }

                fun ownerName(ownerName: String) = ownerName(JsonField.of(ownerName))

                /**
                 * Sets [Builder.ownerName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerName(ownerName: JsonField<String>) = apply { this.ownerName = ownerName }

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
                 * Returns an immutable instance of [BeneficialOwnerIndividual].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BeneficialOwnerIndividual =
                    BeneficialOwnerIndividual(ownerName, additionalProperties.toMutableMap())
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
            fun validate(): BeneficialOwnerIndividual = apply {
                if (validated) {
                    return@apply
                }

                ownerName()
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
            internal fun validity(): Int = (if (ownerName.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BeneficialOwnerIndividual &&
                    ownerName == other.ownerName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(ownerName, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwnerIndividual{ownerName=$ownerName, additionalProperties=$additionalProperties}"
        }

        class StatusReason
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reasonCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason_code")
                @ExcludeMissing
                reasonCode: JsonField<String> = JsonMissing.of()
            ) : this(reasonCode, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reasonCode(): String? = reasonCode.getNullable("reason_code")

            /**
             * Returns the raw JSON value of [reasonCode].
             *
             * Unlike [reasonCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reason_code")
            @ExcludeMissing
            fun _reasonCode(): JsonField<String> = reasonCode

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

                /** Returns a mutable builder for constructing an instance of [StatusReason]. */
                fun builder() = Builder()
            }

            /** A builder for [StatusReason]. */
            class Builder internal constructor() {

                private var reasonCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(statusReason: StatusReason) = apply {
                    reasonCode = statusReason.reasonCode
                    additionalProperties = statusReason.additionalProperties.toMutableMap()
                }

                fun reasonCode(reasonCode: String) = reasonCode(JsonField.of(reasonCode))

                /**
                 * Sets [Builder.reasonCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reasonCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reasonCode(reasonCode: JsonField<String>) = apply {
                    this.reasonCode = reasonCode
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
                 * Returns an immutable instance of [StatusReason].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StatusReason =
                    StatusReason(reasonCode, additionalProperties.toMutableMap())
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
            fun validate(): StatusReason = apply {
                if (validated) {
                    return@apply
                }

                reasonCode()
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
            internal fun validity(): Int = (if (reasonCode.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StatusReason &&
                    reasonCode == other.reasonCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reasonCode, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StatusReason{reasonCode=$reasonCode, additionalProperties=$additionalProperties}"
        }

        /** Nested object mirroring lithic's deeper plural mint */
        class VerificationApplication
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val statusReasons: JsonField<List<StatusReason>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("status_reasons")
                @ExcludeMissing
                statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
            ) : this(statusReasons, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun statusReasons(): List<StatusReason>? = statusReasons.getNullable("status_reasons")

            /**
             * Returns the raw JSON value of [statusReasons].
             *
             * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun _statusReasons(): JsonField<List<StatusReason>> = statusReasons

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
                 * [VerificationApplication].
                 */
                fun builder() = Builder()
            }

            /** A builder for [VerificationApplication]. */
            class Builder internal constructor() {

                private var statusReasons: JsonField<MutableList<StatusReason>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(verificationApplication: VerificationApplication) = apply {
                    statusReasons = verificationApplication.statusReasons.map { it.toMutableList() }
                    additionalProperties =
                        verificationApplication.additionalProperties.toMutableMap()
                }

                fun statusReasons(statusReasons: List<StatusReason>) =
                    statusReasons(JsonField.of(statusReasons))

                /**
                 * Sets [Builder.statusReasons] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusReasons] with a well-typed
                 * `List<StatusReason>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
                    this.statusReasons = statusReasons.map { it.toMutableList() }
                }

                /**
                 * Adds a single [StatusReason] to [statusReasons].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStatusReason(statusReason: StatusReason) = apply {
                    statusReasons =
                        (statusReasons ?: JsonField.of(mutableListOf())).also {
                            checkKnown("statusReasons", it).add(statusReason)
                        }
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
                 * Returns an immutable instance of [VerificationApplication].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VerificationApplication =
                    VerificationApplication(
                        (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): VerificationApplication = apply {
                if (validated) {
                    return@apply
                }

                statusReasons()?.forEach { it.validate() }
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
                (statusReasons.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            class StatusReason
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val applicationNote: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("application_note")
                    @ExcludeMissing
                    applicationNote: JsonField<String> = JsonMissing.of()
                ) : this(applicationNote, mutableMapOf())

                /**
                 * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun applicationNote(): String? = applicationNote.getNullable("application_note")

                /**
                 * Returns the raw JSON value of [applicationNote].
                 *
                 * Unlike [applicationNote], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("application_note")
                @ExcludeMissing
                fun _applicationNote(): JsonField<String> = applicationNote

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

                    /** Returns a mutable builder for constructing an instance of [StatusReason]. */
                    fun builder() = Builder()
                }

                /** A builder for [StatusReason]. */
                class Builder internal constructor() {

                    private var applicationNote: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(statusReason: StatusReason) = apply {
                        applicationNote = statusReason.applicationNote
                        additionalProperties = statusReason.additionalProperties.toMutableMap()
                    }

                    fun applicationNote(applicationNote: String) =
                        applicationNote(JsonField.of(applicationNote))

                    /**
                     * Sets [Builder.applicationNote] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.applicationNote] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun applicationNote(applicationNote: JsonField<String>) = apply {
                        this.applicationNote = applicationNote
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
                     * Returns an immutable instance of [StatusReason].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): StatusReason =
                        StatusReason(applicationNote, additionalProperties.toMutableMap())
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
                fun validate(): StatusReason = apply {
                    if (validated) {
                        return@apply
                    }

                    applicationNote()
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
                internal fun validity(): Int = (if (applicationNote.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StatusReason &&
                        applicationNote == other.applicationNote &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(applicationNote, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StatusReason{applicationNote=$applicationNote, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationApplication &&
                    statusReasons == other.statusReasons &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(statusReasons, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VerificationApplication{statusReasons=$statusReasons, additionalProperties=$additionalProperties}"
        }

        class VerificationDocument
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val documentId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("document_id")
                @ExcludeMissing
                documentId: JsonField<String> = JsonMissing.of()
            ) : this(documentId, mutableMapOf())

            /**
             * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun documentId(): String? = documentId.getNullable("document_id")

            /**
             * Returns the raw JSON value of [documentId].
             *
             * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("document_id")
            @ExcludeMissing
            fun _documentId(): JsonField<String> = documentId

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
                 * Returns a mutable builder for constructing an instance of [VerificationDocument].
                 */
                fun builder() = Builder()
            }

            /** A builder for [VerificationDocument]. */
            class Builder internal constructor() {

                private var documentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(verificationDocument: VerificationDocument) = apply {
                    documentId = verificationDocument.documentId
                    additionalProperties = verificationDocument.additionalProperties.toMutableMap()
                }

                fun documentId(documentId: String) = documentId(JsonField.of(documentId))

                /**
                 * Sets [Builder.documentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentId(documentId: JsonField<String>) = apply {
                    this.documentId = documentId
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
                 * Returns an immutable instance of [VerificationDocument].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VerificationDocument =
                    VerificationDocument(documentId, additionalProperties.toMutableMap())
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
            fun validate(): VerificationDocument = apply {
                if (validated) {
                    return@apply
                }

                documentId()
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
            internal fun validity(): Int = (if (documentId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationDocument &&
                    documentId == other.documentId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(documentId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VerificationDocument{documentId=$documentId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KybKycVerification &&
                token == other.token &&
                beneficialOwnerIndividuals == other.beneficialOwnerIndividuals &&
                statusReasons == other.statusReasons &&
                verificationApplication == other.verificationApplication &&
                verificationDocument == other.verificationDocument &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                beneficialOwnerIndividuals,
                statusReasons,
                verificationApplication,
                verificationDocument,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KybKycVerification{token=$token, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, statusReasons=$statusReasons, verificationApplication=$verificationApplication, verificationDocument=$verificationDocument, additionalProperties=$additionalProperties}"
    }

    class BasicVerification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val verified: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verified")
            @ExcludeMissing
            verified: JsonField<Boolean> = JsonMissing.of(),
        ) : this(token, verified, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun token(): String? = token.getNullable("token")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun verified(): Boolean? = verified.getNullable("verified")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [verified].
         *
         * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Boolean> = verified

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

            /** Returns a mutable builder for constructing an instance of [BasicVerification]. */
            fun builder() = Builder()
        }

        /** A builder for [BasicVerification]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var verified: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(basicVerification: BasicVerification) = apply {
                token = basicVerification.token
                verified = basicVerification.verified
                additionalProperties = basicVerification.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun verified(verified: Boolean) = verified(JsonField.of(verified))

            /**
             * Sets [Builder.verified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verified(verified: JsonField<Boolean>) = apply { this.verified = verified }

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
             * Returns an immutable instance of [BasicVerification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BasicVerification =
                BasicVerification(token, verified, additionalProperties.toMutableMap())
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
        fun validate(): BasicVerification = apply {
            if (validated) {
                return@apply
            }

            token()
            verified()
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
            (if (token.asKnown() == null) 0 else 1) + (if (verified.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BasicVerification &&
                token == other.token &&
                verified == other.verified &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(token, verified, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BasicVerification{token=$token, verified=$verified, additionalProperties=$additionalProperties}"
    }
}
