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
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.kohsuke:github-api:1.314")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.eclipse.jgit:org.eclipse.jgit:6.5.0.202303070854-r")
}

tasks.test {
    useJUnitPlatform()
}