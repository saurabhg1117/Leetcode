/*
Get Stair Paths
Easy

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= n <= 10

Format
Input
A number n

Output
Contents of the arraylist containing paths as shown in sample output

Example
Sample Input

3

Sample Output
[111, 12, 21, 3]
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <String> al=getStairPaths(n);
        System.out.print(al);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList <String> bres=new ArrayList <String> ();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList <String> bres=new ArrayList <String> ();
            return bres;
        }
        ArrayList<String> rres1=getStairPaths(n-1);
        ArrayList<String> rres2=getStairPaths(n-2);
        ArrayList<String> rres3=getStairPaths(n-3);
        ArrayList <String> myres=new ArrayList<>();

        for(String k:rres1)
        {
            myres.add(1+k);           
        }
        for(String k:rres2)
        {
            myres.add(2+k);           
        }
        for(String k:rres3)
        {
            myres.add(3+k);           
        }
        return myres;
    }

}