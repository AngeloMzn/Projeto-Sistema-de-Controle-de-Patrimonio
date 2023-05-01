package main;

import java.util.Scanner;

import beans.Arma;

public class Menu {


    public Menu(){

    }

    public static void printaMenu(){

        System.out.println("Olá usuário, o que gostaria de fazer ?");
        System.out.println("=============opções=============");
        System.out.println("0 - finaliza o programa");
        System.out.println("1 - cadastrar patrimonio");
        System.out.println("2 - movimentar patrimonio");
        System.out.println("3 - remover partimonio");
        System.out.println("4 - buscar patrimonio");
        System.out.println("================================");
        System.out.println("digite sua escolha: ");

        
    }

    public void tpPatrimonioMenu(){

        System.out.println("Escolha aqui qual tipo de patrimonio voce deseja");
        System.out.println("=============opções=============");
        System.out.println("1 - Arma");
        System.out.println("2 - Eletronico");
        System.out.println("3 - Movel");
        System.out.println("4 - Veiculo");
        System.out.println("================================");
        System.out.println("digite sua escolha: ");

        
    }
     
    public void carregaMenu(){
        int escolha, tpPatrimonio;
        Scanner r = new Scanner(System.in);
        Hook h = new Hook();
        do {
          
          printaMenu();
          escolha = r.nextInt();
          
          switch(escolha) {
                case 0:
                System.out.println();  
                System.out.println("Tchau até a próxima !");
                System.out.println();
                break;
            
                case 1:
        
                System.out.println();
                System.out.println("Vamos cadastrar o patrimonio então !");
                System.out.println("escolha tipo de patrimonio vai escolher");
                
                tpPatrimonioMenu();
                tpPatrimonio = r.nextInt();
                
                

                break;
        
                case 2:
                
                System.out.println();  
                System.out.println("opção 2");
                System.out.println();
               
                tpPatrimonioMenu();
                tpPatrimonio = r.nextInt();

                break;
        
                case 3:
            
                System.out.println();
                System.out.println("opção 3");
                System.out.println();
                
                tpPatrimonioMenu();
                tpPatrimonio = r.nextInt();

                break;
        
                case 4:
            
                System.out.println();  
                System.out.println("opção 4");
                System.out.println();
                
                tpPatrimonioMenu();
                tpPatrimonio = r.nextInt();

                break;
        
                default:
                
                System.out.println();  
                System.out.println("Sua escolha deve ser entre 0 e 4 !");
                System.out.println();
                
                tpPatrimonioMenu();
                tpPatrimonio = r.nextInt();

            }
        } while(escolha != 0);



    }

}
