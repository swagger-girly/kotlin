// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.profiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hello_world_testingggg.api.core.ExcludeMissing
import com.hello_world_testingggg.api.core.JsonField
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.toImmutable
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException
import java.util.Collections
import java.util.Objects

class ProfileCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val displayName: JsonField<String>,
    private val email: JsonField<String>,
    private val governmentId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val preferences: JsonField<Preferences>,
    private val secretNote: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("governmentId")
        @ExcludeMissing
        governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<Preferences> = JsonMissing.of(),
        @JsonProperty("secretNote") @ExcludeMissing secretNote: JsonField<String> = JsonMissing.of(),
    ) : this(displayName, email, governmentId, metadata, preferences, secretNote, mutableMapOf())

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type or
     *   is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("displayName")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * Compliance identifier used only during profile creation.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun governmentId(): String? = governmentId.getNullable("governmentId")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun preferences(): Preferences? = preferences.getNullable("preferences")

    /**
     * Internal note that must not be emitted in profile responses.
     *
     * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun secretNote(): String? = secretNote.getNullable("secretNote")

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [governmentId].
     *
     * Unlike [governmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("governmentId")
    @ExcludeMissing
    fun _governmentId(): JsonField<String> = governmentId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<Preferences> = preferences

    /**
     * Returns the raw JSON value of [secretNote].
     *
     * Unlike [secretNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secretNote") @ExcludeMissing fun _secretNote(): JsonField<String> = secretNote

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
         * Returns a mutable builder for constructing an instance of [ProfileCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .displayName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProfileCreateRequest]. */
    class Builder internal constructor() {

        private var displayName: JsonField<String>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var governmentId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var preferences: JsonField<Preferences> = JsonMissing.of()
        private var secretNote: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(profileCreateRequest: ProfileCreateRequest) = apply {
            displayName = profileCreateRequest.displayName
            email = profileCreateRequest.email
            governmentId = profileCreateRequest.governmentId
            metadata = profileCreateRequest.metadata
            preferences = profileCreateRequest.preferences
            secretNote = profileCreateRequest.secretNote
            additionalProperties = profileCreateRequest.additionalProperties.toMutableMap()
        }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun email(email: String?) = email(JsonField.ofNullable(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Compliance identifier used only during profile creation. */
        fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

        /**
         * Sets [Builder.governmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.governmentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun governmentId(governmentId: JsonField<String>) = apply {
            this.governmentId = governmentId
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun preferences(preferences: Preferences) = preferences(JsonField.of(preferences))

        /**
         * Sets [Builder.preferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferences] with a well-typed [Preferences] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferences(preferences: JsonField<Preferences>) = apply {
            this.preferences = preferences
        }

        /** Internal note that must not be emitted in profile responses. */
        fun secretNote(secretNote: String) = secretNote(JsonField.of(secretNote))

        /**
         * Sets [Builder.secretNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretNote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secretNote(secretNote: JsonField<String>) = apply { this.secretNote = secretNote }

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
         * Returns an immutable instance of [ProfileCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .displayName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileCreateRequest =
            ProfileCreateRequest(
                checkRequired("displayName", displayName),
                email,
                governmentId,
                metadata,
                preferences,
                secretNote,
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
    fun validate(): ProfileCreateRequest = apply {
        if (validated) {
            return@apply
        }

        displayName()
        email()
        governmentId()
        metadata()?.validate()
        preferences()?.validate()
        secretNote()
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
        (if (displayName.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (governmentId.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (preferences.asKnown()?.validity() ?: 0) +
            (if (secretNote.asKnown() == null) 0 else 1)

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Preferences
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alerts: JsonField<Alerts>,
        private val newsletter: JsonField<Boolean>,
        private val scoreByRegion: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alerts") @ExcludeMissing alerts: JsonField<Alerts> = JsonMissing.of(),
            @JsonProperty("newsletter")
            @ExcludeMissing
            newsletter: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scoreByRegion")
            @ExcludeMissing
            scoreByRegion: JsonValue = JsonMissing.of(),
        ) : this(alerts, newsletter, scoreByRegion, mutableMapOf())

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alerts(): Alerts? = alerts.getNullable("alerts")

        /**
         * @throws HelloWorldTestinggggInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun newsletter(): Boolean? = newsletter.getNullable("newsletter")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = preferences.scoreByRegion().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("scoreByRegion")
        @ExcludeMissing
        fun _scoreByRegion(): JsonValue = scoreByRegion

        /**
         * Returns the raw JSON value of [alerts].
         *
         * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alerts") @ExcludeMissing fun _alerts(): JsonField<Alerts> = alerts

        /**
         * Returns the raw JSON value of [newsletter].
         *
         * Unlike [newsletter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("newsletter")
        @ExcludeMissing
        fun _newsletter(): JsonField<Boolean> = newsletter

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

            /** Returns a mutable builder for constructing an instance of [Preferences]. */
            fun builder() = Builder()
        }

        /** A builder for [Preferences]. */
        class Builder internal constructor() {

            private var alerts: JsonField<Alerts> = JsonMissing.of()
            private var newsletter: JsonField<Boolean> = JsonMissing.of()
            private var scoreByRegion: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(preferences: Preferences) = apply {
                alerts = preferences.alerts
                newsletter = preferences.newsletter
                scoreByRegion = preferences.scoreByRegion
                additionalProperties = preferences.additionalProperties.toMutableMap()
            }

            fun alerts(alerts: Alerts) = alerts(JsonField.of(alerts))

            /**
             * Sets [Builder.alerts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alerts] with a well-typed [Alerts] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alerts(alerts: JsonField<Alerts>) = apply { this.alerts = alerts }

            fun newsletter(newsletter: Boolean) = newsletter(JsonField.of(newsletter))

            /**
             * Sets [Builder.newsletter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.newsletter] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun newsletter(newsletter: JsonField<Boolean>) = apply { this.newsletter = newsletter }

            fun scoreByRegion(scoreByRegion: JsonValue) = apply {
                this.scoreByRegion = scoreByRegion
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
             * Returns an immutable instance of [Preferences].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Preferences =
                Preferences(alerts, newsletter, scoreByRegion, additionalProperties.toMutableMap())
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
        fun validate(): Preferences = apply {
            if (validated) {
                return@apply
            }

            alerts()?.validate()
            newsletter()
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
            (alerts.asKnown()?.validity() ?: 0) + (if (newsletter.asKnown() == null) 0 else 1)

        class Alerts
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

                /** Returns a mutable builder for constructing an instance of [Alerts]. */
                fun builder() = Builder()
            }

            /** A builder for [Alerts]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(alerts: Alerts) = apply {
                    additionalProperties = alerts.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Alerts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Alerts = Alerts(additionalProperties.toImmutable())
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
            fun validate(): Alerts = apply {
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

                return other is Alerts && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Alerts{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Preferences &&
                alerts == other.alerts &&
                newsletter == other.newsletter &&
                scoreByRegion == other.scoreByRegion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(alerts, newsletter, scoreByRegion, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Preferences{alerts=$alerts, newsletter=$newsletter, scoreByRegion=$scoreByRegion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileCreateRequest &&
            displayName == other.displayName &&
            email == other.email &&
            governmentId == other.governmentId &&
            metadata == other.metadata &&
            preferences == other.preferences &&
            secretNote == other.secretNote &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            displayName,
            email,
            governmentId,
            metadata,
            preferences,
            secretNote,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProfileCreateRequest{displayName=$displayName, email=$email, governmentId=$governmentId, metadata=$metadata, preferences=$preferences, secretNote=$secretNote, additionalProperties=$additionalProperties}"
}
