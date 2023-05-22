package beans;
public class Veiculo extends Patrimonio{
    
    private int qtdVeiculo;
    private String modeloVeiculo;
    private int aroVeiculo;
    private String corVeiculo;
    private String placaVeiculo;

    public Veiculo(){

        super();

    }

    public Veiculo(int nPatrimonio, String estadoPatrimonio, String marca, String local, String modeloVeiculo, int aroVeiculo, String corVeiculo, String placaVeiculo){
        
        super(nPatrimonio, estadoPatrimonio, marca, local);
        this.modeloVeiculo = modeloVeiculo;
        this.aroVeiculo = aroVeiculo;
        this.corVeiculo = corVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.qtdVeiculo++;
    
    }

    public boolean verificaQtdVeiculo(){

        if(qtdVeiculo >= 100){
            throw new OutOfMemoryError("Memoria cheia. Você não pode mais cadastrar veiculos.");
            

        }else{

            return true;
        }


    }
    
    public boolean verificaPlaca(String nSerie){

        if(nSerie.length() != 7){
            
            throw new IllegalArgumentException("O numero da placa deve conter 7 caracteres ! você colocou: " + nSerie.length());

        }else{

            return true;

        }

    }
    
    
    public int getAroVeiculo() {
        return aroVeiculo;
    }
    
    public String getCorVeiculo() {
        return corVeiculo;
    }
    
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }
    
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    
    public int getQtdVeiculo() {
        return qtdVeiculo;
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
