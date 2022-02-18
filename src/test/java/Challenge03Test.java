import challenge03.Challenge03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Challenge03Test {
    /*
        Testa a contagem de pares anagramáticos em uma string
    */
    @Test
    void shouldBeAbleToCountAllAnagrammaticPairsWithinAString() {
        Challenge03 ch03 = new Challenge03();
        String str = "ifailuhkqq";

        int pairs = ch03.countAllAnagrammaticPairs(str);

        Assertions.assertEquals(3, pairs);
    }
}
