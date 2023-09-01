import java.util.*;
public class Curso {

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private String nomeCurso;

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        switch (nomeCurso) {
            case "TI":
                this.disciplinas.add("POO");
                this.disciplinas.add("EST. DADOS");
                break;
            case "ADM":
                this.disciplinas.add("BI");
            default:
                System.out.println("Curso não identificado.");
        }
    }

    private List<String> disciplinas;
}
