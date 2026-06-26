plugins {
    id("hello-world-testingggg.kotlin")
    application
}

dependencies {
    implementation(project(":hello-world-testingggg-kotlin-core"))
    implementation(project(":hello-world-testingggg-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :hello-world-testingggg-kotlin-example:run` to run `Main`
    // Use `./gradlew :hello-world-testingggg-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.hello_world_testingggg.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
