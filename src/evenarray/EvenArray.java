package evenarray;

import java.util.Arrays;
import java.util.Random;

public class EvenArray {

    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numbers = new int[10];
        int counter = 0;
        while(counter < 10){
            int a = random.nextInt(50);
            if(a%2 == 0){
               numbers[counter] = a;
               counter++;
            }
        }
        System.out.println("Массив - " + Arrays.toString(numbers));
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Макс значение - " + max);
        int min = max;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Мин значение - " + min);
        int countofmax = 0;                         
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                countofmax++;
            }
        }
        int countofmin = 0;                         
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                countofmin++;
            }
        }
        int[] newnumbers = new int[numbers.length-(countofmin+countofmax)];
        Arrays.sort(numbers);
        System.arraycopy(numbers, countofmin, newnumbers, 0, newnumbers.length);
        float mid = 0;
        for (int i = 0; i < newnumbers.length; i++) {
            mid += newnumbers[i];
        }
        System.out.println("Среднее - " + mid / newnumbers.length);
    }
}