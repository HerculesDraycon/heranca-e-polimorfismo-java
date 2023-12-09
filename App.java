public class App{
    public static void main(String[] args) {
        
        CadastroPessoas perfil = new CadastroPessoas();

        perfil.cadastraPessoa(new Cliente("Jorge", new Data(12, 01, 1992), 001));
        perfil.cadastraPessoa(new Gerente("Celina Goés", new Data(4, 7, 1978), 5600, "Colegiado"));
        perfil.cadastraPessoa(new Funcionario("Stenio Longo", new Data(2, 8, 1978), 9000));

        perfil.imprimeCadastro();

    }
}