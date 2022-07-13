package com.soulballad.usage.pattern.p2.player.actions;

import com.soulballad.usage.pattern.p2.player.GPlayer;
import com.soulballad.usage.pattern.p2.player.IAction;

public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.speed();
    }
}
