// Definirea clasei de bază
class ClasaDeBaza {
    int atribut1;

    // Constructor implicit
    ClasaDeBaza() {
        this.atribut1 = 0;
        System.out.println("Constructorul implicit al clasei de baza");
    }

    // Constructor cu un parametru
    ClasaDeBaza(int atribut1) {
        this.atribut1 = atribut1;
        System.out.println("Constructorul cu un parametru al clasei de baza");
    }

    // Constructor cu doi parametri
    ClasaDeBaza(int atribut1, int atribut2) {
        this(atribut1); // Apelarea constructorului cu un parametru
        System.out.println("Constructorul cu doi parametri al clasei de baza");
    }

    // Metoda 1
    void metoda1() {
        System.out.println("Metoda 1 din clasa de baza");
    }

    // Metoda 2
    void metoda2() {
        System.out.println("Metoda 2 din clasa de baza");
    }
}

// Definirea clasei derivate
class ClasaDerivata extends ClasaDeBaza {
    int atribut2;

    // Constructor implicit
    ClasaDerivata() {
        super(); // Apelarea constructorului clasei de bază
        this.atribut2 = 0;
        System.out.println("Constructorul implicit al clasei derivate");
    }

    // Constructor cu un parametru
    ClasaDerivata(int atribut1, int atribut2) {
        super(atribut1); // Apelarea constructorului cu un parametru al clasei de bază
        this.atribut2 = atribut2;
        System.out.println("Constructorul cu un parametru al clasei derivate");
    }

    // Metoda 3
    void metoda3() {
        System.out.println("Metoda 3 din clasa derivata");
    }
}

public class Main {
    public static void main(String[] args) {
        // a) Obiectul clasei de bază folosind constructorul clasei de bază
        ClasaDeBaza obiectBaza1 = new ClasaDeBaza(10, 20);
        obiectBaza1.metoda1();
        obiectBaza1.metoda2();

        // b) Obiectul clasei derivate folosind constructorul clasei de bază
        ClasaDerivata obiectDerivat1 = new ClasaDerivata(30, 40);
        obiectDerivat1.metoda1();
        obiectDerivat1.metoda2();
        obiectDerivat1.metoda3();

        // c) Obiectul clasei derivate folosind constructorul clasei derivate
        ClasaDerivata obiectDerivat2 = new ClasaDerivata();
        obiectDerivat2.metoda1();
        obiectDerivat2.metoda2();
        obiectDerivat2.metoda3();

        // d) Obiectul clasei de bază folosind constructorul clasei derivate
        ClasaDeBaza obiectBaza2 = new ClasaDerivata(50, 60);
        obiectBaza2.metoda1();
        obiectBaza2.metoda2();
    }
}
