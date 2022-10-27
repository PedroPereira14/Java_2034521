public class Main {
    //public static void main(String[] args) {

        //System.out.println("Hello world!");
    //}
    public static float perimeter(float width, float height) {
        float p = 2 * (width + height);
        return p;
    }
    public static float Volume(float width, float height, float length) {
        float v = width * height * length;
        return v;
    }
    public static float Celsius(float Farenheit){
        float C = (Farenheit - 32) * 5/9;
        return C;
    }
    public static float horas(float hora, float minutos, float segundos){
        float h = hora * 3600;
        float m = minutos * 60;
        float s = h + m + segundos;
        return s;
    }

    public static int max(int[] arraynum){
        int max = arraynum[0];
        for (int i = 0; i < arraynum.length; i++){
            if (arraynum[i] > max)
                max = arraynum[i];

        }
        return max;
    }
    public static int min(int[] arraynum){
        int min = arraynum[0];
        for (int i = 0; i < arraynum.length; i++){
            if (arraynum[i] < min)
                min = arraynum[i];

        }
        return min;
    }
    public static float medium(int[] arraynum){
        float med = 0;
        for(int i = 0; i < arraynum.length; i++){
            med += arraynum[i];
        }
        return med/arraynum.length;
    }
    public static void main(String[] args) {

        int[] array = {4,6,7,1,3};

        System.out.println(perimeter(2,5));
        System.out.println(Volume(2,3,4));
        System.out.println(Celsius( 10));
        System.out.println("As horas em segundos são: " + horas(10,40,1));
        System.out.println("Numero max é :" + max(array));
        System.out.println("Numero min é :" + min(array));
        System.out.println("Numero media é :" + medium(array));
    }
}