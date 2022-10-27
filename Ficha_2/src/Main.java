
public class Main {

    public static void main(String[] args) {
        int[] array = {2,7,3,9};
        System.out.println(NumericalUtilities.powerOf(2,3));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersUpTo(100));
        System.out.println(NumericalUtilities.sumOfNaturalNumbersBetween(0,10));
        System.out.println(NumericalUtilities.sumOfEvenNumbersBetween(0,100));
        System.out.println(NumericalUtilities.numberOfDivisorsOf(4));
        System.out.println(NumericalUtilities.isPrime(3));
        System.out.println(ArrayUtilities.toString(array));

        int[] copy = ArrayUtilities.copyOf(array);
        System.out.println(ArrayUtilities.toString(copy));
    }


}