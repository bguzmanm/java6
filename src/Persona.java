import java.time.LocalDate;
import java.util.Date;

public class Persona {
  String nombre;
  String apellidoPaterno;
  String apellidoMaterno;
  LocalDate fechaNacimiento;
  String direccion;

  /*public Persona(){
    System.out.println("soy el constructor, y me estoy ejecutando ❤️ ");
  }*/

  public Persona(String nombre, String apellidoPaterno, String apellidoMaterno){
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
  }

  public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String direccion){
      this(nombre, apellidoPaterno, apellidoMaterno);
      this.fechaNacimiento = fechaNacimiento;
      this.direccion = direccion;
  }

  public void nacer(){
    fechaNacimiento = LocalDate.now();
  }

  public int calcularEdad(){
    return LocalDate.now().getYear() - fechaNacimiento.getYear();
  }

  public void respirar(){
    System.out.println(nombre + " respira...");
  }

  public void dormir(){
    System.out.println(nombre + " duerme... zzzzzz... ");
  }

  public void trabajar(){
    System.out.println(nombre + " trabaja...");
  }

}
