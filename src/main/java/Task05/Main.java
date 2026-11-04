
package Task05;

public class Main {
    public static void main(String[] args) {
        String text = "Automation";

        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u' || letter == 'A' ||
                    letter == 'E' || letter == 'I' ||
                    letter == 'O' || letter == 'U') {
                vowels++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Length: " + text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }
}

