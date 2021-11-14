import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        CSVUtils csvUtils = new CSVUtils();
        listaFuncionarios = csvUtils.ler();
        csvUtils.escreve(listaFuncionarios);
    }
}
