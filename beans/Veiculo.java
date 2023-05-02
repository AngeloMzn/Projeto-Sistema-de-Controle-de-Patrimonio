package beans;
public class Veiculo extends Patrimonio{
    
    private String modeloVeiculo;
    private int aroVeiculo;
    private String corVeiculo;
    private String placaVeiculo;

    public Veiculo(String modeloVeiculo, int aroVeiculo, String corVeiculo, String placaVeiculo){
        
        this.modeloVeiculo = modeloVeiculo;
        this.aroVeiculo = aroVeiculo;
        this.corVeiculo = corVeiculo;
        this.placaVeiculo = placaVeiculo;

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
  
}
