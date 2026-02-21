import java.util.Scanner;

public class matrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt(),col1 = sc.nextInt();
        int[][] mat1 = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        int row2 = sc.nextInt(),col2 = sc.nextInt();
        int[][] mat2 = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        int n = mat1.length , m = mat1[0].length , p = mat2[0].length;
        int[][] res = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                res[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
