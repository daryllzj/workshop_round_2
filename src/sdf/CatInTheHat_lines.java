package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatInTheHat_lines {

    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("cat_in_th_hat.txt");
        File file = path.toFile();

        if (!file.exists()) {
            System.out.println(">>> There is no file");
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        FileWriter newfile = new FileWriter("CAT IN THE HAT.txt");
        String line;

        while ((line = br.readLine())!= null) {
            newfile.write(line.toUpperCase());
            newfile.write("\n");
        }

        fr.close();
        br.close();

        newfile.flush();
        newfile.close();

        };

}
    

