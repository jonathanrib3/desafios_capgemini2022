import challenge02.Challenge02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Challenge02Test {
    /*
        Testa o caso em que a quantidade de caracteres é menor que 6.
    */

    @Test
    void shouldBeAbleToShowHowManyCharactersAreLeftInAPassword() {
        Challenge02 ch02 = new Challenge02();
        String weakPassword = "Ya3";
        String result = ch02.verifyPassword(weakPassword);

        Assertions.assertEquals("Quase lá! Mas ainda faltam 3 caracteres!", result);
    }

    /*
        Esse teste é o que valida a mensagem do que é necessário para ter
        uma senha forte. Ele compara o número de linhas ao invés da string
        inteira porque a string é bem longa e eu não queria poluir muito
        os testes.
    */

    @Test
    void shouldBeAbleToShowConditionsToHaveAStrongPassword() {
        Challenge02 ch02 = new Challenge02();
        String weakPassword = "Yaaaa3";

        String result = ch02.verifyPassword(weakPassword);
        Assertions.assertEquals(6,result.lines().count());
    }

    @Test
    void shouldBeAbleToReturnSuccessWithAStrongPassword() {
        Challenge02 ch02 = new Challenge02();
        String strongPassword = "Yaaaa@3";

        String result = ch02.verifyPassword(strongPassword);
        Assertions.assertEquals("Senha cadastrada com sucesso!",result);
    }
}
