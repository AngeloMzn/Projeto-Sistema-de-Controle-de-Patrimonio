package beans;

public class Colete extends Patrimonio {
    
    private char tamanho; // M P G GG
    private int nivelProtecao; // Até qual calibre consegue cegurar 1 2 3
    private String materialOrigem; //feito do que (kevlar)

    public Colete(char tamanho, int nivelProtecao, String materialOrigem){

        this.tamanho = tamanho;
        this.nivelProtecao = nivelProtecao;
        this.materialOrigem = materialOrigem;


    }
    
    public String getMaterialOrigem() {
        return materialOrigem;
    }
   
    public int getNivelProtecao() {
        return nivelProtecao;
    }
    
    public char getTamanho() {
        return tamanho;
    }

}
