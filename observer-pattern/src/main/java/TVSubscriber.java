/**
 * Created by nirjal on 4/19/2017.
 */
public class TVSubscriber implements Subscriber {


    public void update(String story) {
        System.out.print("TV channel has a story "+story);
    }
}
