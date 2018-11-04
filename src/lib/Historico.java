package lib;

import java.util.ArrayList;

public class Historico {
    /*
     * Atributos da classe
     */
    protected Paciente paciente;
    protected ArrayList<Consulta> consultas;
    protected ArrayList<Exame> exames;


    /**
     * Default constructor
     */
    public Historico (Paciente paciente){
        setPaciente(paciente);
    }

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public Paciente getPaciente() {
        return paciente;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    /**
     * @param consulta
     * Metodo para adicionar nova consulta ao historico do paciente
     */
    public void adicionarConsulta(Consulta consulta) {
        // TODO implement here
    }

    /**
     * @param exame
     * Metodo para adicionar novo exame ao historico do paciente
     */
    public void adicionarExame(Exame exame) {
        // TODO implement here
    }
}
