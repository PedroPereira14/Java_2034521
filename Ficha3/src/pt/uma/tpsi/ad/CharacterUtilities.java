package pt.uma.tpsi.ad;

public class CharacterUtilities {
    public static char lowerLetterSuccessorOf(char caracter){
        if (caracter == 'z'){
            return 'a';
        }
        else
            return ++caracter;
    }
    public static char lowerLetterPredecessorOf(char caracter){
        if (caracter == 'a'){
            return 'z';
        }
        else
            return --caracter;
    }
    public static char lowerLetterSuccessorStepsOf(char caracter, int steps){
        char next = caracter;
        for (int i = 0;i < steps; i++){
            next = lowerLetterSuccessorOf(next);
        }
        return next;
    }
    public static char lowerLetterPredecessorStepsOf(char caracter, int steps){
        char next = caracter;
        for (int i = 0;i < steps; i++){
            next = lowerLetterPredecessorOf(next);
        }
        return next;
    }
    public static int occurrencesOfCharacterIn(char[] array, char car){
        int ocorre = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == car){
                ocorre++;
            }
        }
        return ocorre;
    }
    public static char[] replaceCharacterIn(char[] array, char substituir, char substituto){
        for (int i = 0; i < array.length; i++){
            if (array[i] == substituir){
                array[i] = substituto;
            }
        }
        return array;
    }
    public static char[] concatenationOf(char[] arr1, char[] arr2){
        char[] array = new char[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++){
            array[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            array[i+arr1.length]=arr2[i];
        }
        return array;
    }
    public static char[]  copyOfPartOf(char[] array, int II, int IF){
        int f = IF-II;
        int u = 0;
        char[] arraycopiado = new char[f];
        for (int i = II; i < IF; i++){
            arraycopiado[u]=array[i];
            u++;
        }
        return arraycopiado;
    }
}
