package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.util.Position;
import emu.lunarcore.util.Utils;

@Command(label = "teleport", aliases = {"tp"}, permission = "player.teleport", requireTarget = true, desc = "/tp [+-relative x] [+-relative y] [+-relative z]. Teleports the player to the specified pos frm self. (x1000)")
public class TeleportCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Get arguments
        int x = Utils.parseSafeInt(args.get(0));
        int y = Utils.parseSafeInt(args.get(1));
        int z = Utils.parseSafeInt(args.get(2));
        
        // Set new pos
        Position newPos = args.getTarget().getPos().add(x, y, z);
        
        // Move Entity Officially
        args.getTarget().moveTo(newPos);
        
        // Send reply
        args.sendMessage("Teleported player to " + newPos.toString());
    }

}
