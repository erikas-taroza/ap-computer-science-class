package Module14.Assignments.FrequencyAnalysis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class takes text and finds the frequency of a character (in count and
 * percent) in the text. It can read the text from a file and also write the
 * result to a file.
 * 
 * @author Erikas Taroza
 * @version 02/24/21
 * @param textSample = the text sample that will be used when running the
 *                   frequency methods
 */

public class FrequencyAnalysis {
    String textSample = "";

    // constructor that reads a given file
    public FrequencyAnalysis(File textFile) {
        this.textSample = ReadTextFile(textFile.getPath());
    }

    // constructor that takes in a string as the text to analyze
    public FrequencyAnalysis(String text) {
        this.textSample = text;
    }

    // read the text file
    public static String ReadTextFile(String path) {
        String content = "";

        // read each line
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
            }

            scanner.close();
        } catch (FileNotFoundException exception) {
            // catch errors
            System.out.println("ERROR: Could not find file. \n MESSAGE: " + exception);
        }

        return content.trim();
    }

    // write result
    public boolean WriteResults(String pathToWrite, String samplePath, char character, int frequency,
            double percentFrequency) {
        // create file
        File file = new File(pathToWrite);

        // write to the file
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Character: " + character);
            writer.println("Frequency (integer): " + frequency);
            writer.println("Frequency (percent): " + percentFrequency + "%");
            writer.println("Sample path: " + samplePath);
            writer.println();
            writer.close();
            fileWriter.close();

            return true;
        } catch (IOException exception) {
            // catch errors
            System.out.println("ERROR: Could not write results to file. \n MESSAGE: " + exception);
            return false;
        }
    }

    // get the frequency of a character in the text sample
    public int FrequencyOf(char character) {
        int count = 0;

        for (int i = 0; i < textSample.length(); i++) {
            if (textSample.charAt(i) == character) {
                count++;
            }
        }

        return count;
    }

    // get the percent frequency of a character in the text sample
    public double PercentOf(char character) {
        return Math.round(FrequencyOf(character) / (double) textSample.length() * 1000.0) / 1000.0 * 100.0;
    }
}
