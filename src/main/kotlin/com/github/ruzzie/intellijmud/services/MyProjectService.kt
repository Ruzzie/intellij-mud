package com.github.ruzzie.intellijmud.services

import com.intellij.openapi.project.Project
import com.github.ruzzie.intellijmud.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
