import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {
                1.5 ,1.6 , -6.6, 6.8, -1.2, 6.2 ,7.5, -0.1, 5.7,-9.9,4.3,2.0,-1.1,5.5,4.3};
        System.out.println(Arrays.toString(numbers));

        int count = 0;
        double sum = 0;
        boolean firstNegativeNumber = false;
        for (double currentNumber : numbers) {
            if (!firstNegativeNumber && currentNumber < 0 ) {
                firstNegativeNumber = true;
            } else if (firstNegativeNumber && currentNumber > 0 ) {
                sum += currentNumber;
                count ++ ;
            }
        }

        double result = sum / count;
        if (firstNegativeNumber == false) {
            System.out.println("в этом массиве нет отрицательнных чисел");
        }else {
            System.out.println("среднее арифметическое " + result);
            System.out.println("сумма " + sum);
            System.out.println("количество чисел" + count);
        }
    }
}
