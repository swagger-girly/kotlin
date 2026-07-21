// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.models.pet

import com.hello_world_testingggg.api.core.Params
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Returns a cursor-paginated list of pets. */
class PetListParams
private constructor(
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by created_at timestamp range in UTC. Accepts gt/gte/lt/lte. */
    fun createdAt(): CreatedAt? = createdAt

    /** Cursor from a previous response used to fetch the next page. */
    fun cursor(): String? = cursor

    /** Maximum number of pets to return. */
    fun limit(): Long? = limit

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PetListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PetListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PetListParams]. */
    class Builder internal constructor() {

        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(petListParams: PetListParams) = apply {
            createdAt = petListParams.createdAt
            cursor = petListParams.cursor
            limit = petListParams.limit
            additionalHeaders = petListParams.additionalHeaders.toBuilder()
            additionalQueryParams = petListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by created_at timestamp range in UTC. Accepts gt/gte/lt/lte. */
        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Cursor from a previous response used to fetch the next page. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Maximum number of pets to return. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

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
         * Returns an immutable instance of [PetListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PetListParams =
            PetListParams(
                createdAt,
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAt?.let {
                    it.gt()?.let {
                        put("created_at[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.gte()?.let {
                        put("created_at[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.lt()?.let {
                        put("created_at[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.lte()?.let {
                        put("created_at[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at[$key]", value)
                        }
                    }
                }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by created_at timestamp range in UTC. Accepts gt/gte/lt/lte. */
    class CreatedAt
    private constructor(
        private val gt: OffsetDateTime?,
        private val gte: OffsetDateTime?,
        private val lt: OffsetDateTime?,
        private val lte: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /** Minimum value to filter by (exclusive). */
        fun gt(): OffsetDateTime? = gt

        /** Minimum value to filter by (inclusive). */
        fun gte(): OffsetDateTime? = gte

        /** Maximum value to filter by (exclusive). */
        fun lt(): OffsetDateTime? = lt

        /** Maximum value to filter by (inclusive). */
        fun lte(): OffsetDateTime? = lte

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var gt: OffsetDateTime? = null
            private var gte: OffsetDateTime? = null
            private var lt: OffsetDateTime? = null
            private var lte: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(createdAt: CreatedAt) = apply {
                gt = createdAt.gt
                gte = createdAt.gte
                lt = createdAt.lt
                lte = createdAt.lte
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /** Minimum value to filter by (exclusive). */
            fun gt(gt: OffsetDateTime?) = apply { this.gt = gt }

            /** Minimum value to filter by (inclusive). */
            fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

            /** Maximum value to filter by (exclusive). */
            fun lt(lt: OffsetDateTime?) = apply { this.lt = lt }

            /** Maximum value to filter by (inclusive). */
            fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt = CreatedAt(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PetListParams &&
            createdAt == other.createdAt &&
            cursor == other.cursor &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(createdAt, cursor, limit, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PetListParams{createdAt=$createdAt, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
