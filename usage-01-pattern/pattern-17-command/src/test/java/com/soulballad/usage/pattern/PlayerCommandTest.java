package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.player.Controller;
import com.soulballad.usage.pattern.p2.player.GPlayer;
import com.soulballad.usage.pattern.p2.player.actions.PauseAction;
import com.soulballad.usage.pattern.p2.player.actions.PlayAction;
import com.soulballad.usage.pattern.p2.player.actions.SpeedAction;
import com.soulballad.usage.pattern.p2.player.actions.StopAction;
import org.junit.Test;

public class PlayerCommandTest {

    @Test
    public void test_player() {
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
