package lib;

import java.util.ArrayList;

public class Horarios {
    /*
     * Atributos da classe
     */
    private ArrayList<Consulta> consultas;
    private ArrayList<Exame> exames;

    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    /*
     * Consulta dos valores de todos atributos da classe
     */
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    /**
     * @param consulta
     */
    public void marcarHorario(Consulta consulta) {
        // TODO implement here
    }

    /**
     * @param exame
     */
    public void marcarHorario(Exame exame) {
        // TODO implement here
    }

    /**
     * @param consulta
     */
    public void desmarcarHorario(Consulta consulta) {
        // TODO implement here
    }

    /**
     * @param exame
     */
    public void desmarcarHorario(Exame exame) {
        // TODO implement here
    }
}
