package commands;

import receivers.PatriotMissileLauncher;

/**
 * Created by nirjal on 4/17/2017.
 */
public class PatriotCommand implements  Command{
    private PatriotMissileLauncher missile;

    public PatriotCommand(PatriotMissileLauncher missile) {
        this.missile = missile;
    }

    public void launch() {
        missile.initiatePatriot();
    }
}
