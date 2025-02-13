plugins {
    `java-library`
    id("com.github.ben-manes.versions") version "0.42.0"
}

allprojects{
    group = "com.kalimero2.team"
    version = "1.0.0-SNAPSHOT"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

subprojects{
    apply{
        plugin("java-library")
    }
}