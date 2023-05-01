package main;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Arquivo {
    
    public void cadastraArma(){

        try{

            FileOutputStream arq = new FileOutputStream("arma.txt");
            PrintWriter pr = new PrintWriter(arq);

            pr.println("Número de patrimonio: " + "Estado do patrimonio: " + "Local do patrimonio: ");
       
            pr.close();
            arq.close();
        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }


    public void cadastraEletronico(){

        try{

            FileOutputStream arq = new FileOutputStream("eletronico.txt");
            PrintWriter pr = new PrintWriter(arq);

            pr.println("Número de patrimonio: " + "Estado do patrimonio: " + "Local do patrimonio: ");
        
            pr.close();
            arq.close();

        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }
    
    public void cadastraMovel(){

        try{

            FileOutputStream arq = new FileOutputStream("movel.txt");
            PrintWriter pr = new PrintWriter(arq);

            pr.println("Número de patrimonio: " + "Estado do patrimonio: " + "Local do patrimonio: ");
        
            pr.close();
            arq.close();

        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }

    public void cadastraVeiculo(){

        try{

            FileOutputStream arq = new FileOutputStream("veiculo.txt");
            PrintWriter pr = new PrintWriter(arq);

            pr.println("Número de patrimonio: " + "Estado do patrimonio: " + "Local do patrimonio: ");
            
            pr.close();
            arq.close();

        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }


}
