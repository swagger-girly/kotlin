// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.async

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepareAsync
import com.hello_world_testingggg.api.models.Pet
import com.hello_world_testingggg.api.models.PetCreateParams
import com.hello_world_testingggg.api.models.PetDeleteParams
import com.hello_world_testingggg.api.models.PetFindByStatusParams
import com.hello_world_testingggg.api.models.PetFindByTagsParams
import com.hello_world_testingggg.api.models.PetListFakePageInferredPageAsync
import com.hello_world_testingggg.api.models.PetListFakePageInferredPageResponse
import com.hello_world_testingggg.api.models.PetListFakePageInferredParams
import com.hello_world_testingggg.api.models.PetListFakePageParams
import com.hello_world_testingggg.api.models.PetListFakePageResponse
import com.hello_world_testingggg.api.models.PetListLeaderboardParams
import com.hello_world_testingggg.api.models.PetListLeaderboardResponse
import com.hello_world_testingggg.api.models.PetListPageAsync
import com.hello_world_testingggg.api.models.PetListPageResponse
import com.hello_world_testingggg.api.models.PetListParams
import com.hello_world_testingggg.api.models.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.PetListUnpaginatedResponse
import com.hello_world_testingggg.api.models.PetRetrieveParams
import com.hello_world_testingggg.api.models.PetRetrievePremiumParams
import com.hello_world_testingggg.api.models.PetRetrievePremiumResponse
import com.hello_world_testingggg.api.models.PetSearchParams
import com.hello_world_testingggg.api.models.PetUpdateParams
import com.hello_world_testingggg.api.models.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.PetUploadImageParams
import com.hello_world_testingggg.api.models.PetUploadImageResponse

/** Everything about your Pets */
class PetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PetServiceAsync {

    private val withRawResponse: PetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetServiceAsync =
        PetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(params: PetCreateParams, requestOptions: RequestOptions): Pet =
        // post /pet
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(params: PetRetrieveParams, requestOptions: RequestOptions): Pet =
        // get /pet/{petId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: PetUpdateParams, requestOptions: RequestOptions): Pet =
        // put /pet
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PetListParams,
        requestOptions: RequestOptions,
    ): PetListPageAsync =
        // get /pet
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: PetDeleteParams, requestOptions: RequestOptions) {
        // delete /pet/{petId}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun findByStatus(
        params: PetFindByStatusParams,
        requestOptions: RequestOptions,
    ): List<Pet> =
        // get /pet/findByStatus
        withRawResponse().findByStatus(params, requestOptions).parse()

    override suspend fun findByTags(
        params: PetFindByTagsParams,
        requestOptions: RequestOptions,
    ): List<Pet> =
        // get /pet/findByTags
        withRawResponse().findByTags(params, requestOptions).parse()

    override suspend fun listFakePage(
        params: PetListFakePageParams,
        requestOptions: RequestOptions,
    ): PetListFakePageResponse =
        // get /pet/fake-page
        withRawResponse().listFakePage(params, requestOptions).parse()

    override suspend fun listFakePageInferred(
        params: PetListFakePageInferredParams,
        requestOptions: RequestOptions,
    ): PetListFakePageInferredPageAsync =
        // get /pet/fake-page-inferred
        withRawResponse().listFakePageInferred(params, requestOptions).parse()

    override suspend fun listLeaderboard(
        params: PetListLeaderboardParams,
        requestOptions: RequestOptions,
    ): List<PetListLeaderboardResponse> =
        // get /pet/leaderboard
        withRawResponse().listLeaderboard(params, requestOptions).parse()

    override suspend fun listUnpaginated(
        params: PetListUnpaginatedParams,
        requestOptions: RequestOptions,
    ): PetListUnpaginatedResponse =
        // get /pet/unpaginated
        withRawResponse().listUnpaginated(params, requestOptions).parse()

    override suspend fun retrievePremium(
        params: PetRetrievePremiumParams,
        requestOptions: RequestOptions,
    ): PetRetrievePremiumResponse =
        // get /pet/{petId}/premium
        withRawResponse().retrievePremium(params, requestOptions).parse()

    override suspend fun search(
        params: PetSearchParams,
        requestOptions: RequestOptions,
    ): List<Pet> =
        // get /pet/search
        withRawResponse().search(params, requestOptions).parse()

    override suspend fun updateWithForm(
        params: PetUpdateWithFormParams,
        requestOptions: RequestOptions,
    ) {
        // post /pet/{petId}
        withRawResponse().updateWithForm(params, requestOptions)
    }

    override suspend fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions,
    ): PetUploadImageResponse =
        // post /pet/{petId}/uploadImage
        withRawResponse().uploadImage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PetServiceAsync.WithRawResponse =
            PetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Pet> = jsonHandler<Pet>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pet> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Pet> = jsonHandler<Pet>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pet> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Pet> = jsonHandler<Pet>(clientOptions.jsonMapper)

        override suspend fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pet> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PetListPageResponse> =
            jsonHandler<PetListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PetListPageAsync.builder()
                            .service(PetServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val findByStatusHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper)

        override suspend fun findByStatus(
            params: PetFindByStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByStatus")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { findByStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val findByTagsHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper)

        override suspend fun findByTags(
            params: PetFindByTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByTags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { findByTagsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listFakePageHandler: Handler<PetListFakePageResponse> =
            jsonHandler<PetListFakePageResponse>(clientOptions.jsonMapper)

        override suspend fun listFakePage(
            params: PetListFakePageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListFakePageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "fake-page")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFakePageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listFakePageInferredHandler: Handler<PetListFakePageInferredPageResponse> =
            jsonHandler<PetListFakePageInferredPageResponse>(clientOptions.jsonMapper)

        override suspend fun listFakePageInferred(
            params: PetListFakePageInferredParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListFakePageInferredPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "fake-page-inferred")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFakePageInferredHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PetListFakePageInferredPageAsync.builder()
                            .service(PetServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listLeaderboardHandler: Handler<List<PetListLeaderboardResponse>> =
            jsonHandler<List<PetListLeaderboardResponse>>(clientOptions.jsonMapper)

        override suspend fun listLeaderboard(
            params: PetListLeaderboardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PetListLeaderboardResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "leaderboard")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLeaderboardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listUnpaginatedHandler: Handler<PetListUnpaginatedResponse> =
            jsonHandler<PetListUnpaginatedResponse>(clientOptions.jsonMapper)

        override suspend fun listUnpaginated(
            params: PetListUnpaginatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListUnpaginatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "unpaginated")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listUnpaginatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrievePremiumHandler: Handler<PetRetrievePremiumResponse> =
            jsonHandler<PetRetrievePremiumResponse>(clientOptions.jsonMapper)

        override suspend fun retrievePremium(
            params: PetRetrievePremiumParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetRetrievePremiumResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0), "premium")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrievePremiumHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper)

        override suspend fun search(
            params: PetSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateWithFormHandler: Handler<Void?> = emptyHandler()

        override suspend fun updateWithForm(
            params: PetUpdateWithFormParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateWithFormHandler.handle(it) }
            }
        }

        private val uploadImageHandler: Handler<PetUploadImageResponse> =
            jsonHandler<PetUploadImageResponse>(clientOptions.jsonMapper)

        override suspend fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetUploadImageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            checkRequired("body", params._body())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0), "uploadImage")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadImageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
