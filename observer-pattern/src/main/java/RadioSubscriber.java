/**
 * Created by nirjal on 4/19/2017.
 */
public class RadioSubscriber implements Subscriber {

    public void update(String story) {
        System.out.println("Radio channel has a story "+ story);
    }
}
