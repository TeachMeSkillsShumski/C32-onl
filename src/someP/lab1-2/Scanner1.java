import java.util.Scanner;

/*
Что он делает и как
 */
public class Scanner1 {
    public static void main(String[] args) {
        // Определение и присвонение Scanner обьекта
        Scanner sc = new Scanner(System.in);
        //Происходит считывание значеничения из консоли
        int count = sc.nextInt();
        for (int iterator = 0; iterator < count;) {
            iterator++;
            //Systetem.out.(iterator);
        }

//        int iterator = 0;
//        while (iterator < count){
//            iterator++;
//            System.out.println(iterator);
//        }
    }
}