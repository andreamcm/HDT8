/*Andrea Cordón, 16076
Daniel Rodriguez, 15796
Fecha: 5 de abril de 2017
Paciente.java*/
import java.lang.Object;

public class Paciente implements Comparable<Paciente>{
  private String nombre;
  private String sintomas;
  private String prioridad;

  public Paciente(String nombre, String sintomas, String prioridad){
    this.nombre = nombre;
    this.sintomas = sintomas;
    this.prioridad = prioridad;
  }

  public Paciente(){
    super();
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return nombre;
  }

  public void setSintomas(String sintomas){
    this.sintomas = sintomas;
  }

  public String getSintomas(){
    return sintomas;
  }

  public void setPrioridad(String prioridad){
    this.prioridad = prioridad;
  }

  public String getPrioridad(){
    return prioridad;
  }

  public String toString(){
    return nombre + ", " + sintomas + ", " + prioridad;
  }

  public int compareTo(Paciente paciente){
    return this.prioridad.compareTo(paciente.prioridad);
  }

}
