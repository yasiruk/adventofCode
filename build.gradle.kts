plugins {
    kotlin("jvm") version "1.4.21"
}
val kotest_version:String by project
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
tasks.withType<Test> {
    useJUnitPlatform()
}
dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotest_version") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core-jvm:$kotest_version") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property-jvm:$kotest_version") // for kotest property test
}
