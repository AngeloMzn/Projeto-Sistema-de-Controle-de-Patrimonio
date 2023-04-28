package main;
import java.util.Scanner;

public class App{

  public static void main(String[] args){
    int escolha;
    Scanner r = new Scanner(System.in);
    Menu menu = new Menu();
    
    do {
      
      menu.printaMenu();
      escolha = r.nextInt();
      
      switch(escolha) {
        case 0:
          System.out.println("Fim do Programa !");
          break;
        case 1:
        System.out.println("opção 1");
          break;

        case 2:
          System.out.println("opção 2");
          break;

        case 3:
          System.out.println("opção 3");
          break;

        case 4:
          System.out.println("opção 4");
          break;

        default:
          System.out.println("Sua escolha deve ser entre 0 e 4 !");
      }
    } while(escolha != 0);
  }
}
