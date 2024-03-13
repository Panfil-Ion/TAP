import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraf extends Linie {

    @Override
    public void cautaSubstring(String text, String sablon) {
        Pattern pattern = Pattern.compile("([\\p{Punct}]*)\\b" + sablon + "\\b([\\p{Punct}]*)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Subșirul găsit în linie la poziția " + matcher.start() + ": " + matcher.group());
        }
    }

    public void Pagina(String numarPagina) {
        System.out.println("Pagina: " + numarPagina);
    }
}
