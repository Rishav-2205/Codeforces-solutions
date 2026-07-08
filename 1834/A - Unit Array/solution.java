import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int neg = 0, pos = 0;
 
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) pos++;
                else neg++;
            }
 
            if (pos >= neg && neg % 2 == 0) {
                System.out.println(0);
            }
            else if (pos >= neg && neg % 2 != 0) {
                System.out.println(1);
            }
            else {
                int x =(int)Math.ceil((neg-pos)/2.0);
 
                if ((neg - x) % 2 == 0)
                    System.out.println(x);
                else
                    System.out.println(x +1);
            }
        }
    }
}