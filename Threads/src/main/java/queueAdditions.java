
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jaria
 */
public class queueAdditions {

    PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<>(5000);

    void read() {
        //try to open the file
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\jaria\\Desktop\\java-jjjaramillo"
                    + "\\Threads\\input.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        Scanner s = new Scanner(fr);
        while (s.hasNext()) {
            q.add(s.nextInt());
            s.nextLine();
        }
        for (int v : q) {
            System.out.println(v);
        }

    }

    public static void main(String[] args) {
        queueAdditions qa = new queueAdditions();
        qa.read();
    }

}
