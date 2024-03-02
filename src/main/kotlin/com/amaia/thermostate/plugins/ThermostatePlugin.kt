package org.example.com.amaia.thermostate.plugins

import org.example.com.amaia.thermostate.plugins.execution.ExecutionResult

interface ThermostatePlugin {

    fun initialize(context: ThermostateContext)

    /**
     * Thie will be the entrance to the thermostate
     * Means to be called periodically by thermostate
     */
    fun scheduledExecution(): ExecutionResult

    fun shareData(): Any
}
