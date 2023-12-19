package emu.lunarcore.game.scene.triggers;

import emu.lunarcore.game.enums.PropState;
import emu.lunarcore.game.enums.PropType;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.game.scene.entity.EntityProp;
import emu.lunarcore.game.scene.entity.GameEntity;
import emu.lunarcore.util.Utils;
import lombok.Getter;

@Getter
public class TriggerUnhideChestWhenCompletePuzzle extends PropTrigger {
    private int groupId;
    private int chestInstId;
    private int puzzleInstId;
    private int iconInstId;
    
    public TriggerUnhideChestWhenCompletePuzzle(String gateKey, int instId) {
        String[] gate = gateKey.split(",");
        this.groupId = Utils.parseSafeInt(gate[0]);
        this.chestInstId = Utils.parseSafeInt(gate[1]);
        this.puzzleInstId = instId;
        this.iconInstId = 300006; // TODO: Find way to get this from res
    }
    
    @Override
    public PropTriggerType getType() {
        return PropTriggerType.UNHIDE_CHEST_WHEN_COMPLETE_PUZZLE;
    }
    
    @Override
    public boolean shouldRun(int groupId, int instId) {
        return this.groupId == groupId && this.puzzleInstId == instId;
    }
    
    @Override
    public void run(Scene scene) {
        synchronized (scene) {
            for (GameEntity entity : scene.getEntities().values()) {
                if (entity.getGroupId() != this.groupId) {
                    continue;
                }
                
                if (entity instanceof EntityProp prop) {
                    // Set Chest Appear From Hidden (usually)
                    if (prop.getInstId() == this.chestInstId) {
                        prop.setState(PropState.ChestClosed);
                    }
                    // Remove Icon from map
                    if (prop.getInstId() == this.iconInstId) {
                        prop.setState(PropState.Open);
                    }
                }
            }
        }
    }
}
