package main;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import beans.Arma;
import beans.Colete;
import beans.Material;
import beans.Veiculo;

public class Arquivo {
    
    public void cadastraArma(Arma arma){

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


    public void cadastraMaterial(Material material){

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

    public void cadastraVeiculo(Veiculo veiculo){

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
    public void cadastraColete(Colete colete){

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
