import java.util.Scanner;

public class urinalFunctions {
    public static String getString(){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
    public static boolean goodString(String str){

        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(i);
        }
        for(int i=0;i<str.length()-1;i++){
            if(temp[i]==('1') && temp[i+1]==('1'))
                return false;
        }
        return true;
    }

    public int freeUrinals(String str) {

        char[] temp = new char[str.length()];
        int stalls = 0;
        for(int i=0;i<str.length();i++)
            temp[i]= str.charAt(i);

        for(int i=0;i<str.length();i++){
            if(temp[i]==('0') && (i%2==0))
                if(i!=str.length()-1)
                    if(temp[i+1]!=('1'))
                        stalls++;
        }
        return stalls;
    }
}
