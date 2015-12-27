import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count =0;
    int n = sc.nextInt();
    sc.nextLine();

    HashSet<String> hs = new HashSet<String>();
    {
        for(int i=0;i<n;i++)
        {
            String e = sc.nextLine();
            hs.add(e);
           System.out.println(hs.size());



        }
    
    }
}
}