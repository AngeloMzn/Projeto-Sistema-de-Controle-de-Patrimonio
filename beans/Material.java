package beans;
public class Material extends Patrimonio{

    private int qtdMaterial;
    private String descricaoMaterial; // fala que tipo de material é(computador, mouse, mesa)
    private String porte; // pequeno, medio, grande
    
    public Material(){
       
        super();
        
    }

    public Material(int nPatrimonio, String estadoPatrimonio, String marca, String local, String descricaoMaterial, String porte){
        super(nPatrimonio, estadoPatrimonio, marca, local);
        this.descricaoMaterial = descricaoMaterial;
        this.porte = porte;
        this.qtdMaterial++;

    }
    
    public boolean verificaQtdMaterial(){

        if(qtdMaterial >= 100){
            throw new OutOfMemoryError("Memoria cheia. Você não pode mais cadastrar materiais.");

        }else{

            return true;
        }


    }
    
   
    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }
    
    public String getPorte() {
        return porte;
    }

    public int getQtdMaterial() {
        return qtdMaterial;
    }

    @Override
    public int getnPatrimonio() {
        return super.getnPatrimonio();
    }
}
