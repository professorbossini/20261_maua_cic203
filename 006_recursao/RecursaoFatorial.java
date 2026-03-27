public class RecursaoFatorial {
  public static int fatorial(int n){
    if(n == 0 || n == 1)
      return 1;
    if(n == 2)
      return n;
    return n * fatorial(n - 1);
  }
  public static void main(String[] args) {
    System.out.println(fatorial(0));
    System.out.println(fatorial(1));
    System.out.println(fatorial(2));
    System.out.println(fatorial(5));
  }
}
