public class CadastroPessoas {
    
    private static final int TMAX = 10;
    private int qtd;
    private Pessoa[] pessoas;

    public CadastroPessoas(){
        this.qtd = 0;
        this.pessoas = new Pessoa[TMAX];
    }

    public void cadastraPessoa(Pessoa pessoa){

        if(qtd < TMAX){
            pessoas[qtd] = pessoa;
            qtd++;
        } else {
            System.out.println("O número máximo de cadastros já foi atingido.");
        }

    }

    public void imprimeCadastro(){
        System.out.println("| Usuários Cadastrados |");

        for(int i = 0; i<qtd; i++){

            if(pessoas[i] instanceof Funcionario){
                ((Funcionario)pessoas[i]).calculaImposto();
            }

            pessoas[i].imprimeDados();

            System.out.println("____________________________");

        }
    } 
}
