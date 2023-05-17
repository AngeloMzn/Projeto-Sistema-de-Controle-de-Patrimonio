package main;
import java.util.Scanner;

public class App{

  public static void main(String[] args){
    
    Menu m = new Menu();
    Scanner r = new Scanner(System.in);
    int escolha, tpPatrimonio, nPatrimonio;
    Arquivo arq = new Arquivo();

    do {
      
      m.menuInicial();
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
            System.out.println();
            
            m.menuTpPatrimonio();
            tpPatrimonio = r.nextInt();

            arq.salvaPatrimonio(tpPatrimonio);
            

            break;
    
            case 2:
            
            System.out.println();  
            System.out.println("Vamos movimentar um patrimonio então !");
            System.out.println("escolha tipo de patrimonio vai escolher");
            System.out.println();
           
            m.menuTpPatrimonio();
            tpPatrimonio = r.nextInt();
            System.out.println();
            System.out.println("digite o numero de patrimonio");
            nPatrimonio = r.nextInt();
            arq.movimentaPatrimonio(tpPatrimonio, nPatrimonio);


            break;
    
            case 3:
        
            System.out.println();
            System.out.println("Vamos remover um patriomonio então !");
            System.out.println();
            
            m.menuTpPatrimonio();
            tpPatrimonio = r.nextInt();

            
            break;
    
            case 4:
        
            System.out.println();  
            System.out.println("Vamos editar um patrimonio então !");
            System.out.println();
            
            m.menuTpPatrimonio();
            tpPatrimonio = r.nextInt();


            break;
    
            default:
            
            System.out.println();  
            System.out.println("Sua escolha deve ser entre 0 e 4 !");
            System.out.println();
            
            m.menuTpPatrimonio();
            tpPatrimonio = r.nextInt();

        }
    } while(escolha != 0);
  

  }
}
