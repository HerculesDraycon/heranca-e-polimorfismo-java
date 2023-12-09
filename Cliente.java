public class Cliente extends Pessoa {
    
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo){
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + getNascimento());
        System.out.println("Codigo: " + getCodigo());
    }

}
