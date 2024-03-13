import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linie {

    public void nr_cuvinte() {
        System.out.println("Numarul de cuvinte a liniei este de 10");
    }

    public void Aliniere(boolean este_Aliniere) {
        if (este_Aliniere) {
            System.out.println("Linia Este Aliniată");
        } else {
            System.out.println("Linia Nu Este Aliniată");
        }
    }

    // Prima versiune a metodei cautaSubstring (supraîncărcare)
    public void cautaSubstring(String sablon) {
        System.out.println("Căutare subșir în linie folosind doar șablonul: " + sablon);
    }

    // A doua versiune a metodei cautaSubstring (supraîncărcare)
    public void cautaSubstring(String text, String sablon) {
        Pattern pattern = Pattern.compile("([\\p{Punct}]*)\\b" + sablon + "\\b([\\p{Punct}]*)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Subșirul găsit în linie la poziția " + matcher.start() + ": " + matcher.group());
        }
    }
}
