package beans;
public class Arma extends Patrimonio{
  
    private int nSerie; //numero de série
    private String modeloArma; //(glock 16, aks, ak47, parafal)
    private double calibre; // calibre de munição usado

    public Arma(String estadoPatrimonio, String marca, String local, int nSerie, String modeloArma, double calibre){

        this.nSerie = nSerie;
        this.modeloArma = modeloArma;
        this.calibre = calibre;


    }

}
