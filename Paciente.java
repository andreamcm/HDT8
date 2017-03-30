/*Andrea Cordón, 16076
Daniel Rodriguez, 15796
Fecha: 5 de abril de 2017
Paciente.java*/

public class Paciente extends Comparable<E>{
  private String nombre;
  private String sintomas;
  private String prioridad;

  public Paciente(){
    nombre = " ";
    sintomas = " ";
    prioridad = " ";
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

}
