import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {

        urinalFunctions uf = new urinalFunctions();
        System.out.println("Enter the string");
        String a = uf.getString();
        if(!uf.goodString(a)){
            System.out.println("-1\nInvalid Input");
            return;
        }
        int free = uf.freeUrinals(a);
        System.out.println("Free Urinals: "+free);
    }



}
