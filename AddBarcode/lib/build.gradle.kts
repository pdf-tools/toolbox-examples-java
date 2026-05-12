plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    id("application")
}

application {
    mainClass.set("ToolboxAddBarcode.ToolboxAddBarcode")
}
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
} 

java {
    sourceSets {
        main {
            java {
                srcDir("lib/src/main/java")
            }
        }
    }
}

dependencies {
    implementation("com.pdftools:toolbox:1.12.1")
}