# Hello World Testingggg Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.hello_world_testingggg.api/hello-world-testingggg-kotlin)](https://central.sonatype.com/artifact/com.hello_world_testingggg.api/hello-world-testingggg-kotlin/0.0.1)
[![javadoc](https://javadoc.io/badge2/com.hello_world_testingggg.api/hello-world-testingggg-kotlin/0.0.1/javadoc.svg)](https://javadoc.io/doc/com.hello_world_testingggg.api/hello-world-testingggg-kotlin/0.0.1)

<!-- x-release-please-end -->

The Hello World Testingggg Kotlin SDK provides convenient access to the [Hello World Testingggg REST API](http://swagger.io) from applications written in Kotlin.

It is generated with [Stainless](https://www.stainless.com/).

## MCP Server

Use the Hello World Testingggg MCP Server to enable AI assistants to interact with this API, allowing them to explore endpoints, make test requests, and use documentation to help integrate this SDK into your application.

[![Add to Cursor](https://cursor.com/deeplink/mcp-install-dark.svg)](https://cursor.com/en-US/install-mcp?name=hello-world-testingggg-mcp&config=eyJjb21tYW5kIjoibnB4IiwiYXJncyI6WyIteSIsImhlbGxvLXdvcmxkLXRlc3RpbmdnZ2ctbWNwIl0sImVudiI6eyJBUElfS0VZIjoiTXkgQVBJIEtleSJ9fQ)
[![Install in VS Code](https://img.shields.io/badge/_-Add_to_VS_Code-blue?style=for-the-badge&logo=data:image/svg%2bxml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGZpbGw9Im5vbmUiIHZpZXdCb3g9IjAgMCA0MCA0MCI+PHBhdGggZmlsbD0iI0VFRSIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMzAuMjM1IDM5Ljg4NGEyLjQ5MSAyLjQ5MSAwIDAgMS0xLjc4MS0uNzNMMTIuNyAyNC43OGwtMy40NiAyLjYyNC0zLjQwNiAyLjU4MmExLjY2NSAxLjY2NSAwIDAgMS0xLjA4Mi4zMzggMS42NjQgMS42NjQgMCAwIDEtMS4wNDYtLjQzMWwtMi4yLTJhMS42NjYgMS42NjYgMCAwIDEgMC0yLjQ2M0w3LjQ1OCAyMCA0LjY3IDE3LjQ1MyAxLjUwNyAxNC41N2ExLjY2NSAxLjY2NSAwIDAgMSAwLTIuNDYzbDIuMi0yYTEuNjY1IDEuNjY1IDAgMCAxIDIuMTMtLjA5N2w2Ljg2MyA1LjIwOUwyOC40NTIuODQ0YTIuNDg4IDIuNDg4IDAgMCAxIDEuODQxLS43MjljLjM1MS4wMDkuNjk5LjA5MSAxLjAxOS4yNDVsOC4yMzYgMy45NjFhMi41IDIuNSAwIDAgMSAxLjQxNSAyLjI1M3YuMDk5LS4wNDVWMzMuMzd2LS4wNDUuMDk1YTIuNTAxIDIuNTAxIDAgMCAxLTEuNDE2IDIuMjU3bC04LjIzNSAzLjk2MWEyLjQ5MiAyLjQ5MiAwIDAgMS0xLjA3Ny4yNDZabS43MTYtMjguOTQ3LTExLjk0OCA5LjA2MiAxMS45NTIgOS4wNjUtLjAwNC0xOC4xMjdaIi8+PC9zdmc+)](https://vscode.stainless.com/mcp/%7B%22name%22%3A%22hello-world-testingggg-mcp%22%2C%22command%22%3A%22npx%22%2C%22args%22%3A%5B%22-y%22%2C%22hello-world-testingggg-mcp%22%5D%2C%22env%22%3A%7B%22API_KEY%22%3A%22My%20API%20Key%22%7D%7D)

> Note: You may need to set environment variables in your MCP client.

<!-- x-release-please-start-version -->

The REST API documentation can be found on [swagger.io](http://swagger.io). KDocs are available on [javadoc.io](https://javadoc.io/doc/com.hello_world_testingggg.api/hello-world-testingggg-kotlin/0.0.1).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.hello_world_testingggg.api:hello-world-testingggg-kotlin:0.0.1")
```

### Maven

```xml
<dependency>
  <groupId>com.hello_world_testingggg.api</groupId>
  <artifactId>hello-world-testingggg-kotlin</artifactId>
  <version>0.0.1</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.pet.Pet

// Configures using the `helloworldtestingggg.apiKey` and `helloworldtestingggg.baseUrl` system properties
// Or configures using the `API_KEY` and `HELLO_WORLD_TESTINGGGG_BASE_URL` environment variables
val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.fromEnv()

val params: Pet = Pet.builder()
    .name("doggie")
    .addPhotoUrl("string")
    .build()
val pet: Pet = client.pet().update(params)
```

## Client configuration

Configure the client using system properties or environment variables:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

// Configures using the `helloworldtestingggg.apiKey` and `helloworldtestingggg.baseUrl` system properties
// Or configures using the `API_KEY` and `HELLO_WORLD_TESTINGGGG_BASE_URL` environment variables
val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    // Configures using the `helloworldtestingggg.apiKey` and `helloworldtestingggg.baseUrl` system properties
    // Or configures using the `API_KEY` and `HELLO_WORLD_TESTINGGGG_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build()
```

See this table for the available options:

| Setter    | System property                | Environment variable              | Required | Default value |
| --------- | ------------------------------ | --------------------------------- | -------- | ------------- |
| `apiKey`  | `helloworldtestingggg.apiKey`  | `API_KEY`                         | true     | -             |
| `baseUrl` | `helloworldtestingggg.baseUrl` | `HELLO_WORLD_TESTINGGGG_BASE_URL` | true     | `"/api/v3"`   |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient

val clientWithOptions: HelloWorldTestinggggClient = client.withOptions {
    it.baseUrl("https://example.com")
    it.maxRetries(42)
}
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Hello World Testingggg API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.pet().update(...)` should be called with an instance of `PetUpdateParams`, and it will return an instance of `Pet`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.models.pet.Pet

// Configures using the `helloworldtestingggg.apiKey` and `helloworldtestingggg.baseUrl` system properties
// Or configures using the `API_KEY` and `HELLO_WORLD_TESTINGGGG_BASE_URL` environment variables
val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.fromEnv()

val params: Pet = Pet.builder()
    .name("doggie")
    .addPhotoUrl("string")
    .build()
val pet: Pet = client.async().pet().update(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClientAsync
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClientAsync
import com.hello_world_testingggg.api.models.pet.Pet

// Configures using the `helloworldtestingggg.apiKey` and `helloworldtestingggg.baseUrl` system properties
// Or configures using the `API_KEY` and `HELLO_WORLD_TESTINGGGG_BASE_URL` environment variables
val client: HelloWorldTestinggggClientAsync = HelloWorldTestinggggOkHttpClientAsync.fromEnv()

val params: Pet = Pet.builder()
    .name("doggie")
    .addPhotoUrl("string")
    .build()
val pet: Pet = client.pet().update(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Streaming

The SDK defines methods that return response "chunk" streams, where each chunk can be individually processed as soon as it arrives instead of waiting on the full response. Streaming methods generally correspond to [SSE](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events) or [JSONL](https://jsonlines.org) responses.

Some of these methods may have streaming and non-streaming variants, but a streaming method will always have a `Streaming` suffix in its name, even if it doesn't have a non-streaming variant.

These streaming methods return [`StreamResponse`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/core/http/StreamResponse.kt) for synchronous clients:

```kotlin
client.pet().watchStatusStreaming(params).use { response ->
    response.asSequence().forEach { println(it) }
    println("No more chunks!")
}
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.hello_world_testingggg.api.core.http.Headers
import com.hello_world_testingggg.api.core.http.HttpResponseFor
import com.hello_world_testingggg.api.models.pet.Pet

val params: Pet = Pet.builder()
    .name("doggie")
    .addPhotoUrl("string")
    .build()
val pet: HttpResponseFor<Pet> = client.pet().withRawResponse().update(params)

val statusCode: Int = pet.statusCode()
val headers: Headers = pet.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.hello_world_testingggg.api.models.pet.Pet

val parsedPet: Pet = pet.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`HelloWorldTestinggggServiceException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                                                    |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/UnexpectedStatusCodeException.kt) |

  [`SseException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/SseException.kt) is thrown for errors encountered during [SSE streaming](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events) after a successful initial HTTP response.

- [`HelloWorldTestinggggIoException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggIoException.kt): I/O networking errors.

- [`HelloWorldTestinggggRetryableException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`HelloWorldTestinggggInvalidDataException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`HelloWorldTestinggggException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

Enable logging by setting the `HELLO_WORLD_TESTINGGGG_LOG` environment variable to `info`:

```sh
export HELLO_WORLD_TESTINGGGG_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export HELLO_WORLD_TESTINGGGG_LOG=debug
```

Or configure the client manually using the `logLevel` method:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.LogLevel

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .logLevel(LogLevel.INFO)
    .build()
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `hello-world-testingggg-kotlin-core` is published with a [configuration file](hello-world-testingggg-kotlin-core/src/main/resources/META-INF/proguard/hello-world-testingggg-kotlin-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`HelloWorldTestinggggOkHttpClient`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClient.kt) or [`HelloWorldTestinggggOkHttpClientAsync`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.hello_world_testingggg.api.models.pet.Pet

val pet: Pet = client.pet().update(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import java.time.Duration

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

If the proxy responds with `407 Proxy Authentication Required`, supply credentials by also configuring `proxyAuthenticator`:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import com.hello_world_testingggg.api.core.http.ProxyAuthenticator

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .proxy(...)
    // Or a custom implementation of `ProxyAuthenticator`.
    .proxyAuthenticator(ProxyAuthenticator.basic("username", "password"))
    .build()
```

### Connection pooling

To customize the underlying OkHttp connection pool, configure the client using the `maxIdleConnections` and `keepAliveDuration` methods:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient
import java.time.Duration

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    // If `maxIdleConnections` is set, then `keepAliveDuration` must be set, and vice versa.
    .maxIdleConnections(10)
    .keepAliveDuration(Duration.ofMinutes(2))
    .build()
```

If both options are unset, OkHttp's default connection pool settings are used.

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `hello-world-testingggg-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`HelloWorldTestinggggClient`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClient.kt), [`HelloWorldTestinggggClientAsync`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientAsync.kt), [`HelloWorldTestinggggClientImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientImpl.kt), and [`HelloWorldTestinggggClientAsyncImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientAsyncImpl.kt), all of which can work with any HTTP client
- `hello-world-testingggg-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`HelloWorldTestinggggOkHttpClient`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClient.kt) and [`HelloWorldTestinggggOkHttpClientAsync`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClientAsync.kt), which provide a way to construct [`HelloWorldTestinggggClientImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientImpl.kt) and [`HelloWorldTestinggggClientAsyncImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientAsyncImpl.kt), respectively, using OkHttp
- `hello-world-testingggg-kotlin`
  - Depends on and exposes the APIs of both `hello-world-testingggg-kotlin-core` and `hello-world-testingggg-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`hello-world-testingggg-kotlin` dependency](#installation) with `hello-world-testingggg-kotlin-core`
2. Copy `hello-world-testingggg-kotlin-client-okhttp`'s [`OkHttpClient`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`HelloWorldTestinggggClientImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientImpl.kt) or [`HelloWorldTestinggggClientAsyncImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientAsyncImpl.kt), similarly to [`HelloWorldTestinggggOkHttpClient`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClient.kt) or [`HelloWorldTestinggggOkHttpClientAsync`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`hello-world-testingggg-kotlin` dependency](#installation) with `hello-world-testingggg-kotlin-core`
2. Write a class that implements the [`HttpClient`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/core/http/HttpClient.kt) interface
3. Construct [`HelloWorldTestinggggClientImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientImpl.kt) or [`HelloWorldTestinggggClientAsyncImpl`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/client/HelloWorldTestinggggClientAsyncImpl.kt), similarly to [`HelloWorldTestinggggOkHttpClient`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClient.kt) or [`HelloWorldTestinggggOkHttpClientAsync`](hello-world-testingggg-kotlin-client-okhttp/src/main/kotlin/com/hello_world_testingggg/api/client/okhttp/HelloWorldTestinggggOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.hello_world_testingggg.api.core.JsonValue
import com.hello_world_testingggg.api.models.pet.PetUpdateParams

val params: PetUpdateParams = PetUpdateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/core/Values.kt) object to its setter:

```kotlin
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetUpdateParams

val params: PetUpdateParams = PetUpdateParams.builder()
    .pet(Pet.builder()
        .name("doggie")
        .addPhotoUrl("string")
        .build())
    .build()
```

The most straightforward way to create a [`JsonValue`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.hello_world_testingggg.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/core/Values.kt):

```kotlin
import com.hello_world_testingggg.api.core.JsonMissing
import com.hello_world_testingggg.api.models.pet.Pet
import com.hello_world_testingggg.api.models.pet.PetUpdateParams

val params: PetUpdateParams = PetUpdateParams.builder()
    .pet(Pet.builder()
        .name("doggie")
        .addPhotoUrl("string")
        .build())
    .name(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.hello_world_testingggg.api.core.JsonBoolean
import com.hello_world_testingggg.api.core.JsonNull
import com.hello_world_testingggg.api.core.JsonNumber
import com.hello_world_testingggg.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.pet().update(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.hello_world_testingggg.api.core.JsonField

val field: JsonField<Any> = client.pet().update(params)._field()

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = field.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = field.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`HelloWorldTestinggggInvalidDataException`](hello-world-testingggg-kotlin-core/src/main/kotlin/com/hello_world_testingggg/api/errors/HelloWorldTestinggggInvalidDataException.kt) only if you directly access the property.

Validating the response is _not_ forwards compatible with new types from the API for existing fields.

If you would still prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.hello_world_testingggg.api.models.pet.Pet

val pet: Pet = client.pet().update(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.hello_world_testingggg.api.models.pet.Pet

val pet: Pet = client.pet().update(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.hello_world_testingggg.api.client.HelloWorldTestinggggClient
import com.hello_world_testingggg.api.client.okhttp.HelloWorldTestinggggOkHttpClient

val client: HelloWorldTestinggggClient = HelloWorldTestinggggOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/swagger-girly/kotlin/issues) with questions, bugs, or suggestions.
