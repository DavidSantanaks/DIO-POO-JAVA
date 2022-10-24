package Veiculos;
public class RodarAplicacao {
    
    public static void main(String[] args) {
        
        //Criando o carro com o construtor sobrecarregado
        Veiculos carro = new Carro("Azul", "Uno com escada", 30);

        //Criando o carro com o construtor vazio
        Carro carro2 =  new Carro();

        carro2.setCor("preta");
        carro2.setModelo("VW UP");
        carro2.setCapacTanque(55);

        //Print solto apenas com objeto vai passar o endereço da memoria do objeto
        //System.out.println(carro);

        //Tem que informa cada metodo
       
        
        System.out.println();
        System.out.println();

        //Tem que informa cada metodo
        System.out.println("O modelo é: " + carro2.getModelo());
        System.out.println("A cor é: " + carro2.getCor());
        System.out.println("A capacide do tanque é: " + carro2.getCapacTanque());

        System.out.println("O valor gasto para encher o tanque é de: " + carro2.totalValorTanque(5.50));

        ///////////////////

        Veiculos caminhao =  new Veiculos();
        

        

        

    }
}
