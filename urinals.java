import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {

        String a = getString();
        if(!goodString(a)){
            System.out.println("-1");
            return;
        }
    }

    public static String getString(){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
    public static boolean goodString(String str){

        String[] temp = new String[str.length()];
        for(int i=0;i<str.length()-1;i++){
            if(temp[i].equals('1') && temp[i+1].equals('1'))
                return false;
        }
        return true;
    }
}
