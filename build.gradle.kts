plugins {
    id("java")
}

group = "com.miti99"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.36")
    compileOnly("org.projectlombok:lombok:1.18.36")

    implementation("org.apache.logging.log4j:log4j-core:2.24.3")
    implementation("org.apache.logging.log4j:log4j-layout-template-json:2.24.3")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.24.3")

    implementation("org.slf4j:slf4j-api:2.0.16")
}
