plugins {
    // Apply the Java plugin
    `java`
    // Apply the application plugin
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

// Specify the main class for the application
application {
    mainClass.set("hexlet.code.App")
}

// Specify the repositories to use
repositories {
    mavenCentral()
}

// Specify the dependencies for the project
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib") // Add Kotlin standard library if needed
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

// Configure the test task to use JUnit platform
tasks.test {
    useJUnitPlatform()
}

