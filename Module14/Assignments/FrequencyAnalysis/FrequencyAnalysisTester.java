package Module14.Assignments.FrequencyAnalysis;

import java.io.File;
import java.util.Scanner;

/**
 * This class is the client class that runs the methods in
 * FrequencyAnalysis.java The class asks for user input and produces results.
 * 
 * @author Erikas Taroza
 * @version 02/24/21
 */

public class FrequencyAnalysisTester {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String fileName = "";
                char characterToAnalyze = ' ';

                // get file name
                System.out.print("Name of file to read: ");
                fileName = scanner.nextLine().trim();
                System.out.println();

                // get character to analyze
                System.out.print("Character to analyze: ");
                characterToAnalyze = scanner.next().toCharArray()[0];
                System.out.println();

                // create analysis
                FrequencyAnalysis fa = new FrequencyAnalysis(
                                new File("Module14/Assignments/FrequencyAnalysis/" + fileName + ".txt"));

                // get frequency
                int frequency = fa.FrequencyOf(characterToAnalyze);
                double percentFrequency = fa.PercentOf(characterToAnalyze);
                System.out.println("Frequency of \'" + characterToAnalyze + "\': " + frequency);
                System.out.println("Frequency % of \'" + characterToAnalyze + "\': " + percentFrequency + "%");

                // write results
                boolean success = fa.WriteResults("Module14/Assignments/FrequencyAnalysis/" + fileName + "Freq.txt",
                                "Module14/Assignments/FrequencyAnalysis/" + fileName + ".txt", characterToAnalyze,
                                frequency, percentFrequency);

                // print if the write was successful
                if (success) {
                        System.out.println("SUCCESS: Results printed to " + "Module14/Assignments/FrequencyAnalysis/"
                                        + fileName + "Freq.txt");
                }

                // AnalyzeAll();
                scanner.close();
        }

        // analyzes all the letters in the alphabet in the plaintext and ciphertext
        public static void AnalyzeAll() {
                final char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

                for (char c : alphabet) {
                        FrequencyAnalysis fa = new FrequencyAnalysis(FrequencyAnalysis
                                        .ReadTextFile("Module14/Assignments/FrequencyAnalysis/plaintext.txt")
                                        .toLowerCase());

                        int frequency = fa.FrequencyOf(c);
                        double percentFrequency = fa.PercentOf(c);
                        System.out.println("Frequency of \'" + c + "\': " + frequency);
                        System.out.println("Frequency % of \'" + c + "\': " + percentFrequency + "%");

                        fa.WriteResults("Module14/Assignments/FrequencyAnalysis/plaintextFreq.txt",
                                        "Module14/Assignments/FrequencyAnalysis/plaintext.txt", c, frequency,
                                        percentFrequency);
                }

                for (char c : alphabet) {
                        FrequencyAnalysis fa = new FrequencyAnalysis(FrequencyAnalysis
                                        .ReadTextFile("Module14/Assignments/FrequencyAnalysis/ciphertext.txt")
                                        .toLowerCase());

                        int frequency = fa.FrequencyOf(c);
                        double percentFrequency = fa.PercentOf(c);
                        System.out.println("Frequency of \'" + c + "\': " + frequency);
                        System.out.println("Frequency % of \'" + c + "\': " + percentFrequency + "%");

                        fa.WriteResults("Module14/Assignments/FrequencyAnalysis/ciphertextFreq.txt",
                                        "Module14/Assignments/FrequencyAnalysis/ciphertext.txt", c, frequency,
                                        percentFrequency);
                }
        }
}
