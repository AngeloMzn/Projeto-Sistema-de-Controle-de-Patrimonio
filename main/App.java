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
        System.out.println();  
        System.out.println("Tchau até a próxima !");
        System.out.println();
          break;
        case 1:
        System.out.println();
        System.out.println("opção 1");
        System.out.println();
          break;

        case 2:
        System.out.println();  
        System.out.println("opção 2");
        System.out.println();
          break;

        case 3:
        System.out.println();
        System.out.println("opção 3");
        System.out.println();
          break;

        case 4:
        System.out.println();  
        System.out.println("opção 4");
        System.out.println();
          
          break;

        default:
        System.out.println();  
        System.out.println("Sua escolha deve ser entre 0 e 4 !");
        System.out.println();
      }
    } while(escolha != 0);
  }
}
