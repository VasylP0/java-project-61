plugins {
    application
    kotlin("jvm") version "1.8.0"
    id("checkstyle") // no version specified here
}

// Application configuration
application {
    mainClass.set("hexlet.code.App")
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

// Checkstyle configuration
checkstyle {
    // toolVersion = "10.8" // Remove this line or comment it out
    configFile = file("config/checkstyle/checkstyle.xml")
}
