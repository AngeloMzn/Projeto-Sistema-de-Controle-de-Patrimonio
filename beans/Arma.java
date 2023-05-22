package beans;
public class Arma extends Patrimonio{
    
    private int qtdArma; // quantas armas existem no bd
    private String nSerie; //numero de série
    private String modeloArma; //(glock 16, aks, ak47, parafal)
    private String calibre; // calibre de munição usado

    public Arma(){

        super();

    }

    public Arma(int nPatrimonio, String estadoPatrimonio, String marca, String local, String nSerie, String modeloArma, String calibre){

        super(nPatrimonio, estadoPatrimonio, marca, local);
        this.nSerie = nSerie;
        this.modeloArma = modeloArma;
        this.calibre = calibre;
        this.qtdArma++;

    }

    public boolean verificaQtdArma(){

        if(qtdArma >= 100){
            throw new OutOfMemoryError("Memoria cheia. Você não pode mais cadastrar armas.");

        }else{

            return true;
        }


    }
    
    public boolean verificaNserie(String nSerie){

        if(nSerie.length() != 8){
            
            throw new IllegalArgumentException("O numero deve conter 8 caracteres ! você colocou: " + nSerie.length());

        }else{

            return true;

        }

    }



    
    public String getCalibre() {
        return calibre;
    }
   
    public String getModeloArma() {
        return modeloArma;
    }
   
    public String getnSerie() {
        return nSerie;
    }

    public int getQtdArma() {
        return qtdArma;
    }

    @Override
    public int getnPatrimonio() {
        return super.getnPatrimonio();
    }

    @Override
    public String getEstadoPatrimonio() {
        
        return super.getEstadoPatrimonio();
    }
    
    @Override
    public String getLocal() {
        
        return super.getLocal();
    }
    
    @Override
    public String getMarca() {
        
        return super.getMarca();
    }
}
