package Lab_work1;

public class ArrayFilter {
    public void arrayFilter(int[] array){
        boolean check = false;
        for (int i=1;i<array.length;i++){
            if (array[i-1]<array[i]||array[i-1]==array[i]) {
                check = true;
            }
            else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("YOUR ARRAY WAS FILTERED SUCCESSFULLY");
        }
        else {
            System.out.println("PLEASE CHECK YOUR VALUES AND INPUT DATA AGAIN");
        }
    }
}
