package pt.uma.tpsi.ad;

public class CaesarCipherDecipherer {
    public static String cipher(int steps, String frase){
        String cipherStr = "";
        for(int i=0; i<frase.length();i++){
            cipherStr += CharacterUtilities.lowerLetterSuccessorStepsOf(frase.charAt(i),steps);
        }
        return cipherStr;
    }
    public static String decipher(int steps, String frase){
        String cipherStr = "";
        for(int i=0; i<frase.length();i++){
            cipherStr += CharacterUtilities.lowerLetterPredecessorStepsOf(frase.charAt(i),steps);
        }
        return cipherStr;
    }
}
