/*
 *pr
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
//
public class Triage {
    private LocalDate Fecha;
    private LocalTime hora;
    private int respiracion;
    private int pulso;
    private int estadoMental;
    private int consciencia;
    private int dificultadRespiracion;
    private int lesionesGraves;
    private int edad;
    private int fiebre;
    private int vomitos;
    private int dolorAbdominal;
    private int signosShock;
    private int lesionesLeves;
    private int sangrado;
    private String colorSugerido;
    private String motivoCambio;
    private String colorFinal;
    private AdmisionDeEmergencia admision;

    public Triage (LocalDate Fecha, String colorSugerido) {
        this.Fecha = Fecha;
        this.colorSugerido = colorSugerido;
    }
    
    

    public Triage() {
        
        this.Fecha = LocalDate.of(1, 1, 1);;
        this.hora = LocalTime.of(0,0,0);
        this.respiracion = 0;
        this.pulso = 0;
        this.estadoMental = 0;
        this.consciencia = 0;
        this.dificultadRespiracion = 0;
        this.lesionesGraves = 0;
        this.edad = 0;
        this.fiebre = 0;
        this.vomitos = 0;
        this.dolorAbdominal = 0;
        this.signosShock = 0;
        this.lesionesLeves = 0;
        this.sangrado = 0;
        this.colorSugerido = "";
        this.motivoCambio = "";
        this.colorFinal = "";
        this.admision=null;
    }
    
    

    public Triage(LocalDate Fecha, LocalTime hora, int respiracion, int pulso, int estadoMental, int consciencia, int dificultadRespiracion, int lesionesGraves, int edad, int fiebre, int vomitos, int dolorAbdominal, int signosShock, int lesionesLeves, int sangrado, String colorSugerido, String motivoCambio, String colorFinal, AdmisionDeEmergencia admision) {
        this.Fecha = Fecha;
        this.hora = hora;
        this.respiracion = respiracion;
        this.pulso = pulso;
        this.estadoMental = estadoMental;
        this.consciencia = consciencia;
        this.dificultadRespiracion = dificultadRespiracion;
        this.lesionesGraves = lesionesGraves;
        this.edad = edad;
        this.fiebre = fiebre;
        this.vomitos = vomitos;
        this.dolorAbdominal = dolorAbdominal;
        this.signosShock = signosShock;
        this.lesionesLeves = lesionesLeves;
        this.sangrado = sangrado;
        this.colorSugerido = colorSugerido;
        this.motivoCambio = motivoCambio;
        this.colorFinal = colorFinal;
        this.admision=admision;
    }
    
    

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(int respiracion) {
        if (respiracion>=0 && respiracion<=2){
        this.respiracion = respiracion;}
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        if (pulso>=0 && pulso<=1){
            this.pulso = pulso;
        }
    }

    public int getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(int estadoMental) {
        if (estadoMental>=0 && estadoMental<=2){
            this.estadoMental = estadoMental;
        }
    }

    public int getConsciencia() {
        return consciencia;
    }

    public void setConsciencia(int consciencia) {
        if (consciencia>=0 && consciencia<=3){
            this.consciencia = consciencia;
        }
    }

    public int getDificultadRespiracion() {
        return dificultadRespiracion;
    }

    public void setDificultadRespiracion(int dificultadRespiracion) {
        if(dificultadRespiracion>=0 && dificultadRespiracion<=1){
            this.dificultadRespiracion = dificultadRespiracion;
        }
    }

    public int getLesionesGraves() {
        return lesionesGraves;
    }

    public void setLesionesGraves(int lesionesGraves) {
       if(lesionesGraves>=0 && lesionesGraves<=2){ 
           this.lesionesGraves = lesionesGraves;
       }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>= 0 && edad<=1){
            this.edad = edad;
        }
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        if(fiebre>=0 && fiebre<=2){
            this.fiebre = fiebre;
        }
    }

    public int getVomitos() {
        return vomitos;
    }

    public void setVomitos(int vomitos) {
        if(vomitos>=0 && vomitos<=2 ){
            this.vomitos = vomitos;
        }
    }

    public int getDolorAbdominal() {
        return dolorAbdominal;
    }
///////////////////////////////////////////////////////////////////////
    public void setDolorAbdominal(int dolorAbdominal) {
        if(dolorAbdominal>=0 && dolorAbdominal<=2 ){
            this.dolorAbdominal = dolorAbdominal;}
    }

    public int getSignosShock() {
        return signosShock;
    }

    public void setSignosShock(int signosShock) {
        if(signosShock>=0 && signosShock<=3){
            this.signosShock = signosShock;
        }
    }

    public int getLesionesLeves() {
        return lesionesLeves;
    }

    public void setLesionesLeves(int lesionesLeves) {
        if (lesionesLeves>=0 && lesionesLeves<=1){
            this.lesionesLeves = lesionesLeves;
        }
    }

    public int getSangrado() {
        return sangrado;
    }

    public void setSangrado(int sangrado) {
        if(sangrado>=0 && sangrado <=2){
            this.sangrado = sangrado;
        }
    }

    public String getColorSugerido() {
        return colorSugerido;
    }

    public void setColorSugerido(String colorSugerido) {
        this.colorSugerido = colorSugerido;
    }

    public String getMotivoCambio() {
        return motivoCambio;
    }

    public void setMotivoCambio(String motivoCambio) {
        this.motivoCambio = motivoCambio;
    }

    public String getColorFinal() {
        return colorFinal;
    }

    public void setColorFinal(String colorFinal) {
        this.colorFinal = colorFinal;
    }
    
  
    public  String  obtenerColorSugerido  (int respiracion, int pulso 
        ,int estadoMental,int conciencia, int dificultadRespiracion,
        int lesionesGraves, int edad, int fiebre, int vomito, 
        int dolorAbdominal, int signosShock, int lesionesLeves,int sangrado){
    
        int suma = respiracion + pulso + estadoMental + conciencia + 
            dificultadRespiracion + lesionesGraves + edad + fiebre + vomito + 
                dolorAbdominal + signosShock + lesionesLeves + sangrado;
        String color;


        if (suma >= 15) {
            return "Rojo";
        } else if (suma >= 10 && suma <= 14) {
            return "Naranja";
        } else if (suma>= 5 && suma <= 9) {
            return "Amarillo";
        } else if (suma >= 0 && suma <= 4) {
            return "Verde";
        } else {
            return "Azul";
        }

        }

   
      
    public static ArrayList<Integer> cantTriagePorFecha(LocalDate fecha1, LocalDate fecha2) throws FileNotFoundException, IOException {
        ArrayList<Integer> lista = new ArrayList<>();
        int rojo = 0;
        int naranja = 0;
        int amarillo = 0;
        int verde = 0;
        int azul = 0;
        Triage tri;

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos/Triage.txt"))) {
            String linea = br.readLine();

            while (linea != null) {
                String[] array = linea.split(",");
                // Validar que haya al menos dos campos en la línea antes de procesarla
                if (array.length >= 2) {
                    String[] splitFecha = array[0].split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(splitFecha[0]), Integer.parseInt(splitFecha[1]), Integer.parseInt(splitFecha[2]));
                    tri = new Triage();
                    tri.setColorSugerido(array[1]);

                    if (date.isAfter(fecha1) && date.isBefore(fecha2)) {
                        if (tri.getColorSugerido().equals("Rojo")) {
                            rojo++;
                        } else if (tri.getColorSugerido().equals("Naranja")) {
                            naranja++;
                        } else if (tri.getColorSugerido().equals("Amarillo")) {
                            amarillo++;
                        } else if (tri.getColorSugerido().equals("Verde")) {
                            verde++;
                        } else if (tri.getColorSugerido().trim().equals("Azul")) {
                            azul++;
                        }
                    }
                }

                linea = br.readLine();
            }
            // Agregar los valores de cada categoría a la lista una vez fuera del bucle
            lista.add(rojo);
            lista.add(naranja);
            lista.add(amarillo);
            lista.add(verde);
            lista.add(azul);

            return lista;
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    return lista;
    }   
     
     
     
       public static ArrayList<String> obtenerTriageCambiadosPorFecha(LocalDate fecha1, LocalDate fecha2) throws FileNotFoundException, IOException {
    ArrayList<String> lista = new ArrayList<>();
   
    Triage tri;
    String color="";
    try (BufferedReader br = new BufferedReader(new FileReader("Archivos/Triage.txt"))) {
        String linea = br.readLine();

        while (linea != null) {
            String[] array = linea.split(",");
            // Validar que haya al menos dos campos en la línea antes de procesarla
            if (array.length >= 3) {
                String[] splitFecha = array[0].split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(splitFecha[0]), Integer.parseInt(splitFecha[1]), Integer.parseInt(splitFecha[2]));
                tri = new Triage();
                tri.setColorSugerido(array[1]);
                tri.setColorFinal(array[2]);
                  
                if (date.isAfter(fecha1) && date.isBefore(fecha2)) {
                    color="Color sugerido: " +tri.getColorSugerido()+","+" Color final: "+ tri.getColorFinal();
                    lista.add(color);
                }
            }

            linea = br.readLine();
        }
        // Agregar los valores de cada categoría a la lista una vez fuera del bucle
        
      
        return lista;
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    return lista;
}    
    /* - Cantidad de triage que fueron cambiados por quien efectuó el traigado indicando
    color propuesto por el sistema y el color asignado por el funcionario
        */

    /*
    public String toString() {
        return "Triage{" + "Fecha=" + Fecha + ", hora=" + hora + ", respiracion=" + respiracion + ", pulso=" + pulso + ", estadoMental=" + estadoMental + ", consciencia=" + consciencia + ", dificultadRespiracion=" + dificultadRespiracion + ", lesionesGraves=" + lesionesGraves + ", edad=" + edad + ", fiebre=" + fiebre + ", vomitos=" + vomitos + ", dolorAbdominal=" + dolorAbdominal + ", signosShock=" + signosShock + ", lesionesLeves=" + lesionesLeves + ", sangrado=" + sangrado + ", colorSugerido=" + colorSugerido + ", motivoCambio=" + motivoCambio + ", colorFinal=" + colorFinal + '}';
    } */
     public String toString() {
        return "Triage{" + "Fecha=" + Fecha + ", colorSugerido=" + colorSugerido + '}';
    } 
}
    

