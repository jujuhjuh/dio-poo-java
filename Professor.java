public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, String email, String area) {
        super(nome, email);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o professor " + getNome() + 
                           " | Área: " + area);
    }
}
