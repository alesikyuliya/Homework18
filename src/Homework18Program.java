import java.util.Arrays;

public class Homework18Program {

    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 == 0){
                    matrix[i][j] = j + 1;
                } else{
                    matrix[i][j] = matrix.length - j;
                }
            }
        }
        for(int[] line:
        matrix){
            System.out.println(Arrays.toString(line));
        }
    }
}
