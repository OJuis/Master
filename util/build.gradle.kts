plugins {
    id("java")
}

group = "top.fiun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("commons-codec:commons-codec:1.15")
}

tasks.test {
    useJUnitPlatform()
}