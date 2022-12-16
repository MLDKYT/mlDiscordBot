package me.mldkyt.modules

interface Module {
    val name: String
    val description: String

    fun onLoad()
}