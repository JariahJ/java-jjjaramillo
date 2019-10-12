
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jaria
 */
public class collection {

    Scanner s = new Scanner(System.in);
    Map<String, String> m = new HashMap<String, String>();
    String kee;
    String translation;

    public static void main(String[] args) {
        collection c = new collection();
        c.run();
    }

    void read() {
        kee = s.nextLine();
    }

    void solve() {
        if (m.containsKey(kee)) {
            translation = m.get(kee);
            System.out.println(translation);
        } else {
            System.out.println("Key: " + kee + " not found in map!");
        }
    }

    public String run() {
        System.out.println("Enter a number between one-nine (as a word) to get the "
                + "spanish translation!"
                + "Enter 'done' when finished");

        read();
        solve();
        write();

        this.m.put("one", "uno");
        this.m.put("two", "dos");
        this.m.put("three", "tres");
        this.m.put("four", "cuatro");
        this.m.put("five", "cinco");
        this.m.put("six", "seis");
        this.m.put("seven", "siete");
        this.m.put("eight", "ocho");
        this.m.put("nine", "nueve");

        return translation;
    }
}
