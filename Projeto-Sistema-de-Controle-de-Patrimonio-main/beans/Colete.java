package beans;

public class Colete extends Patrimonio {
    
    private int qtdColete;
    private char tamanho; // M P G GG
    private int nivelProtecao; // Até qual calibre consegue cegurar 1 2 3
    private String materiaPrima; //feito do que (kevlar)
    
    public Colete(){

        super();

    }
   
    public Colete(int nPatrimonio, String estadoPatrimonio, String marca, String local, char tamanho, int nivelProtecao, String materiaPrima){

        super(nPatrimonio, estadoPatrimonio, marca, local);
        this.tamanho = tamanho;
        this.nivelProtecao = nivelProtecao;
        this.materiaPrima = materiaPrima;
        this.qtdColete++;

    }
    
    public boolean verificaQtdColete(){

        if(qtdColete >= 100){
            
            return false;

        }else{

            return true;
        }


    }
    
    
    public String getMateriaPrima() {
        return materiaPrima;
    }
   
    public int getNivelProtecao() {
        return nivelProtecao;
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public int getQtdColete() {
        return qtdColete;
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
