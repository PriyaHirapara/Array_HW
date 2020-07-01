public class Array_ascending_order {
    public static void main(String[] args) {
        int[] a = new int[]{10,4,3,6};
        int temp = 0;
        System.out.println(" original arry: ");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        for (int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } } }
        System.out.println();
        System.out.println(" Array sorted in ascending order:");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }}
    }

