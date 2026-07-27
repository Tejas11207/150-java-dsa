public class arraysp_03 {

    static void sort(int [] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;


        while (i < j) {
            if (arr[i] == 2 && arr[j] == 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 2) {
                j--;

            }

        }
        for (int num :arr)
        { System.out.println(num);}
    }

    public static void main(String[] args ) {
        int []arr={2,0,2,1,1,0};
        sort(arr);


    }

}
