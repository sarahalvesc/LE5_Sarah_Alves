public class Funcionario {
    private int id;
    private double salario;
    private int numFilhos;
    private String estadoCivil;
    private String grauInstrucao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }
}
