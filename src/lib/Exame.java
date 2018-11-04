package lib;

public class Exame {

    /*
     * Atributos da classe
     */
    protected int id;
    protected Paciente paciente;
    protected Medico medico;
    protected String tipo;
    protected String resultado;
    protected String informacoes;
    protected String dataHora;
    private boolean realizado;
    private boolean cancelado;

    /**
     * Default constructor
     *
     * @param paciente
     * @param medico
     * @param tipo
     */
    public Exame(Paciente paciente, Medico medico, String tipo) {
        setPaciente(paciente);
        setMedico(medico);
        setTipo(tipo);
        setRealizado(false);
        setCancelado(false);
    }

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

    public void setResultado(String resultado) {
        this.resultado = resultado;
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

    public String getResultado() {
        return resultado;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public boolean isCancelado() { return cancelado; }

    public boolean isRealizado() { return realizado; }

    /*
     * Metodo para marcar uma exame como realizdo
     */
    public void realizar(){
        setRealizado(true);
    }

    /*
     * Metodo para cancelar um exame
     */
    public void cancelar(){
        setRealizado(true);
    }
}
