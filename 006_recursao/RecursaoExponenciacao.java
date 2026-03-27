public class RecursaoExponenciacao {
  public static long potencia(long base, long expoente){
    if(expoente == 0)
      return 1;
    return base * potencia(base, expoente - 1);
  }
  public static void main(String[] args) {
    System.out.println(potencia(2, 10));
  }
}
