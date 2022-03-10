package pl.sdacademy.java.basic.exercises.day2;


public class Task13 {
    public static void main(String[] args) {
        int [] array = new int[]{12,7,1};
        System.out.println(getMinValue(array));
        System.out.println(getMaxValue(array));
        System.out.println(sum(array));
    }
    private static int getMinValue(int [] array){
        int minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if (minValue>array[i]){
                minValue=array[i];
            }
        }
        return minValue;
    }

    private static int getMaxValue(int [] array){
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if (maxValue<array[i]){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
    private static int sum(int [] array){
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
