package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the vcsRoot with id = 'Dfg'
accordingly, and delete the patch script.
*/
changeVcsRoot(RelativeId("Dfg")) {
    val expected = GitVcsRoot({
        id("Dfg")
        name = "password"
        url = "dfgdfg"
    })

    check(this == expected) {
        "Unexpected VCS root settings"
    }

    (this as GitVcsRoot).apply {
        authMethod = password {
            userName = "a"
            password = "credentialsJSON:bacb68ea-3932-4eaf-976e-1b167bccdd3c"
        }
    }

}
