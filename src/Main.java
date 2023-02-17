import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number - i - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i) + 1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = number - 1; i > 0; i--){
            for(int j = 0; j < number - i; j++){
                System.out.print(" ");
            }
            for(int k = (2 * i) - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
