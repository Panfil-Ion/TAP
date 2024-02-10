//. Fiecare litera din textul dat, sa fie înlocuită cu poziţia numerică din alfabet. Textul sa se scrie
//într-o singură linie cu doua spatii intre litere. In linia următoarea sub fiecare literă sa se indice
//poziţia.
public class AlfabetNumeric {

    public static void main(String[] args) {
        String text = "Hello, World!";
        transformaSiAfiseaza(text);
    }

    private static void transformaSiAfiseaza(String text) {
        // Afișează literele în partea de sus
        for (char caracter : text.toCharArray()) {
            if (Character.isLetter(caracter)) {
                System.out.print(caracter + "  ");
            } else {
                System.out.print("   ");
            }
        }

        // Linie nouă pentru a afișa pozițiile numerice în partea de jos
        System.out.println();

        // Afișează pozițiile numerice în partea de jos
        for (char caracter : text.toCharArray()) {
            if (Character.isLetter(caracter)) {
                int pozitie = Character.toLowerCase(caracter) - 'a' + 1;
                System.out.print(pozitie + "  ");
            } else {
                System.out.print("  ");
            }
        }
    }
}
