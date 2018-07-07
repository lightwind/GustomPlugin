package com.ly.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Create by LiuYang on 2018/7/7 10:44
 */
class StandAlonePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('showStandAlonePlugin') {
            doLast {
                println('task in StandAlonePlugin')
            }
        }
    }
}
