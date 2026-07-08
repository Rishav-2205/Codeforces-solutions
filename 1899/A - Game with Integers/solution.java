import java.sql.SQLOutput;
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int i=0;
            int j=0;
            if(n%3==0) System.out.println("Second");
            else{
                while(i++<=10){
                    if (n%3==1) n-=1;
                    else n+=1;
                    if(n%3==0) {j++;break;}
                }
                if(j==0) System.out.println("Second");
                else System.out.println("First");
            }
        }
    }
}