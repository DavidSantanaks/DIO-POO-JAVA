package Funcionarios;

public class Main {

    public static void main(String[] args) {
        
        //Instaciando objeto funcionarios
        Funcionarios funcionarios = new Funcionarios();

        //Upcast
        Funcionarios gerente = new Gerente();
        Funcionarios vendedor = new Vendedor();
        Funcionarios Faxineiro = new Faxineiro();

        //Downcast

        //Gerente gerente_ = new Funcionario(); //MODO ERRADO
        //Normalmente isso abaixo da erro
        //NÃO SE TRABALHA COM DOWNCAST EM POO
        Vendedor vendedor_ = (Vendedor) new Funcionarios();
        


    }
}
