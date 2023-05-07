package beans;
public class Patrimonio{
  
  private int nPatrimonio; // numero gerado com random util java
  private String estadoPatrimonio; //(novo, velho, com defeito)
  private String marca;
  private String local; //local onde o patrimonio esta 
  
  // criar metodo para validar se existe um patrimonio com o numero gerado pelo random na main

  public Patrimonio(){}

  public Patrimonio(int nPatrimonio, String estadoPatrimonio, String marca, String local){
    
    this.nPatrimonio = nPatrimonio;
    this.estadoPatrimonio = estadoPatrimonio;
    this.marca = marca;
    this.local = local;

  }
  
  public String getEstadoPatrimonio() {
      return estadoPatrimonio;
  }

  public String getLocal() {
      return local;
  }

  public String getMarca() {
      return marca;
  }
  public int getnPatrimonio() {
      return nPatrimonio;
  }

  public void setLocal(String local) {
      this.local = local;
  }

}
