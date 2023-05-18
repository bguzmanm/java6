import java.time.LocalDate;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Persona cristian = new Persona("Cristian", "Contreras", "Peña");
    cristian.direccion = "Las Hualtatas 18200, departament 2500, Las Condes";
    cristian.fechaNacimiento = LocalDate.of(1992, 10, 10);

    cristian.respirar();
    cristian.trabajar();
    cristian.dormir();

    System.out.println(cristian.nombre + " tiene " + cristian.calcularEdad() + " años.");

    Persona miriam = new Persona("Miriam", "Pulgar",
            "Estoy", LocalDate.of(1990, 4,
            28), "Alcalde Delano 4234 depto 9843");

    miriam.apellidoMaterno = "Estay";

    miriam.respirar();
    miriam.trabajar();
    miriam.dormir();

    Auto kia;

    Auto ford = new Auto("Ford", "Focus", 2014);

    Auto bmw = new Auto("BMW", "E49", 2024);

    System.out.println(ford.toString());

    System.out.println(bmw.toString());

    kia = new Auto("Kia", "Sorento", 2010);
    System.out.println(kia.toString());

  }
}