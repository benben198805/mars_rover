import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        Rover rover=new Rover(scanner.nextLine());
        while (scanner.hasNext())
        {
            rover.Init(scanner.nextLine());
            rover.TakeOrder(scanner.nextLine());
        }



    }
}