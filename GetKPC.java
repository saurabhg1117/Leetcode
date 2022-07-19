import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList <String> al= getKPC(s);
        System.out.print(al);    

    }

    public static String[] sArray={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) { 
        if(str.length()==0){
            ArrayList <String> bres=new ArrayList <String> ();
            bres.add("");
            return bres;
        }
        char c=str.charAt(0); //6
        String temp=str.substring(1); //78
        ArrayList <String> rres=getKPC(temp); 
        ArrayList <String> myres=new ArrayList<>();

        for(int i=0;i<sArray[c-'0'].length();i++ ){
            char x=sArray[c-'0'].charAt(i);
            for(String j:rres){
                myres.add(x+j);
            }
        }
        return myres;
    }

}