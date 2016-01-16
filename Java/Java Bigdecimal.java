import java.math.BigDecimal;
import java.util.*;

public class Test {

	
	public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }



        //Write your code here
        ArrayList<String> s2=new ArrayList<String>(n);
        for(int i=0;i<n;i++)
        {
            s2.add(s[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                BigDecimal bd1=new BigDecimal(s[i]);
                BigDecimal bd2=new BigDecimal(s[j]);

                if(bd2.compareTo(bd1)<0){
                    String temp=s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }

                if(bd1.compareTo(bd2)==0 && s2.indexOf(s[i])<s2.indexOf(s[j]))
                {
                    String temp=s[j];
                    s[j]=s[i];
                    s[i]=temp;
                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
