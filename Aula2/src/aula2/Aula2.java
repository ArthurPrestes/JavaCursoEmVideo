package aula2;
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada= false;
        c1.rabiscar();
        c1.tampar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
