public class Operators {
    public static void main(String[] args)
    {
       int m = 0 , n = 0;
       int p = --m * --n * n-- * m--;
       System.out.println(p);
    }
}

// in this we have been given the value of m and n
// after this the predecrement is there which makes it -1 and the same goes for -n
// again after this we have been given n-- which casue post decrement and the
// value of both becomes -2 and post increment
// hence the final ans is -1 *4