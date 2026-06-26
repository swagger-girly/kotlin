@file:JvmName("EmptyHandler")

package com.hello_world_testingggg.api.core.handlers

import com.hello_world_testingggg.api.core.http.HttpResponse
import com.hello_world_testingggg.api.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
