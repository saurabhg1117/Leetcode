import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList <String> ans=gss(s);
        System.out.print(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList <String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char a=str.charAt(0);
        String rem=str.substring(1);
        ArrayList <String> remm=gss(rem);
        ArrayList <String> total=new ArrayList<>();
        for(String k : remm){
            total.add(k);
        }
        for(String k : remm){
            total.add(a+k);
        }
        return total;
    }

}