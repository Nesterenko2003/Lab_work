package Lab_work1;

public class FizzBuzz {
    public void playGame(){
        for (int num=1;num<=100;num++){
            if (num%5==0 && num%3==0){
                System.out.print("|Lab_work1.FizzBuzz| ");
                continue;
            }
            if (num%3==0){
                System.out.print("|Fizz| ");
                continue;
            }
            if (num%5==0){
                System.out.print("|Buzz| ");
                continue;
            }
            System.out.print(num+" ");

        }
    }
}
