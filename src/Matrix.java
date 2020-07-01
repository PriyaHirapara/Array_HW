public class Matrix {
    public static void main(String args[]) {//declaring and initializing 2D array

        int [][] arr =new int[3][3];//printing 2D aay
        int value [][]={{1,2,3},{4,5,6},{7,8,9}};


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(value[j][i]+" ");
            }
            System.out.println();
        }
    }}