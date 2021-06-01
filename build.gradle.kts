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
    implementation("org.scala-lang:scala-library:2.13.6")
    testImplementation("org.scalatest:scalatest_2.12:3.3.0-SNAP3")
    testImplementation("junit:junit:4.13.2")
}

scala {
    zincVersion.set("1.3.4")
}