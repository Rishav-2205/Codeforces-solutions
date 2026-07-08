import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x=sc.nextInt();
            int [] arr= new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            for (int i =0;i<n;i++){
                if(i!=n-1) {
                    if (max<(arr[i+1]-arr[i])) max=arr[i+1]-arr[i];
                }
                else{
                    if (max<2*(x-arr[i])) max=2*(x-arr[i]);
                }
            }
            System.out.println(max);
        }
    }
}