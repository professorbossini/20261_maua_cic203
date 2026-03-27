//0, 1, 1, 2, 3, 5, 8, 13, 21, 34....
public class RecursaoFibonacci {
  public static int fibonacci(int n){
    if(n == 0 || n == 1)
      return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static long fibonacciMemoizacao(int n, long[] memo){
    //caso base
    if( n == 0 || n == 1)
      return n;
    //caso base
    if(memo[n] != -1)
      return memo[n];
    //passo recursivo
    memo[n] = 
      fibonacciMemoizacao(n - 1, memo) + fibonacciMemoizacao(n - 2, memo);
    return memo[n];
      

  }
  public static void main(String[] args) {
    int n = 50;
    long [] memo = new long[n + 1];
    java.util.Arrays.fill(memo, -1);
    System.out.printf("Fibonacci(%d):\n", n);
    long inicio = System.currentTimeMillis();
    fibonacci(n);
    long termino = System.currentTimeMillis();
    System.out.println(termino - inicio);
    System.out.printf("FibonacciM(%d)\n", n);
    inicio = System.currentTimeMillis();
    fibonacciMemoizacao(n, memo);
    termino = System.currentTimeMillis();
    System.out.println(termino - inicio);
  }
}

