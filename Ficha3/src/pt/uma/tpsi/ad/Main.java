package pt.uma.tpsi.ad;

import pt.uma.tpsi.ad.CharacterUtilities;

public class Main {
    public static void main(String[] args) {
        char array[]= {'a','a','b'};
        char array1[] = {'c','d','b'};
        System.out.println(CharacterUtilities.lowerLetterSuccessorOf('z'));
        System.out.println(CharacterUtilities.lowerLetterPredecessorOf('y'));
        System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf('b',1));
        System.out.println(CharacterUtilities.lowerLetterPredecessorStepsOf('a',4));
        System.out.println(CharacterUtilities.occurrencesOfCharacterIn(array,'a'));
        System.out.println(CharacterUtilities.replaceCharacterIn(array,'a','c'));
        System.out.println(CharacterUtilities.concatenationOf(array,array1));
        System.out.println(CharacterUtilities.copyOfPartOf(array,1,3));
        System.out.println(CaesarCipherDecipherer.cipher(2,"abcd"));
        System.out.println(CaesarCipherDecipherer.decipher(2,"abcd"));
    }
}