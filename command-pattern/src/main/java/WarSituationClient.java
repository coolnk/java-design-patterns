import commands.Command;
import commands.CruiserCommand;
import commands.NuclearCommand;
import invoker.President;
import receivers.CruiseMissileLauncher;
import receivers.NuclearMissileLauncher;

/**
 * Created by nirjal on 4/17/2017.
 */
public class WarSituationClient {

   public static void main( String [] args)
   {

       CruiseMissileLauncher cruiseMissileLauncher = new CruiseMissileLauncher();
       NuclearMissileLauncher nuclearMissileLauncher = new NuclearMissileLauncher();

       Command launchCruise = new CruiserCommand(cruiseMissileLauncher);
       Command launchNuclear = new NuclearCommand(nuclearMissileLauncher);

       President goodPresident = new President(launchCruise);
       President badPresident = new President(launchNuclear);

       goodPresident.execute();
       badPresident.execute();


   }

}
