// Clasa de bază
class JocVideo {
    String titlu;
    String platforma;
    int anLansare;
    int pret;

    // Constructorul 1
    JocVideo(String titlu, String platforma) {
        this(titlu, platforma, 2000);
        System.out.println("A fost creat un joc video cu titlul \"" + titlu + "\" pe platforma " + platforma + "\n");
    }
    // Constructorul 2
    JocVideo(String titlu, String platforma, int anLansare) {
        this.titlu = titlu;
        this.platforma = platforma;
        this.anLansare = anLansare;
        System.out.println("Jocul \"" + titlu + "\" a fost lansat în anul " + anLansare);
    }
    // Constructorul 3
    JocVideo(String titlu, String platforma, int anLansare, int pret) {
        this.titlu = titlu;
        this.platforma = platforma;
        this.anLansare = anLansare;
        this.pret = pret;
        System.out.println("Jocul \"" + titlu + "\" a fost lansat în anul " + anLansare + " cu un preț de " + pret + " lei.");
    }
    // Metoda 1 din clasa de bază
    void afiseazaDetalii() {
        System.out.println("Detaliile jocului sunt:");
        System.out.println("Titlu: " + titlu);
        System.out.println("Platforma: " + platforma);
        System.out.println("Anul lansării: " + anLansare);
        System.out.println("Preț: " + pret + " lei");
    }
    // Metoda 2 din clasa de bază
    void ruleazaJoc() {
        System.out.println("Jocul \"" + titlu + "\" se rulează pe platforma " + platforma + "\n");
    }
}
// Clasa derivată
class JocRPG extends JocVideo {
    // Constructor 1
    JocRPG(String titlu, String platforma, int anLansare, int pret) {
        super(titlu, platforma, anLansare, pret);
    }
    // Constructor 2
    JocRPG(String titlu, String platforma, boolean esteDLC) {
        this(titlu, platforma, 2011, 800);
        if (esteDLC) {
            System.out.println("Titlul jocului RPG \"" + titlu + "\" pe platforma " + platforma + " este un DLC.");
        } else {
            System.out.println("Titlul jocului RPG \"" + titlu + "\" pe platforma " + platforma + " nu este un DLC.");
        }
    }
    //  metoda 1
    void afiseazaPlatforma() {
        System.out.println("Platforma jocului RPG: " + platforma + "\n");
    }
    //metoda 2
    void afiseazaAnulLansarii() {
        System.out.println("Anul lansării jocului RPG \"" + titlu + "\": " + anLansare);
    }
    //metoda 3
    void afiseazaModPoveste() {
        System.out.println("Jocul RPG \"" + titlu + "\" are un mod poveste bogat.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // a) Obiectul clasei de bază folosind constructorul clasei de bază
        JocVideo joc1 = new JocVideo("Final Fantasy VII", "PlayStation", 1997, 240); // Setăm și anul lansării și prețul
        joc1.afiseazaDetalii();
        joc1.ruleazaJoc();

        // b) Obiectul clasei derivate folosind constructorul clasei de bază
        JocRPG jocRPG1 = new JocRPG("The Witcher 3: Wild Hunt", "PC", 2015, 200); // Constructorul clasei derivate

        jocRPG1.afiseazaPlatforma();

        // c) Obiectul clasei derivate folosind constructorul clasei derivate
        JocRPG jocRPG2 = new JocRPG("Skyrim", "Xbox", true);
        jocRPG2.afiseazaAnulLansarii();
        jocRPG2.afiseazaModPoveste();

        /// d) Obiectul clasei de bază folosind constructorul clasei derivate
        JocVideo joc2 = new JocRPG("Mass Effect", "PlayStation", 2007, 180); // Constructorul clasei derivate

        joc2.afiseazaDetalii();
    }
}
