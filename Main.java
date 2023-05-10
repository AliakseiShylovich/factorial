public class Main {
    public static void main(String[] args) {
        long a, b, c, n;
        n = 4;
        a = 1;
        b = 1;
        c = 1;
        while ( b != n ){
            b = b + 1;
            c = b * a;
            a = c;
        }
        System.out.println(c);
    }
}