package me.ry00001.jbot.commands;

import me.ry00001.jbot.core.*;
import me.ry00001.jbot.Jbot;
import java.util.ArrayList;

class Kotlin(val jbot: Jbot): Command("kotlin", "this command is a .kt file") {

    override fun run(ctx: CommandContext, args: ArrayList<String>) {
        ctx.send("awau")
    }
}