# Lesson 01 - Gradle + Java App Setup

## What I Set Up
- I set up a Java app using Gradle with the Kotlin DSL.
- My config lives in `build.gradle.kts`.

## Key Learnings
- I learned that `./gradlew run` only exists if the `application` plugin is applied.

```kotlin
plugins {
    application
    java
}
```

- I had to explicitly tell Gradle which class to run.

```kotlin
application {
    mainClass.set("io.github.tylerrehm.Main")
}
```

## Issues I Hit
- I hit a Java version mismatch (SDK defaulted to 11, Gradle wanted 17, and I preferred running newer Java).
  - Gradle toolchains are strict.
  - I am running Java 25, so I updated the toolchain to match.

```kotlin
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}
```

- `ClassNotFoundException` due to project/package alignment.
  - I fixed it by aligning folder structure, package name, and Gradle config.
  - The correct source path is `src/main/java/io/github/tylerrehm/Main.java` (it was `src/main/Main.java`).
  - The correct package declaration is `package io.github.tylerrehm;`

## Verification
- I ran from terminal:
  - `./gradlew run`
- Output:
  - `Hello World`

