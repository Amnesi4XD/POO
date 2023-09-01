import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");
       String[] nomeAlunos = {"Alfredo", "Peterson", "Wendel", "Ian", "Debra", "Luana", "Bruno",
                        "Romeu", "Julieta", "Maria", "Capitú", "Bentinho", "Amélia"};
       
       String[] nomeProfessores = {"Mia", "Saulo", "Paula"};

       List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < nomeAlunos.length; i++) {
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAlunos[i]);
            if (i % 2 == 0)
            {
                aluno.setCurso("ADM");
            }
            else
            {
                aluno.setCurso("TI");
            }
        alunos.add(aluno);

        }

    }
}