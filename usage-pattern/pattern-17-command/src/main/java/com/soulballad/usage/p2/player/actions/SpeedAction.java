package com.soulballad.usage.p2.player.actions;

import com.soulballad.usage.p2.player.GPlayer;
import com.soulballad.usage.p2.player.IAction;
/**
 * Created by Tom.
 */
public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.speed();
    }
}
