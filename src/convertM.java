/**
 * @author: fl
 * @data: 2020-04-08 18:01
 * @description: 矩阵反转
 **/
public class convertM {

    public static void main(String[] args) {
        int mattix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        test(mattix);
        for (int i = 0; i < mattix.length; i++) {
            for (int j = 0; j < mattix.length; j++) {
                System.out.print(mattix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void test(int[][] martix){
        int n = martix.length;
        //先进行对角线反转
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = martix[i][j];
                martix[i][j] = martix[j][i];
                martix[j][i]=temp;
            }
        }

        //对折交换
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = martix[i][n-j-1];
                martix[i][n-j-1] = martix[i][j];
                martix[i][j]=temp;
            }
        }

    }
}
