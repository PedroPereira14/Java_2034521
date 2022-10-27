public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11},
                {11, 13, 15},
                {10, 19, 16}
        };
        int studentNumber=0;
        float highestAvg = 0;
        for(int i = 0; i<studentNumbers.length; i++){
            System.out.println("Aluno "+ studentNumbers[i] + " obteve as seguintes avaliaçoes: ");
            float average = 0;
            for (int j = 0; j<courseAcronyms.length;j++){
                System.out.println("\t" + courseAcronyms[j] + ": " + studentGrades[i] [j]);
                average += studentGrades [i] [j];
            }
            average /= studentGrades[i].length;
            if (average > highestAvg){
                highestAvg= average;
                studentNumber = studentNumbers[i];
            }
            System.out.println("\tMédia: " + average);
        }
        System.out.println("A média mais alta é: " + highestAvg + " é do aluno " + studentNumber);
    }

}