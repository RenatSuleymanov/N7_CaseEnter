import java.util.Scanner;

public class CaseEnter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        Integer number = in.nextInt();
        if(number == 1 || number == 2 || number == 12) {
            System.out.print("Данное значение имеется в константах");
        } else System.out.print("Такой константы нет!");
    }
}
