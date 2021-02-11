package Module5.Assignments.AnimalPopulation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalPopulation {
    public static void main(String[] args) throws IOException {
        // variables
        Scanner scanner = new Scanner(System.in);
        int trails = 0;
        boolean finished = false;
        int loopCount = 1;
        // squirrel count
        int rs = 0;
        int gs = 0;
        // message queue
        List<String> queue = new ArrayList<String>();

        // get amount of trails
        System.out.print("Trails to run: ");
        trails = scanner.nextInt();
        while (trails < 1000) {
            System.out.println("Please enter a value greater than 1000.");
            System.out.print("Trails to run: ");
            trails = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Simulating trails...");

        // find squirrels
        for (loopCount = 1; loopCount <= trails; loopCount++) {
            double random = Math.random();
            if (random < 0.9) {
                if (random < 0.45) {
                    queue.add("Red squirrel");
                    rs++;
                } else if (random > 0.45) {
                    queue.add("Grey squirrel");
                    gs++;
                }
            } else if (random > 0.9) {
                queue.add("Fox squirrel");
                createFile(queue, rs, gs, loopCount);
                finished = true;
                break;
            }
        }

        // in case no fox squirrels were found when the trails end, create the file
        if (!finished) {
            createFile(queue, rs, gs, loopCount);
        }

        // read file
        readFile();
    }

    public static void createFile(List<String> queue, int rs, int gs, int trail) throws IOException {
        // print data to a file
        PrintWriter pw = new PrintWriter(new File("Module5/Assignments/AnimalPopulation/results.txt"));
        pw.println("Trail: " + trail);
        pw.println("Red squirrels: " + rs);
        pw.println("Grey squirrels: " + gs);
        pw.println();

        for (int i = 0; i < queue.size(); i++) {
            pw.println(queue.get(i));
        }

        pw.close();
    }

    public static void readFile() throws IOException {
        // read results file
        File results = new File("Module5/Assignments/AnimalPopulation/results.txt");
        Scanner scanner = new Scanner(results);

        int rs = 0;
        int gs = 0;
        double average = 0.0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            // read important information
            if (line.contains("Red squirrels:")) {
                rs = Integer.parseInt(line.substring(15));
            } else if (line.contains("Grey squirrels:")) {
                gs = Integer.parseInt(line.substring(16));
            }
        }

        // find average (add 1 for fox squirrel)
        int total = rs + gs + 1;
        average = Math.round(((double) total / 3) * 100.0) / 100.0;
        
        // display results
        System.out.println("Results: ");
        System.out.println("The average number of squirrels observed until spotting a Fox Squirrel at the city park is: " + average);

        scanner.close();
    }
}
