public class ArrayUtilities {
    public static String toString(int[] array){
        String str = "[ ";
        for (int i=0; i < array.length; i++){
            str += array[i] + ", ";
            if (i == array.length-1){
                str += array[i];
            }
        }
        str += " ]";
        return str;
    };
    public static int[] copyOf(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arr[i] = array[i];
        }
        return arr;
    };
}
