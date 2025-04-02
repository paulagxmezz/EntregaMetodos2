public class NumberFormatTester {
    public static void main(String[] args) {
        String numeroInvalido = "abc";
        boolean tratarError = false; // Cambiar para tratar el error

        if (tratarError) {
            try {
                int numero = Integer.parseInt(numeroInvalido);
                System.out.println("Número convertido: " + numero);
            } catch (NumberFormatException ex) {
                System.out.println("Se ha producido una NumberFormatException: " + ex.getMessage());
            }
        } else {
            int numero = Integer.parseInt(numeroInvalido);
            System.out.println("Número convertido: " + numero);
        }
    }
}
