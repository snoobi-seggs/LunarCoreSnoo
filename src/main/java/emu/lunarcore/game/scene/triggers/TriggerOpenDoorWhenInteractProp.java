package emu.lunarcore.game.scene.triggers;

import emu.lunarcore.game.enums.PropState;
import emu.lunarcore.game.enums.PropType;
import emu.lunarcore.game.scene.Scene;
import emu.lunarcore.game.scene.entity.EntityProp;
import emu.lunarcore.game.scene.entity.GameEntity;
import emu.lunarcore.util.Utils;
import lombok.Getter;

@Getter
public class TriggerOpenDoorWhenInteractProp extends PropTrigger {
    private int groupId;
    private int gateInstId;
    private int controllerInstId;
    
    public TriggerOpenDoorWhenInteractProp(String gateKey, int instId) {
        String[] gate = gateKey.split(",");
        this.groupId = Utils.parseSafeInt(gate[0]);
        this.gateInstId = Utils.parseSafeInt(gate[1]);
        this.controllerInstId = instId;
    }
    
    @Override
    public PropTriggerType getType() {
        return PropTriggerType.OPEN_DOOR;
    }
    
    @Override
    public boolean shouldRun(int groupId, int instId) {
        return this.groupId == groupId && this.controllerInstId == instId;
    }
    
    @Override
    public void run(Scene scene) {
        synchronized (scene) {
            for (GameEntity entity : scene.getEntities().values()) {
                if (entity.getGroupId() != this.groupId) {
                    continue;
                }
                
                if (entity instanceof EntityProp prop) {
                    if (prop.getInstId() == this.gateInstId) {
                        prop.setState(PropState.Open);
                    }
                }
            }
        }
    }
}
