public class Main {
    public static void main(String[] args) {
        
        Professor p1 = new Professor("Marcos Silva", "marcos@escola.com", "Java");
        Aluno a1 = new Aluno("Juliana Santos", "juliana@aluna.com", 2025);

        Curso curso = new Curso("Programação Orientada a Objetos", p1);

        System.out.println("=== Apresentações ===");
        p1.apresentar();
        a1.apresentar();

        System.out.println("\n=== Informações do Curso ===");
        curso.exibirInfo();
    }
}
