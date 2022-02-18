import challenge01.Challenge01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Challenge01Test {

    /*
        Testa a criação da escada de asteriscos com um número aleatório
        entre 6 e 20.
    */
    @Test
    void shouldBeAbleToBuildALadderWithAnyLength() {
        int max = 20;
        int min = 6;
        int n = (int) Math.floor(Math.random()*(max-min+1)+min);

        Challenge01 ch01 = new Challenge01();

        String ladder = ch01.buildLadder(n);

        Assertions.assertEquals(n, ladder.lines().count());
    }
}
