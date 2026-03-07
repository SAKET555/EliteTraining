public class TowerOfHanoi {
    public static void fun(int n,String s, String h,String d)
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+s+" to "+d);
            return;
        }
        fun(n-1,s,d,h);
        System.out.println("Move "+n+" from "+s+" to "+d);
        fun(n-1,h,s,d);
    }
    public static void main(String[] args) {
        int n= 20;
        fun(n,"Source","Helper","Destination");
    }
}
