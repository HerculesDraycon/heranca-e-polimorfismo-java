public class Gerente extends Funcionario {
    
    private String area;

    public Gerente(String nome, Data nascimento, float Salario, String area){
        super(nome, nascimento, Salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void calculaImposto(){
        this.salario = salario * 0.95f;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getNascimento());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Área: " + getArea());
    }

}
