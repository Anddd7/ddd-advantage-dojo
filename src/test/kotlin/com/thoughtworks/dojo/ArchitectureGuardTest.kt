package com.thoughtworks.dojo

import com.tngtech.archunit.core.domain.JavaClasses
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.library.Architectures

@AnalyzeClasses(packages = ["com.thoughtworks.dojo"])
class ArchitectureGuardTest {

    @ArchTest
    fun `should pass the context dependency check for all packages`(classes: JavaClasses) =
        Architectures.layeredArchitecture()
            .layer("CH").definedBy("..ch..")
            .layer("GX").definedBy("..gx..")
            .layer("Shared").definedBy("..shared..")

            .whereLayer("CH").mayNotBeAccessedByAnyLayer()
            .whereLayer("GX").mayNotBeAccessedByAnyLayer()
            .check(classes)

    @ArchTest
    fun `should pass the layer dependency check for all packages`(classes: JavaClasses) =
        Architectures.layeredArchitecture()
            .layer("Infra").definedBy("..infra..")
            .layer("Domain").definedBy("..domain..")
            .layer("Application").definedBy("..application..")

            .whereLayer("Infra").mayNotBeAccessedByAnyLayer()
            .whereLayer("Application").mayOnlyBeAccessedByLayers("Infra")
            .check(classes)
}
