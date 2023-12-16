package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;

@Command(label = "stop", aliases = {"stop"}, permission = "admin.stop", requireTarget = false, desc = "/stop. Stops the server and kicks all players")
public class StopCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Notify Console Of Stop Success
        args.sendMessage("The GameServer will be stopped now");
        
        // Notify Each Player OnKick
        for (Player p : LunarCore.getGameServer().getPlayers().values()) {
            args.sendMessage("The GameServer has been commanded to stop.");
            args.sendMessage("You will be kicked from the server now.");
        }
        
        // Shutdown gameserver and save
        //LunarCore.onShutdown();
        
        // Force Exit Program After
        System.exit(1000);
    }

}
