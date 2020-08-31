package com.soulballad.usage.p2.player;


import com.soulballad.usage.p2.player.actions.PauseAction;
import com.soulballad.usage.p2.player.actions.PlayAction;
import com.soulballad.usage.p2.player.actions.SpeedAction;
import com.soulballad.usage.p2.player.actions.StopAction;

public class Test {
    public static void main(String[] args) {

        GPlayer player = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }
}
