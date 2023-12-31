
package com.mycompany.taller;

/**
 *
 * @author Usuario
 */
public abstract class DatosTaller {
    private static ListaPacientes pacientes;
    private static ListaMedicos medicos;
    private static ListaResEstudios resultados;
    private static ListaAdmisiones admisiones;
    private static ListaEspecialidades especialidades;
    
    private static ListaPacientes pacientesSinTriage;
    private static ListaPacientes pacientesTriageados;
    
    
    public static ListaPacientes getPacientes() {
        return pacientes;
    }

    public static void setPacientes(ListaPacientes pacientes) {
        DatosTaller.pacientes = pacientes;
    }

    public static ListaMedicos getMedicos() {
        return medicos;
    }

    public static void setMedicos(ListaMedicos medicos) {
        DatosTaller.medicos = medicos;
    }

    public static ListaResEstudios getResultados() {
        return resultados;
    }

    public static void setResultados(ListaResEstudios resultados) {
        DatosTaller.resultados = resultados;
    }

    public static ListaAdmisiones getAdmisiones() {
        return admisiones;
    }

    public static void setAdmisiones(ListaAdmisiones admisiones) {
        DatosTaller.admisiones = admisiones;
    }

    public static ListaEspecialidades getEspecialidades() {
        return especialidades;
    }

    public static void setEspecialidades(ListaEspecialidades especialidades) {
        DatosTaller.especialidades = especialidades;
    }

    public static ListaPacientes getPacientesSinTriage() {
        return pacientesSinTriage;
    }

    public static void setPacientesSinTriage(ListaPacientes pacientesSinTriage) {
        DatosTaller.pacientesSinTriage = pacientesSinTriage;
    }
    
    
  
    
    public static void agregarPacienteAdmision(Paciente paci){
        pacientesSinTriage.agregar(paci);
    }
    
    public static void eliminarPacienteAdmision(Paciente paci){
        pacientesSinTriage.eliminar(paci);
    }
    
    
    public static void agregarPacienteTriage(Paciente paci){
        pacientesTriageados.agregar(paci);
    }
    
    public static void eliminarPacienteTriage(Paciente paci){
        pacientesTriageados.eliminar(paci);
    }

}
