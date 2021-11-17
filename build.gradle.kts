plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31" 

    application 
}

repositories {
    mavenCentral() 
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")

    //Kotlin Test
    testImplementation("org.jetbrains.kotlin:kotlin-test") 
    // testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.5.31")
}



dependencies {
    //Spek
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.17")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.5.31")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.17")
    // spek requires kotlin-reflect, can be omitted if already in the classpath
    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
}

tasks.test {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}


application {
    mainClass.set("Cat") 
}