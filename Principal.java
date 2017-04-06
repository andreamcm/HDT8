/*Andrea Cordón, 16076
Daniel Rodriguez, 15796
Fecha: 5 de abril de 2017
Principal.java*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Principal{

static VectorHeap<Paciente> vector = new VectorHeap<Paciente>();

    public static void main(String[] args) throws IOException{
      BufferedReader lector = new BufferedReader(new FileReader(new File("pacientes.txt")));
      String texto;
      String pacientes = "";

      while((texto = lector.readLine()) != null){
        String[] pacientesInfo = texto.split(", ");
        Paciente nuevoPaciente = new Paciente(pacientesInfo[0], pacientesInfo[1], pacientesInfo[2]);
        vector.add(nuevoPaciente);
        pacientes = pacientes + "\n" + nuevoPaciente.toString();
      }

      System.out.println("\nLos pacientes llegaron al hospital de la siguiente manera: \n" + pacientes);
      System.out.println("\nDebido a la prioridad de las enfermedades los pacientes deben ser atendidos de la siguiente forma: \n");
      while(!vector.isEmpty()){
        System.out.println(vector.remove().toString());
      }

    }

}
