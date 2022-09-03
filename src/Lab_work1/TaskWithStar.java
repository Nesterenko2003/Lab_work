package Lab_work1;

public class TaskWithStar {
    public int[] arrayFiltration(int[] array){
        int firstPartSum = 0; //сумма первой половина массива
        int secondPartSum = 0; //сумма второй половина массива
        for (int i = array.length-1; i >=array.length/2; i--) {
            secondPartSum += array[i];
        }
        for (int i = 0; i < array.length/2; i++) {
            firstPartSum += array[i];
        }
        if (firstPartSum==secondPartSum) {
            System.out.println("SUCCESSFULLY FILTRATION");
        }
        else {
            System.out.println("PLEASE CHECK YOUR VALUES");
        }
        return array;
    }
}
