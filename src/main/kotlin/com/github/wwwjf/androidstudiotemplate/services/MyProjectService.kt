package com.github.wwwjf.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.wwwjf.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
