package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PlayStore {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        Map <String, PlayStoreApp> playstore = new HashMap<>();
        
        Path csvPath = Paths.get("googleplaystore2.csv");
        File csvFile = csvPath.toFile();

        if (csvFile.exists()) {
            System.out.println(">>> csv File does exisit");
        } 

        Reader fr = new FileReader(csvFile);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        String[] col;

        while ((line = br.readLine())!= null) {

            // check if there are any empty lines
            if (line.length()<=0) {
                continue;
            }

            col = line.split("Split");

            // check that there are at least 3 columns
            if (col.length < 3) {
                continue;
            }

            

            String name = col[0].replace(",","").trim();
            System.out.println(name);
            String category = col[1].replace(",","");
            String rating = col[2];
            String ratingFloatWithoutComma = rating.replace(",","").trim();

            
            // System.out.println(ratingFloatWithoutComma);
            Float ratingFloat = 0f;

            if (ratingFloatWithoutComma.equals("#NUM!")){
                // System.out.println("found a Nan");
                continue;
            }
                

            // if rating cannot be converted to a float, discard
            try {
                ratingFloat = Float.parseFloat(ratingFloatWithoutComma);
            } catch (NumberFormatException e) {
                continue;
            }

            

            // check if there are any values with the category "key" by using .get()
            PlayStoreApp data = playstore.get(category);
            // if data is null, create new value and add it to Hashmap
            if (data == null) {
                data = new PlayStoreApp(category);
                playstore.put(category, data);
            }

            data.add(ratingFloat);

            data.evaluate(name, ratingFloat);

        }

            br.close();
            fr.close();

        //     System.out.println(">>>>>>>>>>>>>>>>>>");
        //     for (String cat: playstore.keySet()) {
        //         PlayStoreApp data = playstore.get(cat);
        //         System.out.printf("Category: %s\n", cat);
        //         System.out.printf("\taverage rating: %.2f\n", data.getAverageRating());

        //         System.out.printf("\tHighest rated game: %s (%.2f)\n"
        //                 , data.getHighestRatedApp(), data.getHighestRating());
                
        //         System.out.printf("\tLowest rated game: %s (%.2f)\n"
        //                 , data.getLowestRatedApp(), data.getLowestRating()); 
        // }

            
            
        

        

    }
    
}
