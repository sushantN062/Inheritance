import model.Children;
import model.Hobby;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("Sleeping like a maniac", "L");
        Hobby h2 = new Hobby("Singing", "L");
        Hobby h3 = new Hobby("Listing to music", "L");
        Hobby h4 = new Hobby("Watching movies", "L");


        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);


        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h3);
        hobby2.add(h4);

        Children c1 = new Children("Jose", "A", 38, hobby1);
        Children c2 = new Children("Pythagoras", "B", 97, hobby2);

        System.out.println(c1.getFullName());
        c1.getHobby();


    }
}