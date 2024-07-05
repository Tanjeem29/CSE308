package Front;

import Back.editor.editor;
import Back.editor.editorBuilder;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter filename with valid extension (.c OR .cpp OR .py)");
        String temp = in.nextLine();
        editor e = editor.getInstance();
        editorBuilder eb = new editorBuilder();
        try{
            eb.changeEditor(temp);
            e.showDetails();
        }
        catch (Exception exp){
            System.out.println("Exception");
        }



    }
}
