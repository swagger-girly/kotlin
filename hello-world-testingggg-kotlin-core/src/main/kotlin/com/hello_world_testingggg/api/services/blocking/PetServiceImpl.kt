// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.services.blocking

import com.hello_world_testingggg.api.core.ClientOptions
import com.hello_world_testingggg.api.core.RequestOptions
import com.hello_world_testingggg.api.core.checkRequired
import com.hello_world_testingggg.api.core.handlers.emptyHandler
import com.hello_world_testingggg.api.core.handlers.errorBodyHandler
import com.hello_world_testingggg.api.core.handlers.errorHandler
import com.hello_world_testingggg.api.core.handlers.jsonHandler
import com.hello_world_testingggg.api.core.handlers.mapJson
import com.hello_world_testingggg.api.core.handlers.sseHandler
import com.hello_world_testingggg.api.core.http.HttpMethod
import com.hello_world_testingggg.api.core.http.HttpRequest
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.core.http.StreamResponse
import com.hello_world_testingggg.api.core.http.json
import com.hello_world_testingggg.api.core.http.map
import com.hello_world_testingggg.api.core.http.parseable
import com.hello_world_testingggg.api.core.prepare
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetCreateParams
import com.hello_world_testingggg.api.models.pet.PetDeleteParams
import com.hello_world_testingggg.api.models.pet.PetFindByStatusParams
import com.hello_world_testingggg.api.models.pet.PetFindByTagsParams
import com.hello_world_testingggg.api.models.pet.PetListFakePageInferredPage
import com.hello_world_testingggg.api.models.pet.PetListFakePageInferredPageResponse
import com.hello_world_testingggg.api.models.pet.PetListFakePageInferredParams
import com.hello_world_testingggg.api.models.pet.PetListFakePageParams
import com.hello_world_testingggg.api.models.pet.PetListFakePageResponse
import com.hello_world_testingggg.api.models.pet.PetListPage
import com.hello_world_testingggg.api.models.pet.PetListPageResponse
import com.hello_world_testingggg.api.models.pet.PetListParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedParams
import com.hello_world_testingggg.api.models.pet.PetListUnpaginatedResponse
import com.hello_world_testingggg.api.models.pet.PetRetrieveParams
import com.hello_world_testingggg.api.models.pet.PetRetrievePremiumParams
import com.hello_world_testingggg.api.models.pet.PetRetrievePremiumResponse
import com.hello_world_testingggg.api.models.pet.PetUpdateParams
import com.hello_world_testingggg.api.models.pet.PetUpdateWithFormParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageParams
import com.hello_world_testingggg.api.models.pet.PetUploadImageResponse
import com.hello_world_testingggg.api.models.pet.PetWatchStatusParams

/** Everything about your Pets */
class PetServiceImpl internal constructor(private val clientOptions: ClientOptions) : PetService {

    private val withRawResponse: PetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetService =
        PetServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: PetCreateParams, requestOptions: RequestOptions): Pet =
        // post /pet
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PetRetrieveParams, requestOptions: RequestOptions): Pet =
        // get /pet/{petId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PetUpdateParams, requestOptions: RequestOptions): Pet =
        // put /pet
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PetListParams, requestOptions: RequestOptions): PetListPage =
        // get /pet
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PetDeleteParams, requestOptions: RequestOptions) {
        // delete /pet/{petId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun findByStatus(
        params: PetFindByStatusParams,
        requestOptions: RequestOptions,
    ): List<Pet> =
        // get /pet/findByStatus
        withRawResponse().findByStatus(params, requestOptions).parse()

    override fun findByTags(
        params: PetFindByTagsParams,
        requestOptions: RequestOptions,
    ): List<Pet> =
        // get /pet/findByTags
        withRawResponse().findByTags(params, requestOptions).parse()

    override fun listFakePage(
        params: PetListFakePageParams,
        requestOptions: RequestOptions,
    ): PetListFakePageResponse =
        // get /pet/fake-page
        withRawResponse().listFakePage(params, requestOptions).parse()

    override fun listFakePageInferred(
        params: PetListFakePageInferredParams,
        requestOptions: RequestOptions,
    ): PetListFakePageInferredPage =
        // get /pet/fake-page-inferred
        withRawResponse().listFakePageInferred(params, requestOptions).parse()

    override fun listUnpaginated(
        params: PetListUnpaginatedParams,
        requestOptions: RequestOptions,
    ): PetListUnpaginatedResponse =
        // get /pet/unpaginated
        withRawResponse().listUnpaginated(params, requestOptions).parse()

    override fun retrievePremium(
        params: PetRetrievePremiumParams,
        requestOptions: RequestOptions,
    ): PetRetrievePremiumResponse =
        // get /pet/{petId}/premium
        withRawResponse().retrievePremium(params, requestOptions).parse()

    override fun updateWithForm(params: PetUpdateWithFormParams, requestOptions: RequestOptions) {
        // post /pet/{petId}
        withRawResponse().updateWithForm(params, requestOptions)
    }

    override fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions,
    ): PetUploadImageResponse =
        // post /pet/{petId}/uploadImage
        withRawResponse().uploadImage(params, requestOptions).parse()

    override fun watchStatusStreaming(
        params: PetWatchStatusParams,
        requestOptions: RequestOptions,
    ): StreamResponse<Pet> =
        // get /pet/{petId}/status/stream
        withRawResponse().watchStatusStreaming(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PetService.WithRawResponse =
            PetServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<Pet> = jsonHandler<Pet>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: PetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PetListPage.builder()
                            .service(PetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: PetDeleteParams, requestOptions: RequestOptions): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val findByStatusHandler: Handler<List<Pet>> =
            jsonHandler<List<Pet>>(clientOptions.jsonMapper)

        override fun findByStatus(
            params: PetFindByStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByStatus")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun findByTags(
            params: PetFindByTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "findByTags")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun listFakePage(
            params: PetListFakePageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListFakePageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "fake-page")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun listFakePageInferred(
            params: PetListFakePageInferredParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListFakePageInferredPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "fake-page-inferred")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFakePageInferredHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PetListFakePageInferredPage.builder()
                            .service(PetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listUnpaginatedHandler: Handler<PetListUnpaginatedResponse> =
            jsonHandler<PetListUnpaginatedResponse>(clientOptions.jsonMapper)

        override fun listUnpaginated(
            params: PetListUnpaginatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetListUnpaginatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", "unpaginated")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrievePremium(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateWithFormHandler: Handler<Void?> = emptyHandler()

        override fun updateWithForm(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateWithFormHandler.handle(it) }
            }
        }

        private val uploadImageHandler: Handler<PetUploadImageResponse> =
            jsonHandler<PetUploadImageResponse>(clientOptions.jsonMapper)

        override fun uploadImage(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val watchStatusStreamingHandler: Handler<StreamResponse<Pet>> =
            sseHandler(clientOptions.jsonMapper).mapJson<Pet>()

        override fun watchStatusStreaming(
            params: PetWatchStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<Pet>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("petId", params.petId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pet", params._pathParam(0), "status", "stream")
                    .putHeader("Accept", "text/event-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .let { watchStatusStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }
    }
}
