package main;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {

    public static String check;
    static BufferedReader bf;
    static ArrayList<Integer> ar = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter the type of Input\n1.Keyboard\n2.File\n(-1 to exit)");
            int choice = sc.nextInt();

            if (choice == 1) {
                check = getString();
                System.out.println("\nNumber of Free Urinals: " + freeUrinals(check));
            } else if (choice == 2) {
                openFile();
                readFile();
                writeFile();
            } else if (choice==-1){
                System.out.println("\nExiting Menu");
                break;
            }
            else {
                System.out.println("\ninvalid Input");
            }
        }

    }


    public static int freeUrinals(String str) {

        if(!goodStringLength(str) || !goodString(str))
            return -1;

        int stalls = 0;

        if(str.equals("0")){
            stalls++;
            return stalls;
        }
        if(str.equals("1")){
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

        try {
            bf = new BufferedReader(new FileReader("src/main/urinal.dat"));
        } catch (FileNotFoundException e) {
            return -1;
        }
        return 1;
    }

    public static int readFile() throws IOException {

        String st;
        if((st = bf.readLine())==null)
            return -1;
        while((st)!=null){
            if(goodStringLength(st) && goodString(st)) {
                ar.add(freeUrinals(st));
            }else{
                ar.add(-1);
            }

            st = bf.readLine();
        }
        return 0;
    }


    public static int writeFile() throws IOException{

        int counter=1;
        File fl = new File("src/main/rule.txt");
        while(fl.exists()){
            fl = new File("src/main/rule"+counter+".txt");
            counter++;
        }
        FileWriter fw = new FileWriter(fl);

        int fileCounter=0;
        while(fileCounter<(ar.size())){
            fw.write(ar.get(fileCounter)+"\n");
            fileCounter++;
        }
        fw.close();
        return 1;
    }


    public static String getString(){

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("\nEnter the String: ");
        str = sc.next();
        return str;
    }


    public static boolean goodStringLength(String str){

        return str.length() >= 1 && str.length() <= 20;
    }


    public static boolean goodString(String str){

        if(str.equals("-1"))
            return false;
        if(str.contains("11"))
            return false;
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)=='0' || str.charAt(i)=='1')) {
                return false;
            }
        }

        return true;
    }
}
