package main;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import beans.Arma;
import beans.Colete;
import beans.Material;
import beans.Veiculo;

public class Arquivo {
    
    public void cadastrar(Arma arma){

        try{
            //verifica se o objeto foi construido 
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


    public void cadastrar(Material material){

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

    public void cadastrar(Veiculo veiculo){

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
    public void cadastrar(Colete colete){

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
            cadastrar(h.arma());
            break;

            case 2:
            cadastrar(h.material());
            break;

            case 3:
            cadastrar(h.colete());
            break;

            case 4:
            cadastrar(h.veiculo());
            break;
            default:
            System.out.println("Você não escolheu nenhuma das opções !! escolha entre 1 a 4");
            System.out.println();
        }
    

    }

    public Arma buscaArma(int numeroPatrimonioBusca){
        Arma arma = new Arma();
       
        try (BufferedReader br = new BufferedReader(new FileReader("arma.txt"))) {
            
            String linha;
           
            while ((linha = br.readLine()) != null) {
               
                if (linha.startsWith("Numero de patrimonio:")) {
                   
                    String numeroPatrimonio = linha.substring(linha.indexOf(":") + 1, linha.indexOf(";")).trim();
                    
                    if (numeroPatrimonio.equals(numeroPatrimonioBusca)) {
                        int numero = Integer.parseInt(numeroPatrimonio);
                        String estado = extrairValorCampo(linha, "Estado do patrimonio:");
                        String local = extrairValorCampo(linha, "Local do patrimonio:");
                        String marca = extrairValorCampo(linha, "Marca:");
                        int numeroSerie = Integer.parseInt(extrairValorCampo(linha, "Numero de série:"));
                        String modelo = extrairValorCampo(linha, "Modelo:");
                        double calibre = Double.parseDouble(extrairValorCampo(linha, "Calibre:"));

                        arma = new Arma(numero, estado, local, marca, numeroSerie, modelo, calibre);
                       
                        System.out.println();
                        System.out.println("==============================");
                        System.out.println("Busca realizada com sucesso !");
                        System.out.println("==============================");
                        System.out.println();
                        
                    }

                }

            }

        } 
        catch (IOException e) {
           
            e.printStackTrace();
        
        }

        return arma;
        
    }

    private static String extrairValorCampo(String linha, String nomeCampo) {
     
        int inicio = linha.indexOf(nomeCampo) + nomeCampo.length(); // pega a posição do primeiro caractere da string e soma ao tamanho dando a posição do valor
        int fim = linha.indexOf(";", inicio); //busca a posição do separador ; na posição posterior ao valor
        return linha.substring(inicio, fim).trim(); // cria uma substring com o valor entre a posição do inicio e o fim e retira espaços com o trim()
   
    }


}
