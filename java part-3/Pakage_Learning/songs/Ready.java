package Pakage_Learning.songs;
import Pakage_Learning.movie.Leo;
import Pakage_Learning.tamil.suriya.Karuppu;


public class Ready {
    public String singer = "Anirudh";
    public static void main(String[] args) {

        Ready r = new Ready();
        System.out.println("I am in song package , Singer name is :"+r.singer);
        Leo l2 = new Leo();
        System.out.println("I am in song package, actor name is "+l2.actor);
        Karuppu k = new Karuppu();
        System.out.println("I am in song pakage, villan name is,: "+k.villan);
    }
}
