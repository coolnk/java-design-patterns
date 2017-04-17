package commands;

import receivers.NuclearMissileLauncher;

/**
 * Created by nirjal on 4/17/2017.
 * The commands.NuclearCommand Object that has the receiver and know which action to take on the receiver
 *
 */
public class NuclearCommand implements Command {

    private NuclearMissileLauncher missile;
    public NuclearCommand(NuclearMissileLauncher missile) {
        this.missile = missile;
    }

    public void launch() {
        missile.launchNuclear();
    }
}
