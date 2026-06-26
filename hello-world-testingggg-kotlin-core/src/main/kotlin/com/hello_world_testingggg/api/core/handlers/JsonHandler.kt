@file:JvmName("JsonHandler")

package com.hello_world_testingggg.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler
import com.hello_world_testingggg.api.errors.HelloWorldTestinggggInvalidDataException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw HelloWorldTestinggggInvalidDataException("Error reading response", e)
            }
        }
    }
