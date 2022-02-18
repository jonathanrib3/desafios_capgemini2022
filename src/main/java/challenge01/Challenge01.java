package challenge01;

public class Challenge01 {
    private String ladder;

    /*
        Método que realiza a iteração da figura. Aqui tem-se um loop pra altura
        da escada, e outro pra preenchimento da linha. Ao fim de cada linha é 
        acrescentado um espaço e uma quebra de linha pra formar a escada. 
        No fim, é chamado o método pra definir o atributo ladder sem espaços sobrando.
    */
    public String buildLadder(int ladderHeight) {
        String ladder = "";

        for(int i = 0; i < ladderHeight; i++) {
            for (int j = 0; j < i + 1; j++) {
                ladder += "*";
            }
            ladder += " \n";
        }
        setLadder(ladder.trim());

        return getLadder();
    }

    public String getLadder() {
        return this.ladder;
    }

    private void setLadder(String ladder) {
        this.ladder = ladder;
    }
}
