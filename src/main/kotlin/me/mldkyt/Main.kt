package me.mldkyt

import me.mldkyt.modules.ModuleRegistry
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder

class Main {
    companion object {
        @JvmStatic
        public var jda: JDA = JDABuilder.createDefault("token")
            .addEventListeners(Listener())
            .build()

        @JvmStatic
        fun main() {
            ModuleRegistry.loadModules()
            jda.awaitReady()
        }
    }
}