plugins {
    application
    kotlin("jvm") version "1.8.0"
    id("checkstyle")
}

application {
    mainClass.set("hexlet.code.App") // Ensure this class exists and is correct
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib")) // Kotlin standard library

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}

// The Jar task configuration
tasks.named<Jar>("jar") {
    archiveBaseName.set("app") // Change "app" to your preferred name
}

// Install Dist configuration (no unnecessary tasks)
tasks.named("installDist") {
    dependsOn(tasks.named("assemble"))
}

// Checkstyle configuration
checkstyle {
    configFile = file("config/checkstyle/checkstyle.xml")
}
