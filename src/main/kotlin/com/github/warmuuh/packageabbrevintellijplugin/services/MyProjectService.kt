package com.github.warmuuh.packageabbrevintellijplugin.services

import com.github.warmuuh.packageabbrevintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
