
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

    public static void main(String[] args) {
        collection c = new collection();
        System.out.println(c.run());
    }

    private String run() {
        boolean done = false;
        String translation = null;
        while (!done) {
            System.out.println("Enter a number between 1-9 to get the "
                    + "spanish translation!"
                    + "Enter 'done' when finished");

            String kee = s.nextLine();

            if (kee == "done" + System.lineSeparator()) {
                done = true;
            }
            

            this.m.put("one", "uno");
            this.m.put("two", "dos");
            this.m.put("three", "tres");
            this.m.put("four", "cuatro");
            this.m.put("five", "cinco");
            this.m.put("six", "seis");
            this.m.put("seven", "siete");
            this.m.put("eight", "ocho");
            this.m.put("nine", "nueve");

            if (m.containsKey(kee)) {
                translation = m.get(kee);
                System.out.println(translation);
            } else {
                System.out.println("Key: " + kee + " not found in map!");
            }

        }
        return translation;
    }
}
