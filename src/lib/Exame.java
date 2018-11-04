package lib;

public class Exame {

    /*
     * Atributos da classe
     */
    protected int id;
    protected Paciente paciente;
    protected Medico medico;
    protected String tipo;
    protected String informacoes;
    protected String dataHora;
    protected boolean realizado;
    protected boolean cancelado;


    /*
     * Atribuição de valores aos atributos da classe
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /*
     * Consulta dos valores de todos atributos da classe
     */
    public int getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public boolean setRealizado() {
        return realizado;
    }

    public boolean setCancelado() {
        return cancelado;
    }
}
