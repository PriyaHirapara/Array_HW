public class Array_specific_value {

    public static void main(String[] args) {


            int[] value ={10,20,30,40,50,60,70};
            int num= 1;
            //for(int i:value)
            for (int i=0;i< value.length;i++) {
                if (num == value[i]) {
                    System.out.println("true");//return true;
                } else {
                    System.out.println("false");
                }
              //  System.out.println();


            }}}