public class Fibo {
    public static void main(String[] args) {
        int ans = Fib(4);
        System.out.println(ans);
    }
    static int Fib(int n){
        if(n < 2){
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }
}

