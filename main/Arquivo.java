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
            //verifica de o objeto foi construido 
            if(arma.getnPatrimonio() != 0){
                
                FileOutputStream arq = new FileOutputStream("arma.txt", true);
                PrintWriter pr = new PrintWriter(arq);

                
                pr.println("Numero de patrimonio: " + arma.getnPatrimonio()+";" + " Estado do patrimonio: " +arma.getEstadoPatrimonio() + ";"+ " Local do patrimonio: " + arma.getLocal() + ";" + " Marca: " + arma.getMarca()+ ";" + " Numero de série: " + arma.getnSerie() + ";" + " Modelo: " + arma.getModeloArma() + ";" + " Calibre: " + arma.getCalibre()+";");
                System.out.println("Arma cadastrada com sucesso !");
                pr.close();
                arq.close();
                
            }
        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }


    public void cadastraMaterial(Material material){

        try{
            if(material.getnPatrimonio() != 0){
                FileOutputStream arq = new FileOutputStream("material.txt", true);
                PrintWriter pr = new PrintWriter(arq);

                pr.println("Número de patrimonio: " + material.getnPatrimonio() + ";" + "Estado do patrimonio: " + material.getEstadoPatrimonio() + ";" + "Local do patrimonio: " + material.getLocal() + ";" + " Descrição do material: " + material.getDescricaoMaterial() + ";" + " Porte do material: " + material.getPorte() + ";");
                System.out.println("Material cadastrado com sucesso !");
                pr.close();
                arq.close();
            }
        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }

    public void cadastraVeiculo(Veiculo veiculo){

        try{
            if(veiculo.getnPatrimonio() != 0){
                FileOutputStream arq = new FileOutputStream("veiculo.txt", true);
                PrintWriter pr = new PrintWriter(arq);

                pr.println("Número de patrimonio: " + veiculo.getnPatrimonio() + ";" + "Estado do patrimonio: " + veiculo.getEstadoPatrimonio() + ";" + "Local do patrimonio: " + veiculo.getLocal() + ";" + " Marca: " + veiculo.getMarca() + ";" + " Modelo do veiculo: " + veiculo.getModeloVeiculo() + ";" + " Aro do veiculo: " + veiculo.getAroVeiculo() + ";" + " Cor do veiculo: " + veiculo.getCorVeiculo() + ";" + " Placa do veiculo: " + veiculo.getPlacaVeiculo() + ";" );
                System.out.println("Veiculo cadastrado com sucesso !");

                pr.close();
                arq.close();
            }
        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }
    public void cadastraColete(Colete colete){

        try{
            if(colete.getnPatrimonio() != 0){
                FileOutputStream arq = new FileOutputStream("colete.txt",true);
                PrintWriter pr = new PrintWriter(arq);

                pr.println("Número de patrimonio: " + colete.getnPatrimonio() + ";" + "Estado do patrimonio: " + colete.getEstadoPatrimonio() + ";" + "Local do patrimonio: " + colete.getLocal() + ";" + " Marca: " + colete.getMarca() + ";" + " Tamanho do colete: " + colete.getTamanho() + ";" + " Nivel de protecao: " + colete.getNivelProtecao() + ";" + " Materia prima: " + colete.getMateriaPrima() + ";");
                System.out.println("Colete cadastrado com sucesso !");

                pr.close();
                arq.close();
            }
        }
        catch(Exception e){

            System.out.println("Erro ao cadastrar o partimonio");

        }


    }
    public void salvaPatrimonio(int tpPatrimonio){
        
        Hook h = new Hook();
        
        switch(tpPatrimonio){

            case 1:
            cadastraArma(h.arma());
            break;

            case 2:
            cadastraMaterial(h.material());
            break;

            case 3:
            cadastraColete(h.colete());
            break;

            case 4:
            cadastraVeiculo(h.veiculo());
            break;
            default:
            System.out.println("Você não escolheu nenhuma das opções !! escolha entre 1 a 4");
            System.out.println();
        }
    

    }
    /* 
    public void buscaPatrimonio(int nPatrimonio){
    

    }
    */
}
