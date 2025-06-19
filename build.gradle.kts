plugins {
    id("pub.ihub.plugin.ihub-kotlin")
    id("pub.ihub.plugin.ihub-test")
    id("pub.ihub.plugin.ihub-verification")
    id("pub.ihub.plugin.ihub-git-hooks")
}

// TODO Spring Boot 还未兼容kotlin2.0
iHubBom {
    importBoms {
        group("org.jetbrains.kotlin").module("kotlin-bom").version("2.1.21")
    }
}

iHubGitHooks {
    hooks.set(mapOf(
        "pre-commit" to "./gradlew build",
        "commit-msg" to "./gradlew commitCheck"
    ))
}
