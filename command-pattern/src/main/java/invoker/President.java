package invoker;

import commands.Command;

/**
 * Created by nirjal on 4/17/2017.
  The invoker class
 */

public class President {

    private Command command;

    public President(Command commmand) {
        this.command = commmand;
    }


    public  void execute(){
        this.command.launch();
    }
}
