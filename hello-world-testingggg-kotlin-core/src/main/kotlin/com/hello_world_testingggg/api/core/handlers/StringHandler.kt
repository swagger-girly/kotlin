@file:JvmName("StringHandler")

package com.hello_world_testingggg.api.core.handlers

import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
