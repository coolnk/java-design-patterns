import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by nirjal on 4/19/2017.
 */
public class News {
    private List<Subscriber> subscribers;
    private String  story;
    public News(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }
    public News(){
        subscribers = new ArrayList<>();
    }

    public void addSubscribers(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void update(String story){
        this.story = story;
        System.out.println(story);
        update();
    }

    private void update(){
        subscribers.stream().filter(Objects::nonNull).forEach(channel -> channel.update(story));
    }
}
