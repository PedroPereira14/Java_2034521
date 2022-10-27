public class NumericalUtilities {
    public static int powerOf(int number, int power){
        int res = number;
        for (int i=1; i < power; i++){
            res = res*number;
        }
        return res;
    };
    public static int sumOfNaturalNumbersUpTo(int num){
        int num1 = 1;
        int res = 0;
        for (int i = 0; i < num; i++){
            res+=num1;
            num1++;
        }
        return res;
    };
    public static int sumOfNaturalNumbersBetween(int num1, int num2){
        int res = 0;
        int n = num1;
        for (int i = num1; i <= num2; i++){
            res += n;
            n++;
        }
        return res;
    };
    public static int sumOfEvenNumbersBetween(int num1, int num2){
        int res = 0;
        int n = num1;
        for (int i = num1; i <= num2; i++){
            if (n % 2 == 0){
                res += n;
            }
            n++;
        }
        return res;
    };
    public static int numberOfDivisorsOf(int num){
        int res = 0;
        for (int i = 1; i <= num; i++){
            if (num%i==0){
                res+=1;
            }
        }
        return res;
    };
    public static int isPrime(int num){
        int res = 0;
        for (int i = 1; i <= num; i++){
            if (num%i==0){
                res=1;
            } //ta lixado
            else{
                res=0;
                break;
            }
        }
        return res;
    };
}