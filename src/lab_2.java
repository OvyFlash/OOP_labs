import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.Math;
import java.util.Arrays;

// minus = new String(new char[rows_n_columns]).replace("\0", "--+");


public class lab_2 {
    public static void main(String[] args) {

        int rows_n_columns = (int) (Math.random() + 1) * 5;
        String minus;
        minus = "";
        int the_least = 0, sum = 0;
        for (int i = 0; i < rows_n_columns; i++) {
            minus += "--+";
        }
        int[][] arr = new int[rows_n_columns][rows_n_columns];
        int a = 1;

        for (int j = 0; j < rows_n_columns; j++) {
            System.out.println(minus);
            for (int i = 0; i < rows_n_columns; i++) {
                arr[j][i] = (int) ((Math.random()) * 100);

                System.out.printf("%2d|", (int) arr[j][i]);
            }
            System.out.println();
        }
        System.out.println(minus);

        for (int i = 0; i <  rows_n_columns; i++) {
            for (int j = 0; j <  rows_n_columns; j++) {
                arr[i][j] *= a;
            }
        }

        for (int i = 0; i < rows_n_columns; i++) {
            for (int j: arr[i]){
                if((the_least > j)|(j == arr[i][0])){
                    the_least = j;
                }
            }
            System.out.printf("The smallest is: %d\n", the_least);
            sum += the_least;
        }
        System.out.printf("The sum is %d" , sum);
    }
}
