import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      List<String> aList= Arrays.asList(A.toUpperCase().split(""));
  Collections.sort(aList);
  List<String> bList= Arrays.asList(B.toUpperCase().split(""));
  Collections.sort(bList);
  return aList.equals(bList)? true: false;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
