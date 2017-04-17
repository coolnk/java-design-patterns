package commands;

import receivers.CruiseMissileLauncher;

/**
 * Created by nirjal on 4/17/2017.
 */
public class CruiserCommand  implements Command{

    private CruiseMissileLauncher missile;

    public CruiserCommand(CruiseMissileLauncher missile) {
        this.missile = missile;
    }

    public void launch() {
        missile.launchCruiser();
    }
}
