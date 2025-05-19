public class ValidadorSenha {
    public boolean validar(String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temDigito = false;
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            if (Character.isLowerCase(c)) temMinuscula = true;
            if (Character.isDigit(c)) temDigito = true;
        }
        return temMaiuscula && temMinuscula && temDigito;
    }
}
