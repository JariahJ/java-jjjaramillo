
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

    public static void main(String[] args) throws Exception {
        App app = new App();

        String input;
        int numShifts = 1;
        Scanner S = new Scanner(System.in);

        while (numShifts != 0) {
            numShifts = S.nextInt();
            input = S.next();
            S.nextLine();

            app.run(app.a, numShifts, input);
        }

    }

    private void run(char[] a, int numShifts, String input) {
        
    }

}
