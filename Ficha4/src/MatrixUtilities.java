public class MatrixUtilities {
    public static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isMatrix(int[][] matrix) {
        int size = matrix[0].length;

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != size) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if (i==j && matrix[i][j] != 1 || i!=j && matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy (int[][] matrix, int multiple){
        int[][] product = new int[matrix.length][matrix[0].length];
        for(int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product[i][j]= matrix[i][j]*multiple;
            }
        }
        return product;
    }
    public static boolean areCompatibleForSum(int [][] matrix, int [][] matrix2){
        int l = matrix.length;
        if (matrix2.length != l){
            return false;
        }
        else {
            for(int i = 0; i<matrix.length; i++) {
                if(matrix[i].length != matrix2[i].length){
                    return false;
                }
            }
            return true;
        }
    }

    public static int [][] sumOf (int [][] matrix,int [][] matrix2){
        boolean compatible = areCompatibleForSum(matrix,matrix2);
        if (compatible){
            int [][] sum = new int [matrix.length][matrix[0].length];
            for(int i = 0; i<matrix.length; i++){
                for(int j = 0; j<matrix[i].length; j++){
                    sum [i][j] = matrix[i][j] + matrix2[i][j];
                }
            }
            return sum;
        }
        else{
            return null;
        }
    }
}
