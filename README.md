# hello-world

A minimal Java application built with Gradle.

## Overview

This project defines a single entry point in `io.github.tylerrehm.Main` that prints:

```
Hello World
```

## Project details

- **Project name:** `hello-world`
- **Group:** `io.github.tylerrehm`
- **Version:** `1.0-SNAPSHOT`
- **Build tool:** Gradle Wrapper (`gradlew`), configured for Gradle `9.4.0`
- **Language:** Java
- **Java toolchain target:** Java `25`
- **Main class:** `io.github.tylerrehm.Main`

## Prerequisites

- A JDK compatible with your Gradle version.
  - Gradle 9.4 requires Java 17+ to run.
- For this project configuration, Java 25 is set as the toolchain target.

If you have multiple JDKs installed, set `JAVA_HOME` to a compatible JDK before running Gradle.

## Usage

From the project root:

### Run the app

```bash
./gradlew run
```

### Build the app

```bash
./gradlew build
```

### Clean build outputs

```bash
./gradlew clean
```

## Project structure

```text
src/main/java/io/github/tylerrehm/Main.java   # Application entry point
build.gradle.kts                              # Build configuration
settings.gradle.kts                           # Project name
gradle/wrapper/gradle-wrapper.properties      # Gradle wrapper version
```

## Notes

This project is configured with a Java 25 toolchain. If Gradle starts with an older JVM, set `JAVA_HOME` to a Java 25 JDK (or at least Java 17+ for Gradle runtime compatibility).

If you use SDKMAN, this repo includes `.sdkmanrc` pinned to Java `25.0.3-tem`.

```bash
sdk env
```

