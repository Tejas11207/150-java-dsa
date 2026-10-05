import java.util.Scanner;

//public class Matrix {
//
//    static void main() {
//        Scanner sc  = new Scanner(System.in);
//
//        int rows =3;
//        int column = 4;
//
//        int [][]martix = new int [rows][column];
//
//        System.out.println("enter the element in matrix ");
//
//        for(int i =0;i<rows;i++){
//            for(int j =0;j<column;j++ ){
//                martix[i][j]=sc.nextInt();
//
//            }
//        }
//        System.out.println("matrix is ");
//
//        for(int i =0;i<rows;i++){
//            for(int j = 0;j<column;j++){
//                System.out.println(martix[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }
//        sc.close();
//    }
//}

class Solution {
    public int[][] transpose(int[][] matrix) {

        if(matrix == null || matrix.length==0){
            return new int [0][0];
        }
        int totalrows =  matrix.length;
        int totalcolumn= matrix[0].length;

        int newtotalrows= totalcolumn;
        int newtotalcolumn=totalrows;
        int [][] ans = new int [newtotalrows][newtotalcolumn];

        for(int i =0;i<totalrows;i++){
            for(int j = 0;j<totalcolumn;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans ;

    }
}

void main() {
    int [][] matrix ={
            {1,2,3},
            {4,5,6}
    };
    Solution obj = new Solution();
    int [][] transpose = obj.transpose(matrix);

    System.out.println("trasnpose of the matrix ");

    for(int i =0;i<transpose.length;i++){
        for(int j =0;j<transpose[0].length;j++){
            System.out.println(transpose[i][j]+ " ");

        }
        System.out.println();
    }

}