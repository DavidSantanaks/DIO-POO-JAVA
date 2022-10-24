package TesteMeuSobrescrita;

public class main {
    
    
    public static void barulho(Animal animal){
        
        animal.fazerBarulho();
    
    }

    public static void main(String[] args) {
        
        Animal dog = new cachorro();
        Animal gal = new galinha();
        
        barulho(dog);
        barulho(gal);   
    }

    

}
