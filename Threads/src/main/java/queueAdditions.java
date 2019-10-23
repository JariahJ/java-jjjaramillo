
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

class additionJob {
    
}

public class queueAdditions {

    Queue<Integer> q = new LinkedList<>();

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

    }

    void parallelAddition(int threads) {
        ArrayList<additionJob> jobs = new ArrayList<additionJob>(threads);
    }

    void parallelAddition() {
        int cores = Runtime.getRuntime().availableProcessors();
        int threads = 2 * cores;
        parallelAddition(threads);
    }

    public static void main(String[] args) {
        queueAdditions qa = new queueAdditions();
        qa.read();
    }

}
