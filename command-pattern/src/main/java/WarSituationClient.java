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

       CruiseMissileLauncher cruiserMissile = new CruiseMissileLauncher();
       NuclearMissileLauncher nuclearMissile = new NuclearMissileLauncher();

       Command cruiserCommand = new CruiserCommand(cruiserMissile);
       Command nuclearCommand = new NuclearCommand(nuclearMissile);

       President goodPresident = new President(cruiserCommand);
       President badPresident = new President(nuclearCommand);

       goodPresident.execute();
       badPresident.execute();


   }

}
