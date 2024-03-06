public class QuintaQuestão {
    public static void main(String[] args) {
        String original = "Estagio";
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - i - 1];
            caracteres[caracteres.length - i - 1] = temp;
        }
        return new String(caracteres);
    }
}