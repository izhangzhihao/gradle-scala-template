plugins {
    scala
    id ("cz.alenkacz.gradle.scalafmt") version "1.13.0"
    id ("org.scoverage") version "4.0.1"
}

repositories {
    mavenLocal()
    google()
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.4.0")
    testImplementation("org.scalatest:scalatest_3:3.3.0-SNAP4")
    testImplementation("junit:junit:4.13.2")
}