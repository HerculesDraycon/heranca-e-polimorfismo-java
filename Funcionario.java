public class Funcionario extends Pessoa {
    
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void calculaImposto(){
        this.salario = salario * 0.97f;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getNascimento());
        System.out.println("Salário: R$" + getSalario());
    }

}
