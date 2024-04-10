import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduceți un număr sub formă de cifre: ");
            String input = scanner.nextLine();

            validateInput(input); // Verificăm input-ul utilizatorului

            // Inversăm cifrele și afișăm rezultatul
            String reversedNumber = reverseNumber(input);
            System.out.println("Numărul cu cifrele inversate este: " + reversedNumber);
        } catch (InvalidNumberException e) {
            System.out.println("Eroare verificată: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Numărul introdus nu este valid.");
        } catch (RuntimeException e) {
            System.out.println("Eroare de timpul execuției: " + e.getMessage());
        } finally {
            // Închidem scanner-ul în blocul finally pentru a ne asigura că resursele sunt eliberate corect
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // Metoda pentru validarea input-ului utilizatorului
    public static void validateInput(String input) throws InvalidNumberException {
        if (!input.matches("[0-9]+")) {
            throw new InvalidNumberException("Numărul introdus conține caractere nevalide.");
        }
    }

    // Metoda care inversează cifrele numărului
    public static String reverseNumber(String number) {
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNumber.append(number.charAt(i));
        }
        return reversedNumber.toString();
    }
}

// Excepție verificată pentru numărul introdus nevalid
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
