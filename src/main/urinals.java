package main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {

    public static String check = "00000";


    public static void main(String[] args) {



    }


    public static int freeUrinals(String str) {

        if(!goodStringLength(str) || !goodString(str))
            return -1;

        int stalls = 0;

        if(str.equals(0)){
            stalls++;
            return stalls;
        }
        if(str.equals(1)){
            return stalls;
        }

        StringBuilder strTemp = new StringBuilder(str);

        for(int i=0;i<strTemp.length();i++){
            if(i==0){
                if(strTemp.charAt(i)=='0' && strTemp.charAt(i+1)!='1'){
                    stalls++;
                    strTemp.setCharAt(i,'1');
                }
            }
            else if(strTemp.charAt(i)=='0' && i==strTemp.length()-1){
                if(strTemp.charAt(i-1)!='1'){
                    stalls++;
                    strTemp.setCharAt(i,'1');
                }
            }else{
                if(strTemp.charAt(i)=='0' && strTemp.charAt(i-1)!='1' && strTemp.charAt(i+1)!='1'){
                    stalls++;
                    strTemp.setCharAt(i,'1');
                }
            }
        }
        return stalls;
    }

    public static int openFile(){

        Scanner sc;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/main/urinal.dat"));
        } catch (FileNotFoundException e) {
            return -1;
        }
        return 1;
    }

    public static String getString(){

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        return str;
    }


    public static boolean goodStringLength(String str){

        if(str.length()>=1 && str.length()<=20)
            return true;
        else
            return false;
    }


    public static boolean goodString(String str){

        if(str.equals(-1))
            return false;
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
