package main;

import java.util.Random;
import java.util.Scanner;

import beans.Arma;

public class Hook {
    

    
    public Hook(){


    }

    

    public Arma arma(){
        Scanner sc = new Scanner(System.in);
        Random  r = new Random();
        String marca, local, estadoPatrimonio, modeloArma;

        int nSerie;
        double calibre;
        
        System.out.println("Você está cadastrando uma Arma!");
        System.out.println("===============================");
      
        System.out.println("Digite a marca da arma (Ex: taurus, colt):");
        marca = sc.nextLine(); 
      
        System.out.println("Digite em qual local a arma esta (Ex: 2º dp)");
        local = sc.nextLine(); 
      
        System.out.println("Digite o estado do patrimonio(novo, velho, com defeito)");
        estadoPatrimonio = sc.nextLine();

        System.out.println("Digite o modelo da arma (Ex: ak47, glock 16):");
        modeloArma = sc.nextLine();

        System.out.println("Digite o numero de série da arma:");
        nSerie = sc.nextInt();

        System.out.println("digite o calibre da arma:");
        calibre = sc.nextDouble();

        Arma arma = new Arma();


    }


}
