//МЕТОД, БЛАГОДАРЯ КОТОРОМУ ЗАПОЛНЯЕМ МАССИВЫ
//ДЛЯ ВСЕХ ЗАДАНИЙ ГДЕ РАБОТАЕМ С МАССИВА (1 И 3)
package Lab_work1;
import java.util.Scanner;
public class ArrayInput {
    public int[] arrayInput(int[] array){
        int arrayLength = 0;
        Scanner InputLength = new Scanner(System.in);
        Scanner InputArray = new Scanner(System.in);
        do {
            System.out.print("Input array length: ");
            arrayLength = InputLength.nextInt();
            if (arrayLength < 2) {
                System.out.println("ARRAY LENGTH MUST BE EQUAL OR MORE 2");
            }
        } while (arrayLength < 2);
        array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element" + "[" + i + "]: ");
            array[i] = InputArray.nextInt();
        }
        return array;
    }
}
