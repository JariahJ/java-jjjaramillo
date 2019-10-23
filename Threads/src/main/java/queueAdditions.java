
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
class additionJob {

    queueAdditions qa;

    additionJob(queueAdditions qa) {
        this.qa = qa;
    }

    public void run() {

        int num = this.qa.getNumberFromList();
        this.qa.addToQueue(num);
    }
}

public class queueAdditions {

    Queue<Integer> q = new LinkedList<>();
    ArrayList<Integer> data = new ArrayList(5000);
    Object qLock = new Object();
    Object dataLock = new Object();

    void read() {
        //try to open the file
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\jaria\\Desktop\\java\\"
                    + "java-jjjaramillo\\Threads\\input.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        Scanner s = new Scanner(fr);
        while (s.hasNextInt()) {
            data.add(s.nextInt());
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
