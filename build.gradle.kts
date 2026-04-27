plugins {
    application                                                     // Apply the application plugin to add support for building a Java application
    java
}

group = "io.github.tylerrehm"                                       // Set the Group ID for the project (IntelliJ)
version = "1.0-SNAPSHOT"                                            // Set the version of the project (IntelliJ)

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))    // Set Java language version to 25
    }
}

application {
    mainClass.set("io.github.tylerrehm.Main")                       // Set the main class for the application
}

repositories {
    mavenCentral()                                                  // Use Maven Central repository to resolve dependencies
}
