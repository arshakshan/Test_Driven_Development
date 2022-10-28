package main;


import java.util.Scanner;

public class urinals {

    public static String check = "00000";
    public static void main(String[] args) {

        System.out.println("Enter the string");
        String a = getString();
        if(!goodString(a)){
            System.out.println("-1\nInvalid Input");
            return;
        }
        int free = freeUrinals(a);
        System.out.println("Free Urinals: "+free);
    }

    private static int freeUrinals(String a) {
        return 0;
    }


    public static String getString(){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }

    public static boolean goodStringLength(String str){

        if(str.length()>=1 && str.length()<=20)
            return true;
        else
            return false;
    }
    public static boolean goodString(String str){

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1'){
                continue;
            }
            else
                return false;
        }
        if(str.contains("11"))
            return false;
        return true;
    }


}
