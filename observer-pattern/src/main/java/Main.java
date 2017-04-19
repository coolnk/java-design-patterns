/**
 * Created by nirjal on 4/19/2017.
 */
public class Main {

    public static void main(String[] args){
        News news = new News();
        news.update("I got a big cock");

        news.addSubscribers(new RadioSubscriber());
        news.addSubscribers(new TVSubscriber());
        news.update("No I was just kidding");

    }
}
