package Dev;

import Back.Adapter;

import java.io.File;

public class NewSummer {
    Adapter a = new Adapter();
    public int calculateSum(File f){
        return a.calculateSumNew(f, '~');
    }
}
