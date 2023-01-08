package sdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatInTheHat_bytes {

    public static void main(String[] args) {
        
        Path path = Paths.get("cat_in_t_hat.txt");
        File file = path.toFile();

            if (!file.exists()) {
                System.out.println(">>> There is no file");
            }

        byte[] buffer = new byte[1024];
        int bufferSize = 0;
        try {
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream("cat_in_the_hat.txt");
            while ((bufferSize = is.read(buffer))>=0) {
                os.write(buffer, 0, bufferSize);  
            }

            is.close();
            os.flush(); 
            os.close();
            
        } catch (FileNotFoundException e) {
            System.err.printf("Error: %s\n", e.getMessage());
            // e.printStackTrace();
        } catch (IOException e) {
            System.err.printf("Eror: %s\n", e.getMessage());
            // e.printStackTrace();
        } 

    
    }
    
}
