package challenge02;

public class Challenge02 {
    /*
        Regex pra validar todas as regras pra considerar a senha forte.
        A primeira parte verifica se possui dígitos, a segunda caracteres
        minúsculos, a terceira caracteres maiúsculos e por fim a quarta
        se tem algum caracter especial válido. Como cada grupo  usa o
        look ahead (?=) cada regra consegue fazer a verificação em qualquer
        lugar da string passada. Achei conveniente usar essa abordagem porque
        também ainda estou aprendendo e aos poucos perdendo o medo de
        usar expressões regulares.
    */
    private String PASSWORD_MATCH_REGEX =
            "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).+$";

    private String password;

    /*
        Verifica se possui a quantidade mínima necessária para a senha e,
        se não tiver, retorna a quantidade de caracteres necessários. Se
        ele ainda possuir mas não passar pela regex, ainda continua
        inválida.
    */
    public String verifyPassword(String password) {
        int length = password.length();

        if (length < 6) {
            return "Quase lá! Mas ainda faltam " + (6 - length) + " caracteres!";
        }

        if (!password.matches(PASSWORD_MATCH_REGEX)) {
            return "Senha inválida! A senha precisa conter no mínimo: \n" +
                    "- 6 caracteres.\n" +
                    "- 1 digito.\n" +
                    "- 1 letra em minúsculo.\n" +
                    "- 1 letra em maiúsculo.\n" +
                    "- 1 caractere especial, podendo ser escolhido entre: !@#$%^&*()-+";
        }

        setPassword(password);

        return "Senha cadastrada com sucesso!";
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
