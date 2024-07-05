package Archive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LegacySummer {
    public int calculateSum(File file) throws FileNotFoundException {
        int sum = 0;
        int temp;
        Scanner in = new Scanner(file);
        while(in.hasNext()){
            temp = in.nextInt();
            sum+=temp;
        }
        return sum;
    }
}
