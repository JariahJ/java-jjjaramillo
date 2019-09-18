
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
public class App {

    char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', '.'};
    int numShifts = 1;
    String input;

    public static void main(String[] args) throws Exception {
        App app = new App();

        Scanner S = new Scanner(System.in);

        while (true) {
            app.numShifts = S.nextInt();
            
            if (app.numShifts == 0){
                break;
            }
            app.input = S.next();
            S.nextLine();
            
            app.run(app.a, app.numShifts, app.input);
        }

    }

    private String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    public String run(char[] a, int numShifts, String input) {
        String encrypted = "";
 
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= a.length-1; j++) {
                if (input.charAt(i) == a[j]) {
                    if ((j + numShifts) > a.length-1) {
                        encrypted += a[(j+numShifts) - (a.length-1) - 1];
                    } else {
                        encrypted += a[j + numShifts];
                    }
                }
            }
        }
        System.out.println(reverseString(encrypted));
        return reverseString(encrypted);
    }

}
