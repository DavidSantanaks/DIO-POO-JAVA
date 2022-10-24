package Veiculos;
class Caminhao extends Veiculos {
    
     //Atributos do objeto
     private String cor;
     private String modelo;
     private int capacidadeTanque;
 
     //Construtor aqui (Sempre abaixo dos atributos)
     //Construtor com sobrecarga
     //Para ter os construtores é necessarios criar eles com o mesmo nome da classe
 
     //Construtor vazio
     Caminhao(){
 
     }
 
     //Construtor sobrecarregado
     Caminhao(String cor, String modelo, int capacidadeTanque){
         this.cor =  cor;
         this.modelo =  modelo;
         this.capacidadeTanque = capacidadeTanque;
     }
 
     //GETS E SETS
     void setCor(String cor){
         this.cor = cor;
     }
 
     String getCor(){
         return cor;
     }
 
     void setModelo(String modelo){
         this.modelo =  modelo;
     }
 
     String getModelo(){
         return modelo;
     }
 
     
 
     void setCapacTanque(int capacidadeTanque){
         this.capacidadeTanque =  capacidadeTanque;
     }
 
     int getCapacTanque(){
         return this.capacidadeTanque;
     }
 
     //Metodos do total para encher o tanque
 
     double totalValorTanque(double valorCombustivel){
         return this.capacidadeTanque * valorCombustivel;
     }
 
 
     //Metodos de negocios abaixo sempre abaixo o gets e sets

}
