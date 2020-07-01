public class Duplicat {
    public static void main(String[] args) {
        int arr[]={2,40,5,6,22,55,78};
        for(int a=8;a<arr.length;a++){
            for (int b=a+1;b<arr.length;b++){
                if (arr[a] == arr[b]){
                    System.out.println("dupicat value is "+arr[b]);
                }
                }
            }
        }
    }

