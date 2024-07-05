package Back;

import Archive.LegacySummer;

import java.io.*;

public class Adapter {
    LegacySummer LS = new LegacySummer();
    public int calculateSumNew(File file, char delim){
        try {
            File temp = File.createTempFile("tempFile",".txt");
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter(temp, false);
            int curr;
            while ((curr = reader.read()) != -1) {
                if((char)curr == delim){
                    writer.write(' ');
                }
                else{
                    writer.write((char)curr);
                }
            }


            writer.close();
            reader.close();
            int ans = LS.calculateSum(temp);

            temp.deleteOnExit();
            return ans;
        }catch (IOException e){
            e.printStackTrace();
            return -1;
        }

    }

}
