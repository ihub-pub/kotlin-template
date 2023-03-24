plugins {
    id("pub.ihub.plugin.ihub-java")
    id("pub.ihub.plugin.ihub-test")
    id("pub.ihub.plugin.ihub-verification")
    id("pub.ihub.plugin.ihub-git-hooks")
    kotlin("jvm") version "1.8.0"
}

iHubGitHooks {
    hooks = mapOf("pre-commit" to "./gradlew build", "commit-msg" to "./gradlew commitCheck")
}
