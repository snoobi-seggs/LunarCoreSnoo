package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.challenge.ChallengeInstance;
import emu.lunarcore.proto.ChallengeSettleNotifyOuterClass.ChallengeSettleNotify;
import emu.lunarcore.proto.ItemListOuterClass.ItemList;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketChallengeSettleNotify extends BasePacket {

    public PacketChallengeSettleNotify(ChallengeInstance challenge) {
        super(CmdId.ChallengeSettleNotify);
        
        var data = ChallengeSettleNotify.newInstance()
                .setChallengeId(challenge.getExcel().getId())
                .setIsWin(challenge.isWin())
                .setReward(ItemList.newInstance())
                .setStars(challenge.getStars());
        
        this.setData(data);
    }
}
