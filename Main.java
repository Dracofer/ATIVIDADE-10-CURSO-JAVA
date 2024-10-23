import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int hi;
    int hf;
    int x;

    hi = sc.nextInt();
    hf = sc.nextInt();

    if(hf > hi){
      x = hf - hi;
      System.out.println("O JOGO DUROU " + x + " HORA(S)");
    }else{
        x = (24 - hi) + hf;     
      System.out.println("O JOGO DUROU " + x + " HORA(S)");
      }

    sc.close();
  }
}