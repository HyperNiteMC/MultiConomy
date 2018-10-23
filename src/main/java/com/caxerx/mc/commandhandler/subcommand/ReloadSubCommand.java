package com.caxerx.mc.commandhandler.subcommand;

import com.caxerx.mc.commandhandler.SubCommand;
import com.caxerx.mc.interconomy.InterConomy;
import com.caxerx.mc.interconomy.cache.TransitionalType;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * Created by caxerx on 2017/4/1.
 */
public class ReloadSubCommand implements SubCommand {
    @Override
    public void execute(CommandSender sender, String[] args) {
        InterConomy.getInstance().reload();
    }

    @Override
    public List<String> getTabList(int arg) {
        return null;
    }

    @Override
    public String getPermission() {
        return "interconomy.reload";
    }

    @Override
    public String getName() {
        return "reload";
    }
}