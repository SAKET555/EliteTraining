import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        while(n!=1)
        {
            int sum=0;
            while(n>0)
            {
                int digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            if(a.contains(sum))
            {
                System.out.println("Not a Happy Number");
                return;
            }
            a.add(sum);
            n = sum;
        }
        if(n==1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not a Happy Number");
        }
        sc.close();
    }
}