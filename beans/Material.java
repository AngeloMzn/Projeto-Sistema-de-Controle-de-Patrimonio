package beans;
public class Material extends Patrimonio{

    private String descricaoMaterial; // fala que tipo de material é(computador, mouse, mesa)
    private String porte; // pequeno, medio, grande
    
    public Material(String descricaoMaterial, String porte){
        this.descricaoMaterial = descricaoMaterial;
        this.porte = porte;


    }
    
    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }
    
    public String getPorte() {
        return porte;
    }

}
