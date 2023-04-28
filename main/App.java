package main;
import java.util.Scanner;

public class App{

  public static void main(String[] args){
    int escolha;
    Scanner r = new Scanner(System.in);

    
    do {
      System.out.println("Olá usuário, o que gostaria de fazer?");
      System.out.println("=============opções=============");
      System.out.println("0 - finaliza o programa");
      System.out.println("1 - cadastrar patrimonio");
      System.out.println("2 - movimentar patrimonio");
      System.out.println("3 - remover partimonio");
      System.out.println("4 - buscar patrimonio");
      System.out.println("================================");
      System.out.println("digite sua escolha: ");
  
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