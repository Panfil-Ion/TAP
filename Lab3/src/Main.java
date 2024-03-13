public class Main {
    public static void main(String[] args) {
        Linie l = new Paragraf();
        l.nr_cuvinte();
        l.Aliniere(true);
        System.out.println();

        Paragraf p = new Paragraf();
        p.nr_cuvinte();
        p.Aliniere(true);
        p.Pagina("14");
        System.out.println();

        l.cautaSubstring("Acesta este un text de test. Testăm căutarea de subșiruri.");
        l.cautaSubstring("?test? ,test !test alpha-test. tester atest", "test");
    }
}
