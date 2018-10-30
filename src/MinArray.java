public class MinArray {
    public static int minArray(int [] array){
        int min = array[0];
        for (int i = 0; i<array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = {134,3,2,34,12,56,74,34,23};
        System.out.println("Min value is: " + minArray(array));
    }
}
