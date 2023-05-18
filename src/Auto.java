public class Auto {
  String marca;
  String modelo;
  int ano;

  public Auto(String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "Auto{" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", ano=" + ano +
            '}';
  }
}
