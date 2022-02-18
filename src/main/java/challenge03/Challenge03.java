package challenge03;

import java.util.ArrayList;
import java.util.HashMap;

public class Challenge03 {
    private ArrayList<String> possibleSubstrings;

    public Challenge03() {
        possibleSubstrings = new ArrayList<String>();
    }

    /*
        Método que conta todos os pares anagramáticos. Primeiro chama a função
        que define o array de possíveis substrings e depois realiza a comparação
        de cada substring por meio de dois loops.
    */
    public int countAllAnagrammaticPairs(String str) {
        getAllPossibleSubstrings(str);
        int anagramCount = 0;

        for(int i = 0; i < possibleSubstrings.size(); i++) {
            for(int j = i+1; j < possibleSubstrings.size(); j++) {
                if (isAnagram(possibleSubstrings.get(i), possibleSubstrings.get(j))) {
                    anagramCount++;
                }
            }
        }
        return anagramCount;
    }

    /*
        Método que extrai todas as substrings possíveis de uma string por dois
        loops. O primeiro é pra pegar o índice de um caractere, e o segundo
        pra pegar o índice do caractere subsequente. No segundo loop é cortado
        a substring com esses índices respectivamente.
        Então por exemplo na primeira iteração de uma string "abc",
        no primeiro loop o i vai valer 0, daí o j vai valer 1. Na primeira
        iteração do segundo for, a primeira substring armazenada no valor de
        substrings será "ab", depois vai ser "abc" e assim sucessivamente.
    */
    public void getAllPossibleSubstrings(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length() + 1; j++) {
                possibleSubstrings.add(str.substring(i,j));
            }
        }
    }

    /*
        Método que pega duas substrings e checa se é um anagrama. O processo
        se dá por checar se ambas as substrings possuem o mesmo tamanho e,
        se tiverem, converter ambas as substrings para um array de char
        ordenado em ordem alfabética e verificar se os arrays são iguais.
        Se forem, significa que são anagramas.
     */
    public boolean isAnagram(String substr1, String substr2) {
        if(substr1.length() != substr2.length()) {
            return false;
        }

        char[] substr1_arr = convertFromStringToCharAndOrderByASC(substr1);
        char[] substr2_arr = convertFromStringToCharAndOrderByASC(substr2);

        for(int i = 0; i < substr1_arr.length; i++){
             if(substr1_arr[i] != substr2_arr[i]) {
                 return false;
             }
        }
        return true;
    }

    /*
        Método que contém um loop que converte a string para um array
        de char e depois chama a função que ordena eles.
    */
    private char[] convertFromStringToCharAndOrderByASC(String str) {
        char[] chr_arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            chr_arr[i] = str.charAt(i);
        }

        chr_arr = orderCharArrayByASC(chr_arr);
        return chr_arr;
    }

    /*
        Bubble sort que ordena os caracteres do array em ordem alfabética.
        A comparação aqui é feita conforme a tabela ASCII, convertendo os
        caracteres respectivamente. Retorna o array ordenado.
     */
    private char[] orderCharArrayByASC(char[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if ((int) arr[j] > (int) arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

   public String seilaman() {
        return possibleSubstrings.toString();
    }


}
