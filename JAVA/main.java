// Classe principal (main)
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("João", 20, "Engenharia"));
        pessoas.add(new Professor("Maria", 45, 5500.0));

        for (Pessoa p : pessoas) {
            System.out.println("----");
            p.exibirDados();  // Polimorfismo em ação
        }
    }
}