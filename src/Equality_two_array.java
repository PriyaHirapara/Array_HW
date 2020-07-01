public class Equality_two_array {
    public static void main(String[] args) {
        int[] arrayone ={1,2,3,4};
        int[] arraytwo ={1,2,3,6,7,8};
        if (arrayone.length == arraytwo.length) {
            System.out.println("true");
            System.out.println("Two Arrays Are Equal");
        }else {
            System.out.println("false");
            System.out.println("Two Arrays Are not Equal");
        }
    }
}
