package me.mldkyt.modules

import me.mldkyt.modules.settings.Settings
import me.mldkyt.modules.tempchannels.TemporaryChannels

class ModuleRegistry {
    companion object {
        @JvmStatic
        val modules: MutableList<Module> = mutableListOf()

        @JvmStatic
        fun loadModules() {
            with(modules) {
                add(Settings())
                add(TemporaryChannels())
            }
        }
    }
}