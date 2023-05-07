package beans;
public class Arma extends Patrimonio{
    
    private int qtdArma; // quantas armas existem no bd
    private int nSerie; //numero de série
    private String modeloArma; //(glock 16, aks, ak47, parafal)
    private double calibre; // calibre de munição usado

    public Arma(){

        super();

    }

    public Arma(int nPatrimonio, String estadoPatrimonio, String marca, String local, int nSerie, String modeloArma, double calibre){

        super(nPatrimonio, estadoPatrimonio, marca, local);
        this.nSerie = nSerie;
        this.modeloArma = modeloArma;
        this.calibre = calibre;
        this.qtdArma++;

    }

    public boolean verificaQtdArma(){

        if(qtdArma >= 100){
            System.out.println("Memoria cheia. Você não pode mais cadastrar armas.");
            
            return false;

        }else{

            return true;
        }


    }
    
    
    
    public double getCalibre() {
        return calibre;
    }
   
    public String getModeloArma() {
        return modeloArma;
    }
   
    public int getnSerie() {
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
