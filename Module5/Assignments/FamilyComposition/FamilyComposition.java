package Module5.Assignments.FamilyComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FamilyComposition {
    public static void main(String[] args) throws IOException {
        //variables
        File fileName = new File("Module5/Assignments/FamilyComposition/maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        List<String> results = new ArrayList<String>();

        int total = 0;
        int bb = 0;
        int gg = 0;
        int gb = 0;

        //get data from text file
        while(inFile.hasNext())
        {
            String line = inFile.nextLine();
            if(!line.isEmpty() && !line.isBlank())
            {
                results.add(line);
            }
        }
        
        //get quantaties 
        total = results.size();
        for(int i = 0; i < results.size(); i++)
        {
            if(results.get(i).equals("BB"))
            {
                bb++;
            }
            else if(results.get(i).equals("GG"))
            {
                gg++;
            }
            else if(results.get(i).equals("GB") || results.get(i).equals("BG"))
            {
                gb++;
            }
        }

        //display results
        System.out.println("Number of families: " + total);
        System.out.println();
        System.out.println("Number of families with");
        System.out.println("2 boys: " + bb + " represents " + Math.round(bb/(double)total * 1000.0) / 10.0 + "%");
        System.out.println("2 girls: " + gg + " represents " + Math.round(gg/(double)total * 1000.0) / 10.0 + "%");
        System.out.println("1 boy and 1 girl: " + gb + " represents " + Math.round(gb/(double)total * 1000.0) / 10.0 + "%");

        inFile.close();
    }
}