public class arrays2d {


    static void main() {
//        // declaration;
//         int [][] matrix ; // matrix means kuch bhi uski jagah kuch bhi likh sakte hai
//
//        // alloction;
//        int[][] arr=new int[2][3]; //[2]- rows ;[3] - column
//
//        //initialization;
//
       //int xrr[][]={{1,3}, {6,8},{4,5}};     //0    , 1   , 2 = 3X3 matrix of 6  elemnts
//
//
//
//        // now how to access the elemnts of the arr;
//        System.out.println(xrr[0][1]); // 3 - prints and  if change 0 to 1 its change the row// []
//        System.out.println(xrr[0][0]); //1
//        System.out.println(xrr[1][0]); // 6
//        System.out.println(xrr[1][1]); //8
//        System.out.println(xrr[2][0]); //4
//        System.out.println(xrr[2][1]); //5

        // matirx [row][column]


        // traversing 2d arrays - kisi bhi elemnts ko right me push kna ya fir print

        // loops ka use
//
//        for(int i = 0;i<xrr.length;i++){ // outer loops rows
//            for (int j =0;j<xrr[i].length;j++){ // inner loops column
//                System.out.print(xrr[i][j] + " ");
//            }
//            System.out.println();



            // print matrix ;
           //int brr[][]={{1,2,3},{4,5,6},{7,8,9}};
                    // 3X3 matrix
           // };
//            for (int i = 0;i<=brr.length;i++){
//                for(int j = 0 ; j<=brr[i].length-1;j++){
//                    System.out.print(brr[i][j]+" ");
//
//                }
//                System.out.println();
//            }

            // sum row wise
//        int sum =0;
//            for (int x=0;x<=brr.length;x++){
//                for(int s =0;s<=brr[x].length-1;s++){
//                    sum=sum+ brr[x][s];
//
//
//                }
//                System.out.println("row"+x+"sum="+sum);
//            }
            // now column wise sum
        // just exchange the nested loop rows and column ko exchange kr do apni jagah
//
//            for(int j = 0; j<=brr[0].length-1;j++){
//                int sum =0;
//                for(int i=0;i<=brr.length;i++){
//                    sum  = sum +brr[i][j];
//                }
//                System.out.println("column"+j+"sum= "+sum);
//            }


            int trr[][]={
                    {1,2,3},
                    {4,5,6}
            };
            int maxvalue= trr[0][0];
            int minvalue=trr[0][0];
            for(int i =0; i <trr.length;i++){
                for(int j =0; j<trr[i].length;j++){ // not juse <= it causes the bounded or unbounded theory
                    // maxvalue
                    if(trr[i][j]>maxvalue){
                        // update the value
                        maxvalue=trr[i][j];
                        // minvalue
                        if(trr[i][j]<minvalue){
                            minvalue=trr[i][j];
                        }


                    }

                }

            }
        System.out.println("maxvalue:"+maxvalue);
        System.out.println(("minvalue:"+minvalue));

        // tranaspos of the matrix - swap row and column indices;
        // matrix[i][j] -> matrix[j][i]
         for (int o=0; o<trr[0].length;o++){
            for(int r=0;r<trr.length;r++){
                System.out.print(trr[o][r]+ " ");
            }
            System.out.println();
        }
        }


    }



