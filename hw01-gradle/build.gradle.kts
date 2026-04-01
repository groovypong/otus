plugins {
    application
    alias(libs.plugins.shadow)
}

dependencies {
    implementation(libs.guava)
}

application {
    mainClass = "ru.otus.App"
}

tasks.shadowJar {
    manifest {
        attributes("Main-Class" to "ru.otus.HelloOtus")
    }

    archiveClassifier.set(null)
    archiveBaseName.set("толстый")
}
