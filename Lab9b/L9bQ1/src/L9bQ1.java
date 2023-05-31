public class L9bQ1 {
    public static long F(int s, int t) {
        if (t == 1)
            return s;
        else if (s == 1)
            return 1;
        else
            return F(s-1,t) + F(s, t-1);
    }
    public static void main(String[] args) {
        int s = 5, t = 3;
        System.out.println("F("+s+", "+t+") = " + F(s,t));
    }
}
