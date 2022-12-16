package me.mldkyt.modules.settings

import me.mldkyt.Main
import me.mldkyt.modules.Module
import me.mldkyt.modules.ModuleRegistry
import net.dv8tion.jda.api.interactions.commands.build.Commands

class Settings : Module {
    override val name: String
        get() = "Settings"
    override val description: String
        get() = "Configure the bot to your liking. ${ModuleRegistry.modules.size} modules."

    override fun onLoad() {
        with(Main.jda.updateCommands()) {
            addCommands(
                Commands.slash("settings", "Configure the bot to your liking.")
            )
            queue()
        }
    }
}