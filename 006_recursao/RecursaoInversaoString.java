//Bola -> aloB
//a -> a

//Bola -> ola | B -> la | o | B -> a | l | o | B

public class RecursaoInversaoString {
  public static String inverter(String s){
    //caso base
    if(s.length() <= 1)
      return s;
    //passo recursivo
    return inverter(s.substring(1)) + s.charAt(0);
  }
  public static void main(String[] args) {
    System.out.println(inverter("Java"));
    System.out.println(inverter("Recursão"));
    System.out.println(inverter("arara"));
  }
}
