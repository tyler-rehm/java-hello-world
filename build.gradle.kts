plugins {
    application
    java
}

group = "io.github.tylerrehm"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

application {
    mainClass.set("io.github.tylerrehm.Main")
}

repositories {
    mavenCentral()
}
