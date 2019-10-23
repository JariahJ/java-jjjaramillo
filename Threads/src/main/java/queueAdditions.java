
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
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

    queueAdditions qa;

    additionJob(queueAdditions qa) {
        this.qa = qa;
    }

    public void run() {
        if (this.qa.s.hasNextInt()) {
            int num = this.qa.getNumberFromList();
            this.qa.addToQueue(num);
        }
    }
}

public class queueAdditions {

    Scanner s;
    FileReader fr;
    Queue<Integer> q = new LinkedList<>();
    ArrayList<Integer> data = new ArrayList(5000);
    Object qLock = new Object();
    Object dataLock = new Object();

    void read() {
        //try to open the file
        fr = null;
        try {
            fr = new FileReader("C:\\Users\\jaria\\Desktop\\java\\"
                    + "java-jjjaramillo\\Threads\\input.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        s = new Scanner(fr);
        while (s.hasNextInt()) {
            data.add(s.nextInt());
        }
        try {
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    int getNumberFromList() {
        synchronized (dataLock) {
            int num = data.get(0);
            data.remove(0);
            return num;
        }
    }

    void addToQueue(int num) {
        synchronized (qLock) {
            q.add(num);
        }
    }

    void createThreads(int threads) {
        ArrayList<additionJob> jobs = new ArrayList<additionJob>(threads);
        for (int thread = 0; thread < threads; ++thread) {
            jobs.add(new additionJob(this));
        }
        while (!data.isEmpty()) {
            jobs.parallelStream().forEach(number -> number.run());
        }
        if (data.isEmpty()) System.out.println("All data added to queue");
    }

    void numberOfThreads() {
        int cores = Runtime.getRuntime().availableProcessors();
        int threads = 2 * cores;
        createThreads(threads);
    }

    public static void main(String[] args) {
        queueAdditions qa = new queueAdditions();
        qa.read();
    }

}
