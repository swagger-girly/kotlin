// File generated from our OpenAPI spec by Stainless.

package com.hello_world_testingggg.api.errors

import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.core.http.Headers

abstract class HelloWorldTestinggggServiceException
protected constructor(message: String, cause: Throwable? = null) :
    HelloWorldTestinggggException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
