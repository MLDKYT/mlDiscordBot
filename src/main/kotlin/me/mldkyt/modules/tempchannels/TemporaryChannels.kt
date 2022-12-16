package me.mldkyt.modules.tempchannels

import me.mldkyt.modules.Module

class TemporaryChannels : Module {
    override val name: String
        get() = "Temporary Channels"
    override val description: String
        get() = "One voice channel that creates a new channel when someone joins."

    override fun onLoad() {

    }
}