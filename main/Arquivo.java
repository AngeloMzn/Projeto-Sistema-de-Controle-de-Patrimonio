package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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

                pr.println("Numero de patrimonio: " + material.getnPatrimonio() + ";" + " Estado do patrimonio: " + material.getEstadoPatrimonio() + ";" + " Marca: " + material.getMarca()+ ";" + " Local do patrimonio: " + material.getLocal() + ";" + " Descrição do material: " + material.getDescricaoMaterial() + ";" + " Porte do material: " + material.getPorte() + ";");
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

                pr.println("Numero de patrimonio: " + veiculo.getnPatrimonio() + ";" + " Estado do patrimonio: " + veiculo.getEstadoPatrimonio() + ";" + " Marca: " + veiculo.getMarca()+ ";" + " Local do patrimonio: " + veiculo.getLocal() + ";" + " Marca: " + veiculo.getMarca() + ";" + " Modelo do veiculo: " + veiculo.getModeloVeiculo() + ";" + " Aro do veiculo: " + veiculo.getAroVeiculo() + ";" + " Cor do veiculo: " + veiculo.getCorVeiculo() + ";" + " Placa do veiculo: " + veiculo.getPlacaVeiculo() + ";" );
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

                pr.println("Numero de patrimonio: " + colete.getnPatrimonio() + ";" + " Estado do patrimonio: " + colete.getEstadoPatrimonio() + ";" + " Marca: " + colete.getMarca()+ ";" + " Local do patrimonio: " + colete.getLocal() + ";" + " Marca: " + colete.getMarca() + ";" + " Tamanho do colete: " + colete.getTamanho() + ";" + " Nivel de protecao: " + colete.getNivelProtecao() + ";" + " Materia prima: " + colete.getMateriaPrima() + ";");
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
                    
                    if (numeroPatrimonio.equals(String.valueOf(numeroPatrimonioBusca))) {
                        int numero = Integer.parseInt(numeroPatrimonio);
                        String estado = extrairValorCampo(linha, "Estado do patrimonio:");
                        String local = extrairValorCampo(linha, "Local do patrimonio:");
                        String marca = extrairValorCampo(linha, "Marca:");
                        int numeroSerie = Integer.parseInt(extrairValorCampo(linha, "Numero de série:"));
                        String modelo = extrairValorCampo(linha, "Modelo:");
                        double calibre = Double.parseDouble(extrairValorCampo(linha, "Calibre:"));

                        arma = new Arma(numero, estado, local, marca, numeroSerie, modelo, calibre);
                        System.out.println(arma);
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
           
            System.out.println("deu ruim ");  
            e.printStackTrace();
        
        }

        return arma;
        
    }

    public Material buscaMaterial(int numeroPatrimonioBusca){
        Material material = new Material();
       
        try (BufferedReader br = new BufferedReader(new FileReader("material.txt"))) {
            
            String linha;
           
            while ((linha = br.readLine()) != null) {
               
                if (linha.startsWith("Numero de patrimonio:")) {
                   
                    String numeroPatrimonio = linha.substring(linha.indexOf(":") + 1, linha.indexOf(";")).trim();
                    
                    if (numeroPatrimonio.equals(String.valueOf(numeroPatrimonioBusca))) {
                        int numero = Integer.parseInt(numeroPatrimonio);
                        String estado = extrairValorCampo(linha, "Estado do patrimonio:");
                        String local = extrairValorCampo(linha, "Local do patrimonio:");
                        String marca = extrairValorCampo(linha, "Marca:");
                        String descricao = extrairValorCampo(linha, "Descrição do material:");
                        String porte = extrairValorCampo(linha, "Porte do material:");


                        material = new Material(numero, estado, local, marca, descricao, porte);
                       
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
           
            System.out.println("deu ruim");
            e.printStackTrace();
        
        }

        return material;
        
    }

    public Colete buscaColete(int numeroPatrimonioBusca){
        Colete colete = new Colete();
       
        try (BufferedReader br = new BufferedReader(new FileReader("colete.txt"))) {
            
            String linha;
           
            while ((linha = br.readLine()) != null) {
               
                if (linha.startsWith("Numero de patrimonio:")) {
                   
                    String numeroPatrimonio = linha.substring(linha.indexOf(":") + 1, linha.indexOf(";")).trim();
                    
                    if (numeroPatrimonio.equals(String.valueOf(numeroPatrimonioBusca))) {
                        int numero = Integer.parseInt(numeroPatrimonio);
                        String estado = extrairValorCampo(linha, "Estado do patrimonio:");
                        String local = extrairValorCampo(linha, "Local do patrimonio:");
                        String marca = extrairValorCampo(linha, "Marca:");
                        int nivelProtecao = Integer.parseInt(extrairValorCampo(linha, "Nivel de protecao:"));
                        String tamanho = extrairValorCampo(linha, "Tamanho do colete:");
                        String materiaPrima = extrairValorCampo(linha, "Materia prima:");

                        colete = new Colete(numero, estado, local, marca, tamanho.charAt(0), nivelProtecao, materiaPrima );
                       
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

        return colete;
        
    }
    
    public Veiculo buscaVeiculo(int numeroPatrimonioBusca){
        Veiculo veiculo = new Veiculo();
       
        try (BufferedReader br = new BufferedReader(new FileReader("veiculo.txt"))) {
            
            String linha;
           
            while ((linha = br.readLine()) != null) {
               
                if (linha.startsWith("Numero de patrimonio:")) {
                   
                    String numeroPatrimonio = linha.substring(linha.indexOf(":") + 1, linha.indexOf(";")).trim();
                    
                    if (numeroPatrimonio.equals(String.valueOf(numeroPatrimonioBusca))) {
                        int numero = Integer.parseInt(numeroPatrimonio);
                        String estado = extrairValorCampo(linha, "Estado do patrimonio:");
                        String local = extrairValorCampo(linha, "Local do patrimonio:");
                        String marca = extrairValorCampo(linha, "Marca:");
                        
                        String modelo = extrairValorCampo(linha, "Modelo do veiculo:");
                        int aro = Integer.parseInt(extrairValorCampo(linha, "Aro do veiculo:"));
                        String cor = extrairValorCampo(linha, "Cor do veiculo:");
                        String placa = extrairValorCampo(linha, "Placa do veiculo:");

                        veiculo = new Veiculo(numero, estado, local, marca, modelo, aro, cor, placa);
                       
                        System.out.println();
                        System.out.println("=============================");
                        System.out.println("Busca realizada com sucesso !");
                        System.out.println("=============================");
                        System.out.println();
                        
                    }

                }

            }

        } 
        catch (IOException e) {
           
            e.printStackTrace();
        
        }

        return veiculo;
        
    }

    private static String extrairValorCampo(String linha, String nomeCampo) {
        int inicio = linha.indexOf(nomeCampo);
        if (inicio != -1) { // Verifica se o nome do campo foi encontrado na linha
            inicio += nomeCampo.length(); // Incrementa o índice para apontar para o próximo caractere após o nome do campo
            int fim = linha.indexOf(";", inicio);
            if (fim != -1) { // Verifica se o separador ';' foi encontrado após o valor do campo
                return linha.substring(inicio, fim).trim();
            } else {
                System.out.println("Erro: Separador ';' não encontrado após o valor do campo '" + nomeCampo + "'. Linha: " + linha);
            }
        } else {
            System.out.println("Erro: Campo '" + nomeCampo + "' não encontrado na linha: " + linha);
        }
        return null; // Retorna null em caso de erro
    }

    public void alteraLocal(Arma arma){
        
        Hook h = new Hook();
        
        h.alteraLocal(arma);
        
        //sobrescrevendo apenas a linha com local alterado
        try {
            File file = new File("arma.txt");
            BufferedReader reader = new BufferedReader(new FileReader("arma.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                // Verifica se a linha corresponde ao objeto desejado
                if (tokens.length >= 6 && tokens[0].trim().equals("Numero de patrimonio: " + arma.getnPatrimonio())) {
                    // Atualiza o local do patrimônio
                    tokens[2] = " Local do patrimonio: " + arma.getLocal();
                    line = String.join("; ", tokens);
                }

                stringBuilder.append(line).append("\n");
            }

            reader.close();

            // Escreve o conteúdo atualizado de volta para o arquivo
            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("A movimentacao foi concluida com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar movimentar o veiculo: " + e.getMessage());
        }

    }
    
    
    public void alteraLocal(Veiculo veiculo){

        Hook h = new Hook();
        
        veiculo = h.alteraLocal(veiculo);
        
        //sobrescrevendo apenas a linha com local alterado
        try {
            File file = new File("veiculo.txt");
            BufferedReader reader = new BufferedReader(new FileReader("veiculo.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                // Verifica se a linha corresponde ao objeto desejado
                if (tokens.length >= 6 && tokens[0].trim().equals("Numero de patrimonio: " + veiculo.getnPatrimonio())) {
                    // Atualiza o local do patrimônio
                    tokens[2] = " Local do patrimonio: " + veiculo.getLocal();
                    line = String.join("; ", tokens);
                }

                stringBuilder.append(line).append("\n");
            }

            reader.close();

            // Escreve o conteúdo atualizado de volta para o arquivo
            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("A movimentacao foi concluida com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar movimentar o veiculo: " + e.getMessage());
        }
    }   

   
    public void alteraLocal(Material material){

        Hook h = new Hook();
        
        h.alteraLocal(material);

        //sobrescrevendo apenas a linha com local alterado
        try {
            File file = new File("material.txt");
            BufferedReader reader = new BufferedReader(new FileReader("material.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                // Verifica se a linha corresponde ao objeto desejado
                if (tokens.length >= 6 && tokens[0].trim().equals("Numero de patrimonio: " + material.getnPatrimonio())) {
                    // Atualiza o local do patrimônio
                    tokens[2] = " Local do patrimonio: " + material.getLocal();
                    line = String.join("; ", tokens);
                }

                stringBuilder.append(line).append("\n");
            }

            reader.close();

            // Escreve o conteúdo atualizado de volta para o arquivo
            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("A movimentacao foi concluida com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar movimentar o veiculo: " + e.getMessage());
        }

    }
    
    public void alteraLocal(Colete colete){

        Hook h = new Hook();
        
        h.alteraLocal(colete);

        //sobrescrevendo apenas a linha com local alterado
        try {
            File file = new File("colete.txt");
            BufferedReader reader = new BufferedReader(new FileReader("colete.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                // Verifica se a linha corresponde ao objeto desejado
                if (tokens.length >= 6 && tokens[0].trim().equals("Numero de patrimonio: " + colete.getnPatrimonio())) {
                    // Atualiza o local do patrimônio
                    tokens[2] = " Local do patrimonio: " + colete.getLocal();
                    line = String.join("; ", tokens);
                }

                stringBuilder.append(line).append("\n");
            }

            reader.close();

            // Escreve o conteúdo atualizado de volta para o arquivo
            FileWriter writer = new FileWriter(file);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("A movimentacao foi concluida com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar movimentar o veiculo: " + e.getMessage());
        }

    }

    public void movimentaPatrimonio(int tpPatrimonio, int nPatrimonio){
        
        switch(tpPatrimonio){

            case 1:   
           
            Arma arma = buscaArma(nPatrimonio);
            alteraLocal(arma);
           
            break;
           
            case 2:
            
            Material material = buscaMaterial(nPatrimonio);
            alteraLocal(material);
           
            break;

            case 3:
            
            Colete colete = buscaColete(nPatrimonio);
            alteraLocal(colete);
            
            break;

            case 4:
            Veiculo veiculo = buscaVeiculo(nPatrimonio);
            alteraLocal(veiculo);
           
            break;
            
            default:
           
            System.out.println("Você não escolheu nenhuma das opções !! escolha entre 1 a 4");
            System.out.println();
        }
    

    }


}
