public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + getNome() + 
                           " | Matrícula: " + matricula);
    }
}
