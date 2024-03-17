import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe");
        Scanner sc = new Scanner(System.in);

        int liczba = sc.nextInt();


        if(liczba > 0){
            System.out.println("Liczba jest dodatnia.");
        }else if(liczba==0){
            System.out.println("Liczba jest równa 0. ");
        }else{
            System.out.println("Liczba jest ujemna.");
        }

    }
}