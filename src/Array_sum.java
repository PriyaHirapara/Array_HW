public class Array_sum {
    public static void main(String[] args) {
       // int a[] = new int[3];//declartion and instantitation
       int sum[][] =new int[3][3];
        int value1 [][]={{1,2,3},{4,5,6},{7,8,9}};
        int value2 [][]={{1,2,3},{10,10,10},{100,100,100}};

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                sum[i][j] = value1[i][j] + value2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); //new line
        }
    }
}
