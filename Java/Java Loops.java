import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int TestCases=scanner.nextInt();
        
        for(;TestCases>0;TestCases--){
            int  a=scanner.nextInt();
            int  b=scanner.nextInt();
            int  n=scanner.nextInt();
            
            for(int i=0;i<n;i++){
                System.out.print(a+b*((2<<i)-1));
                System.out.print(i<n-1?" ":"\n");
            }
        }
    }
}
