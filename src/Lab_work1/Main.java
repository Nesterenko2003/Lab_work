package Lab_work1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputPoint = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Array filter");
        System.out.println("2. Lab_work1.FizzBuzz");
        System.out.println("3. Task with star");
        System.out.print("Choose point: ");
        int pointMenu = inputPoint.nextInt();
        switch (pointMenu) {
            case(1):
            int[] array1 = new int[0];
            ArrayInput inputArray1 = new ArrayInput();
            array1 = inputArray1.arrayInput(array1);
            ArrayFilter filter = new ArrayFilter();
            filter.arrayFilter(array1);
            break;
            case(2):
            FizzBuzz game = new FizzBuzz();
            game.playGame();
            break;
            case(3):
                int[] array2 = new int[0];
                ArrayInput inputArray2 = new ArrayInput();
                array2 = inputArray2.arrayInput(array2);
                TaskWithStar filtration = new TaskWithStar();
                filtration.arrayFiltration(array2);
                break;
                }
        }
    }
